package com.example.library;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LibraryDAO {
    @Autowired
    SqlSession sqlSession;

    public int insertLibrary(LibraryVO vo){
        String sql = "insert into Library (name, writer, publisher, classification, borrow, borrower) values("
                +"'"+vo.getName()+"',"
                +"'"+vo.getWriter()+"',"
                +"'"+vo.getPublisher()+"',"
                +"'"+vo.getClassification()+"',"
                +"'"+vo.getBorrow()+"',"
                +"'"+vo.getBorrower()+"',";
        return sqlSession.update(sql);
    }

    public int deleteLibrary(int bookID){
        String sql = "delete from Library where personID =" +bookID;
        return sqlSession.update(sql);
    }

    public int updateLibrary(LibraryVO vo){

        String sql = "update Library set name='" + vo.getName()+"',"
                +"writer='" + vo.getWriter()+"',"
                +"Publisher='" + vo.getPublisher()+"',"
                +"classification='" + vo.getClassification()+"',"
                +"borrow='" + vo.getBorrow()+"',"
                +"borrower='" + vo.getBorrower()+"'where personID="+vo.getBookID();

        return sqlSession.update(sql);
    }
    public LibraryVO getLibrary(int bookID){
        LibraryVO one = sqlSession.selectOne("Library.getLibrary", bookID);
        return one;
    }
    public List<LibraryVO> getLibraryList(){
        List<LibraryVO> list = sqlSession.selectList("Library.getLibraryList");
        return list;
    }
}