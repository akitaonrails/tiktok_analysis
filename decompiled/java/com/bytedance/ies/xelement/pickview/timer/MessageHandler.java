package com.bytedance.ies.xelement.pickview.timer;

import X.C1319790kRt;
import X.C1C7U;
import X.C786410Ut5;
import X.EnumC1319830kRx;
import Y.ARunnableS120S0100000_20;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes21.dex */
public final class MessageHandler extends BPEAHandler {
    public final C1319790kRt LL;

    public MessageHandler(C1319790kRt c1319790kRt) {
        super(Looper.getMainLooper());
        this.LL = c1319790kRt;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("MessageHandler@a031.handleMessage");
        int i = message.what;
        if (i != 1000) {
            if (i != 2000) {
                if (i == 3000) {
                    C1319790kRt c1319790kRt = this.LL;
                    if (c1319790kRt.LLILZIL != null) {
                        C786410Ut5.LJLIIL(200L, c1319790kRt.LLLILZJ, new ARunnableS120S0100000_20(c1319790kRt, 391));
                    }
                }
            } else {
                this.LL.LJFF(EnumC1319830kRx.FLING);
            }
        } else {
            this.LL.invalidate();
        }
        C1C7U.LIZIZ("MessageHandler@a031.handleMessage");
    }
}
