package com.ss.android.ugc.aweme.component.verify.pin.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class PinRule implements Serializable {

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("error_msg")
    public final String errorMsg;

    @C09CT("regex")
    public final String regex;

    public PinRule(String str, String str2, String str3) {
        this.regex = str;
        this.errorCode = str2;
        this.errorMsg = str3;
    }
}
