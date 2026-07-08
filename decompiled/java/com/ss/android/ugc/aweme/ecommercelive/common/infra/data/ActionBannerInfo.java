package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class ActionBannerInfo {

    @C09CT("banner_body_text")
    public final String bannerBodyText;

    @C09CT("banner_title_text")
    public final String bannerTitleText;

    public ActionBannerInfo() {
        this(null, null);
    }

    public ActionBannerInfo(String str, String str2) {
        this.bannerTitleText = str;
        this.bannerBodyText = str2;
    }
}
