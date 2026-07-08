package com.ss.android.ugc.aweme.feature.newselector.config.newconversation;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class RecomReasonData {

    @C09CT("cover_url")
    public final String coverUrl;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("text")
    public final String text;

    public RecomReasonData() {
        this("", "", "");
    }

    public RecomReasonData(String str, String str2, String str3) {
        this.text = str;
        this.coverUrl = str2;
        this.schemaUrl = str3;
    }
}
