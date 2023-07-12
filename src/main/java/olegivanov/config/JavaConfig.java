package olegivanov.config;

import olegivanov.profiles.DevProfile;
import olegivanov.profiles.ProductionProfile;
import olegivanov.profiles.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty(name="profile.dev", havingValue="true")
     public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(name="profile.dev", havingValue="false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
