package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ThirdPartyAdConsentPromptModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class AdPersonalitySettings implements Serializable {
    public static final int $stable = 8;

    @C09CT("pa_revising_switch")
    public final Boolean PARevisingSwitch;

    @C09CT("ab_test_pop_up_copy_writing")
    public final PopUpCopyWriting abCopyWriting;

    @C09CT("pop_up_copywriting_content_type")
    public final Integer contentType;

    @C09CT("pop_up_copywriting")
    public final CopyWritingInfo copyWriting;

    @C09CT("description")
    public final String description;

    @C09CT("enable_toggle_decoupling")
    public final Boolean enableToggleDecoupling;

    @C09CT("is_show_disconnect_adv")
    public final Boolean hitDisconnectAdvExperiment;

    @C09CT("is_follow_sys_config")
    public final Boolean isFollowSystemConfig;

    @C09CT("is_new_user")
    public final Integer isNewUser;

    @C09CT("is_np_user")
    public final Boolean isNpUser;

    @C09CT("show_advertiser_settings")
    public final Boolean isShowAdvertiserSettings;

    @C09CT("is_show_reset_entry")
    public final Boolean isShowResetEntry;

    @C09CT("is_show_settings")
    public final Boolean isShowSettings;

    @C09CT("is_teenager_mode")
    public final Integer isTeenagerMode;

    @C09CT("use_balance_prompt")
    public final Boolean isUseBalancePrompt;

    @C09CT("limit_ad_tracking")
    public final Boolean lat;

    @C09CT("mode")
    public final Integer mode;

    @C09CT("need_pop_up")
    public Boolean needPopUp;

    @C09CT("pop_up_copywriting_test_style")
    public final Integer popUpStyle;

    @C09CT("popup_check_text_style")
    public final Integer promptStyle;

    @C09CT("reset_entry_text")
    public final ResetEntryTextData reset;

    @C09CT("use_new_interests")
    public final Integer showInterestItemType;

    @C09CT("pers_ad_show_interest_label")
    public final Boolean showInterestLabel;

    @C09CT("ad_free_subscription")
    public final AdFreeSubscription subscription;

    @C09CT("consent_re_prompt_struct")
    public final ThirdPartyAdConsentPromptModel thirdPartyAdConsentPromptConfig;

    @C09CT("pers_ad_main_mode_title")
    public final String title;

    @C09CT("unified_mode")
    public final Integer unifiedMode;

    @C09CT("unified_mode_text_data")
    public final UnifiedModeTextData unifiedModeTextData;

    public AdPersonalitySettings() {
        this(0, Boolean.FALSE, Boolean.FALSE, "", "", null, Boolean.FALSE, Boolean.FALSE, 0, Boolean.FALSE, 0, Boolean.FALSE, 0, 0, 0, Boolean.FALSE, null, Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, 0, 0, null, null, null, Boolean.FALSE, Boolean.FALSE);
    }

    public final AdPersonalitySettings copy(Integer num, Boolean bool, Boolean bool2, String str, String str2, CopyWritingInfo copyWritingInfo, Boolean bool3, Boolean bool4, Integer num2, Boolean bool5, Integer num3, Boolean bool6, Integer num4, Integer num5, Integer num6, Boolean bool7, UnifiedModeTextData unifiedModeTextData, Boolean bool8, ResetEntryTextData resetEntryTextData, Boolean bool9, Boolean bool10, Integer num7, Integer num8, PopUpCopyWriting popUpCopyWriting, AdFreeSubscription adFreeSubscription, ThirdPartyAdConsentPromptModel thirdPartyAdConsentPromptModel, Boolean bool11, Boolean bool12) {
        return new AdPersonalitySettings(num, bool, bool2, str, str2, copyWritingInfo, bool3, bool4, num2, bool5, num3, bool6, num4, num5, num6, bool7, unifiedModeTextData, bool8, resetEntryTextData, bool9, bool10, num7, num8, popUpCopyWriting, adFreeSubscription, thirdPartyAdConsentPromptModel, bool11, bool12);
    }

    public final Boolean getPARevisingSwitch() {
        return this.PARevisingSwitch;
    }

    public final Boolean isFollowSystemConfig() {
        return this.isFollowSystemConfig;
    }

    public final Integer isNewUser() {
        return this.isNewUser;
    }

    public final Boolean isNpUser() {
        return this.isNpUser;
    }

    public final Boolean isShowAdvertiserSettings() {
        return this.isShowAdvertiserSettings;
    }

    public final Boolean isShowResetEntry() {
        return this.isShowResetEntry;
    }

    public final Boolean isShowSettings() {
        return this.isShowSettings;
    }

    public final Integer isTeenagerMode() {
        return this.isTeenagerMode;
    }

    public final Boolean isUseBalancePrompt() {
        return this.isUseBalancePrompt;
    }

    public final void setNeedPopUp(Boolean bool) {
        this.needPopUp = bool;
    }

    public AdPersonalitySettings(Integer num, Boolean bool, Boolean bool2, String str, String str2, CopyWritingInfo copyWritingInfo, Boolean bool3, Boolean bool4, Integer num2, Boolean bool5, Integer num3, Boolean bool6, Integer num4, Integer num5, Integer num6, Boolean bool7, UnifiedModeTextData unifiedModeTextData, Boolean bool8, ResetEntryTextData resetEntryTextData, Boolean bool9, Boolean bool10, Integer num7, Integer num8, PopUpCopyWriting popUpCopyWriting, AdFreeSubscription adFreeSubscription, ThirdPartyAdConsentPromptModel thirdPartyAdConsentPromptModel, Boolean bool11, Boolean bool12) {
        this.mode = num;
        this.needPopUp = bool;
        this.isFollowSystemConfig = bool2;
        this.description = str;
        this.title = str2;
        this.copyWriting = copyWritingInfo;
        this.isShowSettings = bool3;
        this.showInterestLabel = bool4;
        this.showInterestItemType = num2;
        this.lat = bool5;
        this.promptStyle = num3;
        this.isNpUser = bool6;
        this.unifiedMode = num4;
        this.isTeenagerMode = num5;
        this.isNewUser = num6;
        this.PARevisingSwitch = bool7;
        this.unifiedModeTextData = unifiedModeTextData;
        this.isShowResetEntry = bool8;
        this.reset = resetEntryTextData;
        this.isUseBalancePrompt = bool9;
        this.isShowAdvertiserSettings = bool10;
        this.popUpStyle = num7;
        this.contentType = num8;
        this.abCopyWriting = popUpCopyWriting;
        this.subscription = adFreeSubscription;
        this.thirdPartyAdConsentPromptConfig = thirdPartyAdConsentPromptModel;
        this.enableToggleDecoupling = bool11;
        this.hitDisconnectAdvExperiment = bool12;
    }
}
