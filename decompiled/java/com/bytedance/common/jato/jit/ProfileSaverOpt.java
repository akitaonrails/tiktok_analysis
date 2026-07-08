package com.bytedance.common.jato.jit;

import X.C2104908Ml;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileSaverOpt {
    public static native void disableInlineCache();

    public static native void enableInlineCache();

    public static native void nSaveProfileInBg();

    public static native void profileSaveBackup();

    public static void LIZ() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        JitCompiler.hookProfileSaverBug();
        if (JitCompiler.canForceSaveProfile()) {
            nSaveProfileInBg();
        }
    }

    public static void LIZIZ() {
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i > 34) {
            return;
        }
        C2104908Ml.LIZIZ();
        disableInlineCache();
    }

    public static void LIZJ() {
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i > 33) {
            return;
        }
        C2104908Ml.LIZIZ();
        profileSaveBackup();
    }
}
