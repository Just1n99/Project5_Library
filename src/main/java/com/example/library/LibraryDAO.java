package com.example.library;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LibraryDAO {
    @Autowired
    SqlSession sqlSession;
    // 책을 관리하는 페이지로 만들 것인지 - 이름, 작가, 출판사, 분류, 등록 날짜,
    // 책을 대여하는 페이지로 만들 것인지 - 이름, 작가, 출판사, 분류, 빌린 사람, 빌려갔는지 안빌려갔는지, 반납 일자.
    public int insertLibrary(LibraryVO vo){
        return sqlSession.insert("Library.insertLibrary", vo);
    }

    public int deleteLibrary(int bookID){
        return sqlSession.delete("Library.deleteLibrary", bookID);
    }

    public int updateLibrary(LibraryVO vo){

        return sqlSession.update("Library.updateLibrary", vo);
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