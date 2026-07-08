package com.ss.bytertc.engine.loader;

import X.C2188811AlT;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes21.dex */
public final class LyraxPluginConfig {
    public static final AtomicInteger sPluginState = new AtomicInteger(0);
    public static final AtomicBoolean sAnyLoadStarted = new AtomicBoolean(false);
    public static final AtomicBoolean sUnsetWarned = new AtomicBoolean(false);

    public static void safeLogE(String str, String str2) {
    }

    public static void safeLogE(String str, String str2, Throwable th) {
    }

    public static void safeLogW(String str, String str2) {
    }

    public static int getPluginState() {
        return sPluginState.get();
    }

    public static String getSoLibraryName() {
        sAnyLoadStarted.set(true);
        int i = sPluginState.get();
        if (i != 0) {
            return i == 2 ? "lyrax_plugin" : "lyrax";
        }
        if (!sUnsetWarned.compareAndSet(false, true)) {
            return "lyrax";
        }
        safeLogE("LyraxPluginConfig", "[LYRAX_SO_LOAD] getSoLibraryName called before setPluginState; falling back to default 'lyrax' — experiment bucket disabled");
        return "lyrax";
    }

    public static boolean isConfigured() {
        return sPluginState.get() != 0;
    }

    public static void setPluginState(int i) {
        if (i != 1 && i != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[LYRAX_SO_LOAD] setPluginState rejected: invalid=");
            sbLIZ.append(i);
            safeLogE("LyraxPluginConfig", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        AtomicInteger atomicInteger = sPluginState;
        if (atomicInteger.get() == i) {
            return;
        }
        if (sAnyLoadStarted.get()) {
            safeLogE("LyraxPluginConfig", "[LYRAX_SO_LOAD] setPluginState rejected: too late (loader already ran)");
            return;
        }
        if (atomicInteger.compareAndSet(0, i)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[LYRAX_SO_LOAD] setPluginState: 0 -> ");
            sbLIZ2.append(i);
            safeLogW("LyraxPluginConfig", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        int i2 = atomicInteger.get();
        if (i2 == i) {
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("[LYRAX_SO_LOAD] setPluginState rejected: conflict, current=");
        sbLIZ3.append(i2);
        sbLIZ3.append(", new=");
        sbLIZ3.append(i);
        safeLogE("LyraxPluginConfig", C2188811AlT.LIZIZ(sbLIZ3));
    }
}
