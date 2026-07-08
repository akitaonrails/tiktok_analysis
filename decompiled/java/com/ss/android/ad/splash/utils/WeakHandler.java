package com.ss.android.ad.splash.utils;

import X.C1C7U;
import X.InterfaceC588460N6e;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class WeakHandler extends BPEAHandler {
    public final WeakReference<InterfaceC588460N6e> LL;

    /* JADX WARN: Illegal instructions before constructor call */
    public WeakHandler(InterfaceC588460N6e interfaceC588460N6e) {
        Looper looperMyLooper;
        if (Looper.myLooper() == null) {
            looperMyLooper = Looper.getMainLooper();
        } else {
            looperMyLooper = Looper.myLooper();
        }
        super(looperMyLooper);
        this.LL = new WeakReference<>(interfaceC588460N6e);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("WeakHandler@a11.handleMessage");
        InterfaceC588460N6e interfaceC588460N6e = this.LL.get();
        if (interfaceC588460N6e != null && message != null) {
            interfaceC588460N6e.handleMsg(message);
        }
        C1C7U.LIZIZ("WeakHandler@a11.handleMessage");
    }
}
