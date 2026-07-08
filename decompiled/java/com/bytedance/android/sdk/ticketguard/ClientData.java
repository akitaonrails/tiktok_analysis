package com.bytedance.android.sdk.ticketguard;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class ClientData {

    @C09CT("req_content")
    public final String requestContent;

    @C09CT("req_sign")
    public String requestSign;

    @C09CT("timestamp")
    public final long timestamp;

    @C09CT("ts_sign")
    public String tsSign;

    public ClientData(String str, long j, String str2, String str3) {
        this.requestContent = str;
        this.timestamp = j;
        this.tsSign = str2;
        this.requestSign = str3;
    }
}
