package com.ss.android.ugc.aweme.account.login.twostep;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class VerifyTOTPResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("data")
    public final VerifyData data;

    @C09CT("message")
    public final String message;

    public VerifyTOTPResponse(VerifyData verifyData, String str) {
        this.data = verifyData;
        this.message = str;
    }

    public static final class VerifyData implements Serializable {
        public static final int $stable = 0;

        @C09CT("description")
        public final String description;

        @C09CT("error_code")
        public final Integer errorCode;

        @C09CT("ticket")
        public final String ticket;

        public VerifyData(String str, String str2, Integer num) {
            this.ticket = str;
            this.description = str2;
            this.errorCode = num;
        }
    }
}
