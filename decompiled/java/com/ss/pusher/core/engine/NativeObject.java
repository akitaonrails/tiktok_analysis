package com.ss.pusher.core.engine;

/* JADX INFO: loaded from: classes21.dex */
public class NativeObject extends com.ss.ttlivestreamer.core.engine.NativeObject {
    public void onReleased() {
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        onReleased();
        super.release();
    }
}
