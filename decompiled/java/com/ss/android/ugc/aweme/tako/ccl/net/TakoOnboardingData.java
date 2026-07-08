package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoOnboardingData {

    @C09CT("author_info")
    public final AuthorBaseInfo authorInfo;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("queries")
    public final List<String> queries;

    @C09CT("thumb_url")
    public final UrlStruct thumbUrl;

    @C09CT("type")
    public final String type;

    @C09CT("word_ids")
    public final List<String> wordIds;

    public TakoOnboardingData() {
        this(null, null, null, null, null, null);
    }

    public TakoOnboardingData(String str, List<String> list, String str2, UrlStruct urlStruct, AuthorBaseInfo authorBaseInfo, List<String> list2) {
        this.type = str;
        this.queries = list;
        this.awemeId = str2;
        this.thumbUrl = urlStruct;
        this.authorInfo = authorBaseInfo;
        this.wordIds = list2;
    }
}
