package cn.ibilling.bean.dto;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table product_attr
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class ProductAttrDO implements Serializable {
    /**
     *
     * @mbg.generated do_not_delete_during_merge
     * 
     * 对应数据库字段 product_attr.PRODUCT_ATTR_ID
     */
    private String productAttrId;

    /**
     *
     * @mbg.generated do_not_delete_during_merge
     * 产品ID
     * 对应数据库字段 product_attr.PRODUCT_ID
     */
    private String productId;

    /**
     *
     * @mbg.generated do_not_delete_during_merge
     * 产品名称
     * 对应数据库字段 product_attr.ATTR_FIELD
     */
    private String attrField;

    /**
     *
     * @mbg.generated do_not_delete_during_merge
     * 产品类型
     * 对应数据库字段 product_attr.ATTR_NAME
     */
    private String attrName;

    /**
     *
     * @mbg.generated do_not_delete_during_merge
     * 
     * 对应数据库字段 product_attr.ATTR_DESC
     */
    private String attrDesc;

    /**
     *
     * @mbg.generated do_not_delete_during_merge
     * 
     * 对应数据库字段 product_attr.ATTR_VALUE
     */
    private String attrValue;

    /**
     *
     * @mbg.generated do_not_delete_during_merge
     * 产品状态
     * 对应数据库字段 product_attr.ALLOW_CUSTOMIZE_FLAG
     */
    private String allowCustomizeFlag;

    /**
     *
     * @mbg.generated do_not_delete_during_merge
     * 
     * 对应数据库字段 product_attr.AAA_ATTR_TYPE
     */
    private String aaaAttrType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_attr
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_attr.PRODUCT_ATTR_ID
     *
     * @return the value of product_attr.PRODUCT_ATTR_ID
     *
     * @mbg.generated
     */
    public String getProductAttrId() {
        return productAttrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_attr.PRODUCT_ATTR_ID
     *
     * @param productAttrId the value for product_attr.PRODUCT_ATTR_ID
     *
     * @mbg.generated
     */
    public void setProductAttrId(String productAttrId) {
        this.productAttrId = productAttrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_attr.PRODUCT_ID
     *
     * @return the value of product_attr.PRODUCT_ID
     *
     * @mbg.generated
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_attr.PRODUCT_ID
     *
     * @param productId the value for product_attr.PRODUCT_ID
     *
     * @mbg.generated
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_attr.ATTR_FIELD
     *
     * @return the value of product_attr.ATTR_FIELD
     *
     * @mbg.generated
     */
    public String getAttrField() {
        return attrField;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_attr.ATTR_FIELD
     *
     * @param attrField the value for product_attr.ATTR_FIELD
     *
     * @mbg.generated
     */
    public void setAttrField(String attrField) {
        this.attrField = attrField;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_attr.ATTR_NAME
     *
     * @return the value of product_attr.ATTR_NAME
     *
     * @mbg.generated
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_attr.ATTR_NAME
     *
     * @param attrName the value for product_attr.ATTR_NAME
     *
     * @mbg.generated
     */
    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_attr.ATTR_DESC
     *
     * @return the value of product_attr.ATTR_DESC
     *
     * @mbg.generated
     */
    public String getAttrDesc() {
        return attrDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_attr.ATTR_DESC
     *
     * @param attrDesc the value for product_attr.ATTR_DESC
     *
     * @mbg.generated
     */
    public void setAttrDesc(String attrDesc) {
        this.attrDesc = attrDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_attr.ATTR_VALUE
     *
     * @return the value of product_attr.ATTR_VALUE
     *
     * @mbg.generated
     */
    public String getAttrValue() {
        return attrValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_attr.ATTR_VALUE
     *
     * @param attrValue the value for product_attr.ATTR_VALUE
     *
     * @mbg.generated
     */
    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_attr.ALLOW_CUSTOMIZE_FLAG
     *
     * @return the value of product_attr.ALLOW_CUSTOMIZE_FLAG
     *
     * @mbg.generated
     */
    public String getAllowCustomizeFlag() {
        return allowCustomizeFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_attr.ALLOW_CUSTOMIZE_FLAG
     *
     * @param allowCustomizeFlag the value for product_attr.ALLOW_CUSTOMIZE_FLAG
     *
     * @mbg.generated
     */
    public void setAllowCustomizeFlag(String allowCustomizeFlag) {
        this.allowCustomizeFlag = allowCustomizeFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_attr.AAA_ATTR_TYPE
     *
     * @return the value of product_attr.AAA_ATTR_TYPE
     *
     * @mbg.generated
     */
    public String getAaaAttrType() {
        return aaaAttrType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_attr.AAA_ATTR_TYPE
     *
     * @param aaaAttrType the value for product_attr.AAA_ATTR_TYPE
     *
     * @mbg.generated
     */
    public void setAaaAttrType(String aaaAttrType) {
        this.aaaAttrType = aaaAttrType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attr
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productAttrId=").append(productAttrId);
        sb.append(", productId=").append(productId);
        sb.append(", attrField=").append(attrField);
        sb.append(", attrName=").append(attrName);
        sb.append(", attrDesc=").append(attrDesc);
        sb.append(", attrValue=").append(attrValue);
        sb.append(", allowCustomizeFlag=").append(allowCustomizeFlag);
        sb.append(", aaaAttrType=").append(aaaAttrType);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attr
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ProductAttrDO other = (ProductAttrDO) that;
        return (this.getProductAttrId() == null ? other.getProductAttrId() == null : this.getProductAttrId().equals(other.getProductAttrId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getAttrField() == null ? other.getAttrField() == null : this.getAttrField().equals(other.getAttrField()))
            && (this.getAttrName() == null ? other.getAttrName() == null : this.getAttrName().equals(other.getAttrName()))
            && (this.getAttrDesc() == null ? other.getAttrDesc() == null : this.getAttrDesc().equals(other.getAttrDesc()))
            && (this.getAttrValue() == null ? other.getAttrValue() == null : this.getAttrValue().equals(other.getAttrValue()))
            && (this.getAllowCustomizeFlag() == null ? other.getAllowCustomizeFlag() == null : this.getAllowCustomizeFlag().equals(other.getAllowCustomizeFlag()))
            && (this.getAaaAttrType() == null ? other.getAaaAttrType() == null : this.getAaaAttrType().equals(other.getAaaAttrType()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attr
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductAttrId() == null) ? 0 : getProductAttrId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getAttrField() == null) ? 0 : getAttrField().hashCode());
        result = prime * result + ((getAttrName() == null) ? 0 : getAttrName().hashCode());
        result = prime * result + ((getAttrDesc() == null) ? 0 : getAttrDesc().hashCode());
        result = prime * result + ((getAttrValue() == null) ? 0 : getAttrValue().hashCode());
        result = prime * result + ((getAllowCustomizeFlag() == null) ? 0 : getAllowCustomizeFlag().hashCode());
        result = prime * result + ((getAaaAttrType() == null) ? 0 : getAaaAttrType().hashCode());
        return result;
    }
}