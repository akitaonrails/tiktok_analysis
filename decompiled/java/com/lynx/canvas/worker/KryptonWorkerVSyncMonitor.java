package com.lynx.canvas.worker;

import X.C786410Ut5;
import android.view.Choreographer;
import com.lynx.canvas.worker.KryptonWorkerVSyncMonitor;

/* JADX INFO: loaded from: classes36.dex */
public class KryptonWorkerVSyncMonitor {
    public static native void nativeOnWorkerVSync(long j, long j2);

    public static void requestWorkerVSync(final long j) {
        C786410Ut5.v2().postFrameCallback(new Choreographer.FrameCallback() { // from class: X.1DUK
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                KryptonWorkerVSyncMonitor.nativeOnWorkerVSync(j, j2);
            }
        });
    }
}
