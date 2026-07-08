package com.ss.android.ugc.gamora.editor.sticker.inspiration.api;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class RecommendDescRequestBody {

    @C09CT("degrade")
    public final boolean degrade;

    @C09CT("description")
    public final String description;

    @C09CT("experiment_params")
    public final String experimentParams;

    @C09CT("texts")
    public final String texts;

    @C09CT("title")
    public final String title;

    @C09CT("uri")
    public final String uri;

    public RecommendDescRequestBody() {
        this("", "", "", "", "", true);
    }

    public static RecommendDescRequestBody LIZ(RecommendDescRequestBody recommendDescRequestBody) {
        return new RecommendDescRequestBody(recommendDescRequestBody.uri, recommendDescRequestBody.description, recommendDescRequestBody.texts, recommendDescRequestBody.experimentParams, recommendDescRequestBody.title, false);
    }

    public RecommendDescRequestBody(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.uri = str;
        this.description = str2;
        this.texts = str3;
        this.experimentParams = str4;
        this.title = str5;
        this.degrade = z;
    }
}
