package com.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    LibraryDAO libraryDAO;

    @Override
    public int insertLibrary(LibraryVO vo){

        return libraryDAO.insertLibrary(vo);
    }
    @Override
    public int deleteLibrary(int bookID){
        return libraryDAO.deleteLibrary(bookID);
    }

    @Override
    public int updateLibrary(LibraryVO vo){

        return libraryDAO.updateLibrary(vo);
    }
    @Override
    public LibraryVO getLibrary(int bookID){

        return libraryDAO.getLibrary(bookID);
    }
    @Override
    public List<LibraryVO> getLibraryList(){

        return libraryDAO.getLibraryList();
    }

}