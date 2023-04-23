package com.project.zoopiter.domain.BBSHReply.dao;

import com.project.zoopiter.domain.entity.BBSHReply;

import java.util.List;
import java.util.Optional;

public interface BBSHReplyDAO {
  /**
   * 댓글작성
   * @param bbshReply
   * @return  댓글번호
   */
  Long save(BBSHReply bbshReply);


  /**
   * 댓글목록
   * @param bbshId 글 번호
   * @return
   */
  Optional<List<BBSHReply>> findByBBSHId(Long bbshId);



  /**
   * 댓글 수정
   * @param bbshId 글번호
   * @param bbshReply
   * @return 수정건수
   */
  int updateByBcid(Long bbshId, BBSHReply bbshReply);


  /**
   * 삭제
   * @param bcId 댓글번호
   * @return 삭제건수
   */
  int deleteByBcid(Long bcId);

  /**
   * 댓글 갯수
   * @param bbshId 게시글 번호
   * @return 댓글 갯수
   */
  int countOfReplies(Long bbshId);

}
