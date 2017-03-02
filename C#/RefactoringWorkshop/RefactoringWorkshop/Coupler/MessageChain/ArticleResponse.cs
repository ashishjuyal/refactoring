using System.Collections.Generic;

namespace RefactoringWorkshop.Coupler.MessageChain
{
    public class ArticleResponse
    {
        public List<Article> Articles { get; set; } = new List<Article>();
    }
}