package cn.ibilling.bean;

/**
 * @author Taeyeon
 * @createTime 2019-10-29-16:48
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 封装返回数据javabean
 **/
@ApiModel(value = "Result", description = "通用返回对象")
public class Result {

    @ApiModelProperty(value = "调用是否正常", name = "resultCode")
    private String resultCode;
    @ApiModelProperty(value = "接口返回resultMsg，如果resultCode是1，那么resultMsg是错误信息", name = "resultMsg")
    private String resultMsg;
    @ApiModelProperty(value = "调用成功，返回的数据", name = "result")
    private Object result;

    public Result() {
    }

    public Result(String resultCode, String resultMsg, Object result) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.result = result;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}