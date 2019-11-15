package cn.ibilling.bean.bo;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Taeyeon
 * @createTime 2019-11-15-10:27
 */
public class ProductAttrBean {

    //产品属性标识
    @ApiModelProperty(value = "产品属性标识", name = "attrField")
    private String attrField;
    //产品属性值
    @ApiModelProperty(value = "产品属性值", name = "attrValue")
    private String attrValue;

    public ProductAttrBean() {
    }

    public ProductAttrBean(String attrField, String attrValue) {
        this.attrField = attrField;
        this.attrValue = attrValue;
    }

    public String getAttrField() {
        return attrField;
    }

    public void setAttrField(String attrField) {
        this.attrField = attrField;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }
}
