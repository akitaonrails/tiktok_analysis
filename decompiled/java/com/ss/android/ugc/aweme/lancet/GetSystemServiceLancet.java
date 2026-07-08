package com.ss.android.ugc.aweme.lancet;

import X.C1C7U;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes10.dex */
public final class GetSystemServiceLancet {
    public static volatile boolean LIZ = true;
    public static volatile boolean LIZIZ;

    public static class UIThreadHandler extends BPEAHandler {
        public final Handler LL;

        public UIThreadHandler(Handler handler) {
            super(Looper.getMainLooper());
            this.LL = handler;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("GetSystemServiceLancet$UIThreadHandler@99a2.handleMessage");
            Handler handler = this.LL;
            if (handler != null) {
                handler.handleMessage(message);
            }
            C1C7U.LIZIZ("GetSystemServiceLancet$UIThreadHandler@99a2.handleMessage");
        }
    }
}
