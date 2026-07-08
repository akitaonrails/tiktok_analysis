package com.ss.android.ugc.aweme.app;

import X.C0WZX;
import X.C1913880zu6;
import X.C2204961BRm;
import X.C2214841BmM;
import X.C2230608oa;
import X.C786410Ut5;
import X.C810670Vr7;
import X.C844470XAv;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes35.dex */
public class SharePrefCache {
    public C2230608oa<String> adLandingPageConfig;
    public C2230608oa<String> allContentLanguages;
    public C2230608oa<Integer> atFriendsShowType;
    public C2230608oa<Boolean> autoSaveVideo;
    public volatile List<C2230608oa> cacheItems;
    public C2230608oa<Boolean> canCreateInsights;
    public C2230608oa<Boolean> canLive;
    public boolean collectAllItems;
    public C2230608oa<Boolean> debugWebBar;
    public C2230608oa<String> downloadForbiddenToast;
    public C2230608oa<Integer> downloadMicroApp;
    public C2230608oa<String> downloadSdkConfig;
    public C2230608oa<Integer> enableBindItemCallOMSDK;
    public C2230608oa<Boolean> enableMessagePb2Json;
    public C2230608oa<Boolean> enableProfileActivityLink;
    public C2230608oa<Long> festivalShareDonationTime;
    public C2230608oa<Boolean> followGuideShown;
    public C2230608oa<Long> followNoticeCloseTime;
    public C2230608oa<Boolean> geckoLocalTestUseOnline;
    public C2230608oa<String> googleServerAuthCode;
    public C2230608oa<Boolean> hasEnterBindPhone;
    public C2230608oa<Boolean> hasLongPressDislike;
    public C2230608oa<Boolean> hasShowFilterGuide;
    public C2230608oa<Boolean> hasShowHighQualityVideoTips;
    public C2230608oa<Boolean> iesOffline;
    public C2230608oa<String> imCurrentLocaleLanguage;
    public C2230608oa<Boolean> isAwemePrivate;
    public C2230608oa<Boolean> isContactDialogShown;
    public C2230608oa<Boolean> isContactsUploaded;
    public C2230608oa<Boolean> isEuropeCountry;
    public C2230608oa<Boolean> isFirstLaunch;
    public C2230608oa<Boolean> isFirstReportVideo;
    public C2230608oa<Integer> isNewInstall;
    public C2230608oa<Boolean> isOb;
    public C2230608oa<Boolean> isOldUser;
    public C2230608oa<Boolean> isProfileBubbleShown;
    public C2230608oa<Boolean> isShowFavouriteIcon;
    public C2230608oa<Boolean> isShowNearBy;
    public C2230608oa<Boolean> isUseBackRefresh;
    public C2230608oa<Boolean> ischangeFollowTab;
    public C2230608oa<String> jsActlogUrl;
    public C2230608oa<Long> lastFeedCount;
    public C2230608oa<Long> lastFeedTime;
    public C2230608oa<Long> lastFilterTime;
    public C2230608oa<Long> lastGetRelieveAwemeTime;
    public C2230608oa<Long> lastHintToastTime;
    public C2230608oa<Boolean> lastPublishFailed;
    public C2230608oa<Integer> lastUsableNetworkSpeed;
    public C2230608oa<Boolean> longVideoPermitted;
    public final Object mAddLanguageLock;
    public SharedPreferences mSharedPreferences;
    public final Object mUseHttpsLock;
    public C2230608oa<Boolean> mUseNewPackageNow;
    public C2230608oa<String> miniAppLabTitle;
    public C2230608oa<Boolean> mockLiveResolution;
    public C2230608oa<Boolean> mockLiveSend;
    public C2230608oa<String> mpTab;
    public C2230608oa<Integer> multiSelectLimit;
    public C2230608oa<Integer> privacyAccountFollowCount;
    public C2230608oa<String> privacyReminderH5Url;
    public C2230608oa<Integer> promoteDialogPopupClickType;
    public C2230608oa<String> promoteDialogPopupPopupContent;
    public C2230608oa<Integer> promoteDialogPopupPopupInterval;
    public C2230608oa<String> promoteDialogPopupPopupLinkText;
    public C2230608oa<String> promoteDialogPopupPopupMsg;
    public C2230608oa<String> promoteDialogPopupPopupTitle;
    public C2230608oa<String> promoteDialogPopupPopupUrl;
    public C2230608oa<Integer> promoteDialogPopupTimesLimit;
    public C2230608oa<Boolean> promoteDialogShouldShow;
    public C2230608oa<String> referralEntrance;
    public C2230608oa<Boolean> removeFollowerSwitch;
    public C2230608oa<String> requestNotificationText;
    public C2230608oa<String> requestNotificationTitle;
    public C2230608oa<Boolean> rnFallback;
    public C2230608oa<String> searchTabIndex;
    public C2230608oa<String> selectedContentLanguages;
    public C2230608oa<Boolean> shouldShowCreatorFundAccountUpgradeInProfile;
    public C2230608oa<Boolean> shouldShowFavouriteTip;
    public C2230608oa<Boolean> shouldShowPrivateAccountTipInProfile;
    public C2230608oa<Boolean> showPlayerInfoUI;
    public C2230608oa<Boolean> showTimeLineTab;
    public C2230608oa<Boolean> showVideoBitrateInfo;
    public C2230608oa<Boolean> stickerArtEntry;
    public C2230608oa<String> stickerArtlistUrl;
    public C2230608oa<Integer> storyInfoStickerMaxCount;
    public C2230608oa<String> storyRegisterPublishSyncHintContent;
    public C2230608oa<String> storyRegisterPublishSyncHintH5Str;
    public C2230608oa<String> storyRegisterPublishSyncHintH5Url;
    public C2230608oa<String> storyRegisterPublishSyncHintTitle;
    public C2230608oa<Integer> storyTextStickerMaxCount;
    public C2230608oa<String> storyUnRegisterPublishSyncHintContent;
    public C2230608oa<String> storyUnRegisterPublishSyncHintH5Str;
    public C2230608oa<String> storyUnRegisterPublishSyncHintH5Url;
    public C2230608oa<String> storyUnRegisterPublishSyncHintTitle;
    public C2230608oa<String> twitterSecret;
    public C2230608oa<Integer> upGuideNum;
    public C2230608oa<Boolean> useCronet;
    public C2230608oa<Boolean> useDefaultHost;
    public C2230608oa<Boolean> useHttps;
    public C2230608oa<String> userCurrentRegion;
    public C2230608oa<Boolean> userHasPassword;
    public C2230608oa<String> userResidence;
    public C2230608oa<Boolean> videoPreload;
    public C2230608oa<Integer> weakNetPreLoadSwitch;

