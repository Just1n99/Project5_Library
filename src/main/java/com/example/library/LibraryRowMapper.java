package com.example.library;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

class LibraryRowMapper implements RowMapper<LibraryVO> {

    @Override
    public LibraryVO mapRow(ResultSet rs, int rowNum) throws SQLException {
        LibraryVO vo = new LibraryVO();
        vo.setBookID(rs.getInt("bookID"));
        vo.setName(rs.getString("name"));
        vo.setWriter(rs.getString("writer"));
        vo.setPublisher(rs.getString("publisher"));
        vo.setClassification(rs.getString("classification"));
        vo.setBorrow(rs.getString("borrow"));
        vo.setBorrower(rs.getString("borrower"));
        vo.setReturndate(rs.getDate("returndate"));
        return vo;
    }

}