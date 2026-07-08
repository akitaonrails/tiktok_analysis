package com.ss.android.ugc.aweme.commercialize.tcm.api;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class TcmBarStatusResponse {

    @C09CT("status_code")
    public final int code;

    @C09CT("data")
    public final String data;

    @C09CT("status_msg")
    public final String msg;

    public TcmBarStatusResponse(int i, String str, String str2) {
        this.code = i;
        this.msg = str;
        this.data = str2;
    }
}
