package cn.ibilling.bean.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Taeyeon
 * @createTime 2019-11-14-16:33
 */
@ApiModel(value = "QueryProductParameter", description = "产品查询类")
public class QueryProductParameter {
    //产品名称
    @ApiModelProperty(value = "产品名称", name = "productName", required = false)
    private String productName;
    //状态
    @ApiModelProperty(value = "状态", name = "state", required = false)
    private String state;
    //备注
    @ApiModelProperty(value = "备注", name = "remark", required = false)
    private String remark;
    //列名
    @ApiModelProperty(value = "列名", name = "columnName", required = false)
    private String columnName;
    //排序规则
    @ApiModelProperty(value = "排序规则", name = "order", required = false)
    private String order;
    //起始页
    @ApiModelProperty(value = "起始页", name = "start", required = false)
    private Integer start = 0;
    //单页数
    @ApiModelProperty(value = "单页数", name = "limit", required = false)
    private Integer limit = 20;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
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

    @Override
    public String toString() {
        return "QueryProductParameter{" +
                "productName='" + productName + '\'' +
                ", state='" + state + '\'' +
                ", remark='" + remark + '\'' +
                ", columnName='" + columnName + '\'' +
                ", order='" + order + '\'' +
                ", start=" + start +
                ", limit=" + limit +
                '}';
    }
}
