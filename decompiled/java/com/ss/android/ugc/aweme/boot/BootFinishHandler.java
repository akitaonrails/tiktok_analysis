package com.ss.android.ugc.aweme.boot;

import X.C01GW;
import X.C0CD2;
import X.C1C7U;
import X.C2456309jt;
import X.C799900VZk;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.experiment.ColdBootPushStartupExperiment;

/* JADX INFO: loaded from: classes14.dex */
public final class BootFinishHandler extends BPEAHandler {
    public static final BootFinishHandler LL = new BootFinishHandler();

    public final void init() {
        C01GW c01gw = C0CD2.LJJLJ;
        if ((((Number) c01gw.getValue()).longValue() != -1) && C2456309jt.LIZJ()) {
            long jLongValue = ((Number) c01gw.getValue()).longValue() + 15000;
            Message messageObtainMessage = obtainMessage();
            messageObtainMessage.what = 1205;
            messageObtainMessage.obj = null;
            removeMessages(1205);
            sendMessageDelayed(messageObtainMessage, jLongValue);
            return;
        }
        if (!ColdBootPushStartupExperiment.LIZIZ() || ColdBootPushStartupExperiment.LIZ().bootFinishDelayTime <= 0) {
            Message messageObtainMessage2 = obtainMessage();
            messageObtainMessage2.what = 1205;
            messageObtainMessage2.obj = null;
            removeMessages(1205);
            sendMessageDelayed(messageObtainMessage2, 15000L);
            return;
        }
        long j = ColdBootPushStartupExperiment.LIZ().bootFinishDelayTime + 15000;
        Message messageObtainMessage3 = obtainMessage();
        messageObtainMessage3.what = 1205;
        messageObtainMessage3.obj = null;
        removeMessages(1205);
        sendMessageDelayed(messageObtainMessage3, j);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("BootFinishHandler@5153.handleMessage");
        if (message.what == 1205) {
            C799900VZk.LIZ.getClass();
            C799900VZk.LIZIZ();
            postDelayed(new Runnable() { // from class: X.0Vbe
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("BootFinishHandler@5153.handleMessage$1");
                    try {
                        C0X35.LJ = false;
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("BootFinishHandler@5153.handleMessage$1");
                }
            }, 8000L);
            post(new Runnable() { // from class: X.0Vbf
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("BootFinishHandler@5153.handleMessage$2");
                    C1C7U.LIZIZ("BootFinishHandler@5153.handleMessage$2");
                }
            });
        }
        C1C7U.LIZIZ("BootFinishHandler@5153.handleMessage");
    }
}
