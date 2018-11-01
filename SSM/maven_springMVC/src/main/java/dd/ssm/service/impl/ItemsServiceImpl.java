package dd.ssm.service.impl;

import dd.ssm.mapper.ItemsMapper;
import dd.ssm.po.Items;
import dd.ssm.po.ItemsExample;
import dd.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * @author ZhongChaoYuan
 * @create 2018-09-19 19:29
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapper itemsMapper;

    //查询所有
    public List<Items> getItemsList() {
        ItemsExample example = new ItemsExample();
        List<Items> items = itemsMapper.selectByExampleWithBLOBs(example);
        return items;
    }

    //根据id查询
    public Items findById(int id) {
        Items items = itemsMapper.selectByPrimaryKey(id);
        return items;
    }

    public void updata(Items item) {
        itemsMapper.updateByPrimaryKeyWithBLOBs(item);
    }
}
