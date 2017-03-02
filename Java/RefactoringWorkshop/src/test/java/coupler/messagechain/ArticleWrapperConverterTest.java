package coupler.messagechain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ArticleWrapperConverterTest {

    @Test public void
    should_convert_article_response_wrapper_to_article_wrapper() {
        ArticleResponseWrapper articleResponseWrapper = new ArticleResponseWrapper();

        ArticleResponse articleResponse = mock(ArticleResponse.class);
        SubscriptionWrapper subscriptionWrapper = mock(SubscriptionWrapper.class);

        SubscriptionPreferenceWrapper subscriptionPreferenceWrapper = mock(SubscriptionPreferenceWrapper.class);
        when(subscriptionPreferenceWrapper.getEntityCode()).thenReturn("code");
        when(subscriptionPreferenceWrapper.getEntityName()).thenReturn("company");
        List<SubscriptionPreferenceWrapper> subscriptionPreferenceWrappers = new ArrayList<>();
        subscriptionPreferenceWrappers.add(subscriptionPreferenceWrapper);
        when(subscriptionWrapper.getSubscriptionPreferences()).thenReturn(subscriptionPreferenceWrappers);

        List<Article> articles = new ArrayList<>();
        articles.add(getArticle());

        when(articleResponse.getArticles()).thenReturn(articles);

        articleResponseWrapper.setArticleResponse(articleResponse);
        articleResponseWrapper.setCompanySubscription(subscriptionWrapper);
        ArticleWrapperConverter converter = new ArticleWrapperConverter();
        ArticleWrapper articleWrapper = converter.convert(articleResponseWrapper);

        assertThat(articleWrapper.getCompanies().get(0), is("company"));
        assertThat(articleWrapper.getEntityCodes().get(0), is("CODE"));
        assertThat(articleWrapper.getArticleRef(), is("articleRef"));
    }

    @Test public void
    should_return_empty_article_wrapper_when_there_are_no_articles() {
        ArticleResponse articleResponse = new ArticleResponse();
        ArticleResponseWrapper articleResponseWrapper = new ArticleResponseWrapper();
        articleResponseWrapper.setArticleResponse(articleResponse);
        ArticleWrapperConverter converter = new ArticleWrapperConverter();
        ArticleWrapper articleWrapper = converter.convert(articleResponseWrapper);

        assertTrue(articleWrapper.getCompanies().isEmpty());
        assertTrue(articleWrapper.getEntityCodes().isEmpty());
        assertNull(articleWrapper.getArticleRef());
    }

    @Test public void
    should_return_article_ref_when_company_subscription_is_not_available() {
        ArticleResponse articleResponse = new ArticleResponse();
        ArrayList<Article> articles = new ArrayList<>();
        articles.add(getArticle());
        articleResponse.setArticles(articles);
        ArticleResponseWrapper articleResponseWrapper = new ArticleResponseWrapper();
        articleResponseWrapper.setArticleResponse(articleResponse);
        ArticleWrapperConverter converter = new ArticleWrapperConverter();

        ArticleWrapper articleWrapper = converter.convert(articleResponseWrapper);

        assertTrue(articleWrapper.getCompanies().isEmpty());
        assertTrue(articleWrapper.getEntityCodes().isEmpty());
        assertThat(articleWrapper.getArticleRef(), is("articleRef"));
    }

    @Test public void
    should_return_article_ref_when_metadata_codes_is_not_available() {
        ArticleResponse articleResponse = new ArticleResponse();
        ArrayList<Article> articles = new ArrayList<>();
        Article article = getArticle();
        article.setMetadataCodes(null);
        articles.add(article);
        articleResponse.setArticles(articles);
        ArticleResponseWrapper articleResponseWrapper = new ArticleResponseWrapper();
        articleResponseWrapper.setArticleResponse(articleResponse);
        ArticleWrapperConverter converter = new ArticleWrapperConverter();

        ArticleWrapper articleWrapper = converter.convert(articleResponseWrapper);

        assertTrue(articleWrapper.getCompanies().isEmpty());
        assertTrue(articleWrapper.getEntityCodes().isEmpty());
        assertThat(articleWrapper.getArticleRef(), is("articleRef"));

    }
    private Article getArticle() {
        Article article = new Article();
        MetadataCodes metadataCodes = new MetadataCodes();
        metadataCodes.addCompanyCode("code", "company");
        article.setMetadataCodes(metadataCodes);
        article.setArticleRef("articleRef");
        return article;
    }
}