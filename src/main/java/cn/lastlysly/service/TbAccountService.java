package cn.lastlysly.service;

import cn.lastlysly.pojo.TbAccount;

import java.util.List;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-05-13 11:49
 **/
public interface TbAccountService {

    List<TbAccount> selectAccountInfo();

    boolean transferAccount(double money,int fromId,int toId);
}
