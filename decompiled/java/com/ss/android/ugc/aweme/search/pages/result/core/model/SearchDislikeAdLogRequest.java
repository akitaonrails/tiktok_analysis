package com.ss.android.ugc.aweme.search.pages.result.core.model;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchDislikeAdLogRequest {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("ad_id")
    public final String adId;

    @C09CT("author_id")
    public final String authorId;

    @C09CT("creative_id")
    public final String creativeId;

    @C09CT("dislike_source")
    public final String dislikeSource;

    @C09CT("log_extra")
    public final String logExtra;

    @C09CT("req_id")
    public final String reqId;

    @C09CT("video_type")
    public final Integer videoType;

    public SearchDislikeAdLogRequest(String str, String str2, String str3, String str4, String str5, Integer num, String str6) {
        this.reqId = str;
        this.adId = str2;
        this.logExtra = str3;
        this.creativeId = str4;
        this.dislikeSource = str5;
        this.videoType = num;
        this.authorId = str6;
    }
}
