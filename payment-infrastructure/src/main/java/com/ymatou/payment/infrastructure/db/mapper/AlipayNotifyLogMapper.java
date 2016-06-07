package com.ymatou.payment.infrastructure.db.mapper;

import com.ymatou.payment.infrastructure.db.model.AlipayNotifyLogExample;
import com.ymatou.payment.infrastructure.db.model.AlipayNotifyLogPo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlipayNotifyLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int countByExample(AlipayNotifyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int deleteByExample(AlipayNotifyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int deleteByPrimaryKey(Integer iId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int insert(AlipayNotifyLogPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int insertSelective(AlipayNotifyLogPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    List<AlipayNotifyLogPo> selectByExampleWithBLOBs(AlipayNotifyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    List<AlipayNotifyLogPo> selectByExample(AlipayNotifyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    AlipayNotifyLogPo selectByPrimaryKey(Integer iId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int updateByExampleSelective(@Param("record") AlipayNotifyLogPo record, @Param("example") AlipayNotifyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") AlipayNotifyLogPo record, @Param("example") AlipayNotifyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int updateByExample(@Param("record") AlipayNotifyLogPo record, @Param("example") AlipayNotifyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int updateByPrimaryKeySelective(AlipayNotifyLogPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(AlipayNotifyLogPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int updateByPrimaryKey(AlipayNotifyLogPo record);
}