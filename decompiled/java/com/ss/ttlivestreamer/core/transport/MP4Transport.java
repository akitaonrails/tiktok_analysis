package com.ss.ttlivestreamer.core.transport;

import X.AbstractC1270490jAN;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes21.dex */
public class MP4Transport extends NativeTransport {
    private native void nativeCreateNative(boolean z, boolean z2);

    public native void nativeStartRecord();

    public native void nativeStopRecord();

    @Override // com.ss.ttlivestreamer.core.transport.NativeTransport, com.ss.ttlivestreamer.core.engine.NativeObject
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // com.ss.ttlivestreamer.core.transport.NativeTransport, com.ss.ttlivestreamer.core.engine.Transport
    public /* bridge */ /* synthetic */ void registerFeedbackObserber(AbstractC1270490jAN abstractC1270490jAN) {
        super.registerFeedbackObserber(abstractC1270490jAN);
    }

    @Override // com.ss.ttlivestreamer.core.transport.NativeTransport, com.ss.ttlivestreamer.core.engine.Transport
    public /* bridge */ /* synthetic */ void unRegisterFeedbackObserber(AbstractC1270490jAN abstractC1270490jAN) {
        super.unRegisterFeedbackObserber(abstractC1270490jAN);
    }

    public MP4Transport(boolean z, boolean z2) {
        nativeCreateNative(z, z2);
    }

    @Override // com.ss.ttlivestreamer.core.transport.NativeTransport, com.ss.ttlivestreamer.core.engine.Transport
    public /* bridge */ /* synthetic */ void sendPacket(Buffer buffer, int i) {
        super.sendPacket(buffer, i);
    }
}
