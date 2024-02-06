package kr.swu.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board") // localhost:8080/board/
public class BoardController {

    // 게시판 전체 글 목록을 조회할 수 있는 페이지
    public String goBoardList(Model model){

        return "board/board-list";
    }

}
