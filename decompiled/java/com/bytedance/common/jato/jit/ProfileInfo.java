package com.bytedance.common.jato.jit;

import X.C2104908Ml;
import X.C786410Ut5;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes27.dex */
public class ProfileInfo {
    public static final ExecutorService LIZ = C786410Ut5.h4();

    public static native boolean createProfileForMethod(Method method, int[] iArr, Class[] clsArr);

    public static native void forceSaveProfile();

    public static native Method getMethod(String str, String str2, String str3);

    public static native synchronized boolean init();

    public static native void jitMethod(Method method);

    static {
        C2104908Ml.LIZIZ();
    }
}
