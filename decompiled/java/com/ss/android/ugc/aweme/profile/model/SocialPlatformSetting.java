package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class SocialPlatformSetting implements Serializable {

    @C09CT("access_info")
    public final SocialPlatformAccessInfo accessInfo;

    @C09CT("all_access_infos")
    public final List<SocialPlatformAccessInfo> allAccessInfo;

    @C09CT("contact_book_ads_disclosure")
    public boolean contactAdsDisclosure;

    @C09CT("display_consent_page")
    public final boolean displayConsentPage;

    @C09CT("email_ads_disclosure")
    public boolean emailAdsDisclosure;

    @C09CT("onboarding_rec_strategy")
    public final int onBoardingRecStrategy;

    @C09CT("social_platform")
    public final int socialPlatform;

    @C09CT("sync_status")
    public boolean syncStatus;

    public SocialPlatformSetting() {
        this(0, false, 0, true, null, false, false, null);
    }

    public final SocialPlatformAccessInfo getAccessInfo() {
        return this.accessInfo;
    }

    public final List<SocialPlatformAccessInfo> getAllAccessInfo() {
        return this.allAccessInfo;
    }

    public final boolean getContactAdsDisclosure() {
        return this.contactAdsDisclosure;
    }

    public final boolean getDisplayConsentPage() {
        return this.displayConsentPage;
    }

    public final boolean getEmailAdsDisclosure() {
        return this.emailAdsDisclosure;
    }

    public final int getOnBoardingRecStrategy() {
        return this.onBoardingRecStrategy;
    }

    public final int getSocialPlatform() {
        return this.socialPlatform;
    }

    public final boolean getSyncStatus() {
        return this.syncStatus;
    }

    public final void setContactAdsDisclosure(boolean z) {
        this.contactAdsDisclosure = z;
    }

    public final void setEmailAdsDisclosure(boolean z) {
        this.emailAdsDisclosure = z;
    }

    public final void setSyncStatus(boolean z) {
        this.syncStatus = z;
    }

    public SocialPlatformSetting(int i, boolean z, int i2, boolean z2, SocialPlatformAccessInfo socialPlatformAccessInfo, boolean z3, boolean z4, List<SocialPlatformAccessInfo> list) {
        this.socialPlatform = i;
        this.syncStatus = z;
        this.onBoardingRecStrategy = i2;
        this.displayConsentPage = z2;
        this.accessInfo = socialPlatformAccessInfo;
        this.emailAdsDisclosure = z3;
        this.contactAdsDisclosure = z4;
        this.allAccessInfo = list;
    }
}
