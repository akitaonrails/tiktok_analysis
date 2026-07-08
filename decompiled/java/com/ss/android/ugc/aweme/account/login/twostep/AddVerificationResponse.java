package com.ss.android.ugc.aweme.account.login.twostep;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class AddVerificationResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("data")
    public final Data data;

    @C09CT("message")
    public final String message;

    public static final class Data implements Serializable {
        public static final int $stable = 8;

        @C09CT("default_verify_way")
        public final String default_verify_way;

        @C09CT("error_code")
        public final Integer errorCode;

        @C09CT("description")
        public final String errorDescription;

        @C09CT("is_passkey_signup_account")
        public final Boolean isPasskeySignupAccount;

        @C09CT("two_step_verify_ways")
        public final List<VerifyWay> two_step_verify_ways;

        public final Boolean isPasskeySignupAccount() {
            return this.isPasskeySignupAccount;
        }

        public Data(List<VerifyWay> list, String str, String str2, Integer num, Boolean bool) {
            this.two_step_verify_ways = list;
            this.default_verify_way = str;
            this.errorDescription = str2;
            this.errorCode = num;
            this.isPasskeySignupAccount = bool;
        }
    }

    public AddVerificationResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }
}
