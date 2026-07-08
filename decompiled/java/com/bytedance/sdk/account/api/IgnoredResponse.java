package com.bytedance.sdk.account.api;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class IgnoredResponse {

    @C09CT("data")
    public final Data data;

    @C09CT("message")
    public final String message;

    public static final class Data {

        @C09CT("error_code")
        public int errorCode;

        public Data(int i) {
            this.errorCode = i;
        }
    }

    public IgnoredResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }
}
