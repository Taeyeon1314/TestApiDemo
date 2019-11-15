package cn.ibilling.bean.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @author Taeyeon
 * @createTime 2019-11-14-18:09
 */

public class ProductBean {
    //产品ID
    @ApiModelProperty(value = "产品ID", name = "productId")
    private String productId;
    //产品名称
    @ApiModelProperty(value = "产品名称", name = "productName")
    private String productName;
    //产品类型
    @ApiModelProperty(value = "产品类型", name = "productType")
    private String productType;
    //属性类型
    @ApiModelProperty(value = "属性类型", name = "propertyType")
    private String propertyType;
    //计费方式
    @ApiModelProperty(value = "计费方式", name = "billingModeId")
    private String billingModeId;
    //生效时间
    @ApiModelProperty(value = "生效时间", name = "eftDate")
    private Date eftDate;
    //失效时间
    @ApiModelProperty(value = "失效时间", name = "expDate")
    private Date expDate;
    //状态
    @ApiModelProperty(value = "状态", name = "state")
    private String state;
    //备注
    @ApiModelProperty(value = "备注", name = "remark")
    private String remark;
    //创建时间
    @ApiModelProperty(value = "创建时间", name = "createDate")
    private Date createDate;
    //最近更新时间
    @ApiModelProperty(value = "最近更新时间", name = "lastUpdateDate")
    private Date lastUpdateDate;
    //定价计划ID
    @ApiModelProperty(value = "定价计划ID", name = "pricingPlanId")
    private String pricingPlanId;


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getBillingModeId() {
        return billingModeId;
    }

    public void setBillingModeId(String billingModeId) {
        this.billingModeId = billingModeId;
    }

    public Date getEftDate() {
        return eftDate;
    }

    public void setEftDate(Date eftDate) {
        this.eftDate = eftDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getPricingPlanId() {
        return pricingPlanId;
    }

    public void setPricingPlanId(String pricingPlanId) {
        this.pricingPlanId = pricingPlanId;
    }

    @Override
    public String toString() {
        return "ProductBean{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", propertyType='" + propertyType + '\'' +
                ", billingModeId='" + billingModeId + '\'' +
                ", eftDate=" + eftDate +
                ", expDate=" + expDate +
                ", state='" + state + '\'' +
                ", remark='" + remark + '\'' +
                ", createDate=" + createDate +
                ", lastUpdateDate=" + lastUpdateDate +
                ", pricingPlanId='" + pricingPlanId + '\'' +
                '}';
    }
}
