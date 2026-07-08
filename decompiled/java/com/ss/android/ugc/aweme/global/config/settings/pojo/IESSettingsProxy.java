package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C2503509rV;
import X.C2504909rj;
import X.C316660CbA;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class IESSettingsProxy {
    public static final Float DEFAULT_FLOAT = Float.valueOf(0.74347335f);
    public static final Integer DEFAULT_INTEGER = 2690237;
    public static final Long DEFAULT_LONG = 992354881878L;
    public static final Boolean DEFAULT_BOOLEAN = Boolean.FALSE;

    public Integer getEditEffectAutoDownloadSize() {
        return 5;
    }

    public Integer getKevaSwitch() {
        return 1;
    }

    public AdFeSettings getAdFeSettings() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        AdFeSettings adFeSettings = (AdFeSettings) C2503509rV.LIZJ(AdFeSettings.class, "ad_fe_settings");
        if (adFeSettings != null) {
            return adFeSettings;
        }
        throw new C316660CbA();
    }

    public AdLandingPageConfig getAdLandingPageConfig() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        AdLandingPageConfig adLandingPageConfig = (AdLandingPageConfig) C2503509rV.LIZJ(AdLandingPageConfig.class, "ad_landing_page_config");
        if (adLandingPageConfig != null) {
            return adLandingPageConfig;
        }
        throw new C316660CbA();
    }

    public String getAdTrackerConfig() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJI("ad_tracker_config", "");
    }

    public UserAntiAddiction getAddictionSettings() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        UserAntiAddiction userAntiAddiction = (UserAntiAddiction) C2503509rV.LIZJ(UserAntiAddiction.class, "addiction_settings");
        if (userAntiAddiction != null) {
            return userAntiAddiction;
        }
        throw new C316660CbA();
    }

    public AgeGateSettings getAgeGateSettings() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        AgeGateSettings ageGateSettings = (AgeGateSettings) C2503509rV.LIZJ(AgeGateSettings.class, "age_gate_settings");
        if (ageGateSettings != null) {
            return ageGateSettings;
        }
        throw new C316660CbA();
    }

    public List<String> getApiAlogWhiteList() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        String[] strArrLJ = C2503509rV.LJ("api_alog_white_list");
        if (strArrLJ == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, strArrLJ);
        return arrayList;
    }

    public AppStoreMessage getAppStoreScore() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        AppStoreMessage appStoreMessage = (AppStoreMessage) C2503509rV.LIZJ(AppStoreMessage.class, "app_store_score");
        if (appStoreMessage != null) {
            return appStoreMessage;
        }
        throw new C316660CbA();
    }

    public Long getAutoLiveStateIntervalMills() {
        SettingsManager.LIZLLL().getClass();
        return Long.valueOf(SettingsManager.LJFF("auto_live_state_interval_mills", 60000L));
    }

    public UgAwemeActivitySetting getAwemeActivitySetting() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        UgAwemeActivitySetting ugAwemeActivitySetting = (UgAwemeActivitySetting) C2503509rV.LIZJ(UgAwemeActivitySetting.class, "aweme_activity_setting");
        if (ugAwemeActivitySetting != null) {
            return ugAwemeActivitySetting;
        }
        throw new C316660CbA();
    }

    public AwemeFeEliteItem getAwemeFeElite() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        AwemeFeEliteItem awemeFeEliteItem = (AwemeFeEliteItem) C2503509rV.LIZJ(AwemeFeEliteItem.class, "aweme_fe_elite");
        if (awemeFeEliteItem != null) {
            return awemeFeEliteItem;
        }
        throw new C316660CbA();
    }

    public List<String> getAwemeHighRiskAreaCode() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        String[] strArrLJ = C2503509rV.LJ("aweme_high_risk_area_code");
        if (strArrLJ == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, strArrLJ);
        return arrayList;
    }

    public BioSettings getBioSettings() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        BioSettings bioSettings = (BioSettings) C2503509rV.LIZJ(BioSettings.class, "bio_settings");
        if (bioSettings != null) {
            return bioSettings;
        }
        throw new C316660CbA();
    }

    public List<String> getCacheCleanDefaultWhiteList() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        String[] strArrLJ = C2503509rV.LJ("cache_clean_default_white_list");
        if (strArrLJ == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, strArrLJ);
        return arrayList;
    }

    public List<OriginChannelTab> getChannelTabs() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Object[] objArr = (Object[]) C2503509rV.LIZJ(OriginChannelTab[].class, "channel_tabs");
        if (objArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public Boolean getCleanShareFiles() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("clean_share_files", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("clean_share_files")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public Integer getCloseSyncToHeloEntry() {
        SettingsManager.LIZLLL().getClass();
        return Integer.valueOf(SettingsManager.LJ("close_sync_to_helo_entry", 1));
    }

    public String getCommentFilterTipsSupported() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        String strLJFF = C2503509rV.LJFF("comment_filter_tips_supported");
        if (!"_".equals(strLJFF) || C2503509rV.LIZ("comment_filter_tips_supported")) {
            return strLJFF;
        }
        throw new C316660CbA();
    }

    public CommentListAdMigration getCommentListAdMigration() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        CommentListAdMigration commentListAdMigration = (CommentListAdMigration) C2503509rV.LIZJ(CommentListAdMigration.class, "comment_list_ad_migration");
        if (commentListAdMigration != null) {
            return commentListAdMigration;
        }
        throw new C316660CbA();
    }

    public ContactUploadUiLimits getContactUploadUiLimits() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        ContactUploadUiLimits contactUploadUiLimits = (ContactUploadUiLimits) C2503509rV.LIZJ(ContactUploadUiLimits.class, "contact_upload_ui_limits");
        if (contactUploadUiLimits != null) {
            return contactUploadUiLimits;
        }
        throw new C316660CbA();
    }

    public List<ContentLanguageGuideSetting> getContentLanguageGuideCodes() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Object[] objArr = (Object[]) C2503509rV.LIZJ(ContentLanguageGuideSetting[].class, "content_language_guide_codes");
        if (objArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public Integer getDataSaverSetting() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer numValueOf = Integer.valueOf(C2503509rV.LIZLLL(num.intValue(), "data_saver_setting"));
        if (!num.equals(numValueOf) || C2503509rV.LIZ("data_saver_setting")) {
            return numValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getDisableDelayAbSdkRequest() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("disable_delay_ab_sdk_request", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("disable_delay_ab_sdk_request")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getDisableDelayAppAlertRequest() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("disable_delay_app_alert_request", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("disable_delay_app_alert_request")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getDisableDelayFetchSamecityActiveRequest() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("disable_delay_fetch_samecity_active_request", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("disable_delay_fetch_samecity_active_request")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getDisableDelayFetchShareSettingRequest() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("disable_delay_fetch_share_setting_request", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("disable_delay_fetch_share_setting_request")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getDisableDelayFetchUserRequest() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("disable_delay_fetch_user_request", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("disable_delay_fetch_user_request")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getDisableDelaySecReport() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("disable_delay_sec_report", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("disable_delay_sec_report")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getDisableDelayTokenBeatRequest() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("disable_delay_token_beat_request", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("disable_delay_token_beat_request")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getDisableDvmLinearAllocOpt() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("disable_dvm_linear_alloc_opt", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("disable_dvm_linear_alloc_opt")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getDisableImMessageFullFeedSlide() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("disable_im_message_full_feed_slide", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("disable_im_message_full_feed_slide")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getDisableOmSdk() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("disable_om_sdk", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("disable_om_sdk")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getDisableVastBitrate() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("disable_vast_bitrate", false));
    }

    public Boolean getDisallowVastHasAuthor() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("disallow_vast_has_author", false));
    }

    public Boolean getDiscardRefreshTopDsp() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("discard_refresh_top_dsp", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("discard_refresh_top_dsp")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public String getDoulabUseInformationUrl() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJI("doulab_use_information_url", "");
    }

    public List<DouplusTextStruct> getDouplusEntryTitle() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Object[] objArr = (Object[]) C2503509rV.LIZJ(DouplusTextStruct[].class, "douplus_entry_title");
        if (objArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public EPlatformSettings getEPlatformSettings() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        EPlatformSettings ePlatformSettings = (EPlatformSettings) C2503509rV.LIZJ(EPlatformSettings.class, "e_platform_settings");
        if (ePlatformSettings != null) {
            return ePlatformSettings;
        }
        throw new C316660CbA();
    }

    public EmailLoginSettings getEmailLoginSettings() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        EmailLoginSettings emailLoginSettings = (EmailLoginSettings) C2503509rV.LIZJ(EmailLoginSettings.class, "email_login_settings");
        if (emailLoginSettings != null) {
            return emailLoginSettings;
        }
        throw new C316660CbA();
    }

    public Integer getEnable4kImport() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer numValueOf = Integer.valueOf(C2503509rV.LIZLLL(num.intValue(), "enable_4k_import"));
        if (!num.equals(numValueOf) || C2503509rV.LIZ("enable_4k_import")) {
            return numValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getEnableAnchorCache() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("enable_anchor_cache", false));
    }

    public Boolean getEnableAutoLiveState() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("enable_auto_live_state", false));
    }

    public Boolean getEnableCommentOffensiveFilterSwitch() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("enable_comment_offensive_filter_switch", true));
    }

    public Boolean getEnableCommerceOrder() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("enable_commerce_order", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("enable_commerce_order")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getEnableDelayRequest() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("enable_delay_request", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("enable_delay_request")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public Integer getEnableEmailVerification() {
        SettingsManager.LIZLLL().getClass();
        return Integer.valueOf(SettingsManager.LJ("enable_email_verification", 1));
    }

    public Boolean getEnableEnterLiveRoomStreamOpt() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("enable_enter_live_room_stream_opt", true));
    }

    public Boolean getEnableHdH264HwDecoder() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("enable_hd_h264_hw_decoder", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("enable_hd_h264_hw_decoder")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getEnableLiveSplash() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("enable_live_splash", true));
    }

    public Boolean getEnableNewUserInfoSync() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("enable_new_user_info_sync", true));
    }

    public Boolean getEnableOnPageSelectPauseCheck() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("enable_on_page_select_pause_check", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("enable_on_page_select_pause_check")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getEnableReuseEditorForFastimport() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("enable_reuse_editor_for_fastimport", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("enable_reuse_editor_for_fastimport")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getEnableTImChatEveryone() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("enable_t_im_chat_everyone", false));
    }

    public Integer getEnableYoutubeAppAuth() {
        SettingsManager.LIZLLL().getClass();
        return Integer.valueOf(SettingsManager.LJ("enable_youtube_app_auth", 0));
    }

    public FeConfigCollection getFeConfigCollection() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        FeConfigCollection feConfigCollection = (FeConfigCollection) C2503509rV.LIZJ(FeConfigCollection.class, "fe_config_collection");
        if (feConfigCollection != null) {
            return feConfigCollection;
        }
        throw new C316660CbA();
    }

    public Boolean getFeedHandleGenericMotion() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("feed_handle_generic_motion", true));
    }

    public FeedbackConf getFeedbackConf() throws C316660CbA {
        FeedbackConf feedbackConf = (FeedbackConf) SettingsManager.LIZLLL().LJIIIIZZ("feedback_conf", FeedbackConf.class, null);
        if (feedbackConf != null) {
            return feedbackConf;
        }
        throw new C316660CbA();
    }

    public Boolean getFeedbackRecordEnable() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("feedback_record_enable", true));
    }

    public List<String> getFilterColors() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        String[] strArrLJ = C2503509rV.LJ("filter_colors");
        if (strArrLJ == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, strArrLJ);
        return arrayList;
    }

    public Integer getFirstInstallTime() {
        SettingsManager.LIZLLL().getClass();
        return Integer.valueOf(SettingsManager.LJ("first_install_time", -1));
    }

    public FlexibleUpdateStrategy getFlexibleUpdateStrategy() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        FlexibleUpdateStrategy flexibleUpdateStrategy = (FlexibleUpdateStrategy) C2503509rV.LIZJ(FlexibleUpdateStrategy.class, "flexible_update_strategy");
        if (flexibleUpdateStrategy != null) {
            return flexibleUpdateStrategy;
        }
        throw new C316660CbA();
    }

    public FlipChatSettings getFlipchatSettings() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        FlipChatSettings flipChatSettings = (FlipChatSettings) C2503509rV.LIZJ(FlipChatSettings.class, "flipchat_settings");
        if (flipChatSettings != null) {
            return flipChatSettings;
        }
        throw new C316660CbA();
    }

    public Integer getFollowTabLiveType() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer numValueOf = Integer.valueOf(C2503509rV.LIZLLL(num.intValue(), "follow_tab_live_type"));
        if (!num.equals(numValueOf) || C2503509rV.LIZ("follow_tab_live_type")) {
            return numValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getForbidVoiceChangeOnEditPage() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("forbid_voice_change_on_edit_page", true));
    }

    public String getFreeFlowCardUrlSticker() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        String strLJFF = C2503509rV.LJFF("free_flow_card_url_sticker");
        if (!"_".equals(strLJFF) || C2503509rV.LIZ("free_flow_card_url_sticker")) {
            return strLJFF;
        }
        throw new C316660CbA();
    }

    public Integer getHdHwDecoderMinSideSize() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer numValueOf = Integer.valueOf(C2503509rV.LIZLLL(num.intValue(), "hd_hw_decoder_min_side_size"));
        if (!num.equals(numValueOf) || C2503509rV.LIZ("hd_hw_decoder_min_side_size")) {
            return numValueOf;
        }
        throw new C316660CbA();
    }

    public String getHeartbeatDefaultUrl() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJI("heartbeat_default_url", "");
    }

    public HotSearchWitch getHotsearchSwitchs() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        HotSearchWitch hotSearchWitch = (HotSearchWitch) C2503509rV.LIZJ(HotSearchWitch.class, "hotsearch_switchs");
        if (hotSearchWitch != null) {
            return hotSearchWitch;
        }
        throw new C316660CbA();
    }

    public HybridMonitorConfig getHybridMonitorConfig() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        HybridMonitorConfig hybridMonitorConfig = (HybridMonitorConfig) C2503509rV.LIZJ(HybridMonitorConfig.class, "hybrid_monitor_config");
        if (hybridMonitorConfig != null) {
            return hybridMonitorConfig;
        }
        throw new C316660CbA();
    }

    public AssociativeEmoticonAll getImAssociativeEmoticonAll() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        AssociativeEmoticonAll associativeEmoticonAll = (AssociativeEmoticonAll) C2503509rV.LIZJ(AssociativeEmoticonAll.class, "im_associative_emoticon_all");
        return associativeEmoticonAll != null ? associativeEmoticonAll : new AssociativeEmoticonAll(0, "");
    }

    public Integer getImContactsMultiSelectLimit() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer numValueOf = Integer.valueOf(C2503509rV.LIZLLL(num.intValue(), "im_contacts_multi_select_limit"));
        if (!num.equals(numValueOf) || C2503509rV.LIZ("im_contacts_multi_select_limit")) {
            return numValueOf;
        }
        throw new C316660CbA();
    }

    public List<String> getImImageDomains() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        String[] strArrLJ = C2503509rV.LJ("im_image_domains");
        if (strArrLJ == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, strArrLJ);
        return arrayList;
    }

    public String getImUrlTemplate() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        String strLJFF = C2503509rV.LJFF("im_url_template");
        if (!"_".equals(strLJFF) || C2503509rV.LIZ("im_url_template")) {
            return strLJFF;
        }
        throw new C316660CbA();
    }

    public IMUseOkHttpClientConfig getImUseOkhttpclient() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        IMUseOkHttpClientConfig iMUseOkHttpClientConfig = (IMUseOkHttpClientConfig) C2503509rV.LIZJ(IMUseOkHttpClientConfig.class, "im_use_okhttpclient");
        if (iMUseOkHttpClientConfig != null) {
            return iMUseOkHttpClientConfig;
        }
        throw new C316660CbA();
    }

    public String getImpressionPageSchema() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        String strLJFF = C2503509rV.LJFF("impression_page_schema");
        if (!"_".equals(strLJFF) || C2503509rV.LIZ("impression_page_schema")) {
            return strLJFF;
        }
        throw new C316660CbA();
    }

    public Integer getInappUpdateSwitchStrategy() {
        SettingsManager.LIZLLL().getClass();
        return Integer.valueOf(SettingsManager.LJ("inapp_update_switch_strategy", 0));
    }

    public Integer getIsEnableSplashFirstShowRetrieval() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer numValueOf = Integer.valueOf(C2503509rV.LIZLLL(num.intValue(), "is_enable_splash_first_show_retrieval"));
        if (!num.equals(numValueOf) || C2503509rV.LIZ("is_enable_splash_first_show_retrieval")) {
            return numValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getIsHotUser() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("is_hot_user", false));
    }

    public Boolean getIsNearbyOldUser() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("is_nearby_old_user", false));
    }

    public Boolean getKeepCookies() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("keep_cookies", false));
    }

    public List<String> getKevaBlacklist() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        String[] strArrLJ = C2503509rV.LJ("keva_blacklist");
        if (strArrLJ == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, strArrLJ);
        return arrayList;
    }

    public List<String> getLabFeatureIds() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        String[] strArrLJ = C2503509rV.LJ("lab_feature_ids");
        if (strArrLJ == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, strArrLJ);
        return arrayList;
    }

    public LikePraiseDialogInfo getLikePraiseDialogInfo() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        LikePraiseDialogInfo likePraiseDialogInfo = (LikePraiseDialogInfo) C2503509rV.LIZJ(LikePraiseDialogInfo.class, "like_praise_dialog_info");
        if (likePraiseDialogInfo != null) {
            return likePraiseDialogInfo;
        }
        throw new C316660CbA();
    }

    public LiveCnySetting getLiveCnySettings() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        LiveCnySetting liveCnySetting = (LiveCnySetting) C2503509rV.LIZJ(LiveCnySetting.class, "live_cny_settings");
        if (liveCnySetting != null) {
            return liveCnySetting;
        }
        throw new C316660CbA();
    }

    public LiveInnerPushConfig getLiveInnerPushConfig() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        LiveInnerPushConfig liveInnerPushConfig = (LiveInnerPushConfig) C2503509rV.LIZJ(LiveInnerPushConfig.class, "live_inner_push_config");
        if (liveInnerPushConfig != null) {
            return liveInnerPushConfig;
        }
        throw new C316660CbA();
    }

    public Integer getLocalVideoCacheMaxAge() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer numValueOf = Integer.valueOf(C2503509rV.LIZLLL(num.intValue(), "local_video_cache_max_age"));
        if (!num.equals(numValueOf) || C2503509rV.LIZ("local_video_cache_max_age")) {
            return numValueOf;
        }
        throw new C316660CbA();
    }

    public Integer getLocalVideoCacheMaxLength() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer numValueOf = Integer.valueOf(C2503509rV.LIZLLL(num.intValue(), "local_video_cache_max_length"));
        if (!num.equals(numValueOf) || C2503509rV.LIZ("local_video_cache_max_length")) {
            return numValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getMainTabFollowUseLazyViewpager() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("main_tab_follow_use_lazy_viewpager", false));
    }

    public Integer getMinFollowNumForLandingFollowTab() {
        SettingsManager.LIZLLL().getClass();
        return Integer.valueOf(SettingsManager.LJ("min_follow_num_for_landing_follow_tab", 100));
    }

    public Boolean getMiniappPreloadEmptyProcessEnbale() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("miniapp_preload_empty_process_enbale", false));
    }

    public Integer getMiniappPreloadEnbale() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer numValueOf = Integer.valueOf(C2503509rV.LIZLLL(num.intValue(), "miniapp_preload_enbale"));
        if (!num.equals(numValueOf) || C2503509rV.LIZ("miniapp_preload_enbale")) {
            return numValueOf;
        }
        throw new C316660CbA();
    }

    public String getMovieDetail() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        String strLJFF = C2503509rV.LJFF("movie_detail");
        if (!"_".equals(strLJFF) || C2503509rV.LIZ("movie_detail")) {
            return strLJFF;
        }
        throw new C316660CbA();
    }

    public Integer getMtLocalAnalysisHprof() {
        SettingsManager.LIZLLL().getClass();
        return Integer.valueOf(SettingsManager.LJ("mt_local_analysis_hprof", 0));
    }

    public MtcertSettings getMtcertSettings() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        MtcertSettings mtcertSettings = (MtcertSettings) C2503509rV.LIZJ(MtcertSettings.class, "mtcert_settings");
        if (mtcertSettings != null) {
            return mtcertSettings;
        }
        throw new C316660CbA();
    }

    public Integer getMusicianShowType() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer numValueOf = Integer.valueOf(C2503509rV.LIZLLL(num.intValue(), "musician_show_type"));
        if (!num.equals(numValueOf) || C2503509rV.LIZ("musician_show_type")) {
            return numValueOf;
        }
        throw new C316660CbA();
    }

    public List<Integer> getOneBindNetSetting() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Object[] objArr = (Object[]) C2503509rV.LIZJ(Integer[].class, "one_bind_net_setting");
        if (objArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public Integer getOpenImLink() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer numValueOf = Integer.valueOf(C2503509rV.LIZLLL(num.intValue(), "open_im_link"));
        if (!num.equals(numValueOf) || C2503509rV.LIZ("open_im_link")) {
            return numValueOf;
        }
        throw new C316660CbA();
    }

    public String getOrginalMusicianUrl() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        String strLJFF = C2503509rV.LJFF("orginal_musician_url");
        if (!"_".equals(strLJFF) || C2503509rV.LIZ("orginal_musician_url")) {
            return strLJFF;
        }
        throw new C316660CbA();
    }

    public Boolean getOriginalMusicianEntry() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("original_musician_entry", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("original_musician_entry")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public Integer getPosterSrType() {
        SettingsManager.LIZLLL().getClass();
        return Integer.valueOf(SettingsManager.LJ("poster_sr_type", 0));
    }

    public List<String> getPreloadMicroAppList() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        String[] strArrLJ = C2503509rV.LJ("preload_micro_app_list");
        if (strArrLJ == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, strArrLJ);
        return arrayList;
    }

    public ProAccountEnableDetailInfo getProAccountEnableDetailInfo() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        ProAccountEnableDetailInfo proAccountEnableDetailInfo = (ProAccountEnableDetailInfo) C2503509rV.LIZJ(ProAccountEnableDetailInfo.class, "pro_account_enable_detail_info");
        if (proAccountEnableDetailInfo != null) {
            return proAccountEnableDetailInfo;
        }
        throw new C316660CbA();
    }

    public Boolean getProfilePageSkipRemove() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("profile_page_skip_remove", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("profile_page_skip_remove")) {
            return boolValueOf;
        }
        if (C2504909rj.LIZ == 1) {
            return Boolean.FALSE;
        }
        throw new C316660CbA();
    }

    public pushGuideInfo getPushGuideInfo() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        pushGuideInfo pushguideinfo = (pushGuideInfo) C2503509rV.LIZJ(pushGuideInfo.class, "push_guide_info");
        if (pushguideinfo != null) {
            return pushguideinfo;
        }
        throw new C316660CbA();
    }

    public Integer getPushdelayinitSwitch() {
        SettingsManager.LIZLLL().getClass();
        return Integer.valueOf(SettingsManager.LJ("pushdelayinit_switch", 0));
    }

    public QuickShopLoadingPage getQuickShopLoadingPage() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        QuickShopLoadingPage quickShopLoadingPage = (QuickShopLoadingPage) C2503509rV.LIZJ(QuickShopLoadingPage.class, "quick_shop_loading_page");
        if (quickShopLoadingPage != null) {
            return quickShopLoadingPage;
        }
        throw new C316660CbA();
    }

    public SearchPullFeedbackStruct getSearchPullFeedback() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        SearchPullFeedbackStruct searchPullFeedbackStruct = (SearchPullFeedbackStruct) C2503509rV.LIZJ(SearchPullFeedbackStruct.class, "search_pull_feedback");
        if (searchPullFeedbackStruct != null) {
            return searchPullFeedbackStruct;
        }
        throw new C316660CbA();
    }

    public Boolean getShieldMusicSdk() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("shield_music_sdk", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("shield_music_sdk")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public String getShopLinkAnchorDisclaimer() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJI("shop_link_anchor_disclaimer", "");
    }

    public ShoppingConfig getShopping() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        ShoppingConfig shoppingConfig = (ShoppingConfig) C2503509rV.LIZJ(ShoppingConfig.class, "shopping");
        if (shoppingConfig != null) {
            return shoppingConfig;
        }
        throw new C316660CbA();
    }

    public Boolean getShowMusicFeedbackEntrance() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("show_music_feedback_entrance", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("show_music_feedback_entrance")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getShowRocketShareIfInstall() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("show_rocket_share_if_install", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("show_rocket_share_if_install")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public Long getShowStorageDotSize() {
        return 1073741824L;
    }

    public Long getShowStorageTipSize() {
        return 314572800L;
    }

    public Boolean getSilentShareConfigurable() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("silent_share_configurable", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("silent_share_configurable")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public List<ShareChannelSettings> getSilentShareList() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Object[] objArr = (Object[]) C2503509rV.LIZJ(ShareChannelSettings[].class, "silent_share_list");
        if (objArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public SpringApiLimitConfig getSpringApiLimitConfig() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        SpringApiLimitConfig springApiLimitConfig = (SpringApiLimitConfig) C2503509rV.LIZJ(SpringApiLimitConfig.class, "spring_api_limit_config");
        if (springApiLimitConfig != null) {
            return springApiLimitConfig;
        }
        throw new C316660CbA();
    }

    public Integer getStatisticsBackupPct() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer numValueOf = Integer.valueOf(C2503509rV.LIZLLL(num.intValue(), "statistics_backup_pct"));
        if (!num.equals(numValueOf) || C2503509rV.LIZ("statistics_backup_pct")) {
            return numValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getStickerUpdateApp() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("sticker_update_app", false));
    }

    public Integer getStoryImagePlayTime() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer numValueOf = Integer.valueOf(C2503509rV.LIZLLL(num.intValue(), "story_image_play_time"));
        if (!num.equals(numValueOf) || C2503509rV.LIZ("story_image_play_time")) {
            return numValueOf;
        }
        throw new C316660CbA();
    }

    public SuperEntranceConfig getSuperEntranceConfig() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        SuperEntranceConfig superEntranceConfig = (SuperEntranceConfig) C2503509rV.LIZJ(SuperEntranceConfig.class, "super_entrance_config");
        if (superEntranceConfig != null) {
            return superEntranceConfig;
        }
        throw new C316660CbA();
    }

    public Boolean getSupportFilterErrorFile() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("support_filter_error_file", false));
    }

    public Integer getTcmCtrySettings() {
        SettingsManager.LIZLLL().getClass();
        return Integer.valueOf(SettingsManager.LJ("tcm_ctry_settings", 0));
    }

    public String getTcmNameCtry() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJI("tcm_name_ctry", "TCM");
    }

    public Integer getThirdPartyDataRefresh() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer numValueOf = Integer.valueOf(C2503509rV.LIZLLL(num.intValue(), "third_party_data_refresh"));
        if (!num.equals(numValueOf) || C2503509rV.LIZ("third_party_data_refresh")) {
            return numValueOf;
        }
        throw new C316660CbA();
    }

    public List<Integer> getThirdpartyLoginBindSkip() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Object[] objArr = (Object[]) C2503509rV.LIZJ(Integer[].class, "thirdparty_login_bind_skip");
        if (objArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public String getUgSecLinkUrl() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJI("ug_sec_link_url", "");
    }

    public UlikeParams getUlikeParams() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        UlikeParams ulikeParams = (UlikeParams) C2503509rV.LIZJ(UlikeParams.class, "ulike_params");
        if (ulikeParams != null) {
            return ulikeParams;
        }
        throw new C316660CbA();
    }

    public Integer getUploadContactsNoticeInterval() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer numValueOf = Integer.valueOf(C2503509rV.LIZLLL(num.intValue(), "upload_contacts_notice_interval"));
        if (!num.equals(numValueOf) || C2503509rV.LIZ("upload_contacts_notice_interval")) {
            return numValueOf;
        }
        throw new C316660CbA();
    }

    public Integer getUploadContactsNoticeTimes() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer numValueOf = Integer.valueOf(C2503509rV.LIZLLL(num.intValue(), "upload_contacts_notice_times"));
        if (!num.equals(numValueOf) || C2503509rV.LIZ("upload_contacts_notice_times")) {
            return numValueOf;
        }
        throw new C316660CbA();
    }

    public List<String> getUploadVideoSizeCategory() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        String[] strArrLJ = C2503509rV.LJ("upload_video_size_category");
        if (strArrLJ == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, strArrLJ);
        return arrayList;
    }

    public Boolean getUseBridgeEngineV2() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("use_bridge_engine_v2", true));
    }

    public Boolean getUseRightSwipeBack() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean boolValueOf = Boolean.valueOf(C2503509rV.LIZIZ("use_right_swipe_back", bool.booleanValue()));
        if (!bool.equals(boolValueOf) || C2503509rV.LIZ("use_right_swipe_back")) {
            return boolValueOf;
        }
        throw new C316660CbA();
    }

    public VCDV1ConfigStruct getVcdV1ConfigInfo() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        VCDV1ConfigStruct vCDV1ConfigStruct = (VCDV1ConfigStruct) C2503509rV.LIZJ(VCDV1ConfigStruct.class, "vcd_v1_config_info");
        if (vCDV1ConfigStruct != null) {
            return vCDV1ConfigStruct;
        }
        throw new C316660CbA();
    }

    public List<Float> getVideoBitrateCategory() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Object[] objArr = (Object[]) C2503509rV.LIZJ(Float[].class, "video_bitrate_category");
        if (objArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public Integer getVideoPlayProgressCount() {
        SettingsManager.LIZLLL().getClass();
        return Integer.valueOf(SettingsManager.LJ("video_play_progress_count", 0));
    }

    public List<Integer> getVideoQualityCategory() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Object[] objArr = (Object[]) C2503509rV.LIZJ(Integer[].class, "video_quality_category");
        if (objArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public List<String> getVideoSizeCategory() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        String[] strArrLJ = C2503509rV.LJ("video_size_category");
        if (strArrLJ == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, strArrLJ);
        return arrayList;
    }

    public VisionSearchStruct getVisionSearch() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        VisionSearchStruct visionSearchStruct = (VisionSearchStruct) C2503509rV.LIZJ(VisionSearchStruct.class, "vision_search");
        if (visionSearchStruct != null) {
            return visionSearchStruct;
        }
        throw new C316660CbA();
    }

    public List<String> getWebviewCachePoolSwitch() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        String[] strArrLJ = C2503509rV.LJ("webview_cache_pool_switch");
        if (strArrLJ == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, strArrLJ);
        return arrayList;
    }

    public List<String> getWebviewCacheUrls() {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        String[] strArrLJ = C2503509rV.LJ("webview_cache_urls");
        if (strArrLJ == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, strArrLJ);
        return arrayList;
    }

    public String getWikipediaAnchorUrlPlaceholder() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJI("wikipedia_anchor_url_placeholder", "https://%1$s.m.wikipedia.org/wiki/%2$s");
    }

    public Integer getWsUseNewSdk() throws C316660CbA {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer numValueOf = Integer.valueOf(C2503509rV.LIZLLL(num.intValue(), "ws_use_new_sdk"));
        if (!num.equals(numValueOf) || C2503509rV.LIZ("ws_use_new_sdk")) {
            return numValueOf;
        }
        throw new C316660CbA();
    }

    public Boolean getEnableAvStorageMonitor() {
        return Boolean.TRUE;
    }

    public Integer getEdmEmailConsentSettingByKey(String str, Integer num) {
        SettingsManager.LIZLLL().getSettingsValueProvider();
        return Integer.valueOf(C2503509rV.LIZLLL(num.intValue(), str));
    }
}
