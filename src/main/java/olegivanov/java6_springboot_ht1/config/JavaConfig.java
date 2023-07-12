package olegivanov.java6_springboot_ht1.config;

import olegivanov.java6_springboot_ht1.profiles.DevProfile;
import olegivanov.java6_springboot_ht1.profiles.ProductionProfile;
import olegivanov.java6_springboot_ht1.profiles.SystemProfile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
