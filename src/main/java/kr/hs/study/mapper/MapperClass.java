package kr.hs.study.mapper;

import kr.hs.study.dto.testDTO;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class MapperClass implements RowMapper {
    @Override
    public testDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        testDTO dto = new testDTO();
        dto.setId(rs.getInt("id")); // ex.1
        dto.setName(rs.getString("name")); // ex.kim
        return dto;
    }
}
