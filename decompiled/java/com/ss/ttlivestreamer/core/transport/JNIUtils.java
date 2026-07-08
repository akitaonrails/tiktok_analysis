package com.ss.ttlivestreamer.core.transport;

/* JADX INFO: loaded from: classes4.dex */
public class JNIUtils {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static ClassLoader sJniClassLoader;
    public static Boolean sSelectiveJniRegistrationEnabled;

    public static void enableSelectiveJniRegistration() {
        sSelectiveJniRegistrationEnabled = Boolean.TRUE;
    }

    public static Object getClassLoader() {
        ClassLoader classLoader = sJniClassLoader;
        return classLoader == null ? JNIUtils.class.getClassLoader() : classLoader;
    }

    public static boolean isSelectiveJniRegistrationEnabled() {
        if (sSelectiveJniRegistrationEnabled == null) {
            sSelectiveJniRegistrationEnabled = Boolean.FALSE;
        }
        return sSelectiveJniRegistrationEnabled.booleanValue();
    }

    public static void setClassLoader(ClassLoader classLoader) {
        sJniClassLoader = classLoader;
    }
}
