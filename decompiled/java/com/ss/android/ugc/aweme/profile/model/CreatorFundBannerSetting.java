package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class CreatorFundBannerSetting implements Serializable {

    @C09CT("creator_fund_banner_version")
    public final int bannerVersion;

    @C09CT("creator_fund_banner_link_text")
    public final String creatorFundBannerLinkText;

    @C09CT("creator_fund_banner_title_text")
    public final String creatorFundBannerTitleText;

    public CreatorFundBannerSetting() {
        this(0, "", "");
    }

    public CreatorFundBannerSetting(int i, String str, String str2) {
        this.bannerVersion = i;
        this.creatorFundBannerTitleText = str;
        this.creatorFundBannerLinkText = str2;
    }
}
