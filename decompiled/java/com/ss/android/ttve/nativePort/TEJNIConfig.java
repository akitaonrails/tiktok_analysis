package com.ss.android.ttve.nativePort;

/* JADX INFO: loaded from: classes5.dex */
public class TEJNIConfig {
    public static boolean delayJNI;
    public static boolean skipRegisterEditorUnits;

    public static boolean getDelayJNIAB() {
        return delayJNI;
    }

    public static boolean getSkipRegisterEditorUnits() {
        return skipRegisterEditorUnits;
    }

    public static void setDelayJNIAB(boolean z) {
        delayJNI = z;
    }

    public static void setSkipRegisterEditorUnits(boolean z) {
        skipRegisterEditorUnits = z;
    }
}
