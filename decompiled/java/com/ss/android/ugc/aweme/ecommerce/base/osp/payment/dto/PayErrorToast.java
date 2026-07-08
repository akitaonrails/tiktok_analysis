package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes2.dex */
public final class PayErrorToast {
    public String LIZ;

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("error_msg")
    public final String errorMsg;

    @C09CT("error_text")
    public final String errorText;

    @C09CT("error_title")
    public final String errorTitle;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PayErrorToast(errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.errorMsg);
        sbLIZ.append(", errorText=");
        sbLIZ.append(this.errorText);
        sbLIZ.append(", errorTitle=");
        sbLIZ.append(this.errorTitle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PayErrorToast(String str, String str2, String str3, String str4) {
        this.errorCode = str;
        this.errorMsg = str2;
        this.errorText = str3;
        this.errorTitle = str4;
    }
}
