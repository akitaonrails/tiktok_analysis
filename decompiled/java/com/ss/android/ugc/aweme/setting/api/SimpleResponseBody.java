package com.ss.android.ugc.aweme.setting.api;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class SimpleResponseBody {

    @C09CT("code")
    public final Integer code;

    @C09CT("message")
    public final String message;

    public final boolean LIZ() {
        Integer num = this.code;
        return num != null && num.intValue() == 0;
    }

    public SimpleResponseBody(Integer num, String str) {
        this.code = num;
        this.message = str;
    }
}
