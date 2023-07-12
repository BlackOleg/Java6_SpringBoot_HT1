package olegivanov.java6_springboot_ht1.profiles;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}
