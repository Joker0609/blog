package com.personal.blog.web.controller.api;

import com.personal.blog.base.lang.Consts;
import com.personal.blog.base.lang.Result;
import com.personal.blog.base.utils.BeanMapUtils;
import com.personal.blog.modules.data.PostVO;
import com.personal.blog.modules.service.PostService;
import com.personal.blog.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 侧边栏数据加载
 * @author weizp
 */
@RestController
@RequestMapping("/api")
public class ApiController extends BaseController {
    @Autowired
    private PostService postService;

    @PostMapping(value = "/login")
    public Result login(String username, String password) {
        return executeLogin(username, password, false);
    }

    @RequestMapping("/posts")
    public Page<PostVO> posts(HttpServletRequest request) {
        String order = ServletRequestUtils.getStringParameter(request, "order", Consts.order.NEWEST);
        int channelId = ServletRequestUtils.getIntParameter(request, "channelId", 0);
        return postService.paging(wrapPageable(Sort.by(Sort.Direction.DESC, BeanMapUtils.postOrder(order))), channelId, null);
    }
}
