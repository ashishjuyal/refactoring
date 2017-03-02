package coupler.messagechain;

public class Article {
    private MetadataCodes metadataCodes;
    private String articleRef;

    public String getArticleRef() {
        return articleRef;
    }

    public MetadataCodes getMetadataCodes() {
        return metadataCodes;
    }

    public void setMetadataCodes(MetadataCodes metadataCodes) {
        this.metadataCodes = metadataCodes;
    }

    public void setArticleRef(String articleRef) {
        this.articleRef = articleRef;
    }
}
