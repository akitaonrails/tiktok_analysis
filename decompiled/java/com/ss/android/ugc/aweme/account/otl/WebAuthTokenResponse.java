package com.ss.android.ugc.aweme.account.otl;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: loaded from: classes14.dex */
public final class WebAuthTokenResponse {

    @C09CT("data")
    public final Data data;

    @C09CT("message")
    public final String message;

    public WebAuthTokenResponse() {
        this("", null);
    }

    public WebAuthTokenResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }

    public static final class Data {

        @C09CT("error_code")
        public final Integer errorCode;

        @C09CT("description")
        public final String errorDescription;

        @C09CT("id_token")
        public final String idToken;

        @C09CT("redirect_url")
        public final String redirectUrl;

        @C09CT("ttl")
        public final String ttl;

        public Data() {
            this(null, null, CardStruct.IStatusCode.DEFAULT, null, 0);
        }

        public Data(String str, String str2, String str3, String str4, Integer num) {
            this.redirectUrl = str;
            this.idToken = str2;
            this.ttl = str3;
            this.errorDescription = str4;
            this.errorCode = num;
        }
    }
}
