package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class PaidContentAwareBannerSetting implements Serializable {

    @C09CT("link_text")
    public final String awareBannerCtaButtonText;

    @C09CT("max_display_count")
    public final int awareBannerMaxDisplayCount;

    @C09CT("title_text")
    public final String awareBannerMessageText;

    @C09CT("schema_url")
    public final String awareBannerSchema;

    public PaidContentAwareBannerSetting() {
        this("", "", "", 0);
    }

    public PaidContentAwareBannerSetting(String str, String str2, String str3, int i) {
        this.awareBannerMessageText = str;
        this.awareBannerCtaButtonText = str2;
        this.awareBannerSchema = str3;
        this.awareBannerMaxDisplayCount = i;
    }
}
