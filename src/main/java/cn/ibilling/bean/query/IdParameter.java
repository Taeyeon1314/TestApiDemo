package cn.ibilling.bean.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

/**
 * @author Taeyeon
 * @createTime 2019-11-14-14:48
 */
@ApiModel(value = "IdParameter", description = "id参数类")
public class IdParameter {

    @NotEmpty(message = "id不能为空")
    @ApiModelProperty(value = "id", name = "ID")
    private String id;

    @Override
    public String toString() {

        return "IdParameter{" +
                "id='" + id + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
