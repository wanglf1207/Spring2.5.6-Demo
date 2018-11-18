package com.demo.datasource.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.demo.datasource.dao.UserDAO;
import com.demo.datasource.model.User;

@Component("u")
public class UserDAOImpl implements UserDAO {
	// 将Spring数据源注入进来
	// resource默认是byname
	private DataSource datasource;

	public DataSource getDatasource() {
		return datasource;
	}
	@Resource
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}
	// 这里用throws Exception不好使，只能try catch
	public void save(User user) {
		try {
			Connection connection = datasource.getConnection();
			String sql = "insert into user values ('wanglf','admin')";
			connection.createStatement().executeUpdate(sql);
			System.out.println("user saved!");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
