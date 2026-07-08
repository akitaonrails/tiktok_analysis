package com.bytedance.shadowhook;

import X.C08PL;
import X.C0VAR;
import X.C0VAS;
import X.C2112108Pf;
import X.C2112208Pg;
import X.InterfaceC2112308Ph;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes4.dex */
public final class ShadowHook {
    public static final InterfaceC2112308Ph defaultLibLoader = null;
    public static final int defaultMode = C08PL.SHARED.value;
    public static long initCostMs = -1;
    public static int initErrno = 2;
    public static boolean inited;
    public static boolean loaded;

    public static int init() {
        return init(null);
    }

    public static boolean loadLibrary() {
        return loadLibrary(null);
    }

    public static native String nativeGetArch();

    public static native boolean nativeGetDebuggable();

    public static native boolean nativeGetDisable();

    public static native int nativeGetInitErrno();

    public static native int nativeGetMode();

    public static native boolean nativeGetRecordable();

    public static native String nativeGetRecords(int i);

    public static native String nativeGetVersion();

    public static native int nativeInit(int i, boolean z);

    public static native void nativeSetDebuggable(boolean z);

    public static native void nativeSetDisable(boolean z);

    public static native void nativeSetRecordable(boolean z);

    public static native String nativeToErrmsg(int i);

    public static String getArch() {
        return loadLibrary() ? nativeGetArch() : "unknown";
    }

    public static boolean getDebuggable() {
        if (loadLibrary()) {
            return nativeGetDebuggable();
        }
        return false;
    }

    public static boolean getDisable() {
        if (loadLibrary()) {
            return nativeGetDisable();
        }
        return false;
    }

    public static C08PL getMode() {
        if (!loadLibrary()) {
            return C08PL.SHARED;
        }
        int iNativeGetMode = nativeGetMode();
        C08PL c08pl = C08PL.UNIQUE;
        if (c08pl.value == iNativeGetMode) {
            return c08pl;
        }
        C08PL c08pl2 = C08PL.MULTI;
        return c08pl2.value == iNativeGetMode ? c08pl2 : C08PL.SHARED;
    }

    public static boolean getRecordable() {
        if (loadLibrary()) {
            return nativeGetRecordable();
        }
        return false;
    }

    public static String getVersion() {
        return nativeGetVersion();
    }

    public static long getInitCostMs() {
        return initCostMs;
    }

    public static int getInitErrno() {
        return initErrno;
    }

    public static String getRecords(C0VAR... c0varArr) {
        if (loadLibrary()) {
            int i = 0;
            for (C0VAR c0var : c0varArr) {
                switch (C0VAS.LIZ[c0var.ordinal()]) {
                    case 1:
                        i |= 1;
                        break;
                    case 2:
                        i |= 2;
                        break;
                    case 3:
                        i |= 4;
                        break;
                    case 4:
                        i |= 8;
                        break;
                    case 5:
                        i |= 16;
                        break;
                    case 6:
                        i |= 32;
                        break;
                    case 7:
                        i |= 64;
                        break;
                    case 8:
                        i |= 128;
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        i |= 256;
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        i |= 512;
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        i |= 1024;
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        i |= SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
                        break;
                }
            }
            if (i == 0) {
                i = -1;
            }
            return nativeGetRecords(i);
        }
        return null;
    }

    public static synchronized int init(C2112208Pg c2112208Pg) {
        if (inited) {
            return initErrno;
        }
        inited = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c2112208Pg == null) {
            c2112208Pg = new C2112108Pf().LIZ();
        }
        if (!loadLibrary(c2112208Pg)) {
            initErrno = 100;
            initCostMs = System.currentTimeMillis() - jCurrentTimeMillis;
            return initErrno;
        }
        try {
            boolean z = c2112208Pg.LIZJ;
            if (z) {
                nativeSetRecordable(z);
            }
            initErrno = nativeInit(c2112208Pg.LIZ, c2112208Pg.LIZIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            initErrno = 101;
        }
        initCostMs = System.currentTimeMillis() - jCurrentTimeMillis;
        return initErrno;
    }

    public static synchronized boolean loadLibrary(C2112208Pg c2112208Pg) {
        if (loaded) {
            return true;
        }
        try {
            System.loadLibrary("shadowhook");
            loaded = true;
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static void setDebuggable(boolean z) {
        if (loadLibrary()) {
            nativeSetDebuggable(z);
        }
    }

    public static void setDisable(boolean z) {
        if (loadLibrary()) {
            nativeSetDisable(z);
        }
    }

    public static void setRecordable(boolean z) {
        if (loadLibrary()) {
            nativeSetRecordable(z);
        }
    }

    public static String toErrmsg(int i) {
        if (i == 0) {
            return "OK";
        }
        if (i == 2) {
            return "Not initialized";
        }
        if (i == 100) {
            return "Load libshadowhook.so failed";
        }
        if (i == 101) {
            return "Init exception";
        }
        if (loadLibrary()) {
            return nativeToErrmsg(i);
        }
        return "Unknown";
    }
}
