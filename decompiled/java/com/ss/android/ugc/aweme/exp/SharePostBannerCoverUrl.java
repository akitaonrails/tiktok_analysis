package com.ss.android.ugc.aweme.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class SharePostBannerCoverUrl {

    @C09CT("cover_dark_url")
    public final String coverDarkUrl;

    @C09CT("cover_light_url")
    public final String coverLightUrl;

    public SharePostBannerCoverUrl() {
        this("", "");
    }

    public SharePostBannerCoverUrl(String str, String str2) {
        this.coverDarkUrl = str;
        this.coverLightUrl = str2;
    }
}
