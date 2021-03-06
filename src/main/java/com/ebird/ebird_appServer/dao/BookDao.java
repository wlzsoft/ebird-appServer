package com.ebird.ebird_appServer.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ebird.ebird_entity.dto.BookDto;
import com.ebird.ebird_entity.dto.PonitDto;
import com.ebird.ebird_entity.entity.BookEntity;


@Repository
public interface BookDao {

	public void bookSava(BookEntity entity);
	
	public int delBookById(@Param("bookId")String bookId);
	
	public int editBook(BookEntity entity);
	
	public BookEntity findBook(@Param("bookId")Integer bookId);
	
	public BookDto findBookById(@Param("bookId")Integer bookId);
	
	/**
	 * 根据用户ID 查询所有练习本信息
	 * @param userId用户Id
	 * @return
	 */
	public List<BookDto> searchAllExcercise(@Param("userId")Integer userId);
	
	
	/**
	 * 获取所有共享类型练习本
	 * @return
	 */
	public List<BookDto> getOpenBook(@Param("userId")Integer userId);
	
	
	public List<BookEntity> fidByName();
	
	public List<PonitDto> findExcerciseIdToPonit(@Param("bookId")Integer bookId);
	
	public Integer bookProgress(@Param("bookId")Integer bookId,@Param("userId")Integer userId);
	
	public Integer bookProgressYes(@Param("bookId")Integer bookId,@Param("userId")Integer userId);
	
	/**
	 * 根据 poindId 查询 知识点所属练习本信息
	 * @param pointId
	 * @return
	 */
	public BookEntity findBookByPointId(@Param("pointId")Integer pointId);
	
    /**
     * 根据 cardId 查询 卡片所属练习本信息
     * @param cardId
     * @return
     */
    public BookEntity findBookByCardId(@Param("cardId")Integer cardId);
    
    
    /**
     * 如果创建者 更新了 练习下面的 知识点 或 卡片信息 练习本需要记录 更新时间
     * 
     * @param bookId
     */
    public void updateDetail(@Param("bookId")Integer bookId,@Param("updateDetailId")Integer updateDetailId,@Param("updateDetailTime")Date updateDetailTime);
	
}
