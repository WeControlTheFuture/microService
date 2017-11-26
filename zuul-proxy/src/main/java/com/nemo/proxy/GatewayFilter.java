package com.nemo.proxy;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class GatewayFilter extends ZuulFilter {
	private Logger log = LoggerFactory.getLogger(getClass());

	public boolean shouldFilter() {
		return true;
	}

	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		log.info(String.format("收到 %s 请求 %s", request.getMethod(), request.getRequestURL().toString()));
		Object accessToken = request.getParameter("accesstoken");
//		if (accessToken == null) {
//			ctx.getResponse().setContentType("text/html;charset=UTF-8");
//			log.warn("accesstoken为空");
//			// 令zuul过滤该请求，不对其进行路由
//			ctx.setSendZuulResponse(false);
//			// 设置其返回的错误码和报文体
//			// 这里没有设置应答码为401，是因为401会导致客户端走到它的断路器里面（HystrixCalculatorService）
//			// 所有设置为200，让应答报文体跳过客户端的断路器，返回给前台
//			ctx.setResponseStatusCode(200);
//			ctx.setResponseBody("权限不足");
//			return null;
//		}
		ctx.addZuulRequestHeader("Authorization", "Basic ");
		log.info("accesstoken验证通过");
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

}
