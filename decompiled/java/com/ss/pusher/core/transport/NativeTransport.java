package com.ss.pusher.core.transport;

import X.AbstractC1279280jOY;
import android.util.AndroidRuntimeException;
import com.ss.pusher.core.engine.Transport;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes21.dex */
public class NativeTransport extends Transport {
    @Override // com.ss.pusher.core.engine.NativeObject, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        super.release();
    }

    public static boolean isNativeTransportInstence(Object obj) {
        return obj instanceof NativeTransport;
    }

    @Override // com.ss.pusher.core.engine.Transport
    public void registerFeedbackObserber(AbstractC1279280jOY abstractC1279280jOY) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.ss.pusher.core.engine.Transport
    public void unRegisterFeedbackObserber(AbstractC1279280jOY abstractC1279280jOY) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.ss.pusher.core.engine.Transport
    public void sendPacket(Buffer buffer, int i) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
