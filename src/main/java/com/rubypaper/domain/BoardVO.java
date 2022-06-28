package com.rubypaper.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	
	private int seq;
	private String titile;
	private String writer;
	private String content;
	private Date createDate = new Date();
	private int cnt = 0;
	
}


// 메이븐이 롬복 라이브러리 다운은 해주는데, 어노테이션이 정상적으로 동작안함 => lombok.jar 워크스페이스에 넣고 터미널에서 실행하여 다운받으면 게터세터 생김 (BoardVO 펼치면)