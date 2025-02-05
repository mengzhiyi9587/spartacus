package com.xlc.spartacus.resource.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 配置加载
 *
 * @author xlc, since 2021
 */
@Data
@Component
public class CommonProperties {
	//COS配置（机密）
    @Value("${spartacus.cos.secretId}")
    private String secretId;
    @Value("${spartacus.cos.secretKey}")
    private String secretKey;
    @Value("${spartacus.cos.bucketRegion}")
    private String bucketRegion;
    @Value("${spartacus.cos.bucketName}")
    private String bucketName;
    @Value("${spartacus.cos.articleUploadPath}")
    private String articleUploadPath;
    @Value("${spartacus.cos.logoUploadPath}")
    private String logoUploadPath;
    @Value("${spartacus.cos.baseUrl}")
    private String baseUrl;
    @Value("${spartacus.cos.defaultUrl}")
    private String defaultUrl;
    @Value("${spartacus.cos.resourceRootDirs}")
    private String resourceRootDirs;
}
