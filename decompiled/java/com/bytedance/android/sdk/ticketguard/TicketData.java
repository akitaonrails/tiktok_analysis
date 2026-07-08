package com.bytedance.android.sdk.ticketguard;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class TicketData {

    @C09CT("ticket")
    public final String ticket;

    @C09CT("ts_sign")
    public final String ts_sign;

    @C09CT("type")
    public final String type;

    public TicketData(String str, String str2, String str3) {
        this.type = str;
        this.ticket = str2;
        this.ts_sign = str3;
    }
}
