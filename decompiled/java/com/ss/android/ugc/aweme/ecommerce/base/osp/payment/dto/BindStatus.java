package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class BindStatus {

    @C09CT("bind_status")
    public final BindStatusCode bindStatus;

    @C09CT("binding_error_code")
    public final String bindingErrorCode;

    @C09CT("binding_error_message")
    public final String bindingErrorMessage;

    @C09CT("error_message")
    public final String errorMessage;

    @C09CT("pipo_error_action")
    public final String pipoErrorAction;

    public BindStatus(BindStatusCode bindStatusCode, String str, String str2, String str3, String str4) {
        this.bindStatus = bindStatusCode;
        this.errorMessage = str;
        this.bindingErrorCode = str2;
        this.bindingErrorMessage = str3;
        this.pipoErrorAction = str4;
    }
}
