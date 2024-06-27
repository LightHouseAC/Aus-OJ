package com.aus.ausoj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aus.ausoj.model.entity.Problem;
import com.aus.ausoj.service.ProblemService;
import com.aus.ausoj.mapper.ProblemMapper;
import org.springframework.stereotype.Service;

/**
* @author recww
* @description 针对表【problem】的数据库操作Service实现
* @createDate 2024-06-27 23:41:34
*/
@Service
public class ProblemServiceImpl extends ServiceImpl<ProblemMapper, Problem>
    implements ProblemService{

}




