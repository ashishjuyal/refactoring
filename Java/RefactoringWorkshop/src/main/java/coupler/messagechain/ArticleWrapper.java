package coupler.messagechain;

import java.util.ArrayList;
import java.util.List;

public class ArticleWrapper {
    private List<String> companies = new ArrayList<>();
    private List<String> entityCodes = new ArrayList<>();
    private String articleRef;

    public void setArticleRef(String articleRef) {
        this.articleRef = articleRef;
    }

    public void addCompanies(String company) {
        this.companies.add(company);
    }

    public void addEntityCodes(String code) {
        this.entityCodes.add(code);
    }
    public List<String> getEntityCodes() {
        return this.entityCodes;
    }

    public List<String> getCompanies() {
        return this.companies;
    }

    public String getArticleRef() {
        return articleRef;
    }
}
