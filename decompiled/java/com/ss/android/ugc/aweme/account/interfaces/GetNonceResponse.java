package com.ss.android.ugc.aweme.account.interfaces;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class GetNonceResponse {

    @C09CT("data")
    public final Data data;

    @C09CT("message")
    public final String message;

    public static final class Data {

        @C09CT("description")
        public final String description;

        @C09CT("nonce")
        public final String nonce;

        public Data(String str, String str2) {
            this.nonce = str;
            this.description = str2;
        }
    }

    public GetNonceResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }
}
