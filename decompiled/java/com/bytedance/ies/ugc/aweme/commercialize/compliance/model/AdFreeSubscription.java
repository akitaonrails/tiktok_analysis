package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class AdFreeSubscription implements Serializable {

    @C09CT("ad_free_trial_page_info")
    public final AdFreeTrialPageInfo adFreeTrialPageInfo;

    @C09CT("complete_payment_welcome_page")
    public final AdFreeTrialPageInfo completePaymentWelcomePage;

    @C09CT("continue_payment_page")
    public final AdFreeTrialPageInfo continuePaymentPage;

    @C09CT("tt_plus_experiment_tag")
    public final String experimentTag;

    @C09CT("tt_plus_feed_card_config")
    public final FeedCardConfig feedCardConfig;

    @C09CT("is_show_free_trial_pop_up")
    public final Boolean isShowFreeTrialPopUp;

    @C09CT("is_show_standard_scheduled_pop_up")
    public final Boolean isShowStandardScheduledPopUp;

    @C09CT("need_pop_up_intro_pages")
    public final Boolean needPopUpIntroPages;

    @C09CT("need_pop_up_on_hold_expire_prompt")
    public final Boolean needPopUpOnHoldExpirePrompt;

    @C09CT("need_pop_up_subscription_page")
    public final Boolean needPopUpSubscriptionPage;

    @C09CT("pick_your_ad_plan_page")
    public final PickYourAdPlanPage pickYourAdPlanPage;

    @C09CT("pick_plan_page_in_settings")
    public final PickYourAdPlanPage pickYourAdPlanPageInSetting;

    @C09CT("product_line")
    public final Integer productLine;

    @C09CT("standard_scheduled_prompt_payload")
    public final PromptPayload standardScheduledPromptPayload;

    @C09CT("standard_scheduled_start_time")
    public final Integer standardScheduledStartTime;

    @C09CT("subscribe_intro_page")
    public final AdFreeTrialPageInfo subscribeIntroPage;

    @C09CT("subscribe_intro_reminder_page")
    public final AdFreeTrialPageInfo subscribeIntroReminderPage;

    @C09CT("subscription_mode")
    public final Integer subscriptionMode;

    @C09CT("subscription_status")
    public Integer subscriptionStatus;

    @C09CT("subscription_status_info")
    public final SubscriptionStatusInfo subscriptionStatusInfo;

    @C09CT("test_end_prompt_payload")
    public final PromptPayload testEndPromptPayload;

    @C09CT("tiktok_plus_on_hold_prompt_payload")
    public final PromptPayload tiktokPlusOnHoldPromptPayload;

    @C09CT("tt_plus_intro_entries")
    public final List<Integer> ttPlusIntroEntries;

    @C09CT("vid")
    public final String vid;

    public AdFreeSubscription() {
        this(0, -1, null, null, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, 0, Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, null, null, "", null, null, null, null);
    }

    public final Boolean isShowFreeTrialPopUp() {
        return this.isShowFreeTrialPopUp;
    }

    public final Boolean isShowStandardScheduledPopUp() {
        return this.isShowStandardScheduledPopUp;
    }

    public final void setSubscriptionStatus(Integer num) {
        this.subscriptionStatus = num;
    }

    public AdFreeSubscription(Integer num, Integer num2, PickYourAdPlanPage pickYourAdPlanPage, AdFreeTrialPageInfo adFreeTrialPageInfo, SubscriptionStatusInfo subscriptionStatusInfo, Boolean bool, Boolean bool2, Boolean bool3, Integer num3, Boolean bool4, Boolean bool5, PromptPayload promptPayload, PromptPayload promptPayload2, PromptPayload promptPayload3, String str, AdFreeTrialPageInfo adFreeTrialPageInfo2, AdFreeTrialPageInfo adFreeTrialPageInfo3, AdFreeTrialPageInfo adFreeTrialPageInfo4, AdFreeTrialPageInfo adFreeTrialPageInfo5, String str2, FeedCardConfig feedCardConfig, PickYourAdPlanPage pickYourAdPlanPage2, Integer num4, List<Integer> list) {
        this.subscriptionMode = num;
        this.subscriptionStatus = num2;
        this.pickYourAdPlanPage = pickYourAdPlanPage;
        this.adFreeTrialPageInfo = adFreeTrialPageInfo;
        this.subscriptionStatusInfo = subscriptionStatusInfo;
        this.isShowFreeTrialPopUp = bool;
        this.isShowStandardScheduledPopUp = bool2;
        this.needPopUpIntroPages = bool3;
        this.standardScheduledStartTime = num3;
        this.needPopUpSubscriptionPage = bool4;
        this.needPopUpOnHoldExpirePrompt = bool5;
        this.standardScheduledPromptPayload = promptPayload;
        this.tiktokPlusOnHoldPromptPayload = promptPayload2;
        this.testEndPromptPayload = promptPayload3;
        this.vid = str;
        this.completePaymentWelcomePage = adFreeTrialPageInfo2;
        this.subscribeIntroReminderPage = adFreeTrialPageInfo3;
        this.continuePaymentPage = adFreeTrialPageInfo4;
        this.subscribeIntroPage = adFreeTrialPageInfo5;
        this.experimentTag = str2;
        this.feedCardConfig = feedCardConfig;
        this.pickYourAdPlanPageInSetting = pickYourAdPlanPage2;
        this.productLine = num4;
        this.ttPlusIntroEntries = list;
    }
}