    private void collectAllItemsIfNeed() throws Throwable {
        if (this.collectAllItems) {
            return;
        }
        this.collectAllItems = true;
        for (Method method : SharePrefCache.class.getDeclaredMethods()) {
            if (method.getReturnType() == C2230608oa.class) {
                try {
                    C2204961BRm.a0(method, this, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9H91DMBf85fHyBAHGsgwg==", null));
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (InvocationTargetException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
    }

    public C2230608oa<String> getAdLandingPageConfig() {
        if (this.adLandingPageConfig == null) {
            this.adLandingPageConfig = new C2230608oa<>("ad_landing_page_config", "");
            this.cacheItems.add(this.adLandingPageConfig);
        }
        return this.adLandingPageConfig;
    }

    public C2230608oa<String> getAllContentLanguages() {
        if (this.allContentLanguages == null) {
            this.allContentLanguages = new C2230608oa<>("user_all_content_languages", "");
            this.cacheItems.add(this.allContentLanguages);
        }
        return this.allContentLanguages;
    }

    public C2230608oa<Integer> getAtFriendsShowType() {
        if (this.atFriendsShowType == null) {
            this.atFriendsShowType = new C2230608oa<>("at_friends_show_type", 0);
            this.cacheItems.add(this.atFriendsShowType);
        }
        return this.atFriendsShowType;
    }

    public C2230608oa<Boolean> getAutoSaveVideo() {
        if (this.autoSaveVideo == null) {
            this.autoSaveVideo = new C2230608oa<>("auto_save_video", Boolean.TRUE);
            this.cacheItems.add(this.autoSaveVideo);
        }
        return this.autoSaveVideo;
    }

    public C2230608oa<Boolean> getCanCreateInsights() {
        if (this.canCreateInsights == null) {
            this.canCreateInsights = new C2230608oa<>("can_create_insights", Boolean.FALSE);
            this.cacheItems.add(this.canCreateInsights);
        }
        return this.canCreateInsights;
    }

    public C2230608oa<String> getCurrentLocaleLanguage() {
        if (this.imCurrentLocaleLanguage == null) {
            this.imCurrentLocaleLanguage = new C2230608oa<>("im_current_locale", C786410Ut5.t2(Locale.CHINESE));
            this.cacheItems.add(this.imCurrentLocaleLanguage);
        }
        return this.imCurrentLocaleLanguage;
    }

    public C2230608oa<Boolean> getDebugWebBar() {
        if (this.debugWebBar == null) {
            this.debugWebBar = new C2230608oa<>("debug_web_bar", Boolean.TRUE);
            this.cacheItems.add(this.debugWebBar);
        }
        return this.debugWebBar;
    }

    public C2230608oa<String> getDownloadForbiddenToast() {
        if (this.downloadForbiddenToast == null) {
            this.downloadForbiddenToast = new C2230608oa<>("download_forbidden_toast", "");
            this.cacheItems.add(this.downloadForbiddenToast);
        }
        return this.downloadForbiddenToast;
    }

    public C2230608oa<Integer> getDownloadMicroApp() {
        if (this.downloadMicroApp == null) {
            this.downloadMicroApp = new C2230608oa<>("download_micro_app", 1);
            this.cacheItems.add(this.downloadMicroApp);
        }
        return this.downloadMicroApp;
    }

    public C2230608oa<String> getDownloadSdkConfig() {
        if (this.downloadSdkConfig == null) {
            this.downloadSdkConfig = new C2230608oa<>("download_sdk_config", "");
            this.cacheItems.add(this.downloadSdkConfig);
        }
        return this.downloadSdkConfig;
    }

    public C2230608oa<Integer> getEnableBindItemCallOMSDK() {
        if (this.enableBindItemCallOMSDK == null) {
            this.enableBindItemCallOMSDK = new C2230608oa<>("enableBindItemCallOMSDK", 0);
            this.cacheItems.add(this.enableBindItemCallOMSDK);
        }
        return this.enableBindItemCallOMSDK;
    }

    public C2230608oa<Boolean> getEnableProfileActivityLink() {
        if (this.enableProfileActivityLink == null) {
            this.enableProfileActivityLink = new C2230608oa<>("enable_profile_link", Boolean.FALSE);
            this.cacheItems.add(this.enableProfileActivityLink);
        }
        return this.enableProfileActivityLink;
    }

    public C2230608oa<Long> getFestivalShareDonationTime() {
        if (this.festivalShareDonationTime == null) {
            this.festivalShareDonationTime = new C2230608oa<>("festival_share_donation_time", 0L);
            this.cacheItems.add(this.festivalShareDonationTime);
        }
        return this.festivalShareDonationTime;
    }

    public C2230608oa<Boolean> getFollowGuideShown() {
        if (this.followGuideShown == null) {
            this.followGuideShown = new C2230608oa<>("follow_guide_shown", Boolean.FALSE);
            this.cacheItems.add(this.followGuideShown);
        }
        return this.followGuideShown;
    }

    public C2230608oa<Long> getFollowNoticeCloseTime() {
        if (this.followNoticeCloseTime == null) {
            this.followNoticeCloseTime = new C2230608oa<>("follow_notice_close_time", 0L);
            this.cacheItems.add(this.followNoticeCloseTime);
        }
        return this.followNoticeCloseTime;
    }

    public C2230608oa<Boolean> getGeckoLocalTestUseOnline() {
        if (this.geckoLocalTestUseOnline == null) {
            this.geckoLocalTestUseOnline = new C2230608oa<>("gecko_local_test_use_online", Boolean.FALSE);
            this.cacheItems.add(this.geckoLocalTestUseOnline);
        }
        return this.geckoLocalTestUseOnline;
    }

    public C2230608oa<Boolean> getHasEnterBindPhone() {
        if (this.hasEnterBindPhone == null) {
            this.hasEnterBindPhone = new C2230608oa<>("has_enter_bind_phone", Boolean.FALSE);
            this.cacheItems.add(this.hasEnterBindPhone);
        }
        return this.hasEnterBindPhone;
    }

    public C2230608oa<Boolean> getHasLongPressDislike() {
        if (this.hasLongPressDislike == null) {
            this.hasLongPressDislike = new C2230608oa<>("has_long_pressed_dislike", Boolean.FALSE);
            this.cacheItems.add(this.hasLongPressDislike);
        }
        return this.hasLongPressDislike;
    }

    public C2230608oa<Boolean> getIesOffline() {
        if (this.iesOffline == null) {
            this.iesOffline = new C2230608oa<>("iesoffline", Boolean.TRUE);
            this.cacheItems.add(this.iesOffline);
        }
        return this.iesOffline;
    }

    public C2230608oa<Boolean> getIsAwemePrivate() {
        if (this.isAwemePrivate == null) {
            this.isAwemePrivate = new C2230608oa<>("is_aweme_private", Boolean.FALSE);
            this.cacheItems.add(this.isAwemePrivate);
        }
        return this.isAwemePrivate;
    }

    public C2230608oa<Boolean> getIsChangeFollowTab() {
        if (this.ischangeFollowTab == null) {
            this.ischangeFollowTab = new C2230608oa<>("is_change_follow_tab", Boolean.FALSE);
            this.cacheItems.add(this.ischangeFollowTab);
        }
        return this.ischangeFollowTab;
    }

    public C2230608oa<Boolean> getIsContactDialogShown() {
        if (this.isContactDialogShown == null) {
            this.isContactDialogShown = new C2230608oa<>("contact_dialog_shown", Boolean.valueOf(getSharePref().getBoolean("contact_dialog_shown", false)));
            this.cacheItems.add(this.isContactDialogShown);
        }
        return this.isContactDialogShown;
    }

    public C2230608oa<Boolean> getIsContactsUploaded() {
        if (this.isContactsUploaded == null) {
            this.isContactsUploaded = new C2230608oa<>("contacts_uploaded", Boolean.FALSE);
            this.cacheItems.add(this.isContactsUploaded);
        }
        return this.isContactsUploaded;
    }

    public C2230608oa<Boolean> getIsEuropeCountry() {
        if (this.isEuropeCountry == null) {
            if (!TextUtils.isEmpty(C1913880zu6.LIZIZ())) {
                this.isEuropeCountry = new C2230608oa<>("is_europe_country", Boolean.valueOf(C1913880zu6.LIZJ(C1913880zu6.LIZIZ())));
            } else if (TextUtils.isEmpty(C1913880zu6.LIZ())) {
                this.isEuropeCountry = new C2230608oa<>("is_europe_country", Boolean.FALSE);
            } else {
                this.isEuropeCountry = new C2230608oa<>("is_europe_country", Boolean.valueOf(C1913880zu6.LIZJ(C1913880zu6.LIZ())));
            }
            this.cacheItems.add(this.isEuropeCountry);
        }
        return this.isEuropeCountry;
    }

    public C2230608oa<Boolean> getIsFirstLaunch() {
        if (this.isFirstLaunch == null) {
            this.isFirstLaunch = new C2230608oa<>("is_first_lauch", Boolean.TRUE);
            this.cacheItems.add(this.isFirstLaunch);
        }
        return this.isFirstLaunch;
    }

    public C2230608oa<Boolean> getIsFirstReportVideo() {
        if (this.isFirstReportVideo == null) {
            this.isFirstReportVideo = new C2230608oa<>("is_first_report_video", Boolean.TRUE);
            this.cacheItems.add(this.isFirstReportVideo);
        }
        return this.isFirstReportVideo;
    }

    public C2230608oa<Integer> getIsNewInstall() {
        if (this.isNewInstall == null) {
            this.isNewInstall = new C2230608oa<>("is_new_install", -1);
            this.cacheItems.add(this.isNewInstall);
        }
        return this.isNewInstall;
    }

    public C2230608oa<Boolean> getIsOldUser() {
        if (this.isOldUser == null) {
            this.isOldUser = new C2230608oa<>("old_user", Boolean.FALSE);
            this.cacheItems.add(this.isOldUser);
        }
        return this.isOldUser;
    }

    public C2230608oa<Boolean> getIsProfileBubbleShown() {
        if (this.isProfileBubbleShown == null) {
            this.isProfileBubbleShown = new C2230608oa<>("profile_bubble_shown", Boolean.TRUE);
            this.cacheItems.add(this.isProfileBubbleShown);
        }
        return this.isProfileBubbleShown;
    }

    public C2230608oa<Boolean> getIsShowFavouriteIcon() {
        if (this.isShowFavouriteIcon == null) {
            this.isShowFavouriteIcon = new C2230608oa<>("show_favourite_icon", Boolean.FALSE);
            this.cacheItems.add(this.isShowFavouriteIcon);
        }
        return this.isShowFavouriteIcon;
    }

    public C2230608oa<Boolean> getIsShowNearBy() {
        if (this.isShowNearBy == null) {
            this.isShowNearBy = new C2230608oa<>("is_show_near_by", Boolean.FALSE);
            this.cacheItems.add(this.isShowNearBy);
        }
        return this.isShowNearBy;
    }

    public C2230608oa<Boolean> getIsUseBackRefresh() {
        if (this.isUseBackRefresh == null) {
            this.isUseBackRefresh = new C2230608oa<>("is_use_back_refresh", Boolean.TRUE);
            this.cacheItems.add(this.isUseBackRefresh);
        }
        return this.isUseBackRefresh;
    }

    public C2230608oa<String> getJsActlogUrl() {
        if (this.jsActlogUrl == null) {
            this.jsActlogUrl = new C2230608oa<>("js_actlog_url", "");
            this.cacheItems.add(this.jsActlogUrl);
        }
        return this.jsActlogUrl;
    }

    public C2230608oa<Long> getLastFeedCount() {
        if (this.lastFeedCount == null) {
            this.lastFeedCount = new C2230608oa<>("last_feed_count", 0L);
            this.cacheItems.add(this.lastFeedCount);
        }
        return this.lastFeedCount;
    }

    public C2230608oa<Long> getLastFeedTime() {
        if (this.lastFeedTime == null) {
            this.lastFeedTime = new C2230608oa<>("last_feed_time", 0L);
            this.cacheItems.add(this.lastFeedTime);
        }
        return this.lastFeedTime;
    }

    public C2230608oa<Long> getLastFilterTime() {
        if (this.lastFilterTime == null) {
            this.lastFilterTime = new C2230608oa<>("last_filter_time", 0L);
            this.cacheItems.add(this.lastFilterTime);
        }
        return this.lastFilterTime;
    }

    public C2230608oa<Long> getLastGetRelieveAwemeTime() {
        if (this.lastGetRelieveAwemeTime == null) {
            this.lastGetRelieveAwemeTime = new C2230608oa<>("has_relieve_aweme", 0L);
            this.cacheItems.add(this.lastGetRelieveAwemeTime);
        }
        return this.lastGetRelieveAwemeTime;
    }

    public C2230608oa<Long> getLastHintToastTime() {
        if (this.lastHintToastTime == null) {
            this.lastHintToastTime = new C2230608oa<>("last_hint_toast_time", 0L);
            this.cacheItems.add(this.lastHintToastTime);
        }
        return this.lastHintToastTime;
    }

    public C2230608oa<Boolean> getLastPublishFailed() {
        if (this.lastPublishFailed == null) {
            this.lastPublishFailed = new C2230608oa<>("last_publish_failed", Boolean.FALSE);
            this.cacheItems.add(this.lastPublishFailed);
        }
        return this.lastPublishFailed;
    }

    public C2230608oa<Integer> getLastUsableNetworkSpeed() {
        if (this.lastUsableNetworkSpeed == null) {
            this.lastUsableNetworkSpeed = new C2230608oa<>("last_usable_network_speed", -1);
        }
        return this.lastUsableNetworkSpeed;
    }

    public C2230608oa<Boolean> getLongVideoPermitted() {
        if (this.longVideoPermitted == null) {
            this.longVideoPermitted = new C2230608oa<>("long_video_permitted", Boolean.FALSE);
            this.cacheItems.add(this.longVideoPermitted);
        }
        return this.longVideoPermitted;
    }

    public C2230608oa<String> getMiniAppLabelTitle() {
        if (this.miniAppLabTitle == null) {
            this.miniAppLabTitle = new C2230608oa<>("lab_title", "");
            this.cacheItems.add(this.miniAppLabTitle);
        }
        return this.miniAppLabTitle;
    }

    public C2230608oa<String> getMpTab() {
        if (this.mpTab == null) {
            this.mpTab = new C2230608oa<>("mp_tab", "");
            this.cacheItems.add(this.mpTab);
        }
        return this.mpTab;
    }

    public C2230608oa<Integer> getMultiSelectLimitItem() {
        if (this.multiSelectLimit == null) {
            this.multiSelectLimit = new C2230608oa<>("multi_select_limit", 10);
            this.cacheItems.add(this.multiSelectLimit);
        }
        return this.multiSelectLimit;
    }

    public C2230608oa<Integer> getPrivacyAccountFollowCount() {
        if (this.privacyAccountFollowCount == null) {
            this.privacyAccountFollowCount = new C2230608oa<>("privacy_account_follow_count", 0);
        }
        return this.privacyAccountFollowCount;
    }

    public C2230608oa<String> getPrivacyReminderH5Url() {
        if (this.privacyReminderH5Url == null) {
            this.privacyReminderH5Url = new C2230608oa<>("privacy_reminder", "");
            this.cacheItems.add(this.privacyReminderH5Url);
        }
        return this.privacyReminderH5Url;
    }

    public C2230608oa<Integer> getPromoteDialogPopupClickType() {
        if (this.promoteDialogPopupClickType == null) {
            this.promoteDialogPopupClickType = new C2230608oa<>("promote_dialog_popup_click_type", 0);
            this.cacheItems.add(this.promoteDialogPopupClickType);
        }
        return this.promoteDialogPopupClickType;
    }

    public C2230608oa<String> getPromoteDialogPopupPopupContent() {
        if (this.promoteDialogPopupPopupContent == null) {
            this.promoteDialogPopupPopupContent = new C2230608oa<>("promote_dialog_popup_content", "");
            this.cacheItems.add(this.promoteDialogPopupPopupContent);
        }
        return this.promoteDialogPopupPopupContent;
    }

    public C2230608oa<Integer> getPromoteDialogPopupPopupInterval() {
        if (this.promoteDialogPopupPopupInterval == null) {
            this.promoteDialogPopupPopupInterval = new C2230608oa<>("promote_dialog_popup_interval", 7);
            this.cacheItems.add(this.promoteDialogPopupPopupInterval);
        }
        return this.promoteDialogPopupPopupInterval;
    }

    public C2230608oa<String> getPromoteDialogPopupPopupLinkText() {
        if (this.promoteDialogPopupPopupLinkText == null) {
            this.promoteDialogPopupPopupLinkText = new C2230608oa<>("promote_dialog_popup_linkText", "");
            this.cacheItems.add(this.promoteDialogPopupPopupLinkText);
        }
        return this.promoteDialogPopupPopupLinkText;
    }

    public C2230608oa<String> getPromoteDialogPopupPopupMsg() {
        if (this.promoteDialogPopupPopupMsg == null) {
            this.promoteDialogPopupPopupMsg = new C2230608oa<>("promote_dialog_popup_msg", "");
            this.cacheItems.add(this.promoteDialogPopupPopupMsg);
        }
        return this.promoteDialogPopupPopupMsg;
    }

    public C2230608oa<String> getPromoteDialogPopupPopupTitle() {
        if (this.promoteDialogPopupPopupTitle == null) {
            this.promoteDialogPopupPopupTitle = new C2230608oa<>("promote_dialog_popup_title", "");
            this.cacheItems.add(this.promoteDialogPopupPopupTitle);
        }
        return this.promoteDialogPopupPopupTitle;
    }

    public C2230608oa<String> getPromoteDialogPopupPopupUrl() {
        if (this.promoteDialogPopupPopupUrl == null) {
            this.promoteDialogPopupPopupUrl = new C2230608oa<>("promote_dialog_popup_url", "");
            this.cacheItems.add(this.promoteDialogPopupPopupUrl);
        }
        return this.promoteDialogPopupPopupUrl;
    }

    public C2230608oa<Integer> getPromoteDialogPopupTimesLimit() {
        if (this.promoteDialogPopupTimesLimit == null) {
            this.promoteDialogPopupTimesLimit = new C2230608oa<>("promote_dialog_popup_times_limit", 3);
            this.cacheItems.add(this.promoteDialogPopupTimesLimit);
        }
        return this.promoteDialogPopupTimesLimit;
    }

    public C2230608oa<Boolean> getPromoteDialogShouldShow() {
        if (this.promoteDialogShouldShow == null) {
            this.promoteDialogShouldShow = new C2230608oa<>("promote_dialog_show", Boolean.FALSE);
            this.cacheItems.add(this.promoteDialogShouldShow);
        }
        return this.promoteDialogShouldShow;
    }

    public C2230608oa<String> getReferralEntrance() {
        if (this.referralEntrance == null) {
            this.referralEntrance = new C2230608oa<>("invite_friends", "");
        }
        return this.referralEntrance;
    }

    public C2230608oa<Boolean> getRemoveFollowerSwitch() {
        if (this.removeFollowerSwitch == null) {
            this.removeFollowerSwitch = new C2230608oa<>("remove_follower_switch", Boolean.FALSE);
        }
        return this.removeFollowerSwitch;
    }

    public C2230608oa<String> getRequestNotificationText() {
        if (this.requestNotificationText == null) {
            this.requestNotificationText = new C2230608oa<>("request_notification_text", "");
            this.cacheItems.add(this.requestNotificationText);
        }
        return this.requestNotificationText;
    }

    public C2230608oa<String> getRequestNotificationTitle() {
        if (this.requestNotificationTitle == null) {
            this.requestNotificationTitle = new C2230608oa<>("request_notification_title", "");
            this.cacheItems.add(this.requestNotificationTitle);
        }
        return this.requestNotificationTitle;
    }

    public C2230608oa<Boolean> getRnFallback() {
        if (this.rnFallback == null) {
            this.rnFallback = new C2230608oa<>("rn_fallback", Boolean.FALSE);
            this.cacheItems.add(this.rnFallback);
        }
        return this.rnFallback;
    }

    public C2230608oa<String> getSearchTabIndex() {
        if (this.searchTabIndex == null) {
            this.searchTabIndex = new C2230608oa<>("search_tab_index", "");
            this.cacheItems.add(this.searchTabIndex);
        }
        return this.searchTabIndex;
    }

    public C2230608oa<Boolean> getShouldShowCreatorFundAccountUpgradeInProfile() {
        if (this.shouldShowCreatorFundAccountUpgradeInProfile == null) {
            this.shouldShowCreatorFundAccountUpgradeInProfile = new C2230608oa<>("show_creator_fund_account_upgrade_in_profile", Boolean.FALSE);
            this.cacheItems.add(this.shouldShowCreatorFundAccountUpgradeInProfile);
        }
        return this.shouldShowCreatorFundAccountUpgradeInProfile;
    }

    public C2230608oa<Boolean> getShouldShowFavouriteTip() {
        if (this.shouldShowFavouriteTip == null) {
            this.shouldShowFavouriteTip = new C2230608oa<>("should_show_favourite_tip", Boolean.TRUE);
            this.cacheItems.add(this.shouldShowFavouriteTip);
        }
        return this.shouldShowFavouriteTip;
    }

    public C2230608oa<Boolean> getShouldShowPrivateAccountTipInProfile() {
        if (this.shouldShowPrivateAccountTipInProfile == null) {
            this.shouldShowPrivateAccountTipInProfile = new C2230608oa<>("show_private_account_tip_in_profile", Boolean.FALSE);
            this.cacheItems.add(this.shouldShowPrivateAccountTipInProfile);
        }
        return this.shouldShowPrivateAccountTipInProfile;
    }

    public C2230608oa<Boolean> getShowPlayerInfoUI() {
        if (this.showPlayerInfoUI == null) {
            this.showPlayerInfoUI = new C2230608oa<>("show_player_info_ui", Boolean.FALSE);
            this.cacheItems.add(this.showPlayerInfoUI);
        }
        return this.showPlayerInfoUI;
    }

    public C2230608oa<Boolean> getShowTimeLineTab() {
        if (this.showTimeLineTab == null) {
            this.showTimeLineTab = new C2230608oa<>("show_timeline_tab", Boolean.FALSE);
            this.cacheItems.add(this.showTimeLineTab);
        }
        return this.showTimeLineTab;
    }

    public C2230608oa<Boolean> getShowVideoBitrateInfo() {
        if (this.showVideoBitrateInfo == null) {
            this.showVideoBitrateInfo = new C2230608oa<>("showVideoBitrateInfo", Boolean.FALSE);
            this.cacheItems.add(this.showVideoBitrateInfo);
        }
        return this.showVideoBitrateInfo;
    }

    public C2230608oa<Boolean> getStickerArtEntry() {
        if (this.stickerArtEntry == null) {
            this.stickerArtEntry = new C2230608oa<>("sticker_artist_entry", Boolean.FALSE);
            this.cacheItems.add(this.stickerArtEntry);
        }
        return this.stickerArtEntry;
    }

    public C2230608oa<String> getStickerArtlistUrl() {
        if (this.stickerArtlistUrl == null) {
            this.stickerArtlistUrl = new C2230608oa<>("sticker_artlist_url", "");
            this.cacheItems.add(this.stickerArtlistUrl);
        }
        return this.stickerArtlistUrl;
    }

    public C2230608oa<Integer> getStoryInfoStickerMaxCount() {
        if (this.storyInfoStickerMaxCount == null) {
            this.storyInfoStickerMaxCount = new C2230608oa<>("story_info_sticker_max_count", 30);
            this.cacheItems.add(this.storyInfoStickerMaxCount);
        }
        return this.storyInfoStickerMaxCount;
    }

    public C2230608oa<String> getStoryRegisterPublishSyncHintContent() {
        if (this.storyRegisterPublishSyncHintContent == null) {
            this.storyRegisterPublishSyncHintContent = new C2230608oa<>("story_publish_register_sync_hint_content", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintContent);
        }
        return this.storyRegisterPublishSyncHintContent;
    }

    public C2230608oa<String> getStoryRegisterPublishSyncHintH5Str() {
        if (this.storyRegisterPublishSyncHintH5Str == null) {
            this.storyRegisterPublishSyncHintH5Str = new C2230608oa<>("story_publish_register_sync_hint_h5", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintH5Str);
        }
        return this.storyRegisterPublishSyncHintH5Str;
    }

    public C2230608oa<String> getStoryRegisterPublishSyncHintH5Url() {
        if (this.storyRegisterPublishSyncHintH5Url == null) {
            this.storyRegisterPublishSyncHintH5Url = new C2230608oa<>("story_publish_register_sync_hint_h5_url", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintH5Url);
        }
        return this.storyRegisterPublishSyncHintH5Url;
    }

    public C2230608oa<String> getStoryRegisterPublishSyncHintTitle() {
        if (this.storyRegisterPublishSyncHintTitle == null) {
            this.storyRegisterPublishSyncHintTitle = new C2230608oa<>("story_publish_register_sync_hint_title", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintTitle);
        }
        return this.storyRegisterPublishSyncHintTitle;
    }

    public C2230608oa<Integer> getStoryTextStickerMaxCount() {
        if (this.storyTextStickerMaxCount == null) {
            this.storyTextStickerMaxCount = new C2230608oa<>("story_text_sticker_max_count", 30);
            this.cacheItems.add(this.storyTextStickerMaxCount);
        }
        return this.storyTextStickerMaxCount;
    }

    public C2230608oa<String> getStoryUnRegisterPublishSyncHintContent() {
        if (this.storyUnRegisterPublishSyncHintContent == null) {
            this.storyUnRegisterPublishSyncHintContent = new C2230608oa<>("story_publish_unregister_sync_hint_content", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintContent);
        }
        return this.storyUnRegisterPublishSyncHintContent;
    }

    public C2230608oa<String> getStoryUnRegisterPublishSyncHintH5Str() {
        if (this.storyUnRegisterPublishSyncHintH5Str == null) {
            this.storyUnRegisterPublishSyncHintH5Str = new C2230608oa<>("story_publish_unregister_sync_hint_h5", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintH5Str);
        }
        return this.storyUnRegisterPublishSyncHintH5Str;
    }

    public C2230608oa<String> getStoryUnRegisterPublishSyncHintH5Url() {
        if (this.storyUnRegisterPublishSyncHintH5Url == null) {
            this.storyUnRegisterPublishSyncHintH5Url = new C2230608oa<>("story_publish_unregister_sync_hint_h5_url", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintH5Url);
        }
        return this.storyUnRegisterPublishSyncHintH5Url;
    }

    public C2230608oa<String> getStoryUnRegisterPublishSyncHintTitle() {
        if (this.storyUnRegisterPublishSyncHintTitle == null) {
            this.storyUnRegisterPublishSyncHintTitle = new C2230608oa<>("story_publish_unregister_sync_hint_title", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintTitle);
        }
        return this.storyUnRegisterPublishSyncHintTitle;
    }

    public C2230608oa<Integer> getUpGuideNum() {
        if (this.upGuideNum == null) {
            this.upGuideNum = new C2230608oa<>("up_guide_num", -1);
            this.cacheItems.add(this.upGuideNum);
        }
        return this.upGuideNum;
    }

    public C2230608oa<Boolean> getUseCronet() {
        if (this.useCronet == null) {
            this.useCronet = new C2230608oa<>("use_cronet", Boolean.TRUE);
            this.cacheItems.add(this.useCronet);
        }
        return this.useCronet;
    }

    public C2230608oa<Boolean> getUseDefaultHost() {
        if (this.useDefaultHost == null) {
            this.useDefaultHost = new C2230608oa<>("use_default_host", Boolean.TRUE);
            this.cacheItems.add(this.useDefaultHost);
        }
        return this.useDefaultHost;
    }

    public C2230608oa<Boolean> getUseHttps() {
        C2230608oa<Boolean> c2230608oa;
        synchronized (this.mUseHttpsLock) {
            try {
                if (this.useHttps == null) {
                    this.useHttps = new C2230608oa<>("use_https", Boolean.TRUE);
                    this.cacheItems.add(this.useHttps);
                }
                c2230608oa = this.useHttps;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c2230608oa;
    }

    public C2230608oa<Boolean> getUseNewPackageNow() {
        if (this.mUseNewPackageNow == null) {
            this.mUseNewPackageNow = new C2230608oa<>("use_new_package_now", Boolean.FALSE);
            this.cacheItems.add(this.mUseNewPackageNow);
        }
        return this.mUseNewPackageNow;
    }

    public C2230608oa<String> getUserAddLanguages() {
        synchronized (this.mAddLanguageLock) {
            try {
                if (this.selectedContentLanguages == null) {
                    this.selectedContentLanguages = new C2230608oa<>("user_add_languages", "");
                    this.cacheItems.add(this.selectedContentLanguages);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this.selectedContentLanguages;
    }

    public C2230608oa<String> getUserCurrentRegion() {
        if (this.userCurrentRegion == null) {
            this.userCurrentRegion = new C2230608oa<>("user_current_region", "");
            this.cacheItems.add(this.userCurrentRegion);
        }
        return this.userCurrentRegion;
    }

    public C2230608oa<Boolean> getUserHasPassword() {
        if (this.userHasPassword == null) {
            this.userHasPassword = new C2230608oa<>("user_has_password", Boolean.FALSE);
            this.cacheItems.add(this.userHasPassword);
        }
        return this.userHasPassword;
    }

    public C2230608oa<String> getUserResidence() {
        if (this.userResidence == null) {
            this.userResidence = new C2230608oa<>("user_residence", "");
            this.cacheItems.add(this.userResidence);
        }
        return this.userResidence;
    }

    public C2230608oa<Boolean> getVideoPreload() {
        if (this.videoPreload == null) {
            this.videoPreload = new C2230608oa<>("video_preload", Boolean.TRUE);
            this.cacheItems.add(this.videoPreload);
        }
        return this.videoPreload;
    }

    public C2230608oa<Integer> getWeakNetPreLoadSwitch() {
        if (this.weakNetPreLoadSwitch == null) {
            this.weakNetPreLoadSwitch = new C2230608oa<>("weak_net_pre_load_switch", 1);
            this.cacheItems.add(this.weakNetPreLoadSwitch);
        }
        return this.weakNetPreLoadSwitch;
    }

    public C2230608oa<Boolean> hasShowHighQualityVideoTips() {
        if (this.hasShowHighQualityVideoTips == null) {
            this.hasShowHighQualityVideoTips = new C2230608oa<>("has_show_high_quality_video_tips", Boolean.FALSE);
            this.cacheItems.add(this.hasShowHighQualityVideoTips);
        }
        return this.hasShowHighQualityVideoTips;
    }

    public C2230608oa<Boolean> isEnableMessagePb2Json() {
        if (this.enableMessagePb2Json == null) {
            this.enableMessagePb2Json = new C2230608oa<>("live_enanble_message_pb2json", Boolean.FALSE);
            this.cacheItems.add(this.enableMessagePb2Json);
        }
        return this.enableMessagePb2Json;
    }

    public C2230608oa<Boolean> isOb() {
        if (this.isOb == null) {
            this.isOb = new C2230608oa<>("is_ob", Boolean.FALSE);
            this.cacheItems.add(this.isOb);
        }
        return this.isOb;
    }

    public C2230608oa<Boolean> mockLiveResolution() {
        if (this.mockLiveResolution == null) {
            this.mockLiveResolution = new C2230608oa<>("mock_live_resolution", Boolean.FALSE);
            this.cacheItems.add(this.mockLiveResolution);
        }
        return this.mockLiveResolution;
    }

    public C2230608oa<Boolean> mockLiveSend() {
        if (this.mockLiveSend == null) {
            this.mockLiveSend = new C2230608oa<>("mock_live_send", Boolean.FALSE);
            this.cacheItems.add(this.mockLiveSend);
        }
        return this.mockLiveSend;
    }

    public SharePrefCache() {
        this.cacheItems = Collections.synchronizedList(new ArrayList());
        this.mUseHttpsLock = new Object();
        this.mAddLanguageLock = new Object();
        C844470XAv.LIZ.getClass();
        this.mSharedPreferences = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "aweme-app");
    }

    public void clearCache() throws Throwable {
        collectAllItemsIfNeed();
        for (C2230608oa c2230608oa : this.cacheItems) {
            c2230608oa.LIZLLL(c2230608oa.LIZ);
        }
    }

    public int getMultiSelectLimit() {
        return getMultiSelectLimitItem().LIZ().intValue();
    }

    public static SharePrefCache inst() {
        return C2214841BmM.LIZ;
    }

    public SharedPreferences getSharePref() {
        return this.mSharedPreferences;
    }

    public void setMultiSelectLimit(int i) {
        getMultiSelectLimitItem().LJ(Integer.valueOf(i));
    }
}
