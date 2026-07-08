package com.lynx.canvas;

import X.AbstractC1304280k2s;

/* JADX INFO: loaded from: classes21.dex */
public class Settings {
    public static AbstractC1304280k2s LIZ(KryptonApp kryptonApp) {
        if (kryptonApp != null) {
            return (AbstractC1304280k2s) kryptonApp.LJ(AbstractC1304280k2s.class);
        }
        return null;
    }

    public static boolean booleanValueForKey(KryptonApp kryptonApp, String str, boolean z) {
        AbstractC1304280k2s abstractC1304280k2sLIZ = LIZ(kryptonApp);
        if (abstractC1304280k2sLIZ == null) {
            return z;
        }
        return abstractC1304280k2sLIZ.LIZ(str, z);
    }

    public static double doubleValueForKey(KryptonApp kryptonApp, String str, double d) {
        AbstractC1304280k2s abstractC1304280k2sLIZ = LIZ(kryptonApp);
        if (abstractC1304280k2sLIZ == null) {
            return d;
        }
        return abstractC1304280k2sLIZ.LIZIZ(d, str);
    }

    public static int integerValueForKey(KryptonApp kryptonApp, String str, int i) {
        AbstractC1304280k2s abstractC1304280k2sLIZ = LIZ(kryptonApp);
        if (abstractC1304280k2sLIZ == null) {
            return i;
        }
        return abstractC1304280k2sLIZ.LIZJ(i, str);
    }

    public static String stringValueForKey(KryptonApp kryptonApp, String str, String str2) {
        AbstractC1304280k2s abstractC1304280k2sLIZ = LIZ(kryptonApp);
        if (abstractC1304280k2sLIZ == null) {
            return str2;
        }
        return abstractC1304280k2sLIZ.LJ(str, str2);
    }
}
