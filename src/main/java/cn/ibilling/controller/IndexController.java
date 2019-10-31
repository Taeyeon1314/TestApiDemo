package cn.ibilling.controller;


import cn.ibilling.bean.Result;
import cn.ibilling.pojo.Info;
import cn.ibilling.pojo.User;
import cn.ibilling.service.InfoService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Controller
@EnableSwagger2
public class IndexController {

    @ApiOperation(value = "根据用户名查询用户信息", notes = "查询数据库中某个的用户信息")
    @ApiImplicitParam(name = "username", value = "用户名", paramType = "path", required = true, dataType = "String")
    @GetMapping(value = "/user/{username}")
    @ResponseBody
    public Result getUserByName(@PathVariable String username) {
        if (username.equals("admin")) {
            return new Result("0", "查询成功", new User(username, "1234567"));
        } else {
            return new Result("1", "查询失败", null);
        }
    }

    @ApiOperation(value = "根据用户ID查询用户信息", notes = "查询数据库中某个的用户信息")
    @ApiImplicitParam(name = "id", value = "用户id", paramType = "path", required = true, dataType = "Integer")
    @GetMapping(value = "/user/{id}")
    @ResponseBody
    public Result getUserById(@PathVariable Integer id) {
        return new Result("0", "查询成功", new User("admin", "1234567"));
    }

    @ApiOperation(value = "用户登陆接口", notes = "用户用户登陆验证接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String")
    })
    @PostMapping("/login")
    @ResponseBody
    public Result testSwagger(String username, String password) {
        return new Result("0", "请求成功", new User(username, password));
    }
}