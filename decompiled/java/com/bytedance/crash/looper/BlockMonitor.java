package com.bytedance.crash.looper;

import X.C1C7U;
import com.bytedance.crash.jni.NativeBridge;

/* JADX INFO: loaded from: classes13.dex */
public class BlockMonitor implements Runnable {
    public final long LL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("BlockMonitor@abf4.run");
        try {
            NativeBridge.LJJIZ(this.LL);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BlockMonitor@abf4.run");
    }

    public BlockMonitor(long j) {
        this.LL = j;
    }
}
