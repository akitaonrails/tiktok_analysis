package com.ss.android.ugc.aweme.ecommerce.singpass;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class Error {

    @C09CT("code")
    public final Integer code;

    @C09CT("error_msg")
    public final String errorMsg;

    public Error(Integer num, String str) {
        this.code = num;
        this.errorMsg = str;
    }
}
