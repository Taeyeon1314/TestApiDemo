package cn.ibilling.controller;

import cn.ibilling.bean.bo.*;
import cn.ibilling.bean.query.FindProductParameter;
import cn.ibilling.bean.query.IdParameter;
import cn.ibilling.bean.query.IdsParameter;
import cn.ibilling.bean.query.InsertAndUpdateProductParameter;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Taeyeon
 * @createTime 2019-11-14-10:37
 */
@RestController
@EnableSwagger2
public class ProductController {

    @ApiOperation(value = "查询产品", notes = "根据一些条件查询产品数据")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "productName", value = "产品名称", required = false, paramType = "body"),
//            @ApiImplicitParam(name = "state", value = "状态", required = false, paramType = "body"),
//            @ApiImplicitParam(name = "remark", value = "备注", required = false, paramType = "body"),
//            @ApiImplicitParam(name = "columnName", value = "列名", required = false, paramType = "body"),
//            @ApiImplicitParam(name = "order", value = "排序规则", required = false, paramType = "body"),
//            @ApiImplicitParam(name = "start", value = "起始页", required = false, paramType = "body"),
//            @ApiImplicitParam(name = "limit", value = "单页数", required = false, paramType = "body")
//    })
    @GetMapping("/product")
    public APIResultBean<ListObject<ProductBean>> findProduct(@RequestBody @Valid FindProductParameter findProductParameter) {
        List<ProductBean> productBeanList = new ArrayList<>();
        return new APIResultBean("0", "查询成功", productBeanList);
    }

    /**
     * 根据产品ID删除产品
     *
     * @param id 产品Id
     * @return json
     */
    @ApiOperation(value = "删除产品", notes = "根据产品ID删除产品")
//    @ApiImplicitParam(
//            name = "productId", value = "产品Id", required = true, paramType = "body")
    @PostMapping("/product/delete")
    public APIResultBean deleteProductByPrimaryKey(@RequestBody @Valid IdParameter id) {
        return new APIResultBean("0", "删除成功");
    }

    /**
     * 根据产品ID批量删除产品
     *
     * @param ids 被批量删除的产品Id
     * @return json
     */
    @ApiOperation(value = "批量删除产品", notes = "根据产品ID批量删除产品")
//    @ApiImplicitParam(
//            name = "ids", value = "id以逗号分隔", required = true, paramType = "body")
    @PostMapping("/product/batchDelete")
    public APIResultBean batchDeleteProductByPrimaryKey(@RequestBody @Valid IdsParameter ids) {
        return new APIResultBean("0", "删除成功");
    }

    /**
     * 根据产品ID禁用产品
     *
     * @param id 产品Id
     * @return json
     */
    @ApiOperation(value = "禁用产品", notes = "根据产品ID禁用产品")
//    @ApiImplicitParam(
//            name = "productId", value = "产品Id", required = true, paramType = "body")
    @PostMapping("/product/disable")
    public APIResultBean disableProductByPrimaryKey(@RequestBody @Valid IdParameter id) {
        return new APIResultBean("0", "禁用成功");
    }

    /**
     * 根据产品ID批量禁用产品
     *
     * @param ids 被批量禁用的产品Id
     * @return json
     */
    @ApiOperation(value = "批量禁用产品", notes = "根据产品ID批量禁用产品")
//    @ApiImplicitParam(
//            name = "ids", value = "id以逗号分隔", required = true, paramType = "body")
    @PostMapping("/product/batchDisable")
    public APIResultBean batchDisableProductByPrimaryKey(@RequestBody @Valid IdsParameter ids) {
        return new APIResultBean("0", "禁用成功");
    }

    /**
     * 根据产品ID启用产品
     *
     * @param id 产品Id
     * @return json
     */
    @ApiOperation(value = "启用产品", notes = "根据产品ID启用产品")
//    @ApiImplicitParam(
//            name = "productId", value = "产品Id", required = true, paramType = "body")
    @PostMapping("/product/enable")
    public APIResultBean enableProductByPrimaryKey(@RequestBody @Valid IdParameter id) {
        return new APIResultBean("0", "启用成功");
    }

    /**
     * 根据产品ID批量启用产品
     *
     * @param ids 被批量启用的产品Id
     * @return json
     */
    @ApiOperation(value = "批量启用产品", notes = "根据产品ID批量启用产品")
//    @ApiImplicitParam(
//            name = "ids", value = "id以逗号分隔", required = true, paramType = "body")
    @PostMapping("/product/batchEnable")
    public APIResultBean batchEnableProductByPrimaryKey(@RequestBody @Valid IdsParameter ids) {
        return new APIResultBean("0", "启用成功");
    }

    @ApiOperation(value = "查询产品记录数", notes = "根据一些条件查询产品记录数")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "productName", value = "产品名称", required = false, paramType = "body"),
//            @ApiImplicitParam(name = "state", value = "状态", required = false, paramType = "body"),
//            @ApiImplicitParam(name = "remark", value = "备注", required = false, paramType = "body")
//    })
    @GetMapping("/product/total")
    public APIResultBean<PageTotalBean> getProductCount(@RequestBody @Valid FindProductParameter findProductParameter) {
        return new APIResultBean("0", "查询成功", new PageTotalBean("100"));
    }

    @ApiOperation(value = "查询产品", notes = "根据一些条件查询产品数据")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "productName", value = "产品名称", required = true, paramType = "body"),
//            @ApiImplicitParam(name = "productType", value = "产品类型", required = true, paramType = "body"),
//            @ApiImplicitParam(name = "propertyType", value = "属性类型", required = true, paramType = "body"),
//            @ApiImplicitParam(name = "billingModeId", value = "计费方式", required = true, paramType = "body"),
//            @ApiImplicitParam(name = "eftDate", value = "生效时间", required = true, paramType = "body"),
//            @ApiImplicitParam(name = "expDate", value = "失效时间", required = true, paramType = "body"),
//            @ApiImplicitParam(name = "remark", value = "备注", required = true, paramType = "body"),
//            @ApiImplicitParam(name = "pricingPlanId", value = "定价计划ID", required = true, paramType = "body"),
//            @ApiImplicitParam(name = "attrs", value = "产品属性数组", required = true, paramType = "body", dataType = "List")
//    })
    @GetMapping("/product/add")
    public APIResultBean<IdParameter> insertProduct(@RequestBody @Valid InsertAndUpdateProductParameter insertAndUpdateProductParameter) {
        return new APIResultBean("0", "新增成功", new IdParameter("100"));
    }


}
