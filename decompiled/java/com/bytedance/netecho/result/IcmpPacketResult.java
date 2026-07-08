package com.bytedance.netecho.result;

/* JADX INFO: loaded from: classes24.dex */
public final class IcmpPacketResult {
    public final int errorCode;
    public final boolean success;
    public final float tripTimeMs;
    public final int ttl;

    public IcmpPacketResult(boolean z, int i, float f, int i2) {
        this.success = z;
        this.ttl = i;
        this.tripTimeMs = f;
        this.errorCode = i2;
    }
}
