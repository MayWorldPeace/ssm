package dd.ssm.controller;

import dd.ssm.po.Items;
import dd.ssm.po.User;
import dd.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

/**
 * @author ZhongChaoYuan
 * @create 2018-09-19 18:29
 **/
@SuppressWarnings("all")
@Controller
public class ItemsController {

   /* @RequestMapping("/itemList")
    public String itemList(Model model) throws Exception {
        //创建items集合
        List<Items> itemList = new ArrayList<Items>();

        Items items1 = new Items();
        items1.setName("窑子");
        items1.setPrice(250f);
        items1.setDetail("乾县贱人尧");

        Items items2 = new Items();
        items2.setName("淫鹏");
        items2.setPrice(250f);
        items2.setDetail("扶风韩剧鹏");
        Items items3 = new Items();
        items3.setName("鸡儿");
        items3.setPrice(250f);
        items3.setDetail("商洛鸡儿张");

        itemList.add(items1);
        itemList.add(items2);
        itemList.add(items3);
        //创建modle
        //ModelAndView modelAndView = new ModelAndView();

        //modelAndView.addObject("itemList",itemList);
        //modelAndView.setViewName("itemList");
        //return modelAndView;
        model.addAttribute("itemList",itemList);
        return "itemList";
    }
*/
   //查询所有商品返回前台
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/itemList")
    public String getItemsList(Model model){
        List<Items> itemsList = itemsService.getItemsList();
        model.addAttribute("itemList",itemsList);
        return "itemList";
    }

    //条件查询商品返回
    @RequestMapping("/editItem")
    public String findById(Model model, @RequestParam(value="id",defaultValue = "1",required = true) Integer id){

        //Integer id = item.getId();
        System.out.println(id);
        //System.out.println(item.getName());
        Items items = itemsService.findById(id);
        model.addAttribute("item",items);
        return "editItem";
    }

    //修改操作
    @RequestMapping("/updateitem")
    public String updata(Items item){
        itemsService.updata(item);
        return "success";
    }

    //测试包装pojo
    @RequestMapping("/queryItem")
    public void pojoTest(Items items, User user){
        //System.out.println(queryVo.getItems().getId());
        //System.out.println(queryVo.getItems().getName());
        System.out.println(items);
        System.out.println(user);
    }
}
