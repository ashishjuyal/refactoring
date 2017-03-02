package coupler.messagechain;

import java.util.HashMap;
import java.util.Map;

public class MetadataCodes {
    private Map<String, String> companyCodes = new HashMap<>();

    public Map<String, String> getCompanyCodes() {
        return this.companyCodes;
    }

    public void addCompanyCode(String code, String company) {
        this.companyCodes.put(code, company);
    }
}
