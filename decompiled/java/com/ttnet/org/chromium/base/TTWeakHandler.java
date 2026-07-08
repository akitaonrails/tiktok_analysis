package com.ttnet.org.chromium.base;

import X.C1C7U;
import X.C742190T9l;
import X.InterfaceC742180T9k;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class TTWeakHandler extends BPEAHandler {
    public final WeakReference<InterfaceC742180T9k> LL;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("TTWeakHandler@1dfa.handleMessage");
        InterfaceC742180T9k interfaceC742180T9k = this.LL.get();
        if (interfaceC742180T9k != null && message != null) {
            interfaceC742180T9k.LIZ();
        }
        C1C7U.LIZIZ("TTWeakHandler@1dfa.handleMessage");
    }

    public TTWeakHandler(Looper looper, C742190T9l c742190T9l) {
        super(looper);
        this.LL = new WeakReference<>(c742190T9l);
    }
}
