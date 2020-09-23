package cn.com.xuxiaowei.service.impl;

import cn.com.xuxiaowei.entity.Quartz;
import cn.com.xuxiaowei.mapper.QuartzMapper;
import cn.com.xuxiaowei.service.IQuartzService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * quartz 定时任务表 服务实现类
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-09-23
 */
@Service
public class QuartzServiceImpl extends ServiceImpl<QuartzMapper, Quartz> implements IQuartzService {

}
