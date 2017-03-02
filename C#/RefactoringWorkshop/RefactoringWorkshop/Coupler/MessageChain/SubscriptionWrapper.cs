using System.Collections.Generic;

namespace RefactoringWorkshop.Coupler.MessageChain
{
    public class SubscriptionWrapper
    {
        public List<SubscriptionPreferenceWrapper> SubscriptionPreferences { get; set; } =
            new List<SubscriptionPreferenceWrapper>();

        public void AddSubscriptionPreferences(SubscriptionPreferenceWrapper subscriptionPreference) {
            SubscriptionPreferences.Add(subscriptionPreference);
        }

    }
}