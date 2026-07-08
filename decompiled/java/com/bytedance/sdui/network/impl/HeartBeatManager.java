package com.bytedance.sdui.network.impl;

import X.AbstractC1317090kNX;
import X.C1317440kO6;
import X.C1317810kOh;
import X.C1C7U;
import X.C786410Ut5;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdui.serializedData.common.EventRequest;

/* JADX INFO: loaded from: classes21.dex */
public final class HeartBeatManager {
    public final AbstractC1317090kNX LIZ;
    public final HeartBeatManager$handler$1 LIZIZ;

    static {
        new Object() { // from class: X.0kJk
        };
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.sdui.network.impl.HeartBeatManager$handler$1] */
    public HeartBeatManager(AbstractC1317090kNX abstractC1317090kNX) {
        this.LIZ = abstractC1317090kNX;
        final Looper looperW2 = C786410Ut5.W2(C1317440kO6.LIZLLL.LIZJ);
        this.LIZIZ = new BPEAHandler(looperW2) { // from class: com.bytedance.sdui.network.impl.HeartBeatManager$handler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("HeartBeatManager@f0bb.handler$1");
                if (message.what == 1001) {
                    this.LL.LIZ.LLJJ.LJIIIIZZ(new EventRequest());
                    sendEmptyMessageDelayed(1001, C1317810kOh.LJI);
                }
                C1C7U.LIZIZ("HeartBeatManager@f0bb.handler$1");
            }
        };
    }
}
