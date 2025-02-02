package com.ssafy.backspring.model.service;

import java.util.List;
import java.util.Map;

import com.ssafy.backspring.model.dto.Board;
import com.ssafy.backspring.util.PageMaker;

public interface BoardService {
	public void insert(Board board);
	public Board search(int board_no);
	public List<Board> searchAll();
	public void update(Board board);
	public void delete(int board_no);
	public List<Map<String, Object>> searchBoardTitle(PageMaker page);
	public List<Map<String, Object>> searchBoardSubTitle(PageMaker page);
	public List<Map<String, Object>> searchBoardTitleByOption(PageMaker page);
	public List<Map<String, Object>> searchBoardSubTitleByOption(PageMaker page);
	public int countBoardTitle(PageMaker page);
	public int countBoardTitleByOption(PageMaker page);
	public int countBoardSubTitle(PageMaker page);
	public int countBoardSubTitleByOption(PageMaker page);
}
