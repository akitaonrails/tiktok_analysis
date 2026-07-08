package com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacyInlineLink {

    @C09CT("text")
    public final String text;

    @C09CT("url")
    public final String url;

    public PrivacyInlineLink() {
        this("", "");
    }

    public PrivacyInlineLink(String str, String str2) {
        this.text = str;
        this.url = str2;
    }
}
