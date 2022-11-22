package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/18 17:11
 */
//使用配置类配置网关
@Configuration
public class GAteWayConfig {
    @Bean
    public RouteLocator customRouteLocatorBuilder(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_atguigu",r -> r.path("/baidu").uri("http://www.baidu.com")).build();

        return routes.build();
    }
}
