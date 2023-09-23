package com.example.mybatisgeneratorexample.infrastructure.mapper.mbg;

import com.example.mybatisgeneratorexample.domain.model.mbg.PositionExample;
import com.example.mybatisgeneratorexample.domain.model.mbg.PositionKey;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface PositionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.position
     *
     * @mbg.generated
     */
    long countByExample(PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.position
     *
     * @mbg.generated
     */
    int deleteByExample(PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.position
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(PositionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.position
     *
     * @mbg.generated
     */
    int insert(PositionKey row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.position
     *
     * @mbg.generated
     */
    int insertSelective(PositionKey row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.position
     *
     * @mbg.generated
     */
    List<PositionKey> selectByExampleWithRowbounds(PositionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.position
     *
     * @mbg.generated
     */
    List<PositionKey> selectByExample(PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.position
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("row") PositionKey row, @Param("example") PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.position
     *
     * @mbg.generated
     */
    int updateByExample(@Param("row") PositionKey row, @Param("example") PositionExample example);
}