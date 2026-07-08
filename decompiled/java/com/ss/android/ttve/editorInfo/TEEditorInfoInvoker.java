package com.ss.android.ttve.editorInfo;

import X.C1284730jXL;
import X.C2122208Tc;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public class TEEditorInfoInvoker {
    public static native void nativeInit();

    static {
        C2122208Tc.LIZJ();
    }

    public static void onNativeCallback_onEditorInfoFloat(String str, float f) {
        ConcurrentHashMap<String, Object> concurrentHashMap = C1284730jXL.LIZIZ;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, Float.valueOf(f));
        }
    }

    public static void onNativeCallback_onEditorInfoInt(String str, long j) {
        C1284730jXL.LIZ(j, str);
    }

    public static void onNativeCallback_onEditorInfoJson(String str, String str2) {
        C1284730jXL.LIZIZ(str, str2);
    }

    public static void onNativeCallback_onEditorInfoMap(String str, HashMap map) {
        ConcurrentHashMap<String, Object> concurrentHashMap = C1284730jXL.LIZIZ;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, map);
        }
    }
}
