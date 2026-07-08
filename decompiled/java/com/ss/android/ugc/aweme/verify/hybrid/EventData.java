package com.ss.android.ugc.aweme.verify.hybrid;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EventData {

    @C09CT("container_id")
    public final String containerId;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("extra")
    public final EventExtra extra;

    @C09CT("verify_id")
    public final String verifyId;

    public EventData(String str, String str2, String str3, EventExtra eventExtra) {
        this.enterFrom = str;
        this.containerId = str2;
        this.verifyId = str3;
        this.extra = eventExtra;
    }
}
