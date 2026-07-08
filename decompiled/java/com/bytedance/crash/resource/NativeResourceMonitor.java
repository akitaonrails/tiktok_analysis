package com.bytedance.crash.resource;

import X.C2188811AlT;
import com.bytedance.crash.jni.NativeBridge;

/* JADX INFO: loaded from: classes14.dex */
public class NativeResourceMonitor {
    public static native void nDumpNativeInfoThreads(String str);

    public static native int nFakeOpen(String str);

    public static native int nFdTrackDoCommand(int i);

    public static native int nFdTrackDumpNative(int i, String str);

    public static native int nFdTrackGetFdCount(int i);

    public static native int nNativeBridgeInit(int i, int i2, String str, String str2, String str3, String str4);

    public static native int nNativeDoCommnad(int i);

    public static native long nNativeGetHeapLeakSize();

    public static native long nNativeGetHeapSize();

    public static native void nNativeNeedDumpMemInfo(int i);

    public static native void nNativeSetDumpThreshold(long j);

    public static native void nNativeSetMinSizeByte(long j);

    public static native int nVmMonitorDoCommand(int i, int i2);

    public static native void nVmMonitorDumpMaps(String str);

    public static native int nVmMonitorDumpNative(int i, int i2, String str);

    public static native int nXasanInit(int i, String str, String str2);

    public static long LJI() {
        if (NativeBridge.LJJIJIIJIL()) {
            return nNativeGetHeapLeakSize();
        }
        return -1L;
    }

    public static long LJII() {
        if (NativeBridge.LJJIJIIJIL()) {
            return nNativeGetHeapSize();
        }
        return -1L;
    }

    public static void LIZJ(String str) {
        if (NativeBridge.LJJIJIIJIL()) {
            nDumpNativeInfoThreads(str);
        }
    }

    public static int LIZLLL(int i) {
        if (!NativeBridge.LJJIJIIJIL()) {
            return -1;
        }
        return nFdTrackDoCommand(i);
    }

    public static int LJ(int i) {
        if (!NativeBridge.LJJIJIIJIL()) {
            return -1;
        }
        return nFdTrackGetFdCount(i);
    }

    public static int LJFF(int i) {
        if (!NativeBridge.LJJIJIIJIL()) {
            return -1;
        }
        return nNativeDoCommnad(i);
    }

    public static void LJIIIZ(String str) {
        if (!NativeBridge.LJJIJIIJIL()) {
            return;
        }
        nVmMonitorDumpMaps(str);
    }

    public static int LJIIIIZZ(int i, int i2) {
        if (!NativeBridge.LJJIJIIJIL()) {
            return -1;
        }
        return nVmMonitorDoCommand(i, i2);
    }

    public static void LIZIZ(int i, String str, String str2) {
        if (!NativeBridge.LJJIJIIJIL()) {
            return;
        }
        nXasanInit(i, str, str2);
    }

    public static int LIZ(int i, int i2, String str, String str2, String str3, String str4) {
        if (!NativeBridge.LJJIJIIJIL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("monitorType:");
            sbLIZ.append(i2);
            sbLIZ.append(" soName:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            return -1;
        }
        return nNativeBridgeInit(i, i2, str, str2, str3, str4);
    }
}
