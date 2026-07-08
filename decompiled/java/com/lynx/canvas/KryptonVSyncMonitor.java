package com.lynx.canvas;

import X.InterfaceC1285170jY3;
import com.lynx.canvas.KryptonVSyncMonitor;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class KryptonVSyncMonitor {
    public final WeakReference<KryptonApp> LIZ;

    public static native void nativeOnBeforeVSyncEndTrigger(long j, long j2);

    public static native void nativeOnVSyncTrigger(long j, long j2);

    public KryptonVSyncMonitor(KryptonApp kryptonApp) {
        this.LIZ = new WeakReference<>(kryptonApp);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0jdC] */
    public void registerBeforeAnimationEnd(final long j) {
        b bVar;
        KryptonApp kryptonApp = this.LIZ.get();
        if (kryptonApp == null || (bVar = (b) kryptonApp.LJ(b.class)) == 0) {
            return;
        }
        bVar.LIZ(new InterfaceC1285170jY3() { // from class: X.0jdC
            @Override // X.InterfaceC1285170jY3
            public final void doFrame(long j2) {
                KryptonVSyncMonitor.nativeOnBeforeVSyncEndTrigger(j, j2);
            }
        });
    }

    public void requestVSync(final long j) {
        b bVar;
        KryptonApp kryptonApp = this.LIZ.get();
        if (kryptonApp == null || (bVar = (b) kryptonApp.LJ(b.class)) == null) {
            return;
        }
        bVar.LIZIZ(new InterfaceC1285170jY3() { // from class: X.0jdB
            @Override // X.InterfaceC1285170jY3
            public final void doFrame(long j2) {
                KryptonVSyncMonitor.nativeOnVSyncTrigger(j, j2);
            }
        });
    }
}
