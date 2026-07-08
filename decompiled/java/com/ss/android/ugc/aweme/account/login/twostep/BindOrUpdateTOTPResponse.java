package com.ss.android.ugc.aweme.account.login.twostep;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class BindOrUpdateTOTPResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("data")
    public final RegisterData data;

    @C09CT("message")
    public final String message;

    public BindOrUpdateTOTPResponse(RegisterData registerData, String str) {
        this.data = registerData;
        this.message = str;
    }

    public static final class RegisterData implements Serializable {
        public static final int $stable = 0;

        @C09CT("description")
        public final String description;

        @C09CT("error_code")
        public final Integer errorCode;

        @C09CT("totp_key_uri")
        public final String totpKeyUri;

        @C09CT("totp_secret")
        public final String totpSecret;

        public RegisterData(String str, String str2, String str3, Integer num) {
            this.totpSecret = str;
            this.totpKeyUri = str2;
            this.description = str3;
            this.errorCode = num;
        }
    }
}
