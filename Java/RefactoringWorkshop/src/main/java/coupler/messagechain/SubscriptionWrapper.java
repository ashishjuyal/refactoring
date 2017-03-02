package coupler.messagechain;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionWrapper {
    private List<SubscriptionPreferenceWrapper> subscriptionPreferences = new ArrayList<>();

    public List<SubscriptionPreferenceWrapper> getSubscriptionPreferences() {
        return this.subscriptionPreferences;
    }

    public void addSubscriptionPreferences(SubscriptionPreferenceWrapper subscriptionPreference) {
        this.subscriptionPreferences.add(subscriptionPreference);
    }
}
