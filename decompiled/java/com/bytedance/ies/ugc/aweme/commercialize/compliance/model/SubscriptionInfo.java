package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class SubscriptionInfo implements Serializable {

    @C09CT("ad_settings_description")
    public final String adSettingsDescription;

    @C09CT("tiktok_plus_benefits_title")
    public final String benefitsTitle;

    @C09CT("cancel_subscription_button_text")
    public final String cancelSubscriptionButtonText;

    @C09CT("change_plan_text")
    public final String changePlanText;

    @C09CT("subscription_expire_timestamp")
    public final Integer expireTimestamp;

    @C09CT("subscription_expire_timestamp_text")
    public final String expireTimestampText;

    @C09CT("benefit_page_learn_more_url")
    public final String learnMoreUrl;

    @C09CT("h5_page_info")
    public final String midPageInfo;

    @C09CT("offer_info")
    public final OfferInfo offerInfo;

    @C09CT("plus_benefit")
    public final List<BenefitInfo> plusBenefit;

    @C09CT("product_launch_phase")
    public final String productLaunchPhase;

    @C09CT("subscription_start_timestamp")
    public final Integer startTimestamp;

    @C09CT("subscription_start_timestamp_text")
    public final String startTimestampText;

    public SubscriptionInfo(String str, Integer num, String str2, Integer num2, OfferInfo offerInfo, String str3, String str4, List<BenefitInfo> list, String str5, String str6, String str7, String str8, String str9) {
        this.startTimestampText = str;
        this.startTimestamp = num;
        this.expireTimestampText = str2;
        this.expireTimestamp = num2;
        this.offerInfo = offerInfo;
        this.cancelSubscriptionButtonText = str3;
        this.benefitsTitle = str4;
        this.plusBenefit = list;
        this.learnMoreUrl = str5;
        this.midPageInfo = str6;
        this.productLaunchPhase = str7;
        this.changePlanText = str8;
        this.adSettingsDescription = str9;
    }
}
