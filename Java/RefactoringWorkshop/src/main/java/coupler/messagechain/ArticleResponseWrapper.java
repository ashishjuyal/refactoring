package coupler.messagechain;

public class ArticleResponseWrapper {
    private ArticleResponse articleResponse;
    private SubscriptionWrapper companySubscription;

    public ArticleResponse getArticleResponse() {
        return articleResponse;
    }

    public SubscriptionWrapper getCompanySubscription() {
        return companySubscription;
    }

    public void setArticleResponse(ArticleResponse articleResponse) {
        this.articleResponse = articleResponse;
    }

    public void setCompanySubscription(SubscriptionWrapper companySubscription) {
        this.companySubscription = companySubscription;
    }
}
