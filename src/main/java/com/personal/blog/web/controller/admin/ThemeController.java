package com.personal.blog.web.controller.admin;

import com.personal.blog.base.lang.Result;
import com.personal.blog.base.utils.BlogUtils;
import com.personal.blog.config.ContextStartup;
import com.personal.blog.modules.service.OptionsService;
import com.personal.blog.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author weizp
 */
@Controller
@RequestMapping("/admin/theme")
public class ThemeController extends BaseController {
    @Autowired
    private OptionsService optionsService;
    @Autowired
    private ContextStartup contextStartup;

    @RequestMapping("/index")
    public String index(ModelMap model) {
        model.put("themes", BlogUtils.getThemes());
        return "/admin/theme/index";
    }

    @RequestMapping("/active")
    @ResponseBody
    public Result update(@RequestParam Map<String, String> body) {
        optionsService.update(body);
        contextStartup.reloadOptions(false);
        return Result.success();
    }
}
