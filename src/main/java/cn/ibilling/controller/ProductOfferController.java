package cn.ibilling.controller;

import cn.ibilling.bean.bo.APIResultBean;
import cn.ibilling.bean.bo.ListObject;
import cn.ibilling.bean.bo.PageTotalBean;
import cn.ibilling.bean.bo.ProductOfferBean;
import cn.ibilling.bean.query.*;
import io.swagger.annotations.ApiOperation;
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
 * @createTime 2019-11-15-14:00
 */
@RestController
@EnableSwagger2
public class ProductOfferController {

    /**
     * 新增销售品
     *
     * @param insertProductOfferParameter 销售品信息
     * @return json
     */
    @ApiOperation(value = "新增销售品", notes = "新增销售品数据")
    @PostMapping("/productOffer/add")
    public APIResultBean<IdParameter> insertProductOffer(@RequestBody @Valid InsertProductOfferParameter insertProductOfferParameter) {
        return new APIResultBean("0", "新增成功", new IdParameter("100"));

    }

    /**
     * 修改销售品
     *
     * @param updateProductOfferParameter 销售品信息
     * @return json
     */
    @ApiOperation(value = "修改销售品", notes = "修改销售品数据")
    @PostMapping("/productOffer/update")
    public APIResultBean updateProductOffer(@RequestBody @Valid UpdateProductOfferParameter updateProductOfferParameter) {
        return new APIResultBean("0", "修改成功");
    }

    /**
     * 根据销售品ID删除销售品
     *
     * @param id 产品Id
     * @return json
     */
    @ApiOperation(value = "删除销售品", notes = "根据产品ID删除销售品")
    @PostMapping("/productOffer/delete")
    public APIResultBean deleteProductOfferById(@RequestBody @Valid IdParameter id) {
        return new APIResultBean("0", "删除成功");
    }

    /**
     * 根据销售品ID批量删除销售品
     *
     * @param ids 被批量删除的销售品Id
     * @return json
     */
    @ApiOperation(value = "批量删除销售品", notes = "根据产品ID批量删除销售品")
    @PostMapping("/productOffer/batchDelete")
    public APIResultBean batchDeleteProductOfferById(@RequestBody @Valid IdsParameter ids) {
        return new APIResultBean("0", "删除成功");
    }

    /**
     * 根据销售品ID禁用销售品
     *
     * @param id 销售品Id
     * @return json
     */
    @ApiOperation(value = "禁用销售品", notes = "根据销售品ID禁用产品")
    @PostMapping("/productOffer/disable")
    public APIResultBean disableProductOfferById(@RequestBody @Valid IdParameter id) {
        return new APIResultBean("0", "禁用成功");
    }

    /**
     * 根据销售品ID批量禁用销售品
     *
     * @param ids 被批量禁用的销售品Id
     * @return json
     */
    @ApiOperation(value = "批量禁用销售品", notes = "根据销售品ID批量禁用产品")
    @PostMapping("/productOffer/batchDisable")
    public APIResultBean batchDisableProductOfferById(@RequestBody @Valid IdsParameter ids) {
        return new APIResultBean("0", "禁用成功");
    }

    /**
     * 根据销售品ID启用销售品
     *
     * @param id 销售品Id
     * @return json
     */
    @ApiOperation(value = "启用销售品", notes = "根据产品ID启用销售品")
    @PostMapping("/productOffer/enable")
    public APIResultBean enableProductOfferById(@RequestBody @Valid IdParameter id) {
        return new APIResultBean("0", "启用成功");
    }

    /**
     * 根据销售品ID批量启用销售品
     *
     * @param ids 被批量启用的销售品Id
     * @return json
     */
    @ApiOperation(value = "批量启用销售品", notes = "根据产品ID批量启用销售品")
    @PostMapping("/productOffer/batchEnable")
    public APIResultBean batchEnableProductOfferById(@RequestBody @Valid IdsParameter ids) {
        return new APIResultBean("0", "启用成功");
    }

    /**
     * 根据一些条件查询销售品数据
     *
     * @param queryProductParameter 查询条件
     * @return json
     */
    @ApiOperation(value = "查询销售品", notes = "根据一些条件查询销售品数据")
    @GetMapping("/productOffer")
    public APIResultBean<ListObject<ProductOfferBean>> getProducts(@RequestBody @Valid QueryProductParameter queryProductParameter) {
        List<ProductOfferBean> productBeanList = new ArrayList<>();
        return new APIResultBean("0", "查询成功", productBeanList);
    }

    /**
     * 根据一些条件查询销售品记录数
     *
     * @param queryProductOfferParameter 查询条件
     * @return json
     */
    @ApiOperation(value = "查询销售品记录数", notes = "根据一些条件查询销售品记录数")
    @GetMapping("/productOffer/total")
    public APIResultBean<PageTotalBean> getProductCount(@RequestBody @Valid QueryProductOfferParameter queryProductOfferParameter) {
        return new APIResultBean("0", "查询成功", new PageTotalBean("100"));
    }

}
