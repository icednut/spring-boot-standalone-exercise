package com.springbook.biz.board;

import java.util.List;

/**
 * @author wangeun.lee@sk.com
 * @created 2017. 8. 2.
 */
public interface BoardService {
    void insertBoard(BoardVO vo);

    void updateBoard(BoardVO vo);

    void deleteBoard(BoardVO vo);

    BoardVO getBoard(BoardVO vo);

    List<BoardVO> getBoardList(BoardVO vo);
}
