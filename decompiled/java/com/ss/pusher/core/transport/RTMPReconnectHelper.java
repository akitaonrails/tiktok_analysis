package com.ss.pusher.core.transport;

import com.ss.pusher.core.base.TEBundle;
import com.ss.pusher.core.engine.NativeObject;

/* JADX INFO: loaded from: classes21.dex */
public class RTMPReconnectHelper extends NativeObject {
    private native int nativeCreate(TEBundle tEBundle);

    private native int nativeGetCurrentRetryCount();

    private native int nativeGetStreamRetryCount();

    private native void nativeOnEvent(int i, int i2, long j, String str);

    private native void nativeResetLightWeightReconnectParams();

    @Override // com.ss.pusher.core.engine.NativeObject, com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        super.release();
    }
}
