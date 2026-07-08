package com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacyTextWithInlineLink {

    @C09CT("links")
    public final List<PrivacyInlineLink> links;

    @C09CT("text")
    public final String text;

    public PrivacyTextWithInlineLink() {
        this("", null);
    }

    public PrivacyTextWithInlineLink(String str, List<PrivacyInlineLink> list) {
        this.text = str;
        this.links = list;
    }
}
