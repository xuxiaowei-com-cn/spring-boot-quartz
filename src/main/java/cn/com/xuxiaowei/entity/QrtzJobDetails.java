package cn.com.xuxiaowei.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 作业详情表
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-09-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("qrtz_job_details")
public class QrtzJobDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 调度程序名称
     */
    @TableField("SCHED_NAME")
    private String schedName;

    /**
     * 作业名称
     */
    @TableField("JOB_NAME")
    private String jobName;

    /**
     * 作业组
     */
    @TableField("JOB_GROUP")
    private String jobGroup;

    /**
     * 作业详情注释
     */
    @TableField("DESCRIPTION")
    private String description;

    /**
     * 作业 class 名称
     */
    @TableField("JOB_CLASS_NAME")
    private String jobClassName;

    @TableField("IS_DURABLE")
    private String isDurable;

    /**
     * 是否并发
     */
    @TableField("IS_NONCONCURRENT")
    private String isNonconcurrent;

    @TableField("IS_UPDATE_DATA")
    private String isUpdateData;

    /**
     * 是否恢复
     */
    @TableField("REQUESTS_RECOVERY")
    private String requestsRecovery;

    @TableField("JOB_DATA")
    private String jobData;


    public static final String SCHED_NAME = "SCHED_NAME";

    public static final String JOB_NAME = "JOB_NAME";

    public static final String JOB_GROUP = "JOB_GROUP";

    public static final String DESCRIPTION = "DESCRIPTION";

    public static final String JOB_CLASS_NAME = "JOB_CLASS_NAME";

    public static final String IS_DURABLE = "IS_DURABLE";

    public static final String IS_NONCONCURRENT = "IS_NONCONCURRENT";

    public static final String IS_UPDATE_DATA = "IS_UPDATE_DATA";

    public static final String REQUESTS_RECOVERY = "REQUESTS_RECOVERY";

    public static final String JOB_DATA = "JOB_DATA";

}
