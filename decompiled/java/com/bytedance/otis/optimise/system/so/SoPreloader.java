package com.bytedance.otis.optimise.system.so;

import X.C2105508Mr;

/* JADX INFO: loaded from: classes4.dex */
public class SoPreloader {
    public static final boolean initializedDone = C2105508Mr.LIZ();

    public static native boolean nativeLoadSoByDlOpen(String str);

    public static boolean loadSoByDlOpen(String str) {
        if (initializedDone && str != null && !str.isEmpty()) {
            return nativeLoadSoByDlOpen(str);
        }
        return false;
    }
}
