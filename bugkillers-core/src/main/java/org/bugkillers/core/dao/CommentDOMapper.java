package org.bugkillers.core.dao;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.bugkillers.core.domain.CommentDO;
import org.bugkillers.core.domain.CommentDOExample;

public interface CommentDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_comment
     *
     * @mbggenerated
     */
    int countByExample(CommentDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_comment
     *
     * @mbggenerated
     */
    int deleteByExample(CommentDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_comment
     *
     * @mbggenerated
     */
    @Delete({
        "delete from bk_comment",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_comment
     *
     * @mbggenerated
     */
    @Insert({
        "insert into bk_comment (id, question_id, ",
        "user_id, comment_text, ",
        "create_time, update_time, ",
        "bk_create, bk_modified, ",
        "dr)",
        "values (#{id,jdbcType=INTEGER}, #{questionId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{commentText,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{bkCreate,jdbcType=TIMESTAMP}, #{bkModified,jdbcType=TIMESTAMP}, ",
        "#{dr,jdbcType=TINYINT})"
    })
    int insert(CommentDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_comment
     *
     * @mbggenerated
     */
    int insertSelective(CommentDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_comment
     *
     * @mbggenerated
     */
    List<CommentDO> selectByExample(CommentDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_comment
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, question_id, user_id, comment_text, create_time, update_time, bk_create, ",
        "bk_modified, dr",
        "from bk_comment",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    CommentDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_comment
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CommentDO record, @Param("example") CommentDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_comment
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CommentDO record, @Param("example") CommentDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_comment
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CommentDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_comment
     *
     * @mbggenerated
     */
    @Update({
        "update bk_comment",
        "set question_id = #{questionId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "comment_text = #{commentText,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "bk_create = #{bkCreate,jdbcType=TIMESTAMP},",
          "bk_modified = #{bkModified,jdbcType=TIMESTAMP},",
          "dr = #{dr,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CommentDO record);
}