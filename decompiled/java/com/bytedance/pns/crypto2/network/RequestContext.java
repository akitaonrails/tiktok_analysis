package com.bytedance.pns.crypto2.network;

import android.util.Base64;

/* JADX INFO: loaded from: classes4.dex */
public class RequestContext {
    public long contextPtr;
    public byte[] requestBody;

    public String getRequestBodyString() {
        return Base64.encodeToString(this.requestBody, 2);
    }

    public long getContextPtr() {
        return this.contextPtr;
    }
}
