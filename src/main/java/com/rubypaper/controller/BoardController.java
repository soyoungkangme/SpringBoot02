package com.rubypaper.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.domain.BoardVO;

// @Controller    // @ConponentScan 에 의해 메모리에 로딩됨 
@RestController   // @@Controller + @ResponseBody 
public class BoardController {
	
	public BoardController() {
		System.out.println("===> BoardController 생성");
	}
	
	@RequestMapping("/hello.do")    // http://localhost:8080/hello.do?name=kangsoyoung 
	// @ResponseBody       // 리턴 값을 JSON으로 변환하여 응답 프로토콜 Body에 출력
	public String hello(String name) {  // name = 내가 입력한 값을 전달하여 출력
		return "Hello : " + name;    // JSP 안만들고 이 문자열을 브라우저에 바로 출력할때 (@ResponseBody 없으면 문자열 형태의 JSP 찾음)
	}
	
	@RequestMapping("/getBoard.do")   // http://localhost:8080/getBoard.do (jsonviewer 설치)
	public BoardVO getBoard() { 
		BoardVO board = new BoardVO();
		board.setSeq(1);
		board.setTitile("테스트 제목");
		board.setWriter("테스터");
		board.setContent("테스트 내용");
		board.setCreateDate(new Date());
		board.setCnt(0);
		return board;     // JSON(키밸류 형태, xml 보다 가벼움) 으로 변환하여 -> 응답 프로토콜 -> 브라우저 화면 출력 (JSP X)  
	}
	
	@RequestMapping("/getBoardList.do")  
	public List<BoardVO> getBoardList() { 
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		for (int i =1; i <= 10; i++) {
			BoardVO board = new BoardVO();
			board.setSeq(i);
			board.setTitile("테스트 제목" + i);
			board.setWriter("테스터" + i);
			board.setContent("테스트 내용" + i);
			board.setCreateDate(new Date());
			board.setCnt(0);
			boardList.add(board);
		}
		return boardList;
	}
	
		 
	
}
