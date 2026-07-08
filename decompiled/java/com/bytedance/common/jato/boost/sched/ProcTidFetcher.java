package com.bytedance.common.jato.boost.sched;

import X.C800620Vau;
import X.InterfaceC800630Vav;
import java.util.HashMap;

/* JADX INFO: loaded from: classes14.dex */
public class ProcTidFetcher {
    public static final HashMap<String, Integer> LIZ = new HashMap<>();
    public static int LIZIZ = -1;
    public static C800620Vau LIZJ = null;

    public interface MonitorCallback {
    }

    public static native void nativeFetchThreadTid(String[] strArr, int[] iArr);

    public static native void nativeHookMonitorThreadName(String[] strArr, MonitorCallback monitorCallback);

    public static native void nativeStopHookMonitorThreadName();

    public static void LIZ() {
        int[] iArr = new int[1];
        nativeFetchThreadTid(new String[]{"(RenderThread)"}, iArr);
        int i = iArr[0];
        if (i > 0) {
            LIZIZ = i;
        }
    }

    public static void LIZIZ(String[] strArr, InterfaceC800630Vav interfaceC800630Vav) {
        int[] iArr = new int[strArr.length];
        nativeFetchThreadTid(strArr, iArr);
        for (int i = 0; i < strArr.length; i++) {
            int i2 = iArr[i];
            if (i2 > 0) {
                LIZ.put(strArr[i], Integer.valueOf(i2));
            }
        }
        if (interfaceC800630Vav != null) {
            interfaceC800630Vav.LIZ(LIZ);
        }
    }
}
