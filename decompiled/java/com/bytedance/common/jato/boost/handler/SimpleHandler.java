package com.bytedance.common.jato.boost.handler;

import X.C1C7U;
import X.C2188811AlT;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleHandler extends BPEAHandler {
    public String LL;
    public Handler LLILLJJLI;

    @Override // android.os.Handler
    public final String toString() {
        return this.LL;
    }

    public SimpleHandler(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("SimpleHandler@7f0.handleMessage");
        Handler handler = this.LLILLJJLI;
        if (handler != null) {
            handler.handleMessage(message);
        }
        C1C7U.LIZIZ("SimpleHandler@7f0.handleMessage");
    }

    public final void LJ(String str, Handler handler) {
        this.LLILLJJLI = handler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(handler.getClass().getSimpleName());
        this.LL = C2188811AlT.LIZIZ(sbLIZ);
    }
}
