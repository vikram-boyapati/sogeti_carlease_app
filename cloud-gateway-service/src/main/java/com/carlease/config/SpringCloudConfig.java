package com.carlease.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/api/v1/cars/**")
                        .uri("http://localhost:8082/")
                        .id("carDataService"))
                .route(r -> r.path("/api/v1/customers/**")
                        .uri("http://localhost:8083/")
                        .id("customerService"))
                .route(r -> r.path("/api/v1/leaserate/**")
                        .uri("http://localhost:8084/")
                        .id("leaseRateService"))
                .build();
    }
}