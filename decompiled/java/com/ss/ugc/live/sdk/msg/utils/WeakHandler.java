package com.ss.ugc.live.sdk.msg.utils;

import X.C0UIC;
import X.C0UIG;
import X.C1C7U;
import X.C2222511Byj;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class WeakHandler extends BPEAHandler {
    public final WeakReference<C0UIG> LL;

    public WeakHandler(C0UIC c0uic) {
        this.LL = new WeakReference<>(c0uic);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("WeakHandler@b2d8.handleMessage");
        C0UIG c0uig = this.LL.get();
        if (c0uig != null && message != null) {
            c0uig.handleMsg(message);
        }
        C1C7U.LIZIZ("WeakHandler@b2d8.handleMessage");
    }

    public WeakHandler(Looper looper, C2222511Byj c2222511Byj) {
        super(looper);
        this.LL = new WeakReference<>(c2222511Byj);
    }
}
