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
    @PostMapping("/product/batchEnable")
    public APIResultBean batchEnableProductByPrimaryKey(@RequestBody @Valid IdsParameter ids) {
        return new APIResultBean("0", "启用成功");
    }

    /**
     * 根据一些条件查询产品记录数
     *
     * @param findProductParameter 查询条件
     * @return json
     */
    @ApiOperation(value = "查询产品记录数", notes = "根据一些条件查询产品记录数")
    @GetMapping("/product/total")
    public APIResultBean<PageTotalBean> getProductCount(@RequestBody @Valid FindProductParameter findProductParameter) {
        return new APIResultBean("0", "查询成功", new PageTotalBean("100"));
    }

    /**
     * 新增产品数据
     *
     * @param insertAndUpdateProductParameter 产品数据
     * @return json
     */
    @ApiOperation(value = "新增产品", notes = "新增产品数据")
    @PostMapping("/product/add")
    public APIResultBean<IdParameter> insertProduct(@RequestBody @Valid InsertAndUpdateProductParameter insertAndUpdateProductParameter) {
        return new APIResultBean("0", "新增成功", new IdParameter("100"));
    }


    /**
     * 修改产品数据
     *
     * @param insertAndUpdateProductParameter 产品数据
     * @return json
     */
    @ApiOperation(value = "修改产品数据", notes = "修改产品数据")
    @PostMapping("/product/update")
    public APIResultBean<IdParameter> updateProduct(@RequestBody @Valid InsertAndUpdateProductParameter insertAndUpdateProductParameter) {
        return new APIResultBean("0", "修改成功", new IdParameter("100"));
    }


    /**
     * 查询产品属性数据
     *
     * @param id 产品Id
     * @return json
     */
    @ApiOperation(value = "查询产品属性数据", notes = "根据产品Id查询产品属性数据")
    @GetMapping("/product/attrList")
    public APIResultBean<ListObject<ProductAttrBean>> getProductAttrList(@RequestBody @Valid IdParameter id) {
        List<ProductAttrBean> productAttrBeanList = new ArrayList<>();
        return new APIResultBean("0", "查询成功", productAttrBeanList);
    }

}
