package com.ymatou.payment.infrastructure.db.mapper;

import com.ymatou.payment.infrastructure.db.model.BussinessOrderExample;
import com.ymatou.payment.infrastructure.db.model.BussinessOrderPo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BussinessOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_BussinessOrder
     *
     * @mbggenerated Tue May 24 14:57:11 CST 2016
     */
    int countByExample(BussinessOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_BussinessOrder
     *
     * @mbggenerated Tue May 24 14:57:11 CST 2016
     */
    int deleteByExample(BussinessOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_BussinessOrder
     *
     * @mbggenerated Tue May 24 14:57:11 CST 2016
     */
    int deleteByPrimaryKey(String bussinessOrderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_BussinessOrder
     *
     * @mbggenerated Tue May 24 14:57:11 CST 2016
     */
    int insert(BussinessOrderPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_BussinessOrder
     *
     * @mbggenerated Tue May 24 14:57:11 CST 2016
     */
    int insertSelective(BussinessOrderPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_BussinessOrder
     *
     * @mbggenerated Tue May 24 14:57:11 CST 2016
     */
    List<BussinessOrderPo> selectByExampleWithBLOBs(BussinessOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_BussinessOrder
     *
     * @mbggenerated Tue May 24 14:57:11 CST 2016
     */
    List<BussinessOrderPo> selectByExample(BussinessOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_BussinessOrder
     *
     * @mbggenerated Tue May 24 14:57:11 CST 2016
     */
    BussinessOrderPo selectByPrimaryKey(String bussinessOrderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_BussinessOrder
     *
     * @mbggenerated Tue May 24 14:57:11 CST 2016
     */
    int updateByExampleSelective(@Param("record") BussinessOrderPo record, @Param("example") BussinessOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_BussinessOrder
     *
     * @mbggenerated Tue May 24 14:57:11 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") BussinessOrderPo record, @Param("example") BussinessOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_BussinessOrder
     *
     * @mbggenerated Tue May 24 14:57:11 CST 2016
     */
    int updateByExample(@Param("record") BussinessOrderPo record, @Param("example") BussinessOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_BussinessOrder
     *
     * @mbggenerated Tue May 24 14:57:11 CST 2016
     */
    int updateByPrimaryKeySelective(BussinessOrderPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_BussinessOrder
     *
     * @mbggenerated Tue May 24 14:57:11 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(BussinessOrderPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_BussinessOrder
     *
     * @mbggenerated Tue May 24 14:57:11 CST 2016
     */
    int updateByPrimaryKey(BussinessOrderPo record);
}