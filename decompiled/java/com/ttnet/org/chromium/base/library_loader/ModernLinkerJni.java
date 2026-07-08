package com.ttnet.org.chromium.base.library_loader;

import X.C2161308dP;
import X.C2161608dS;
import com.ttnet.org.chromium.base.library_loader.Linker;

/* JADX INFO: loaded from: classes4.dex */
public class ModernLinkerJni {
    public static native int nativeGetRelroSharingResult();

    public static native boolean nativeLoadLibrary(String str, Linker.LibInfo libInfo, boolean z);

    public static native boolean nativeUseRelros(long j, Linker.LibInfo libInfo);

    public static void reportDlopenExtTime(long j) {
        C2161308dP.LIZ.LIZIZ(2, C2161608dS.LIZ(j), C2161608dS.LIZ(1L), C2161608dS.LIZ(10000L), 50, "ChromiumAndroidLinker.ModernLinkerDlopenExtTime");
    }

    public static void reportIteratePhdrTime(long j) {
        C2161308dP.LIZ.LIZIZ(2, C2161608dS.LIZ(j), C2161608dS.LIZ(1L), C2161608dS.LIZ(10000L), 50, "ChromiumAndroidLinker.ModernLinkerIteratePhdrTime");
    }
}
