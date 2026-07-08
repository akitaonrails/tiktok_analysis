package com.ss.ttvideoengine.fetcher;

import X.AbstractC1468760oKA;
import X.C1467340oHs;
import X.C1469810oLr;
import X.C1C7U;
import X.C786410Ut5;
import X.C795730VJj;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import fyo.e;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes24.dex */
public final class SubInfoFetcher {
    public C1467340oHs LIZJ;
    public final AbstractC1468760oKA LIZLLL;
    public String LIZIZ = "";
    public final Handler LIZ = new MyHandler(this, C795730VJj.LJII());

    public static class MyHandler extends BPEAHandler {
        public final WeakReference<SubInfoFetcher> LL;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("SubInfoFetcher$MyHandler@1a6e.handleMessage");
            SubInfoFetcher subInfoFetcher = this.LL.get();
            if (subInfoFetcher == null) {
                C1C7U.LIZIZ("SubInfoFetcher$MyHandler@1a6e.handleMessage");
                return;
            }
            C1467340oHs c1467340oHs = subInfoFetcher.LIZJ;
            if (c1467340oHs == null) {
                C1C7U.LIZIZ("SubInfoFetcher$MyHandler@1a6e.handleMessage");
                return;
            }
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    c1467340oHs.LIZ(null, (String) HandlerHook.getMessageObj(message.obj));
                }
            } else {
                c1467340oHs.LIZ((e) HandlerHook.getMessageObj(message.obj), null);
            }
            C1C7U.LIZIZ("SubInfoFetcher$MyHandler@1a6e.handleMessage");
        }

        public MyHandler(SubInfoFetcher subInfoFetcher, Looper looper) {
            super(looper);
            this.LL = new WeakReference<>(subInfoFetcher);
        }
    }

    public SubInfoFetcher(AbstractC1468760oKA abstractC1468760oKA) {
        if (abstractC1468760oKA == null) {
            this.LIZLLL = new C1469810oLr();
        } else {
            this.LIZLLL = abstractC1468760oKA;
        }
    }

    public final void LIZ(e eVar) {
        C786410Ut5.LJLJJL(this.LIZ, this.LIZ.obtainMessage(1, eVar));
    }
}
