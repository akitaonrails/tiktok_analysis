package com.ss.android.ugc.aweme.account.unbind;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class UnbindResponse {

    @C09CT("data")
    public final Data data;

    @C09CT("message")
    public final String message;

    public static final class Data {

        @C09CT("description")
        public final String description;

        @C09CT("error_code")
        public int errorCode;

        public Data(int i, String str) {
            this.errorCode = i;
            this.description = str;
        }
    }

    public UnbindResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }
}
