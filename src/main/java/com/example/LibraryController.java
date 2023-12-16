package com.example;

import com.example.library.LibraryServiceImpl;
import com.example.library.LibraryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/library")
public class LibraryController {
    @Autowired
    LibraryServiceImpl libraryService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String libraryList(Model model){
        model.addAttribute("list",libraryService.getLibraryList());
        return "library/list";
    }

    @RequestMapping(value ="/posts/{id}", method = RequestMethod.GET)
    public String libraryPosts(@PathVariable("id") int id, Model model){
        LibraryVO libraryVO = libraryService.getLibrary(id);
        model.addAttribute("posts",libraryVO);
        return "library/posts";
    }
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPost(){
        return "library/addform";
    }

    @RequestMapping(value = "/addok", method = RequestMethod.POST)
    public String addPostOk(LibraryVO vo){
        if(libraryService.insertLibrary(vo) == 0){
            System.out.println("데이터 추가 실패");
        }
        else{
            System.out.println("데이터 추가 성공!!!");
        }
        return "redirect:/library/list";
    }

    @RequestMapping(value = "/editform/{id}", method = RequestMethod.GET)
    public String editPost(@PathVariable("id") int id, Model model){
        LibraryVO libraryVO = libraryService.getLibrary(id);
        model.addAttribute("u",libraryVO);
        return "library/editform";
    }

    @RequestMapping(value = "/editok", method = RequestMethod.POST)
    public String editPostOk(LibraryVO vo){
        if(libraryService.updateLibrary(vo) == 0){
            System.out.println("데이터 수정 실패");
        }
        else{
            System.out.println("데이터 수정 성공!!");
        }
        return "redirect:../library/list";
    }

    @RequestMapping(value = "/desktop/{id}", method=RequestMethod.GET)
    public String deletePostOk(@PathVariable("id") int id){
        if(libraryService.deleteLibrary(id) == 0){
            System.out.println(("데이터 삭제 실패"));
        }
        else{
            System.out.println("데이터 삭제 성공!!");
        }
        return "redirect:../list";
    }
}