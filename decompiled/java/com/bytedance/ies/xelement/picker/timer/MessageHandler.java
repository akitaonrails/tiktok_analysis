package com.bytedance.ies.xelement.picker.timer;

import X.C1C7U;
import X.C21631219l8;
import X.EnumC21631419lA;
import Y.ARunnableS133S0100000_33;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: loaded from: classes34.dex */
public final class MessageHandler extends BPEAHandler {
    public final C21631219l8 LL;

    public MessageHandler(C21631219l8 c21631219l8) {
        this.LL = c21631219l8;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("MessageHandler@7b22.handleMessage");
        int i = message.what;
        if (i != 1000) {
            if (i != 2000) {
                if (i == 3000) {
                    C21631219l8 c21631219l8 = this.LL;
                    if (c21631219l8.LLILZIL != null) {
                        HandlerHook.viewPostDelay(c21631219l8, new ARunnableS133S0100000_33(c21631219l8, 106), 200L);
                    }
                }
            } else {
                this.LL.LJFF(EnumC21631419lA.FLING);
            }
        } else {
            this.LL.invalidate();
        }
        C1C7U.LIZIZ("MessageHandler@7b22.handleMessage");
    }
}
