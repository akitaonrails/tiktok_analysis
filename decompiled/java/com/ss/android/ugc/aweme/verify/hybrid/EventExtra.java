package com.ss.android.ugc.aweme.verify.hybrid;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EventExtra {

    @C09CT("next_verify_info")
    public final String nextVerifyInfo;

    @C09CT("switched_from")
    public final String switchedFrom;

    @C09CT("switched_to")
    public final String switchedTo;

    @C09CT("verify_id")
    public final String verifyId;

    @C09CT("verify_info")
    public final String verifyInfo;

    public EventExtra(String str, String str2, String str3, String str4, String str5) {
        this.nextVerifyInfo = str;
        this.switchedTo = str2;
        this.switchedFrom = str3;
        this.verifyId = str4;
        this.verifyInfo = str5;
    }
}
