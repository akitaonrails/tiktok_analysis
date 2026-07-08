package com.ss.android.ugc.aweme.giftcard.checkout;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CheckRule {

    @C09CT("error_code")
    public final Long errorCode;

    @C09CT("error_msg")
    public final String errorMsg;

    @C09CT("regex")
    public final String regex;

    public CheckRule() {
        this(null, null, null);
    }

    public CheckRule(String str, Long l, String str2) {
        this.regex = str;
        this.errorCode = l;
        this.errorMsg = str2;
    }
}
