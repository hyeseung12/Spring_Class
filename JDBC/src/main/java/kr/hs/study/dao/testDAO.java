package kr.hs.study.dao;

import kr.hs.study.dto.testDTO;
import kr.hs.study.mapper.MapperClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class testDAO {
    @Autowired
    private JdbcTemplate jdbc;

    @Autowired
    private MapperClass mapper;

    public void insert(testDTO dto) {
        String sql = "insert into test values (?, ?)";
        jdbc.update(sql, dto.getId(), dto.getName());
    }

    public void update(testDTO dto) {
        String sql = "update test set name = ? where id = ?";
        jdbc.update(sql, dto.getName(), dto.getId());
    }

    public void delete(testDTO dto) {
        String sql = "delete from test where id = ?";
        jdbc.update(sql, dto.getId());
    }

    public List<testDTO> select() {
        String sql = "select * from test order by id desc";
        List<testDTO> list = jdbc.query(sql, mapper);
        return list;
    }
}
