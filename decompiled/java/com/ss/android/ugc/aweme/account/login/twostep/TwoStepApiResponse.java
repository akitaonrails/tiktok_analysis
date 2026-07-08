package com.ss.android.ugc.aweme.account.login.twostep;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class TwoStepApiResponse {

    @C09CT("data")
    public final Data data;

    @C09CT("message")
    public final String message;

    public TwoStepApiResponse(String str, Data data) {
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

        @C09CT("ticket")
        public final String ticket;

        public Data(String str, String str2, Integer num, String str3) {
            this.ticket = str;
            this.captcha = str2;
            this.errorCode = num;
            this.errorDescription = str3;
        }
    }
}
