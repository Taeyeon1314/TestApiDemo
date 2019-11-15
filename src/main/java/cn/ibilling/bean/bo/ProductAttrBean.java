package cn.ibilling.bean.bo;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Taeyeon
 * @createTime 2019-11-15-10:27
 */
public class ProductAttrBean {
    //产品属性Id
    @ApiModelProperty(value = "产品属性Id", name = "productAttrId")
    private String productAttrId;
    //产品Id
    @ApiModelProperty(value = "产品Id", name = "productId")
    private String productId;
    //产品属性标识
    @ApiModelProperty(value = "产品属性标识", name = "attrField")
    private String attrField;
    //产品属性名
    @ApiModelProperty(value = "产品属性名", name = "attrName")
    private String attrName;
    //产品属性描述
    @ApiModelProperty(value = "产品属性描述", name = "attrDesc")
    private String attrDesc;
    //产品属性值
    @ApiModelProperty(value = "产品属性值", name = "attrValue")
    private String attrValue;

    public ProductAttrBean() {
    }

    public ProductAttrBean(String productAttrId, String productId, String attrField, String attrName, String attrDesc, String attrValue) {
        this.productAttrId = productAttrId;
        this.productId = productId;
        this.attrField = attrField;
        this.attrName = attrName;
        this.attrDesc = attrDesc;
        this.attrValue = attrValue;
    }

    public String getProductAttrId() {
        return productAttrId;
    }

    public void setProductAttrId(String productAttrId) {
        this.productAttrId = productAttrId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getAttrField() {
        return attrField;
    }

    public void setAttrField(String attrField) {
        this.attrField = attrField;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrDesc() {
        return attrDesc;
    }

    public void setAttrDesc(String attrDesc) {
        this.attrDesc = attrDesc;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }
}
