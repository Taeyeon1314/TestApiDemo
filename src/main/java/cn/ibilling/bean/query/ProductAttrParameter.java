package cn.ibilling.bean.query;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Taeyeon
 * @createTime 2019-11-15-9:27
 */
public class ProductAttrParameter {
    //属性名称
    @ApiModelProperty(value = "属性名称", name = "attrField")
    private String attrField;
    //属性值
    @ApiModelProperty(value = "属性值", name = "attrValue")
    private String attrValue;

    public ProductAttrParameter() {
    }

    public ProductAttrParameter(String attrField, String attrValue) {
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
