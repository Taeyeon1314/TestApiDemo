package cn.ibilling.bean.query;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Taeyeon
 * @createTime 2019-11-15-17:14
 */
public class QueryProductOfferParameter {

    @ApiModelProperty(value = "销售品名称", name = "offerName", required = false)
    private String offerName;
    //状态
    @ApiModelProperty(value = "状态", name = "state", required = false)
    private String state;
    //备注
    @ApiModelProperty(value = "备注", name = "remark", required = false)
    private String remark;
    //起始页
    @ApiModelProperty(value = "起始页", name = "start", required = false)
    private Integer start = 0;
    //单页数
    @ApiModelProperty(value = "单页数", name = "limit", required = false)
    private Integer limit = 20;

    public QueryProductOfferParameter() {
    }

    public QueryProductOfferParameter(String offerName, String state, String remark, Integer start, Integer limit) {
        this.offerName = offerName;
        this.state = state;
        this.remark = remark;
        this.start = start;
        this.limit = limit;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
