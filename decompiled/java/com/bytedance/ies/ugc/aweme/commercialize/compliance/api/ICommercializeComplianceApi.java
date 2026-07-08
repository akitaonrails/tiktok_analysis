package com.bytedance.ies.ugc.aweme.commercialize.compliance.api;

import X.C0TPL;
import X.C0X9S;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.Advertiser;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.InfoModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.common.datamodel.TTAEToggleModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AckPaymentCallbackResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AgeGateResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.BenefitsResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ClearHistory;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.CommercialComplianceSettings;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscribeResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionStatusResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.UnsubscribeResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.model.PersonalDetailsResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.thirdparty.ThirdPartyAdvertiserList;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.thirdparty.ThirdPartySetAdvertiserStatusResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.model.PATopicsResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.model.SensitiveTopicsResponse;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface ICommercializeComplianceApi {
    public static final C0TPL LIZ = C0TPL.LIZ;

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/csp/subscription/ack_client_payment_callback")
    C0X9S<AckPaymentCallbackResponse> ackPaymentCallback(@InterfaceC1501100pAK("payment_status") int i, @InterfaceC1501100pAK("contract_id") String str, @InterfaceC1501100pAK("error_code") Integer num);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/csp/subscription/ack_prompt")
    C0X9S<BaseResponse> ackPrompt(@InterfaceC1501100pAK("prompt_type") Integer num, @InterfaceC1501100pAK("card_style_id") String str, @InterfaceC1501100pAK("card_slot_id") String str2);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/csp/subscription/ack_survey")
    C0X9S<BaseResponse> ackSurvey(@InterfaceC1501100pAK("survey_source") int i, @InterfaceC1501100pAK("user_action") int i2);

    @InterfaceC1501170pAR("/tiktok/v1/csp/clear_activity")
    C0X9S<ClearHistory> clearHistory();

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/csp/3p_adv/list")
    C0X9S<ThirdPartyAdvertiserList> get3PAdvertiserList(@InterfaceC1501100pAK("adv_type") Integer num, @InterfaceC1501100pAK("offset") Integer num2);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/csp/ata/info")
    C0X9S<InfoModel> getATAInfo(@InterfaceC1501100pAK("geo_name_id") String str, @InterfaceC1501100pAK("country_code") String str2, @InterfaceC1501100pAK("audience_tag_ids") String str3, @InterfaceC1501100pAK("adv_id") String str4);

    @InterfaceC1501170pAR("/tiktok/v1/csp/adv/list")
    C0X9S<Advertiser> getAdvertiserList();

    @InterfaceC1501170pAR("/tiktok/v1/csp/ttae/get_pa")
    Object getAudienceExtensionPA(InterfaceC1364105Vn<? super TTAEToggleModel> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/csp/subscription/get_benefits")
    C0X9S<BenefitsResponse> getBenefits();

    @InterfaceC1501170pAR("/tiktok/v1/csp/ads_compliance_settings")
    C0X9S<CommercialComplianceSettings> getCommercialComplianceSettings();

    @InterfaceC1501170pAR("tiktok/v1/csp/person/details")
    C0X9S<PersonalDetailsResponse> getPersonalDetails();

    @InterfaceC1501170pAR("tiktok/v1/csp/topics/sensitive")
    C0X9S<SensitiveTopicsResponse> getSensitiveTopics();

    @InterfaceC1501170pAR("/tiktok/v1/csp/subscription/subscription_status")
    C0X9S<SubscriptionStatusResponse> getSubscriptionStatus();

    @InterfaceC1501160pAQ("/aweme/v1/pers/ad/topics/")
    C0X9S<PATopicsResponse> getUserTopicsList(@InterfaceC1501120pAM("ad_topic_id") String str, @InterfaceC1501120pAM("ad_topic_section") Integer num);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/csp/subscription/exp_register")
    C0X9S<AgeGateResponse> registerUserForExp(@InterfaceC1501100pAK("product_id") String str, @InterfaceC1501100pAK("vid") String str2);

    @InterfaceC1501170pAR("/tiktok/v1/csp/re_prompt/consent_pa")
    C0X9S<BaseResponse> report3PConsentPromptConsent();

    @InterfaceC1501170pAR("/tiktok/v1/csp/re_prompt/show")
    C0X9S<BaseResponse> report3PConsentPromptShow();

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/csp/3p_adv/optout")
    C0X9S<ThirdPartySetAdvertiserStatusResponse> set3PAdvertiserStatus(@InterfaceC1501100pAK("adv_id") String str, @InterfaceC1501100pAK("enable") Integer num);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/csp/adv/optout")
    C0X9S<BaseResponse> setAdvertiser(@InterfaceC1501100pAK("adv_id") String str, @InterfaceC1501100pAK("enable") String str2, @InterfaceC1501100pAK(Scene.SCENE_SERVICE) String str3);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/csp/ttae/set_pa")
    Object setAudienceExtensionPA(@InterfaceC1501100pAK("mode") String str, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/csp/subscription/ad_choice")
    C0X9S<BaseResponse> setSubscriptionUserChoice(@InterfaceC1501100pAK("ad_choice") String str, @InterfaceC1501100pAK("choice_source") Integer num);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("tiktok/v1/csp/set/settings/")
    C0X9S<BaseResponse> setUserSensitive(@InterfaceC1501100pAK("settings") String str);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/aweme/v1/cmpl/set/settings/")
    C0X9S<BaseResponse> setUserTopic(@InterfaceC1501100pAK("settings") String str);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/csp/subscription/subscribe")
    C0X9S<SubscribeResponse> subscribe(@InterfaceC1501100pAK("product_id") String str, @InterfaceC1501100pAK("choice_source") Integer num, @InterfaceC1501100pAK("offer_token") String str2, @InterfaceC1501100pAK("price_point_id") String str3);

    @InterfaceC1501170pAR("/tiktok/v1/csp/subscription/unsubscribe")
    C0X9S<UnsubscribeResponse> unsubscribe();
}
