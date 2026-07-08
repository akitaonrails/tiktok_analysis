package com.ss.android.ugc.aweme.account.login.twostep;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class SendSmsCodeResponse {

    @C09CT("data")
    public final Data data;

    @C09CT("message")
    public final String message;

    public SendSmsCodeResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }

    public static final class Data {

        @C09CT("captcha")
        public final String captcha;

        @C09CT("error_code")
        public final Integer errorCode;

        @C09CT("description")
        public final String errorDescription;

        @C09CT("mobile")
        public final String mobile;

        @C09CT("next_url")
        public final String nextUrl;

        @C09CT("retry_time")
        public final Integer retryTime;

        public Data(String str, Integer num, String str2, String str3, Integer num2, String str4) {
            this.mobile = str;
            this.retryTime = num;
            this.captcha = str2;
            this.errorDescription = str3;
            this.errorCode = num2;
            this.nextUrl = str4;
        }
    }
}
