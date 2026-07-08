package com.ss.android.ugc.tiktok.pns.screen.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BaseResponse implements Serializable {

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public BaseResponse() {
        this(0, "");
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public BaseResponse(int i, String str) {
        this.statusCode = i;
        this.statusMsg = str;
    }
}
