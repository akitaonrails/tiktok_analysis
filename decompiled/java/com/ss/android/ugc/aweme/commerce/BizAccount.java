package com.ss.android.ugc.aweme.commerce;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class BizAccount implements Serializable {

    @C09CT("account_switch_info")
    public BizAccountSwitchInfo bizAccountSwitchInfo;

    @C09CT("profile_banner_info")
    public BizProfileBannerInfo bizProfileBannerInfo;

    @C09CT("branded_content")
    public final BrandedContent brandedContent;

    @C09CT("isVerifiedBA")
    public boolean isVerifiedBA;

    @C09CT("restrictCommerceMusic")
    public boolean restrictCommerceMusic;

    public final BizAccountSwitchInfo getBizAccountSwitchInfo() {
        return this.bizAccountSwitchInfo;
    }

    public final BizProfileBannerInfo getBizProfileBannerInfo() {
        return this.bizProfileBannerInfo;
    }

    public final BrandedContent getBrandedContent() {
        return this.brandedContent;
    }

    public final boolean getRestrictCommerceMusic() {
        return this.restrictCommerceMusic;
    }

    public final boolean isVerifiedBA() {
        return this.isVerifiedBA;
    }

    public final void setBizAccountSwitchInfo(BizAccountSwitchInfo bizAccountSwitchInfo) {
        this.bizAccountSwitchInfo = bizAccountSwitchInfo;
    }

    public final void setBizProfileBannerInfo(BizProfileBannerInfo bizProfileBannerInfo) {
        this.bizProfileBannerInfo = bizProfileBannerInfo;
    }

    public final void setRestrictCommerceMusic(boolean z) {
        this.restrictCommerceMusic = z;
    }

    public final void setVerifiedBA(boolean z) {
        this.isVerifiedBA = z;
    }
}
