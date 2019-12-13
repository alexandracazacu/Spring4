package com;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ComputerRepository {
        @Autowired
        private JdbcTemplate jdbcTemplate;

        public List<Computer> findAll(){
            return jdbcTemplate.query(
                    "SELECT * FROM computer",
                    (response, rowNumber) ->
                            new  Computer(response.getInt("id"),
                                    response.getString("name"),
                                    response.getString("color"),
                                    response.getFloat("price"),
                                    response.getInt("year")));

        }


        public void save(Computer computer) {
            jdbcTemplate.update(
                    "INSERT INTO computer (name, color, price, year,) VALUES(?,?,?,?)",
                    computer.getName(), computer.getColor(), computer.getPrice(), computer.getYear());
        }

        public void delete(int id){
            jdbcTemplate.update(
                    "DELETE FROM computer WHERE id = ?",id);
        }

        public void update (int id, Computer computer) {
            jdbcTemplate.update(
                    "UPDATE computer SET name=?, color=?, price=?, year=?, WHERE id = ?",
                    computer.getName(), computer.getColor(), computer.getPrice(), computer.getYear(), id);
        }
    }


