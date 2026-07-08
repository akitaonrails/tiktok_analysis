package com.lynx.canvas;

import X.InterfaceC1285170jY3;
import com.lynx.canvas.CanvasVSyncMonitor;

/* JADX INFO: loaded from: classes21.dex */
public class CanvasVSyncMonitor {
    public b LIZ;

    public static native void nativeOnVSync(long j, long j2);

    public void requestVSync(final long j) {
        b bVar = this.LIZ;
        if (bVar != null) {
            bVar.LIZIZ(new InterfaceC1285170jY3() { // from class: X.0k2A
                @Override // X.InterfaceC1285170jY3
                public final void doFrame(long j2) {
                    CanvasVSyncMonitor.LIZ(j, j2);
                }
            });
        }
    }

    public static void LIZ(long j, long j2) {
        nativeOnVSync(j, j2);
    }
}
