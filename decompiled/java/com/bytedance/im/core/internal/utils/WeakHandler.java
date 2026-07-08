package com.bytedance.im.core.internal.utils;

import X.C0YE4;
import X.C1C7U;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes15.dex */
public class WeakHandler extends BPEAHandler {
    public final WeakReference<C0YE4> LL;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("WeakHandler@51f9.handleMessage");
        C0YE4 c0ye4 = this.LL.get();
        if (c0ye4 != null && message != null) {
            c0ye4.handleMsg(message);
        }
        C1C7U.LIZIZ("WeakHandler@51f9.handleMessage");
    }

    public WeakHandler(Looper looper, C0YE4 c0ye4) {
        super(looper);
        this.LL = new WeakReference<>(c0ye4);
    }
}
