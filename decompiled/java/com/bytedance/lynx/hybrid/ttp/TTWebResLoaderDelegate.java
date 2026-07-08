package com.bytedance.lynx.hybrid.ttp;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class TTWebResLoaderDelegate {
    public static final /* synthetic */ int LIZ = 0;

    public static final class Extra {

        @C09CT("client_start_timing")
        public final long clientStartTiming;

        @C09CT("request_accept")
        public final String requestAccept;

        @C09CT("request_accept_encoding")
        public final String requestAcceptEncoding;

        @C09CT("res_from")
        public final String resFrom;

        @C09CT("web_url")
        public final String webUrl;

        public Extra(String str, String str2, String str3, long j, String str4) {
            this.webUrl = str;
            this.requestAccept = str2;
            this.requestAcceptEncoding = str3;
            this.clientStartTiming = j;
            this.resFrom = str4;
        }
    }
}
