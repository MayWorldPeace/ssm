package dd.ssm.service.impl;


import dd.ssm.mapper.BaseDictMapper;
import dd.ssm.po.BaseDict;
import dd.ssm.po.BaseDictExample;
import dd.ssm.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * @author ZhongChaoYuan
 * @create 2018-09-22 15:40
 **/
@SuppressWarnings("all")
@Service
@Transactional
public class BaseDictServiceImpl implements BaseDictService {

    @Autowired
    private BaseDictMapper baseDictMapper;
    @Override
    public List<BaseDict> findDictList(String type_code) {
        //查询客户来源列表
        BaseDictExample example = new BaseDictExample();
        BaseDictExample.Criteria criteria = example.createCriteria();
        criteria.andDictTypeCodeEqualTo(type_code);
        List<BaseDict> baseDicts = baseDictMapper.selectByExample(example);
        return baseDicts;
    }
}
