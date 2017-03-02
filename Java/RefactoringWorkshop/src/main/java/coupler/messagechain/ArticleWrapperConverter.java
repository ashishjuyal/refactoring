package coupler.messagechain;

public class ArticleWrapperConverter {

    public ArticleWrapper convert(ArticleResponseWrapper articleResponseWrapper) {
        ArticleWrapper articleWrapper = new ArticleWrapper();

        if (!articleResponseWrapper.getArticleResponse().getArticles().isEmpty()) {
            Article article = articleResponseWrapper.getArticleResponse().getArticles().get(0);
            articleWrapper.setArticleRef(article.getArticleRef());

            if (articleResponseWrapper.getCompanySubscription() != null) {
                for (SubscriptionPreferenceWrapper subscriptionPreferenceWrapper : articleResponseWrapper.getCompanySubscription()
                        .getSubscriptionPreferences()) {
                    if (article.getMetadataCodes() != null) {
                        if (article.getMetadataCodes().getCompanyCodes().containsKey(subscriptionPreferenceWrapper.getEntityCode().toUpperCase())
                                || article.getMetadataCodes().getCompanyCodes()
                                .containsKey(subscriptionPreferenceWrapper.getEntityCode().toLowerCase())) {
                            articleWrapper.addCompanies(subscriptionPreferenceWrapper.getEntityName());
                            articleWrapper.addEntityCodes(subscriptionPreferenceWrapper.getEntityCode().toUpperCase());
                        }
                    }
                }
            }
        }
        return articleWrapper;
    }
}

