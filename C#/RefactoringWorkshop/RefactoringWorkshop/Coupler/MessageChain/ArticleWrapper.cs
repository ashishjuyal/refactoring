using System.Collections.Generic;

namespace RefactoringWorkshop.Coupler.MessageChain
{
    public class ArticleWrapper
    {
        public List<string> Companies = new List<string>();
        public List<string> EntityCodes = new List<string>();
        public string ArticleRef;

        public void AddCompanies(string company) {
            Companies.Add(company);
        }

        public void AddEntityCodes(string code) {
            EntityCodes.Add(code);
        }

    }
}