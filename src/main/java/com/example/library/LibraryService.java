package com.example.library;

import java.util.List;

public interface LibraryService {
    public int insertLibrary(LibraryVO vo);
    public int deleteLibrary(int bookID);
    public int updateLibrary(LibraryVO vo);
    public LibraryVO getLibrary(int bookID);
    public List<LibraryVO> getLibraryList();

}