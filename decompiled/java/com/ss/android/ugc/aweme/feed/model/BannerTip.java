package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class BannerTip implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("banner_txt")
    public String bannerTxt;

    @C09CT("banner_type")
    public int bannerType;

    @C09CT("link_txt")
    public String linkTxt;

    @C09CT("link_type")
    public int linkType;

    @C09CT("link_url")
    public String linkUrl;

    public static final class Companion {
    }

    public BannerTip() {
    }

    public BannerTip(int i, String str, int i2, String str2, String str3) {
        this.bannerType = i;
        this.bannerTxt = str;
        this.linkType = i2;
        this.linkUrl = str2;
        this.linkTxt = str3;
    }
}
