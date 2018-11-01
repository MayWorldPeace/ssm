package dd.ssm.controller;

import dd.ssm.po.BaseDict;
import dd.ssm.po.Customer;
import dd.ssm.po.QueryVo;
import dd.ssm.service.BaseDictService;
import dd.ssm.service.CustomerService;
import dd.ssm.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @author ZhongChaoYuan
 * @create 2018-09-22 15:01
 **/
@Controller
public class CustomerController {

    @Autowired
    private BaseDictService baseDictService;

    @Autowired
    private CustomerService customerService;

    @Value("${customer.source.code}")
    private String FROM_TYPE;

    @Value("${customer.industory.code}")
    private String INDUSTRY_TYPE;

    @Value("${customer.level.code}")
    private String LEVEL_TYPE;

    @RequestMapping("/customer/list")
    public String showCustomerList(HttpServletResponse response,HttpServletRequest request, Model model, QueryVo queryVo) throws UnsupportedEncodingException {
        //乱码处理
        queryVo.setCustName(new String(queryVo.getCustName().getBytes("iso8859-1"), "utf-8"));
        //response.setContentType("text/html;charset=UTF-8");
        //String custName = request.getParameter("custName");
        //String decode = URLDecoder.decode(custName, "utf-8");
        //System.out.println(decode);
        //客户来源
        List<BaseDict> sourceList = baseDictService.findDictList(FROM_TYPE);
        //所属行业
        List<BaseDict> industryList = baseDictService.findDictList(INDUSTRY_TYPE);
        //客户级别
        List<BaseDict> levelList = baseDictService.findDictList(LEVEL_TYPE);

        //返回所有客户
        Page<Customer> customers = customerService.getCustomerList(queryVo);
        model.addAttribute("page", customers);
        //参数回显
        model.addAttribute("custName", queryVo.getCustName());
        model.addAttribute("custSource", queryVo.getCustSource());
        model.addAttribute("custIndustry", queryVo.getCustIndustory());
        model.addAttribute("custLevel", queryVo.getCustLevel());

        model.addAttribute("fromType", sourceList);
        model.addAttribute("industryType", industryList);
        model.addAttribute("levelType", levelList);
        return "customer";
    }
}
