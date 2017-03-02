using System;
using System.Collections.Generic;
using NUnit.Framework;
using RefactoringWorkshop.Coupler.MessageChain;
using Rhino.Mocks;

namespace Test.Coupler.MessageChain
{
    public class ArticleWrapperConverterTest
    {
        [Test]
        public void should_convert_article_response_wrapper_to_article_wrapper() {
            var articleResponseWrapper = new ArticleResponseWrapper();

            var articleResponse = MockRepository.GenerateStub<ArticleResponse>();
            articleResponse.Articles = new List<Article> {GetArticle()};

            var subscriptionPreferenceWrapper = MockRepository.GenerateStub<SubscriptionPreferenceWrapper>();
            subscriptionPreferenceWrapper.EntityCode = "code";
            subscriptionPreferenceWrapper.EntityName = "company";

            var subscriptionWrapper = MockRepository.GenerateStub<SubscriptionWrapper>();
            subscriptionWrapper.SubscriptionPreferences = new List<SubscriptionPreferenceWrapper> {subscriptionPreferenceWrapper};

            articleResponseWrapper.ArticleResponse = articleResponse;
            articleResponseWrapper.CompanySubscription = subscriptionWrapper;

            var converter = new ArticleWrapperConverter();
            var articleWrapper = converter.Convert(articleResponseWrapper);

            Assert.AreEqual(articleWrapper.Companies[0], "company");
            Assert.AreEqual(articleWrapper.EntityCodes[0], "CODE");
            Assert.AreEqual(articleWrapper.ArticleRef, "articleRef");
        }

        [Test]
        public void should_return_empty_article_wrapper_when_there_are_no_articles() {
            var articleResponse = new ArticleResponse();
            ArticleResponseWrapper articleResponseWrapper =
                new ArticleResponseWrapper {ArticleResponse = articleResponse};
            var converter = new ArticleWrapperConverter();
            var articleWrapper = converter.Convert(articleResponseWrapper);

            Assert.True(articleWrapper.Companies.Count == 0);
            Assert.True(articleWrapper.EntityCodes.Count == 0);
            Assert.IsNull(articleWrapper.ArticleRef);
        }

        [Test]
        public void should_return_article_ref_when_company_subscription_is_not_available() {
            var articleResponse = new ArticleResponse();
            var articles = new List<Article> {GetArticle()};
            articleResponse.Articles = articles;
            var articleResponseWrapper = new ArticleResponseWrapper {ArticleResponse = articleResponse};
            var converter = new ArticleWrapperConverter();

            var articleWrapper = converter.Convert(articleResponseWrapper);

            Assert.True(articleWrapper.Companies.Count == 0);
            Assert.True(articleWrapper.EntityCodes.Count == 0);
            Assert.AreEqual(articleWrapper.ArticleRef, "articleRef");
        }

        [Test]
        public void should_return_article_ref_when_metadata_codes_is_not_available() {
            var articleResponse = new ArticleResponse();
            var articles = new List<Article>();
            var article = GetArticle();
            article.MetadataCodes = null;
            articles.Add(article);
            articleResponse.Articles = articles;
            var articleResponseWrapper = new ArticleResponseWrapper {ArticleResponse = articleResponse};
            var converter = new ArticleWrapperConverter();

            var articleWrapper = converter.Convert(articleResponseWrapper);

            Assert.True(articleWrapper.Companies.Count == 0);
            Assert.True(articleWrapper.EntityCodes.Count == 0);
            Assert.AreEqual(articleWrapper.ArticleRef, "articleRef");
        }

        private Article GetArticle()
        {
            Article article = new Article();
            MetadataCodes metadataCodes = new MetadataCodes();
            metadataCodes.AddCompanyCode("code", "company");
            article.MetadataCodes = metadataCodes;
            article.ArticleRef = "articleRef";
            return article;
        }
    }
}