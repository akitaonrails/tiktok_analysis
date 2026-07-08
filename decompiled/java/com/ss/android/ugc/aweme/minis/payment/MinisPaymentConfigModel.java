package com.ss.android.ugc.aweme.minis.payment;

import X.C09CT;
import X.C13BV;
import com.google.gson.n;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class MinisPaymentConfigModel {

    @C09CT("beans_policy_translated_language")
    public final List<String> beansPolicyTranslatedLanguage;

    @C09CT("beans_policy_translated_locale")
    public final List<String> beansPolicyTranslatedLocale;

    @C09CT("beans_withdrawal_disabled_content_countries")
    public final n beansWithdrawalDisabledContentCountries;

    @C09CT("iap_commercial_act_url")
    public final String iapPaymentCommercialActLegalUrl;

    @C09CT("iap_privacy_url")
    public final String iapPaymentPrivacyUrl;

    @C09CT("iap_privacy_url_translated")
    public final String iapPaymentPrivacyUrlTranslated;

    @C09CT("iap_payment_service_url")
    public final String iapPaymentServiceActLegalUrl;

    @C09CT("iap_query_timeout")
    public final int maxQueryTime;

    @C09CT("merchant_id_list")
    public final MerchantIdList merchantIdList;

    @C09CT("iap_query_interval")
    public final int queryInterval;

    @C09CT("subscription_privacy_url")
    public final String subscriptionPaymentPrivacyUrl;

    public MinisPaymentConfigModel(int i, int i2, List<String> list, List<String> list2, n nVar, String str, String str2, String str3, String str4, String str5, MerchantIdList merchantIdList) {
        this.maxQueryTime = i;
        this.queryInterval = i2;
        this.beansPolicyTranslatedLanguage = list;
        this.beansPolicyTranslatedLocale = list2;
        this.beansWithdrawalDisabledContentCountries = nVar;
        this.iapPaymentPrivacyUrl = str;
        this.iapPaymentPrivacyUrlTranslated = str2;
        this.subscriptionPaymentPrivacyUrl = str3;
        this.iapPaymentCommercialActLegalUrl = str4;
        this.iapPaymentServiceActLegalUrl = str5;
        this.merchantIdList = merchantIdList;
    }

    public MinisPaymentConfigModel(int i, int i2, List list, List list2, n nVar, String str, String str2, String str3, String str4, String str5, MerchantIdList merchantIdList, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? C13BV.INSTANCE : list, (i3 & 8) != 0 ? C13BV.INSTANCE : list2, (i3 & 16) != 0 ? new n() : nVar, (i3 & 32) != 0 ? null : str, (i3 & 64) != 0 ? null : str2, (i3 & 128) != 0 ? null : str3, (i3 & 256) != 0 ? null : str4, (i3 & 512) != 0 ? null : str5, (i3 & 1024) == 0 ? merchantIdList : null);
    }
}
