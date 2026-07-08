package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class AgeGateOption {

    @C09CT("content")
    public final String content;

    @C09CT("type")
    public final String type;

    @C09CT("url")
    public final String url;

    public AgeGateOption() {
        this("", null, "");
    }

    public AgeGateOption(String str, String str2, String str3) {
        this.content = str;
        this.url = str2;
        this.type = str3;
    }
}
