package com.ss.android.ugc.aweme.account.login.twostep;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class SendEmailCodeResponse {

    @C09CT("data")
    public final Data data;

    @C09CT("message")
    public final String message;

    public SendEmailCodeResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }

    public static final class Data {

        @C09CT("captcha")
        public final String captcha;

        @C09CT("email")
        public final String email;

        @C09CT("error_code")
        public final Integer errorCode;

        @C09CT("description")
        public final String errorDescription;

        public Data(String str, String str2, String str3, Integer num) {
            this.email = str;
            this.captcha = str2;
            this.errorDescription = str3;
            this.errorCode = num;
        }
    }
}
