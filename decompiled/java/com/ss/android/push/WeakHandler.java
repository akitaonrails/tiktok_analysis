package com.ss.android.push;

import X.C1C7U;
import X.InterfaceC742230T9p;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class WeakHandler extends BPEAHandler {
    public final WeakReference<InterfaceC742230T9p> LL;

    public WeakHandler(InterfaceC742230T9p interfaceC742230T9p) {
        this.LL = new WeakReference<>(interfaceC742230T9p);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("WeakHandler@3b81.handleMessage");
        InterfaceC742230T9p interfaceC742230T9p = this.LL.get();
        if (interfaceC742230T9p != null && message != null) {
            interfaceC742230T9p.handleMsg(message);
        }
        C1C7U.LIZIZ("WeakHandler@3b81.handleMessage");
    }
}
