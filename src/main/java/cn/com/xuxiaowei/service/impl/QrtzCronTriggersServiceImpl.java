package cn.com.xuxiaowei.service.impl;

import cn.com.xuxiaowei.entity.QrtzCronTriggers;
import cn.com.xuxiaowei.mapper.QrtzCronTriggersMapper;
import cn.com.xuxiaowei.service.IQrtzCronTriggersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * cron 触发器表 服务实现类
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-09-26
 */
@Service
public class QrtzCronTriggersServiceImpl extends ServiceImpl<QrtzCronTriggersMapper, QrtzCronTriggers> implements IQrtzCronTriggersService {

}
