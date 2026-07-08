package com.bytedance.realx.base;

/* JADX INFO: loaded from: classes14.dex */
public final class NativeNetworkFunctions {
    public static native void nativeOnBlockedStatusChanged(String str, boolean z, long j);

    public static native void nativeOnCapabilitiesChanged(String str, String str2, long j);

    public static native void nativeOnLinkPropertiesChanged(String str, String str2, long j);

    public static native void nativeOnNetworkAvailable(String str, long j);

    public static native void nativeOnNetworkLost(String str, long j);

    public static native void nativeOnNetworkResumed(String str, long j);

    public static native void nativeOnNetworkSuspended(String str, long j);

    public static native void nativeOnNetworkUnavailable(long j);
}
