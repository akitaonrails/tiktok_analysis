package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveSubscriptionAnchorUrlConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("anchor_subscribe_entry")
    public String anchorSubscribeEntry;

    @C09CT("anchor_subscribers_popup")
    public String anchorSubscriberList;

    @C09CT("badge_management")
    public String badgeManagement;

    @C09CT("board_customize_style_popup")
    public String boardCustomizeStylePopup;

    @C09CT("board_intro")
    public String boardIntro;

    @C09CT("board_template_suggest")
    public String boardTemplateSuggest;

    @C09CT("c2c_trans_guide_page")
    public String c2cTransGuidePage;

    @C09CT("custom_price_management")
    public String customPriceManagement;

    @C09CT("emote_management")
    public String emoteManagement;

    @C09CT("go_live_education")
    public String goLiveEducation;

    @C09CT("multi_tier_list")
    public String multiTierInSubSetting;

    @C09CT("perks_list")
    public String multiTierPerksList;

    @C09CT("no_live_access")
    public String noLiveAccess;

    @C09CT("payout_unsupported_notice_popup")
    public String payoutUnsupportedNoticePopup;

    @C09CT("pin_management_intro")
    public String pinManagementIntro;

    @C09CT("pin_management_page")
    public String pinManagementPage;

    @C09CT("smb_lead_form_creation")
    public String smbLeadFormCreation;

    @C09CT("smb_lynx_booking_service")
    public String smbLynxBookingService;

    @C09CT("smb_lynx_dm_ai_service")
    public String smbLynxDmAiService;

    @C09CT("spotlight_faq")
    public String spotlightFaq;

    @C09CT("spotlight_intro")
    public String spotlightIntro;

    @C09CT("sub_incentive")
    public String subIncentiveFullPage;

    @C09CT("sub_incentive_halfscreen")
    public String subIncentiveHalfScreen;

    @C09CT("sub_management_home")
    public String subManagementHome;

    @C09CT("sub_management_home_popup")
    public String subManagementHomePopup;

    @C09CT("subonly_music_intro")
    public String subOnlyMusicIntro;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveSubscriptionAnchorUrlConfig_OptTypeAdapter();
    }

    public LiveSubscriptionAnchorUrlConfig() {
        this("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
    }

    public LiveSubscriptionAnchorUrlConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26) {
        this.emoteManagement = str;
        this.badgeManagement = str2;
        this.c2cTransGuidePage = str3;
        this.payoutUnsupportedNoticePopup = str4;
        this.anchorSubscriberList = str5;
        this.anchorSubscribeEntry = str6;
        this.pinManagementPage = str7;
        this.pinManagementIntro = str8;
        this.customPriceManagement = str9;
        this.spotlightFaq = str10;
        this.spotlightIntro = str11;
        this.subOnlyMusicIntro = str12;
        this.multiTierInSubSetting = str13;
        this.multiTierPerksList = str14;
        this.subIncentiveFullPage = str15;
        this.subIncentiveHalfScreen = str16;
        this.boardIntro = str17;
        this.boardCustomizeStylePopup = str18;
        this.boardTemplateSuggest = str19;
        this.subManagementHome = str20;
        this.subManagementHomePopup = str21;
        this.goLiveEducation = str22;
        this.noLiveAccess = str23;
        this.smbLynxBookingService = str24;
        this.smbLeadFormCreation = str25;
        this.smbLynxDmAiService = str26;
    }
}
