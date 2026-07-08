package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("error_code")
    public String errorCode;

    @C09CT("fail_detailed_message")
    public String failDetailedMessage;

    @C09CT("fail_title")
    public String failTitle;

    public ErrorInfo() {
        this(null, null, null);
    }

    public ErrorInfo(String str, String str2, String str3) {
        this.errorCode = str;
        this.failTitle = str2;
        this.failDetailedMessage = str3;
    }
}
