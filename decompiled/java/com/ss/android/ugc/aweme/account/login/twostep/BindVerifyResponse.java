package com.ss.android.ugc.aweme.account.login.twostep;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class BindVerifyResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("data")
    public final BindErrorData data;

    @C09CT("message")
    public final String message;

    public static final class BindErrorData implements Serializable {
        public static final int $stable = 0;

        @C09CT("description")
        public final String description;

        @C09CT("error_code")
        public final Integer errorCode;

        public BindErrorData(String str, Integer num) {
            this.description = str;
            this.errorCode = num;
        }
    }

    public BindVerifyResponse(BindErrorData bindErrorData, String str) {
        this.data = bindErrorData;
        this.message = str;
    }
}
