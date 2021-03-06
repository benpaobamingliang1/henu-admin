package com.henu.admin;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class Boot05WebAdminApplicationTests {

    @Autowired
   JdbcTemplate jdbc;

    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() {

//        jdbcTemplate.queryForObject("select * from account_tbl")
//        jdbcTemplate.queryForList("select * from account_tbl",)
            Long aLong = jdbc.queryForObject("select count(*) from admin", Long.class);
            log.info("记录总数：{}",aLong);

            log.info("数据源类型：{}",dataSource.getClass());

        }
}


