package com.ss.android.ugc.aweme.live.alphaplayer.utils;

import X.C1C7U;
import X.C2246821Cwq;
import X.InterfaceC789190UxZ;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes14.dex */
public class WeakHandler extends BPEAHandler {
    public final WeakReference<InterfaceC789190UxZ> LL;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("WeakHandler@879f.handleMessage");
        InterfaceC789190UxZ interfaceC789190UxZ = this.LL.get();
        if (interfaceC789190UxZ != null && message != null) {
            interfaceC789190UxZ.handleMsg(message);
        }
        C1C7U.LIZIZ("WeakHandler@879f.handleMessage");
    }

    public WeakHandler(C2246821Cwq c2246821Cwq, Looper looper) {
        super(looper);
        this.LL = new WeakReference<>(c2246821Cwq);
    }
}
