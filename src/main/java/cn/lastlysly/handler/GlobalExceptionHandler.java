package cn.lastlysly.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-05-19 15:57
 **/

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    private Map<String,Object> exceptionHandler(HttpServletRequest request, Exception e){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code","0");
        map.put("tip",e.getMessage() + "来自统一异常处理报告");
        return map;
    }

    @ExceptionHandler(value = MyCustomException.class)
    @ResponseBody
    private Map<String,Object> myCustomHandler(HttpServletRequest request, Exception e){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code","0");
        map.put("tip",e.getMessage() + "来自统一异常处理报告,我在测试让统一异常处理来处理自定义异常，（精确定位异常）");
        return map;
    }


}
