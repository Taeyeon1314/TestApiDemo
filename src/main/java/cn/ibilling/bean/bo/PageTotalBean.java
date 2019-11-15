package cn.ibilling.bean.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Taeyeon
 * @createTime 2019-11-15-9:14
 */
@ApiModel(value = "PageTotalBean", description = "分页记录数类")
public class PageTotalBean {

    @ApiModelProperty(value = "记录总数", name = "pageTotal")
    private String pageTotal;

    public PageTotalBean(String pageTotal) {
        this.pageTotal = pageTotal;
    }

    public PageTotalBean() {
    }

    public String getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(String pageTotal) {
        this.pageTotal = pageTotal;
    }


}
