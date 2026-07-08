package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoPreBindVerifyResp {

    @C09CT("data")
    public final PipoPreBindVerifyData data;

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("error_msg")
    public final String errorMsg;

    @C09CT("pipo_error_action")
    public final String pipoErrorAction;

    @C09CT("result_code")
    public final String resultCode;

    public PipoPreBindVerifyResp() {
        this(null, null, null, null, null);
    }

    public PipoPreBindVerifyResp(String str, String str2, String str3, PipoPreBindVerifyData pipoPreBindVerifyData, String str4) {
        this.errorCode = str;
        this.errorMsg = str2;
        this.resultCode = str3;
        this.data = pipoPreBindVerifyData;
        this.pipoErrorAction = str4;
    }
}
