package cn.ibilling.constant;

/**
 * @author Taeyeon
 * @createTime 2019-11-14-10:27
 */
public enum ResultCode {
    /*
            请求返回状态码和说明信息
     */
    SUCCESS_RESULT(ResultCode.SUCCESS, "成功"),
    MODIFY_SUCCESS(ResultCode.SUCCESS, "修改成功"),
    ADD_SUCCESS(ResultCode.SUCCESS, "添加成功"),
    DELETE_SUEECSS(ResultCode.SUCCESS, "删除成功"),


    LOGIN_ERROR(ResultCode.FAILED, "登陆失败，用户名或密码错误"),
    LOGINED_STATUS(ResultCode.FAILED, "该用户已登录"),
    //用户已停用(1)

    BAD_REQUEST("400", "参数或者语法不对"),

    UNAUTHORIZED("401", "认证失败"),
    UNLOGIN_STATUS("401", "已退出登录"),
    INVALID_TOKEN("401", "Token不合法"),
    EXPIRED_TOKEN("401", "Token已过期"),
    EXPIRED_Identify("401", "身份已失效，请重新登录"),

    FORBIDDEN("403", "权限不足,禁止访问"),
    NOT_FOUND("404", "请求的资源不存在"),
    OPERATE_ERROR("405", "操作失败，请求操作的资源不存在"),
    TIME_OUT("408", "请求超时"),
    SERVER_ERROR("500", "服务器内部错误"),

    DATA_ERROR("1", "数据错误");

    private String code;
    private String msg;

    public static final String SUCCESS = "0";
    public static final String FAILED = "1";
    public static final String ERROR = "-1";

    ResultCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}