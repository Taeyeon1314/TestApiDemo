package cn.ibilling.controller;

import cn.ibilling.bean.bo.APIResultBean;
import cn.ibilling.bean.query.IdParameter;
import cn.ibilling.bean.query.InsertProductOfferParameter;
import cn.ibilling.bean.query.UpdateProductOfferParameter;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.validation.Valid;

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
    public APIResultBean<IdParameter> updateProductOffer(@RequestBody @Valid UpdateProductOfferParameter updateProductOfferParameter) {
        return new APIResultBean("0", "修改成功", new IdParameter("100"));

    }
}
