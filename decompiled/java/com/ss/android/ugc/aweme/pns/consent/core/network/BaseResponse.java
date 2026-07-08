package com.ss.android.ugc.aweme.pns.consent.core.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class BaseResponse implements Serializable {

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public BaseResponse() {
        this(0, "");
    }

    public BaseResponse(int i, String str) {
        this.statusCode = i;
        this.statusMsg = str;
    }
}
