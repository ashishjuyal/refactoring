namespace RefactoringWorkshop.Coupler.MessageChain
{
    public class ArticleWrapperConverter
    {
        public ArticleWrapper Convert(ArticleResponseWrapper articleResponseWrapper) {
            var articleWrapper = new ArticleWrapper();

            if (articleResponseWrapper.ArticleResponse.Articles.Count > 0) {
                var article = articleResponseWrapper.ArticleResponse.Articles[0];
                articleWrapper.ArticleRef = article.ArticleRef;

                if (articleResponseWrapper.CompanySubscription != null) {
                    foreach (var subscriptionPreferenceWrapper in articleResponseWrapper.CompanySubscription.SubscriptionPreferences) {
                        if (article.MetadataCodes != null) {
                            if (article.MetadataCodes.GetCompanyCodes().ContainsKey(subscriptionPreferenceWrapper.EntityCode.ToUpper())
                                || article.MetadataCodes.GetCompanyCodes()
                                    .ContainsKey(subscriptionPreferenceWrapper.EntityCode.ToLower())) {
                                articleWrapper.Companies.Add(subscriptionPreferenceWrapper.EntityName);
                                articleWrapper.EntityCodes.Add(subscriptionPreferenceWrapper.EntityCode.ToUpper());
                            }
                        }
                    }
                }
            }
            return articleWrapper;
        }

    }
}