package com.springbook.biz;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.Tv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import java.util.List;

@SpringBootApplication
@ImportResource({"applicationContext.xml"})
public class MainApplication {

    public static void main(String[] args) {
        // 1. Spring 컨테이너를 구동한다. (with Spring Boot)
        ApplicationContext container = SpringApplication.run(MainApplication.class, args);

        // TV 실습
        Tv samsungTv = (Tv) container.getBean("samsungTv");
        samsungTv.powerOn();

        // 2. Spring 컨테이너로부터 BoardServiceImpl 객체를 Lookup한다.
        BoardService boardService = (BoardService) container.getBean("boardService");

        // 3. 글 등록 기능 테스트
        BoardVO vo = new BoardVO();
        vo.setTitle("임시 제목");
        vo.setWriter("홍길동");
        vo.setContent("임시 내용...........");
        boardService.insertBoard(vo);

        // 4. 글 목록 검색 기능 테스트
        List<BoardVO> boardList = boardService.getBoardList(vo);
        for (BoardVO board : boardList) {
            System.out.println("---> " + board.toString());
        }

        // 5. Spring 컨테이너 종료
        // 안해도 됨
    }
}
