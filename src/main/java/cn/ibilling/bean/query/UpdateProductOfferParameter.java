package cn.ibilling.bean.query;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

/**
 * @author Taeyeon
 * @createTime 2019-11-15-13:38
 */
public class UpdateProductOfferParameter {

    @ApiModelProperty(value = "销售品ID", name = "offerId", required = true)
    private String offerId;
    @ApiModelProperty(value = "销售品名称", name = "offerName", required = true)
    private String offerName;
    @ApiModelProperty(value = "生效时间", name = "eftDate", required = false)
    private Date effDate;
    @ApiModelProperty(value = "失效时间", name = "expDate", required = false)
    private Date expDate;
    @ApiModelProperty(value = "备注", name = "expDate", required = false)
    private String remark;
    @ApiModelProperty(value = "产品ID集合", name = "productIds", dataType = "List", required = true)
    private List<String> productIds;

    public UpdateProductOfferParameter() {
    }

    public UpdateProductOfferParameter(String offerId, String offerName, Date effDate, Date expDate, String remark, List<String> productIds) {
        this.offerId = offerId;
        this.offerName = offerName;
        this.effDate = effDate;
        this.expDate = expDate;
        this.remark = remark;
        this.productIds = productIds;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public Date getEffDate() {
        return effDate;
    }

    public void setEffDate(Date effDate) {
        this.effDate = effDate;
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

    public List<String> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }
}
