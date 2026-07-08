package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class GuidanceDetail implements Serializable {
    public static final int $stable = 0;

    @C09CT("desc")
    public final String desc;

    @C09CT("icon_token")
    public final String iconToken;

    @C09CT("title")
    public final String title;

    public GuidanceDetail() {
        this(null, null, null);
    }

    public GuidanceDetail(String str, String str2, String str3) {
        this.iconToken = str;
        this.title = str2;
        this.desc = str3;
    }
}
