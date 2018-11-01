package dd.ssm.service;

import dd.ssm.po.BaseDict;
import java.util.List;

/**
 * @author ZhongChaoYuan
 * @create 2018-09-22 15:40
 **/
@SuppressWarnings("all")
public interface BaseDictService {
    List<BaseDict> findDictList(String type_code);
}
