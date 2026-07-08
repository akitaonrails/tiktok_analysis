package com.ss.ttvideoengine.utils;

import X.C1C7U;
import X.InterfaceC587150N1d;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class WeakHandler extends BPEAHandler {
    public final WeakReference<InterfaceC587150N1d> LL;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("WeakHandler@989c.handleMessage");
        InterfaceC587150N1d interfaceC587150N1d = this.LL.get();
        if (interfaceC587150N1d != null) {
            interfaceC587150N1d.handleMessage(message);
        }
        C1C7U.LIZIZ("WeakHandler@989c.handleMessage");
    }

    public WeakHandler(Looper looper, InterfaceC587150N1d interfaceC587150N1d) {
        super(looper);
        this.LL = new WeakReference<>(interfaceC587150N1d);
    }
}
