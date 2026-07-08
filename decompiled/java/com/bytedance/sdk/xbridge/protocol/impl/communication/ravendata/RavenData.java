package com.bytedance.sdk.xbridge.protocol.impl.communication.ravendata;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public class RavenData<D> {

    @C09CT("data")
    public D data;

    @C09CT("timestamp")
    public long timestamp;

    public RavenData(D d, long j) {
        this.data = d;
        this.timestamp = j;
    }
}
