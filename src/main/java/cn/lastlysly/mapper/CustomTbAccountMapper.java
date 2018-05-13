package cn.lastlysly.mapper;

import java.util.Map;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-05-13 11:59
 **/
public interface CustomTbAccountMapper {
    int inAccount(Map<String,Object> map);

    int outAccount(Map<String,Object> map);
}
