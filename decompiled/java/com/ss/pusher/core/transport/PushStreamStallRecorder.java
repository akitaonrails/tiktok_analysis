package com.ss.pusher.core.transport;

import com.ss.pusher.core.base.TEBundle;
import com.ss.pusher.core.engine.NativeObject;

/* JADX INFO: loaded from: classes21.dex */
public class PushStreamStallRecorder extends NativeObject {
    public PushStreamStallRecorder() {
        throw null;
    }

    private native int nativeCreate(TEBundle tEBundle);

    private native void nativeStartRecorder();

    private native void nativeStopRecorder();

    @Override // com.ss.pusher.core.engine.NativeObject, com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        super.release();
    }
}
