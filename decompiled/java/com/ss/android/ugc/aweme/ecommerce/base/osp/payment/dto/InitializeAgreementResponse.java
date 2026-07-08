package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class InitializeAgreementResponse {

    @C09CT("data")
    public final InitializeAgreementData data;

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("error_content")
    public final String errorContent;

    @C09CT("error_message")
    public final String errorMessage;

    @C09CT("result_code")
    public final String resultCode;

    public InitializeAgreementResponse() {
        this(null, null, null, null, null);
    }

    public InitializeAgreementResponse(String str, String str2, String str3, String str4, InitializeAgreementData initializeAgreementData) {
        this.errorContent = str;
        this.resultCode = str2;
        this.errorMessage = str3;
        this.errorCode = str4;
        this.data = initializeAgreementData;
    }
}
