package cn.ibilling.controller;

import cn.ibilling.bean.bo.APIResultBean;
import cn.ibilling.bean.query.IdParameter;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.validation.Valid;
import java.util.Map;

/**
 * @author Taeyeon
 * @createTime 2019-11-14-10:37
 */
@RestController
@EnableSwagger2
public class ProductController {

//    @GetMapping("/product")
//    public APIResultBean findProduct() {
//        JSONObject result = new JSONObject();
//        result.put("productList", "");
//        return new APIResultBean<Map>("0", "查询成功", result);
//    }

    @ApiOperation(value = "根据产品ID删除产品", notes = "根据产品ID删除产品")
    @ApiImplicitParam(
            name = "id", value = "产品Id", required = true, paramType = "body")
    @ApiResponses({
            @ApiResponse(code = 0, message = "删除成功"),
            @ApiResponse(code = 1, message = "删除失败，产品不存在")
    })
    @PostMapping("/product/delete")
    public APIResultBean deleteProductByPrimaryKey(@RequestBody @Valid IdParameter id) {
        return new APIResultBean("0", "删除成功");
    }
}
