using System.Collections.Generic;

namespace RefactoringWorkshop.Coupler.MessageChain
{
    public class MetadataCodes
    {
        private Dictionary<string, string> _companyCodes = new Dictionary<string, string>();

        public Dictionary<string, string> GetCompanyCodes() {
            return _companyCodes;
        }

        public void AddCompanyCode(string code, string company) {
            _companyCodes.Add(code, company);
        }
    }
}