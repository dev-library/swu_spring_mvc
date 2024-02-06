package kr.swu.spring_mvc.domain;

import java.time.LocalDateTime;

public class Board {

    // 게시판에 필요한 정보들(제목, 글쓴이, 날짜, 본문, 조회수 등)
    private int boardNum;
    private String title;
    private String writer;
    private LocalDateTime createdAt;
    private LocalDateTime upatedAt;
    private String content;
    private int hit;

}
