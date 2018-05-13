package cn.lastlysly.myutils;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-05-13 13:14
 **/
public class MyResponseJson {
    public int code;
    public String tip;
    public Object data;

    public MyResponseJson(int code, String tip, Object data) {
        this.code = code;
        this.tip = tip;
        this.data = data;
    }

    public MyResponseJson() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
