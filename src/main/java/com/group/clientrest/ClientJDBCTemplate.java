package com.group.clientrest;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.mysql.jdbc.Driver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

/**
 * @author afsilva
 */
public class ClientJDBCTemplate {

    public List<Client> getClients(String sex){

        try {
            SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
            Driver driver = new com.mysql.jdbc.Driver();
            dataSource.setDriver(driver);
            dataSource.setUrl("jdbc:mysql://localhost:3306/test_db");
            dataSource.setUsername("root");
            dataSource.setPassword("admin");

            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

            String sqlSelect = "SELECT * FROM client WHERE sex = '" + sex + "'";
            List<Client> clientList = jdbcTemplate.query(sqlSelect, new RowMapper<Client>() {

                public Client mapRow(ResultSet result, int rowNum) throws SQLException {
                    Client client = new Client();
                    client.setFirstName(result.getString("firstname"));
                    client.setLastName(result.getString("lastname"));
                    client.setSex(result.getString("sex"));

                    return client;
                }
            });

            return clientList;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
