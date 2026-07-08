package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class InitializeAgreementRequest {

    @C09CT("agreement_info")
    public final String agreementInfo;

    @C09CT("agreement_type")
    public final String agreementType;

    @C09CT("category")
    public final String category;

    @C09CT("configuration")
    public final AgreementConfiguration configuration;

    @C09CT("is_unactivated")
    public final Boolean isUnactivated;

    @C09CT("merchant_agreement_id")
    public final String merchantAgreementId;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("notification_type")
    public final Integer notificationType;

    @C09CT("notification_url")
    public final String notificationUrl;

    @C09CT("risk_info")
    public final String riskInfo;

    @C09CT("sub_merchant_id")
    public final String subMerchantId;

    @C09CT("template_id")
    public final String templateId;

    @C09CT("user_external_logon_id")
    public final String userExternalLogonId;

    public InitializeAgreementRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public InitializeAgreementRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, AgreementConfiguration agreementConfiguration, Integer num, Boolean bool) {
        this.agreementType = str;
        this.category = str2;
        this.merchantId = str3;
        this.merchantAgreementId = str4;
        this.merchantUserId = str5;
        this.notificationUrl = str6;
        this.riskInfo = str7;
        this.userExternalLogonId = str8;
        this.subMerchantId = str9;
        this.templateId = str10;
        this.agreementInfo = str11;
        this.configuration = agreementConfiguration;
        this.notificationType = num;
        this.isUnactivated = bool;
    }
}
