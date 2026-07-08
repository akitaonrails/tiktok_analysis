package com.bytedance.lynx.webview.adblock;

/* JADX INFO: loaded from: classes36.dex */
public class TTSccAdblockWrapper {
    public static final native boolean nativeDeserialize(long j);

    public static final native void nativeDestroy(long j);

    public static final native int nativeGetEngineVersion();

    public static final native long nativeInit(String str);

    public static final native long nativeInitV2(String str, String str2);

    public static final native boolean nativeParseRulesFiles(long j, String str, String str2);

    public static final native boolean nativeParseRulesString(long j, String str);

    public static final native boolean nativeSerialize(long j);

    public static final native boolean nativeShouldBlockUrlRequest(long j, String str, String str2, int i, boolean z);

    public static final native String nativeShouldHidingElement(long j, String str);
}
