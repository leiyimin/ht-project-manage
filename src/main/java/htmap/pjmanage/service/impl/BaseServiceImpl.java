package htmap.pjmanage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import htmap.pjmanage.dao.BaseDao;
import htmap.pjmanage.service.IBaseService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BaseServiceImpl extends ServiceImpl<BaseDao, Map<String,Object>> implements IBaseService {
}
