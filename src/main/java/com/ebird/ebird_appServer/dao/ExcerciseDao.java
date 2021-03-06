package com.ebird.ebird_appServer.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ebird.ebird_entity.dto.CardDto;
import com.ebird.ebird_entity.dto.PonitDto;

@Repository
public interface ExcerciseDao {
		
	public List<PonitDto> excerciseError_bookId(@Param("bookId")Integer bookId,@Param("userId")Integer userId);
	
	public List<PonitDto> excerciseError_chapterIds(@Param("bookId")Integer bookId,@Param("chapterId")Integer chapterId[],@Param("userId")Integer userId);
	
	public List<PonitDto> excerciseNew_chapterIds(@Param("bookId")Integer bookId,@Param("chapterId")Integer chapterId[],@Param("userId")Integer userId);
	
	public List<PonitDto> excerciseNew_bookId(@Param("bookId")Integer bookId,@Param("userId")Integer userId);
	
	public List<PonitDto> excerciseStrenthen_chapterIds(@Param("bookId")Integer bookId,@Param("chapterId")Integer chapterId[],@Param("userId")Integer userId);
	
	public List<PonitDto> excerciseStrenthen_bookId(@Param("bookId")Integer bookId,@Param("userId")Integer userId);
	
	public List<PonitDto> excerciseStrenthenFull_chapterIds(@Param("bookId")Integer bookId,@Param("chapterId")Integer chapterId[],@Param("userId")Integer userId);
	
	public List<PonitDto> excerciseStrenthenFull_bookId(@Param("bookId")Integer bookId,@Param("userId")Integer userId);
	
	public List<CardDto> findCardByPoindId(@Param("pointId")Integer pointId);
	
	public List<PonitDto> findStrenthen_bookId(@Param("bookId")Integer bookId,@Param("userId")Integer userId);

}
