package webcast.api.smb;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class BusinessHubArticleViewResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("article")
        public Article article;

        @C09CT("has_user_rated_article")
        public boolean hasUserRatedArticle;
    }
}
