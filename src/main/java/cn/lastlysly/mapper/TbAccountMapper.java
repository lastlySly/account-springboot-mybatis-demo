package cn.lastlysly.mapper;

import cn.lastlysly.pojo.TbAccount;
import cn.lastlysly.pojo.TbAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAccountMapper {
    long countByExample(TbAccountExample example);

    int deleteByExample(TbAccountExample example);

    int insert(TbAccount record);

    int insertSelective(TbAccount record);

    List<TbAccount> selectByExample(TbAccountExample example);

    int updateByExampleSelective(@Param("record") TbAccount record, @Param("example") TbAccountExample example);

    int updateByExample(@Param("record") TbAccount record, @Param("example") TbAccountExample example);
}