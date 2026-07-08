package com.bytedance.android.livesdkapi.depend.handler;

import X.C1C7U;
import X.InterfaceC465240IMg;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public class WeakHandler extends BPEAHandler {
    public final WeakReference<InterfaceC465240IMg> LL;

    public WeakHandler(InterfaceC465240IMg interfaceC465240IMg) {
        this.LL = new WeakReference<>(interfaceC465240IMg);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("WeakHandler@66d5.handleMessage");
        InterfaceC465240IMg interfaceC465240IMg = this.LL.get();
        if (interfaceC465240IMg != null && message != null) {
            interfaceC465240IMg.handleMsg(message);
        }
        C1C7U.LIZIZ("WeakHandler@66d5.handleMessage");
    }

    public WeakHandler(Looper looper, InterfaceC465240IMg interfaceC465240IMg) {
        super(looper);
        this.LL = new WeakReference<>(interfaceC465240IMg);
    }
}
