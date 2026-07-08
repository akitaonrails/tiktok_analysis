package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class SearchTagRequest {

    @C09CT("limit")
    public int limit;

    @C09CT("need_detail")
    public boolean needDetail;

    @C09CT("offset")
    public int offset;

    @C09CT("user_id")
    public String userId = "";

    @C09CT("search_id")
    public String searchId = "";

    @C09CT("query_string")
    public String queryString = "";

    @C09CT("lan")
    public String lan = "";

    @C09CT("country")
    public String country = "";
}
