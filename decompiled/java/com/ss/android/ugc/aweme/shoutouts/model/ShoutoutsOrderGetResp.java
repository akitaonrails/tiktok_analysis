package com.ss.android.ugc.aweme.shoutouts.model;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class ShoutoutsOrderGetResp {

    @C09CT("order_detail")
    public final ShoutoutsOrder orderStruct;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public ShoutoutsOrderGetResp(int i, String str, ShoutoutsOrder shoutoutsOrder) {
        this.statusCode = i;
        this.statusMsg = str;
        this.orderStruct = shoutoutsOrder;
    }
}
