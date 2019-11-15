package cn.ibilling.bean.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author Taeyeon
 * @createTime 2019-11-14-14:45
 */
@ApiModel(value = "IdsParameter", description = "批量Id类")
public class IdsParameter {

    @NotEmpty(message = "ids不能为空")
    @ApiModelProperty(value = "批量Id,id以逗号分隔", name = "ids", required = true)
    private String ids;

    public IdsParameter(@NotNull @NotEmpty String ids) {
        this.ids = ids;
    }

    public IdsParameter() {
    }

    @Override
    public String toString() {
        return "IdsParameter{" +
                "ids='" + ids + '\'' +
                '}';
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getIds() {
        return ids;
    }
}
