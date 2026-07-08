package com.ss.android.ugc.aweme.compliance.api.services.edm;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class HighlightInfo {
    public static final int $stable = 0;

    @C09CT("text")
    public final String text;

    @C09CT("url")
    public final String url;

    public HighlightInfo() {
        this(null, null);
    }

    public HighlightInfo(String str, String str2) {
        this.text = str;
        this.url = str2;
    }
}
