package com.bytedance.crash.looper;

import X.C0VXF;
import X.C1C7U;

/* JADX INFO: loaded from: classes14.dex */
public class DeferredMessageObserver extends FullMessageObserver {
    public DeferredMessageObserver() {
        super(false);
    }

    @Override // com.bytedance.crash.looper.FullMessageObserver, com.bytedance.crash.looper.MessageObserver
    public final void start() {
        C0VXF.postDelayed(new Runnable() { // from class: com.bytedance.crash.looper.DeferredMessageObserver.1
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DeferredMessageObserver@1451.start$1");
                try {
                    DeferredMessageObserver.this.LIZJ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DeferredMessageObserver@1451.start$1");
            }
        }, 30000L);
    }

    public final void LIZJ() {
        super.start();
    }
}
