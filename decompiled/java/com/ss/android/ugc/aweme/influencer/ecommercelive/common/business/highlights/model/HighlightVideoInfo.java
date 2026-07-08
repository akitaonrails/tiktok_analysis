package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes34.dex */
public final class HighlightVideoInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("cover_url")
    public final String coverUrl;

    @C09CT("fragment_id")
    public final String fragmentId;

    @C09CT("length")
    public final Long length;

    @C09CT("show_text")
    public final String text;

    @C09CT("url")
    public String url;

    public final void setUrl(String str) {
        this.url = str;
    }

    public HighlightVideoInfo(String str, String str2, Long l, String str3, String str4) {
        this.fragmentId = str;
        this.coverUrl = str2;
        this.length = l;
        this.url = str3;
        this.text = str4;
    }
}
