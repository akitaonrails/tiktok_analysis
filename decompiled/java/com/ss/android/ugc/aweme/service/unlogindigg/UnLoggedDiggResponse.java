package com.ss.android.ugc.aweme.service.unlogindigg;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class UnLoggedDiggResponse {

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public UnLoggedDiggResponse(int i, String str) {
        this.statusCode = i;
        this.statusMsg = str;
    }
}
