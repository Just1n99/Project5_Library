package com.example.myapp;

import com.example.library.LibraryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.library.LibraryVO;
import java.util.List;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value="/login")
public class LoginController {
    @Autowired
    UserServiceImpl service;

    @Autowired
    LibraryServiceImpl libraryService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login/login";
    }

    @RequestMapping(value = "/loginOk", method = RequestMethod.POST)
    public String loginCheck (HttpSession session, UserVO vo, Model model){
        String returnURL = "";
        if (session.getAttribute("login") != null) {
            session.removeAttribute("login");
        }

        UserVO loginvo = service.getUser(vo);
        if (loginvo != null){
            System.out.println("로그인 성공!");
            session.setAttribute("login", loginvo);
            List<LibraryVO> libraryList = libraryService.getLibraryList(); // Fetch library data
            model.addAttribute("list", libraryList);
            returnURL = "/library/list";
        }
        else{
            System.out.println("로그인 실패!");
            returnURL = "/login/login";
            model.addAttribute("error", "Invalid username or password. Please try again.");
        }
        return returnURL;
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/login/login";
    }
}
