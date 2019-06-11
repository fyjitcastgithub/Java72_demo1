package cn.itcast.exception;

/**
 * 定义提示信息类
 *fyj
 */
public class CommonCode {

    public static String PARAM="参数错误";
    public static String EXISTS="数据重复";

    public CommonCode(String msg) {
        this.msg = msg;
    }

    private String msg;

    public String getMsg() {
        return msg;
    }
}
