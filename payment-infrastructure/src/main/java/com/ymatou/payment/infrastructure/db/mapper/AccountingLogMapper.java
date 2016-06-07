package com.ymatou.payment.infrastructure.db.mapper;

import com.ymatou.payment.infrastructure.db.model.AccountingLogExample;
import com.ymatou.payment.infrastructure.db.model.AccountingLogPo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountingLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_AccoutingLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int countByExample(AccountingLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_AccoutingLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int deleteByExample(AccountingLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_AccoutingLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int deleteByPrimaryKey(Long ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_AccoutingLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int insert(AccountingLogPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_AccoutingLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int insertSelective(AccountingLogPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_AccoutingLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    List<AccountingLogPo> selectByExample(AccountingLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_AccoutingLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    AccountingLogPo selectByPrimaryKey(Long ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_AccoutingLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int updateByExampleSelective(@Param("record") AccountingLogPo record, @Param("example") AccountingLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_AccoutingLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int updateByExample(@Param("record") AccountingLogPo record, @Param("example") AccountingLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_AccoutingLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int updateByPrimaryKeySelective(AccountingLogPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_AccoutingLog
     *
     * @mbggenerated Tue Jun 07 16:24:21 CST 2016
     */
    int updateByPrimaryKey(AccountingLogPo record);
}