package com.bytedance.common.jato.memory.gcblocker;

import X.C0X3I;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class DvmGcBlocker extends C0X3I {
    public static native void nativeDalvikStartBlockGc();

    public static native void nativeDalvikStopBlockGc();

    public static native void nativeInit();

    @Override // X.C0X3I
    public final void LIZ(long j) {
    }

    @Override // X.C0X3I
    public final void LIZIZ(int i, boolean z) {
    }

    @Override // X.C0X3I
    public final void LIZJ(int i) {
    }

    public DvmGcBlocker() {
        try {
            nativeInit();
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C0X3I
    public final void LIZLLL(String str) {
        try {
            nativeDalvikStartBlockGc();
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C0X3I
    public final void LJ(String str) {
        try {
            nativeDalvikStopBlockGc();
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
