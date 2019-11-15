package cn.ibilling.bean.query;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

/**
 * @author Taeyeon
 * @createTime 2019-11-15-14:13
 */
public class UpdateProductParameter {

    //产品名称
    @ApiModelProperty(value = "产品Id", name = "productId", required = true)
    private String productId;
    //产品名称
    @ApiModelProperty(value = "产品名称", name = "productName", required = true)
    private String productName;
    //产品类型
    @ApiModelProperty(value = "产品类型", name = "productType", required = true)
    private String productType;
    //属性类型
    @ApiModelProperty(value = "属性类型", name = "propertyType", required = true)
    private String propertyType;
    //计费方式
    @ApiModelProperty(value = "计费方式", name = "billingModeId", required = false)
    private String billingModeId;
    //生效时间
    @ApiModelProperty(value = "生效时间", name = "eftDate", required = false)
    private Date eftDate;
    //失效时间
    @ApiModelProperty(value = "失效时间", name = "expDate", required = false)
    private Date expDate;
    //备注
    @ApiModelProperty(value = "备注", name = "remark", required = false)
    private String remark;
    //定价计划ID
    @ApiModelProperty(value = "定价计划ID", name = "pricingPlanId", required = false)
    private String pricingPlanId;
    //定价计划ID
    @ApiModelProperty(value = "产品属性数组", name = "attrs", dataType = "List", required = false)
    private List<ProductAttrParameter> attrs;

    public UpdateProductParameter() {
    }

    public UpdateProductParameter(String productId, String productName, String productType, String propertyType, String billingModeId, Date eftDate, Date expDate, String remark, String pricingPlanId, List<ProductAttrParameter> attrs) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.propertyType = propertyType;
        this.billingModeId = billingModeId;
        this.eftDate = eftDate;
        this.expDate = expDate;
        this.remark = remark;
        this.pricingPlanId = pricingPlanId;
        this.attrs = attrs;
    }

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPricingPlanId() {
        return pricingPlanId;
    }

    public void setPricingPlanId(String pricingPlanId) {
        this.pricingPlanId = pricingPlanId;
    }

    public List<ProductAttrParameter> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<ProductAttrParameter> attrs) {
        this.attrs = attrs;
    }
}
