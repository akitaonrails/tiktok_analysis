package com.ss.android.ugc.aweme.subscription.model;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class CtaInfo {

    @C09CT("cta_text")
    public final String ctaText;

    @C09CT("cta_url")
    public final String ctaUrl;

    public CtaInfo() {
        this("", "");
    }

    public CtaInfo(String str, String str2) {
        this.ctaText = str;
        this.ctaUrl = str2;
    }
}
