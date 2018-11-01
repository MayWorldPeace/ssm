package dd.ssm.service;

import dd.ssm.po.Items;
import java.util.List;

/**
 * @author ZhongChaoYuan
 * @create 2018-09-19 19:27
 **/
public interface ItemsService {
    List<Items> getItemsList();

    Items findById(int id);

    void updata(Items item);
}
