package cn.ibilling.bean.bo;

import cn.ibilling.constant.ResultCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Taeyeon
 * @createTime 2019-11-14-10:24
 */
@ApiModel(value = "APIResultBean", description = "通用返回对象")
public class APIResultBean<T> {

    @ApiModelProperty(value = "调用是否正常的标志", name = "resultCode")
    private String resultCode;

    @ApiModelProperty(value = "接口返回resultMsg，如果resultCode是1，那么resultMsg是错误信息", name = "resultMsg")
    private String resultMsg;

    @ApiModelProperty(value = "调用成功，返回的数据", name = "result")
    private T result;


    public APIResultBean(String resultCode, String resultMsg, T result) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.result = result;
    }

    public APIResultBean(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.result = null;
    }

    public APIResultBean(ResultCode resultCode) {
        this.resultCode = resultCode.getCode();
        this.resultMsg = resultCode.getMsg();
        this.result = null;
    }

    public APIResultBean(ResultCode resultCode, T result) {
        this.resultCode = resultCode.getCode();
        this.resultMsg = resultCode.getMsg();
        this.result = result;
    }


    @Override
    public String toString() {
        return "APIResultBean{" +
                "resultCode='" + resultCode + '\'' +
                ", resultMsg='" + resultMsg + '\'' +
                ", result=" + result +
                '}';
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

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}