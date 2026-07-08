package com.bytedance.pipo.ttpay.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class TtpayEventModel {

    @C09CT("event_name")
    public final String eventName;

    @C09CT("event_params")
    public final String eventParams;

    public TtpayEventModel() {
        this(null, null);
    }

    public TtpayEventModel(String str, String str2) {
        this.eventName = str;
        this.eventParams = str2;
    }
}
