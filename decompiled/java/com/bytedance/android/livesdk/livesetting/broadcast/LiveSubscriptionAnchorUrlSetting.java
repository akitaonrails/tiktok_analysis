package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("live_subscription_anchor_url")
public final class LiveSubscriptionAnchorUrlSetting {
    public static final LiveSubscriptionAnchorUrlSetting INSTANCE = new LiveSubscriptionAnchorUrlSetting();
    public static final LiveSubscriptionAnchorUrlConfig DEFAULT = new LiveSubscriptionAnchorUrlConfig("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");

    public static final String anchorSubscribeEntry() {
        return INSTANCE.getSettingValue().anchorSubscribeEntry;
    }

    public static final String anchorSubscriberList() {
        return INSTANCE.getSettingValue().anchorSubscriberList;
    }

    public static final String badgeManagement() {
        return INSTANCE.getSettingValue().badgeManagement;
    }

    public static final String boardCustomizeStylePopup() {
        return INSTANCE.getSettingValue().boardCustomizeStylePopup;
    }

    public static final String boardIntro() {
        return INSTANCE.getSettingValue().boardIntro;
    }

    public static final String boardTemplateSuggest() {
        return INSTANCE.getSettingValue().boardTemplateSuggest;
    }

    public static final String c2cTransGuidePage() {
        return INSTANCE.getSettingValue().c2cTransGuidePage;
    }

    public static final String customPriceManagement() {
        return INSTANCE.getSettingValue().customPriceManagement;
    }

    public static final String emoteManagement() {
        return INSTANCE.getSettingValue().emoteManagement;
    }

    public static final String goLiveEducation() {
        return INSTANCE.getSettingValue().goLiveEducation;
    }

    public static final String multiTier() {
        return INSTANCE.getSettingValue().multiTierInSubSetting;
    }

    public static final String multiTierPerks() {
        return INSTANCE.getSettingValue().multiTierPerksList;
    }

    public static final String musicIntro() {
        return INSTANCE.getSettingValue().subOnlyMusicIntro;
    }

    public static final String noLiveAccess() {
        return INSTANCE.getSettingValue().noLiveAccess;
    }

    public static final String payoutUnsupportedNoticePopup() {
        return INSTANCE.getSettingValue().payoutUnsupportedNoticePopup;
    }

    public static final String pinManagementIntro() {
        return INSTANCE.getSettingValue().pinManagementIntro;
    }

    public static final String pinManagementPage() {
        return INSTANCE.getSettingValue().pinManagementPage;
    }

    public static final String smbLeadFormCreation() {
        return INSTANCE.getSettingValue().smbLeadFormCreation;
    }

    public static final String smbLynxBookingService() {
        return INSTANCE.getSettingValue().smbLynxBookingService;
    }

    public static final String smbLynxDmAiService() {
        return INSTANCE.getSettingValue().smbLynxDmAiService;
    }

    public static final String spotlightFaq() {
        return INSTANCE.getSettingValue().spotlightFaq;
    }

    public static final String spotlightIntro() {
        return INSTANCE.getSettingValue().spotlightIntro;
    }

    public static final String subManagementHome() {
        return INSTANCE.getSettingValue().subManagementHome;
    }

    public static final String subManagementHomePopup() {
        return INSTANCE.getSettingValue().subManagementHomePopup;
    }

    public static final String subMileStoneFullScreen() {
        return INSTANCE.getSettingValue().subIncentiveFullPage;
    }

    public static final String subMileStoneHalfScreen() {
        return INSTANCE.getSettingValue().subIncentiveHalfScreen;
    }

    public final LiveSubscriptionAnchorUrlConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveSubscriptionAnchorUrlConfig liveSubscriptionAnchorUrlConfig = DEFAULT;
        LiveSubscriptionAnchorUrlConfig liveSubscriptionAnchorUrlConfig2 = (LiveSubscriptionAnchorUrlConfig) settingsManager.getValueSafely("live_subscription_anchor_url", liveSubscriptionAnchorUrlConfig);
        return liveSubscriptionAnchorUrlConfig2 != null ? liveSubscriptionAnchorUrlConfig2 : liveSubscriptionAnchorUrlConfig;
    }
}
