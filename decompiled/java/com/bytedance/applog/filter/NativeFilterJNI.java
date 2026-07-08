package com.bytedance.applog.filter;

/* JADX INFO: loaded from: classes35.dex */
public class NativeFilterJNI {
    public static native void nativeClearCache(String str);

    public static native int nativeInitServerFilter(String str, String str2);

    public static native boolean nativeIsEventAllowed(String str, String str2);

    public static native boolean nativeIsServerFilterEmpty(String str);

    public static native int nativeSetServerFilterConfig(String str, String str2);
}
