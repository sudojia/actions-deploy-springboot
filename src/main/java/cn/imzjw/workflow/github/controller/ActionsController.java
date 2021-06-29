package cn.imzjw.workflow.github.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author https://blog.imzjw.cn
 * @date 2021/6/29 15:10
 */
@RestController
public class ActionsController {

    @GetMapping("actions")
    public String actions() {
        return "使用 GitHub Actions 部署至服务器";
    }
}
