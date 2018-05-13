package cn.lastlysly.controller;

import cn.lastlysly.myutils.MyResponseJson;
import cn.lastlysly.pojo.TbAccount;
import cn.lastlysly.service.TbAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-05-13 13:10
 **/
@RestController
@RequestMapping("/account")
public class TbAccountController {
    @Autowired
    private TbAccountService tbAccountService;


//    @ResponseBody可以不写
    @PostMapping("/getaccountinfo")
    public MyResponseJson getAccountInfo(){

        List<TbAccount> list = tbAccountService.selectAccountInfo();
        MyResponseJson sucessResponseJson = new MyResponseJson(1,"查询成功",list);
        return sucessResponseJson;

    }

    //    @ResponseBody可以不写
    @PostMapping("/transfer")
    public MyResponseJson transferAccount(HttpServletRequest request, HttpServletResponse response){
        int inId = Integer.parseInt(request.getParameter("accountIn"));
        int outId = Integer.parseInt(request.getParameter("accountOut"));
        double money = Double.parseDouble(request.getParameter("money"));
        System.out.print("===================" + inId + "====" + outId + "====" + money);
        try {
            if (tbAccountService.transferAccount(money,outId,inId)){
                return new MyResponseJson(1,"转账成功",null);
            }
        }catch (Exception e){
            return new MyResponseJson(0,"转账失败,测试事务回滚，如果失败，金额总额不变，为成功"+e.getMessage(),null);
        }
        return new MyResponseJson(0,"转账失败",null);

    }


}
