package com.bytedance.monitor.collector;

import X.C1C7U;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes4.dex */
public final class DoFrameBooster {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new ProxyFrameHandler(Looper.getMainLooper());
    }

    public static class ProxyFrameHandler extends BPEAHandler {
        public ProxyFrameHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C1C7U.LIZ("DoFrameBooster$ProxyFrameHandler@5b7d.handleMessage");
            throw null;
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            message.getCallback();
            return super.sendMessageAtTime(message, j);
        }
    }
}
