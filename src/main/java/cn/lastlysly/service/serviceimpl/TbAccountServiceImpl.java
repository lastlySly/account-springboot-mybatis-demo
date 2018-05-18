package cn.lastlysly.service.serviceimpl;

import cn.lastlysly.mapper.CustomTbAccountMapper;
import cn.lastlysly.mapper.TbAccountMapper;
import cn.lastlysly.pojo.TbAccount;
import cn.lastlysly.service.TbAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-05-13 11:51
 **/
@Service
public class TbAccountServiceImpl implements TbAccountService {

    @Autowired
    public CustomTbAccountMapper customTbAccountMapper;

    @Autowired
    public TbAccountMapper tbAccountMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<TbAccount> selectAccountInfo() {
        List<TbAccount> list = tbAccountMapper.selectByExample(null);
        return list;
    }

    @Transactional(propagation = Propagation.REQUIRED)
//    @Transactional
    @Override
    public boolean transferAccount(double money, int fromId, int toId) {

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("inId",toId);
        map.put("outId",fromId);
        map.put("money",money);
        int inRow = customTbAccountMapper.inAccount(map);

        //测试事务回滚
        int a = 1/0;

        int outRow = customTbAccountMapper.outAccount(map);

        if (inRow > 0 && outRow >0){
            return true;
        }


        return false;
    }
}
