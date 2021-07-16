package org.lock.conductor.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author liukai
 * @date 2021/7/16
 */
@ConfigurationProperties(prefix = "job")
@Data
public class JobProperties {

    private boolean enable;

    private String zkAddress;

}
