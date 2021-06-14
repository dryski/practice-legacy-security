package com.cen.sec.config;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class DataSourceConfigTest {

	@Test
	public void DB연결테스트() {
		DataSourceConfig config = new DataSourceConfig();
		try {
			System.out.println(config.dataSource().getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
