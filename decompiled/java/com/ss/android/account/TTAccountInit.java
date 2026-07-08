package com.ss.android.account;

import X.C0XFG;
import X.C0XG9;
import X.C0XMV;
import X.C1C7U;
import X.InterfaceC829330Wg7;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes14.dex */
public final class TTAccountInit {
    public static final Handler LIZ = new CheckTokenHandler(Looper.getMainLooper());
    public static volatile InterfaceC829330Wg7 LIZIZ;
    public static volatile C0XFG LIZJ;

    public static InterfaceC829330Wg7 LIZ() {
        if (LIZIZ != null) {
            return LIZIZ;
        }
        throw new IllegalStateException("not init TTAccount config");
    }

    public static class CheckTokenHandler extends BPEAHandler {
        public CheckTokenHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("TTAccountInit$CheckTokenHandler@1a99.handleMessage");
            if (message.what == 2001 && !C0XMV.LLJJJJ) {
                TTAccountInit.LIZIZ.getClass();
                C0XG9.LJ("never_call_token_init", null);
            }
            C1C7U.LIZIZ("TTAccountInit$CheckTokenHandler@1a99.handleMessage");
        }
    }
}
