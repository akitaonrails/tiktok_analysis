package com.ss.android.ugc.aweme.account.login.twostep;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class UnusualInfoResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("data")
    public final Data data;

    @C09CT("message")
    public final String message;

    public UnusualInfoResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }

    public static final class Data implements Serializable {
        public static final int $stable = 0;

        @C09CT("error_code")
        public final Integer errorCode;

        @C09CT("description")
        public final String errorDescription;

        @C09CT("new_notice")
        public final Integer new_notice;

        public Data(Integer num, String str, Integer num2) {
            this.new_notice = num;
            this.errorDescription = str;
            this.errorCode = num2;
        }
    }
}
