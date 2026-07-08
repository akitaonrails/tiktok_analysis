package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes27.dex */
public final class InitializeAgreementData {

    @C09CT("AgreementId")
    public final String agreementId;

    @C09CT("BaseResp")
    public final BaseResponse baseResp;

    @C09CT("ErrorContent")
    public final String errorContent;

    @C09CT("MerchantAgreementId")
    public final String merchantAgreementId;

    @C09CT("MerchantId")
    public final String merchantId;

    @C09CT("SignExpirationTime")
    public final String signExpirationTime;

    @C09CT("SubMerchantId")
    public final String subMerchantId;

    public InitializeAgreementData() {
        this(null, null, null, null, null, null, null);
    }

    public InitializeAgreementData(String str, String str2, String str3, String str4, String str5, String str6, BaseResponse baseResponse) {
        this.merchantId = str;
        this.subMerchantId = str2;
        this.merchantAgreementId = str3;
        this.agreementId = str4;
        this.signExpirationTime = str5;
        this.errorContent = str6;
        this.baseResp = baseResponse;
    }
}
