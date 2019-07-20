package com.personal.blog.modules.template.directive;

import com.personal.blog.modules.template.DirectiveHandler;
import com.personal.blog.modules.template.TemplateDirective;
import org.springframework.stereotype.Component;

/**
 * 资源路径处理
 * @author weizp
 */
@Component
public class ResourceDirective extends TemplateDirective {
    @Override
    public String getName() {
        return "resource";
    }

    @Override
    public void execute(DirectiveHandler handler) throws Exception {
        String src = handler.getString("src", "#");
        if (src.startsWith("/storage")) {
            String base = handler.getContextPath();
            handler.renderString(base + src);
        } else {
            handler.renderString(src);
        }
    }

}
