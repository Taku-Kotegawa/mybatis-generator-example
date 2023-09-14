package com.example.mybatisgeneratorexample.infrastructure.mapper.mbg;

import com.example.mybatisgeneratorexample.domain.model.mbg.Organization;
import com.example.mybatisgeneratorexample.domain.model.mbg.OrganizationExample;
import com.example.mybatisgeneratorexample.domain.model.mbg.OrganizationKey;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface OrganizationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.organization
     *
     * @mbg.generated
     */
    long countByExample(OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.organization
     *
     * @mbg.generated
     */
    int deleteByExample(OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.organization
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(OrganizationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.organization
     *
     * @mbg.generated
     */
    int insert(Organization row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.organization
     *
     * @mbg.generated
     */
    int insertSelective(Organization row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.organization
     *
     * @mbg.generated
     */
    List<Organization> selectByExampleWithRowbounds(OrganizationExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.organization
     *
     * @mbg.generated
     */
    List<Organization> selectByExample(OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.organization
     *
     * @mbg.generated
     */
    Organization selectByPrimaryKey(OrganizationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.organization
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("row") Organization row, @Param("example") OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.organization
     *
     * @mbg.generated
     */
    int updateByExample(@Param("row") Organization row, @Param("example") OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.organization
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Organization row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.organization
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Organization row);
}