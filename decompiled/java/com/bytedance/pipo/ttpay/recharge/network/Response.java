package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class Response implements Serializable {

    @C09CT("response")
    public final String response;

    @C09CT("sign")
    public final String sign;

    public Response() {
        this(null, null);
    }

    public Response(String str, String str2) {
        this.sign = str;
        this.response = str2;
    }
}
