package com.bytedance.qmi.vsync.bridge;

import X.C08GA;
import X.C08GD;
import X.C08GF;
import X.C1C7U;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class HandlerBridge extends BPEAHandler {
    public final C08GA LL;
    public final Handler LLILLJJLI;
    public final Object LLILLL;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("HandlerBridge@19b8.handleMessage");
        this.LLILLJJLI.handleMessage(message);
        C1C7U.LIZIZ("HandlerBridge@19b8.handleMessage");
    }

    @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        Object obj = this.LLILLL;
        if (obj != null && message.getCallback() == obj) {
            LIZIZ(j, 0);
            this.LL.LIZIZ.getClass();
            C08GF c08gfLIZ = C08GF.LIZ();
            if (!((ArrayList) c08gfLIZ.LIZLLL).isEmpty()) {
                Iterator it2 = ((ArrayList) c08gfLIZ.LIZLLL).iterator();
                while (it2.hasNext()) {
                    if (((C08GD) it2.next()).LJIILIIL()) {
                        return true;
                    }
                }
            }
        }
        return super.sendMessageAtTime(message, j);
    }

    public HandlerBridge(Looper looper, C08GA c08ga, Handler handler, Object obj) {
        super(looper);
        this.LL = c08ga;
        this.LLILLJJLI = handler;
        this.LLILLL = obj;
    }
}
