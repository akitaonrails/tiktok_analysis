package com.ss.ttm.strategycenter;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public class TTPlayerStrategyCenter {
    public static TTPlayerStrategyCenter LIZ;

    public static native void _init();

    public static native void _notifyEvent(int i);

    public static native String _packStrategyLogInfo(long j);

    public static native void _setDataCenterHandle(long j);

    public static TTPlayerStrategyCenter LIZ() {
        if (LIZ == null) {
            LIZ = new TTPlayerStrategyCenter();
        }
        return LIZ;
    }

    public static void LIZIZ() {
        try {
            _init();
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZJ(int i) {
        try {
            _notifyEvent(i);
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static String LIZLLL(long j) {
        try {
            return _packStrategyLogInfo(j);
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LJ(long j) {
        try {
            _setDataCenterHandle(j);
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
