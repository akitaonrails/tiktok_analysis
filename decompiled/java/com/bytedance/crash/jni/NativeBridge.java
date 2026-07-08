package com.bytedance.crash.jni;

import X.C08P6;
import X.C0VSJ;
import X.C0VX9;
import X.C0VXF;
import X.C0VYR;
import X.C801940Vd2;
import X.C802430Vdp;
import X.C802500Vdw;
import X.C802600Ve6;
import X.C802680VeE;
import X.C802700VeG;
import X.C802790VeP;
import X.C802930Ved;
import X.C803490VfX;
import X.InterfaceC802370Vdj;
import X.InterfaceC803790Vg1;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.crash.NativeCrashSummary;
import com.bytedance.crash.monitor.k;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class NativeBridge {
    public static volatile boolean isSoLoaded;

    public static native void doRegister(String str, String str2);

    public static native void doSetDropDataState(int i);

    public static native void nAnrDumpNativeInfo(long j);

    public static native long nAnrDumpNativeInit(String str);

    public static native void nAnrDumpNativeRelease(long j);

    public static native void nAnrDumpProcessGroupInfo(String str);

    public static native void nAnrDumpTrace(String str);

    public static native void nAnrEnterMonitorLooper();

    public static native void nAnrInitOnMainThread();

    public static native void nAnrNativeProfilerDump(long j, String str, long j2);

    public static native void nAnrNativeProfilerExit(long j);

    public static native void nAnrNativeProfilerFormat(String str, long[] jArr);

    public static native int nAnrNativeProfilerJvmStart(long j);

    public static native String nAnrNativeProfilerRunTest(String str);

    public static native long nAnrNativeProfilerStart();

    public static native void nAnrNativeProfilerStop(long j);

    public static native void nCheckSigHandler();

    public static native void nCoredumpNativeInit(String str);

    public static native long nCrashDumpNativeInfo(long j);

    public static native void nDumpLogcat(String str, int i);

    public static native void nDumpOsMemory(String str);

    public static native void nDumpScudoInfo(String str);

    public static native void nDumperLateInit();

    public static native void nEnablePrioriryParams(boolean z, boolean z2, int i);

    public static native int nFlock(String str);

    public static native int nGetApexVersion();

    public static native String nGetBuildID(String str);

    public static native int nGetFdCount(String str);

    public static native String nGetFdLeakReason(String str);

    public static native int nGetFdLimit();

    public static native int nGetJvmMonitorState();

    public static native String nGetMallocType();

    public static native String nGetNativePthreadKeyLeakLibrary(String str);

    public static native String nGetStackTrace(boolean z);

    public static native int nGetThreadCount(String str);

    public static native long nGetThreadCpuTimeMills(int i);

    public static native String nGetThreadLeakLibrary(String str);

    public static native String nGetThreadLeakName(String str);

    public static native long nGetVmRss(String str);

    public static native long nGetVmSize(String str, int i);

    public static native long nGetVmSwap(String str);

    public static native void nIgnoreCurrentSigquit();

    public static native boolean nIncreaseFdLimit();

    public static native int nInitScudoDumper(int i);

    public static native boolean nIs64BitRuntime();

    public static native void nLeakWatchStart();

    public static native String nLoadNativeCrashAbortReason(String str);

    public static native String nLoadNativeCrashBacktrace(String str);

    public static native NativeCrashSummary nLoadNativeCrashSummary(String str);

    public static native void nMapsParserScanDirectory(String str, boolean z);

    public static native int nNativePthreadKeyCount(String str);

    public static native void nNotifyUploadDone();

    public static native void nPriorityMonitorInit(String str);

    public static native void nRecoverSignalHandler();

    public static native void nResetNativeInfoLatches();

    public static native void nSet64Bit(boolean z);

    public static native void nSetAlogFlushAddr(long j);

    public static native void nSetAnrDumpAsync(boolean z);

    public static native void nSetAnrResendSigquit(boolean z);

    public static native void nSetAppVersion(String str);

    public static native void nSetDumpTraceTryCatch(boolean z);

    public static native boolean nSignalToProcess(int i, int i2);

    public static native void nStackTraceCollectorCapture(long j);

    public static native long nStackTraceCollectorCreate(int i);

    public static native void nStackTraceCollectorDump(long j, String str);

    public static native void nStartDumperThread();

    public static native int nStartNativeCrashMonitor(int i, String str, String str2, String str3, String str4, String str5, int i2, long j, long j2, String str6);

    public static native void nStartProfilerJavaLockMonitor();

    public static native long nStringDumperCreate(String str, int i);

    public static native void nStringDumperDumpByteArray(long j, byte[] bArr, int i);

    public static native void nStringDumperDumpCharArray(long j, char[] cArr, int i);

    public static native void nStringDumperDumpString(long j, String str, int i);

    public static native void nStringDumperFlushBuffer(long j);

    public static native void nStringDumperRelease(long j);

    public static native void nUnFlock(int i);

    public static native int nativeDumpHprof(int i, String str);

    public static native void nativeDumpTags(String str);

    public static native String[] nativeGetFdListForAPM();

    public static native String[] nativeGetTags();

    public static native void unRegister(String str);

    public static void LJII() {
        if (isSoLoaded) {
            nAnrEnterMonitorLooper();
        }
    }

    public static void LJIIIIZZ() {
        if (isSoLoaded) {
            nAnrInitOnMainThread();
        }
    }

    public static void LJIILL() {
        if (isSoLoaded) {
            nDumperLateInit();
        }
    }

    public static int LJIIZILJ() {
        if (!isSoLoaded) {
            return -1;
        }
        try {
            return nGetApexVersion();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }

    public static int LJIJJ() {
        return isSoLoaded ? nGetFdLimit() : Build.VERSION.SDK_INT > 27 ? 32768 : 1024;
    }

    public static int LJIJJLI() {
        if (!isSoLoaded) {
            return -1;
        }
        try {
            return nGetJvmMonitorState();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }

    public static String LJIL() {
        if (!isSoLoaded) {
            return null;
        }
        try {
            return nGetMallocType();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static void LJJIIZI() {
        if (isSoLoaded) {
            nIgnoreCurrentSigquit();
        }
    }

    public static boolean LJJIJIIJI() {
        if (isSoLoaded) {
            return nIs64BitRuntime();
        }
        return false;
    }

    public static long LJJJ() {
        if (!isSoLoaded) {
            return 0L;
        }
        try {
            return nStackTraceCollectorCreate(5);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0L;
        }
    }

    public static void LJJJIL() {
        if (isSoLoaded) {
            nNotifyUploadDone();
        }
    }

    public static void LJJJJZI() {
        if (isSoLoaded) {
            nSetDumpTraceTryCatch(false);
        }
    }

    public static void LJJJLL() {
        if (isSoLoaded) {
            nStartDumperThread();
        }
    }

    public static void LJJJLZIJ() {
        if (isSoLoaded) {
            nLeakWatchStart();
        }
    }

    public static void LJJL() {
        if (isSoLoaded) {
            nStartProfilerJavaLockMonitor();
        }
    }

    public static void gcEnd() {
        C0VXF.post(C0VYR.LIZJ.LIZIZ);
    }

    public static HashMap<String, String> LJJI() {
        String[] strArrNativeGetTags = nativeGetTags();
        HashMap<String, String> map = new HashMap<>();
        if (strArrNativeGetTags == null) {
            return map;
        }
        try {
            if (strArrNativeGetTags.length < 1) {
                return map;
            }
            for (int i = 0; i < strArrNativeGetTags.length; i += 2) {
                map.put(strArrNativeGetTags[i], strArrNativeGetTags[i + 1]);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return map;
    }

    public static boolean LJJIJIIJIL() {
        return isSoLoaded;
    }

    public static String LIZ(String str) {
        if (isSoLoaded) {
            return nGetBuildID(str);
        }
        return null;
    }

    public static int LIZIZ(String str) {
        if (!isSoLoaded) {
            return 0;
        }
        return nNativePthreadKeyCount(str);
    }

    public static void LIZJ(long j) {
        if (isSoLoaded) {
            nAnrDumpNativeInfo(j);
        }
    }

    public static void LIZLLL(long j) {
        if (isSoLoaded) {
            nAnrDumpNativeRelease(j);
        }
    }

    public static void LJ(String str) {
        if (isSoLoaded) {
            nAnrDumpProcessGroupInfo(str);
        }
    }

    public static void LJFF(String str) {
        if (isSoLoaded) {
            nAnrDumpTrace(str);
        }
    }

    public static long LJI(String str) {
        if (isSoLoaded) {
            return nAnrDumpNativeInit(str);
        }
        return 0L;
    }

    public static long LJIIIZ(long j) {
        if (isSoLoaded) {
            return nCrashDumpNativeInfo(j);
        }
        return 0L;
    }

    public static void LJIIJ(String str) {
        if (!isSoLoaded) {
            return;
        }
        try {
            nativeDumpHprof(Build.VERSION.SDK_INT, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJIIL(String str) {
        if (isSoLoaded) {
            nDumpOsMemory(str);
            SystemClock.sleep(1000L);
        }
    }

    public static void LJIILIIL(String str) {
        if (isSoLoaded) {
            try {
                nDumpScudoInfo(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LJIILJJIL(String str) {
        if (!isSoLoaded) {
            return;
        }
        try {
            nativeDumpTags(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static int LJIILLIIL(String str) {
        if (isSoLoaded) {
            return nFlock(str);
        }
        return -1;
    }

    public static int LJIJ(String str) {
        if (isSoLoaded) {
            return nGetFdCount(str);
        }
        return 0;
    }

    public static String LJIJI(File file) {
        String strNGetFdLeakReason;
        if (isSoLoaded) {
            strNGetFdLeakReason = nGetFdLeakReason(file.getAbsolutePath());
        } else {
            strNGetFdLeakReason = null;
        }
        if (TextUtils.isEmpty(strNGetFdLeakReason)) {
            return "unknown";
        }
        return strNGetFdLeakReason;
    }

    public static String LJJ(File file) {
        String strNGetNativePthreadKeyLeakLibrary;
        if (isSoLoaded) {
            strNGetNativePthreadKeyLeakLibrary = nGetNativePthreadKeyLeakLibrary(file.getAbsolutePath());
        } else {
            strNGetNativePthreadKeyLeakLibrary = null;
        }
        if (TextUtils.isEmpty(strNGetNativePthreadKeyLeakLibrary)) {
            return "unknown";
        }
        return strNGetNativePthreadKeyLeakLibrary;
    }

    public static int LJJIFFI(String str) {
        if (isSoLoaded) {
            return nGetThreadCount(str);
        }
        return 0;
    }

    public static String LJJII(File file) {
        String strNGetThreadLeakLibrary;
        if (isSoLoaded) {
            strNGetThreadLeakLibrary = nGetThreadLeakLibrary(file.getAbsolutePath());
        } else {
            strNGetThreadLeakLibrary = null;
        }
        if (TextUtils.isEmpty(strNGetThreadLeakLibrary)) {
            return "unknown";
        }
        return strNGetThreadLeakLibrary;
    }

    public static String LJJIII(File file) {
        String strNGetThreadLeakName;
        if (isSoLoaded) {
            strNGetThreadLeakName = nGetThreadLeakName(file.getAbsolutePath());
        } else {
            strNGetThreadLeakName = null;
        }
        if (TextUtils.isEmpty(strNGetThreadLeakName)) {
            return "unknown";
        }
        return strNGetThreadLeakName;
    }

    public static long LJJIIJ(String str) {
        if (isSoLoaded) {
            return nGetVmRss(str);
        }
        return 0L;
    }

    public static long LJJIIZ(String str) {
        if (isSoLoaded) {
            return nGetVmRss(str);
        }
        return 0L;
    }

    public static int LJJIJ(int i) {
        if (isSoLoaded) {
            try {
                return nInitScudoDumper(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return -11;
            }
        }
        return -11;
    }

    public static String LJJIJIL(String str) {
        if (isSoLoaded) {
            return nLoadNativeCrashAbortReason(str);
        }
        return null;
    }

    public static String LJJIJL(String str) {
        if (isSoLoaded) {
            return nLoadNativeCrashBacktrace(str);
        }
        return null;
    }

    public static NativeCrashSummary LJJIJLIJ(String str) {
        if (isSoLoaded) {
            return nLoadNativeCrashSummary(str);
        }
        return null;
    }

    public static void LJJIZ(long j) {
        if (isSoLoaded && j != 0) {
            try {
                nStackTraceCollectorCapture(j);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LJJJJ(String str) {
        if (isSoLoaded && str.length() > 0) {
            nPriorityMonitorInit(str);
        }
    }

    public static void LJJJJIZL(String str) {
        if (!isSoLoaded || TextUtils.isEmpty(str)) {
            return;
        }
        unRegister(str);
    }

    public static void LJJJJJ(boolean z) {
        if (!isSoLoaded) {
            return;
        }
        nSet64Bit(z);
    }

    public static void LJJJJJL(long j) {
        if (isSoLoaded) {
            nSetAlogFlushAddr(j);
        }
    }

    public static void LJJJJL(boolean z) {
        if (!isSoLoaded) {
            return;
        }
        nSetAnrDumpAsync(z);
    }

    public static void LJJJJLI(boolean z) {
        if (!isSoLoaded) {
            return;
        }
        nSetAnrResendSigquit(z);
    }

    public static void LJJJJLL(String str) {
        if (isSoLoaded) {
            nSetAppVersion(str);
        }
    }

    public static void LJJJJZ(int i) {
        if (!isSoLoaded) {
            return;
        }
        doSetDropDataState(i);
    }

    public static void LJJLIIIJILLIZJL(long j) {
        if (isSoLoaded) {
            nStringDumperFlushBuffer(j);
        }
    }

    public static void LJJLIIIJJI(long j) {
        if (isSoLoaded) {
            nStringDumperRelease(j);
        }
    }

    public static void LJJLIIIJJIZ(int i) {
        if (isSoLoaded) {
            nUnFlock(i);
        }
    }

    public static void LJIIJJI(String str, boolean z) {
        if (isSoLoaded) {
            try {
                if (Build.VERSION.SDK_INT == 23) {
                    String str2 = Build.MANUFACTURER;
                    if (!TextUtils.isEmpty(str2)) {
                        if (str2.toLowerCase(Locale.getDefault()).contains("oppo")) {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            nDumpLogcat(str, 1);
            if (z) {
                SystemClock.sleep(1000L);
            }
        }
    }

    public static long LJJIIJZLJL(String str, boolean z) {
        if (isSoLoaded) {
            return nGetVmSize(str, z ? 1 : 0);
        }
        return 0L;
    }

    public static void LJJIL(String str, boolean z) {
        if (isSoLoaded) {
            try {
                nMapsParserScanDirectory(str, z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LJJJI(long j, String str) {
        if (isSoLoaded && j != 0) {
            try {
                nStackTraceCollectorDump(j, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LJJJJI(String str, String str2) {
        if (!isSoLoaded) {
            return;
        }
        doRegister(str, str2);
    }

    public static void LJJJZ(Context context, File file) {
        String absolutePath;
        if (isSoLoaded) {
            String absolutePath2 = file.getAbsolutePath();
            String str = context.getApplicationInfo().nativeLibraryDir;
            C0VSJ c0vsj = C08P6.LJ.LIZIZ;
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            String absolutePath3 = new C0VSJ(c0vsj, C802600Ve6.LIZ()).getAbsolutePath();
            int i = Build.VERSION.SDK_INT;
            C802500Vdw.LIZIZ();
            C0VSJ c0vsj2 = C802500Vdw.LIZLLL;
            if (c0vsj2 == null) {
                absolutePath = "";
            } else {
                absolutePath = c0vsj2.getAbsolutePath();
            }
            nStartNativeCrashMonitor(i, str, absolutePath2, absolutePath3, absolutePath, C0VX9.LJI(context).getAbsolutePath(), 40201164, C0VX9.LIZJ(), C0VX9.LIZIZ().LJFF, C0VX9.LJIIIZ);
            return;
        }
        C801940Vd2.LIZIZ("npth so load fail", new Exception());
    }

    public static long LJJLI(int i, String str) {
        if (isSoLoaded) {
            return nStringDumperCreate(str, i);
        }
        return 0L;
    }

    public static void handleCrashFromDumperThread(long j, int i) {
        C0VX9.LJIIIIZZ = true;
        C802600Ve6 c802600Ve6 = C802600Ve6.LIZLLL;
        if (c802600Ve6 != null) {
            C802930Ved c802930Ved = c802600Ve6.LIZIZ;
            c802930Ved.getClass();
            if (j > 0) {
                try {
                    C802790VeP c802790VeP = k.LIZ;
                    if (c802790VeP != null) {
                        Iterator<InterfaceC802370Vdj> it2 = c802790VeP.LIZJ.LJII(CrashType.NATIVE).iterator();
                        while (it2.hasNext()) {
                            try {
                                it2.next().LIZ();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            c802930Ved.LIZ.LIZ(i, false, j, C802930Ved.LIZIZ, C802930Ved.LIZJ);
            if (j > 0) {
                String strLJJIJL = LJJIJL(c802930Ved.LIZ.LIZ.getAbsolutePath());
                if (!TextUtils.isEmpty(strLJJIJL)) {
                    for (C802680VeE c802680VeE : C802680VeE.LJIILJJIL) {
                        if (c802680VeE != null) {
                            Iterator<ICrashCallback> it3 = c802680VeE.LIZJ.LJFF(CrashType.NATIVE).iterator();
                            while (it3.hasNext()) {
                                try {
                                    it3.next().onCrash(CrashType.NATIVE, strLJJIJL, null);
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void reportAnrEventFromNative(int i, int i2) {
        C802430Vdp c802430Vdp = C802430Vdp.LJII;
        if (c802430Vdp != null && c802430Vdp.LJ) {
            try {
                C802790VeP c802790VeP = k.LIZ;
                if (c802790VeP != null) {
                    Iterator it2 = ((CopyOnWriteArrayList) c802790VeP.LIZJ.LJIIJJI).iterator();
                    while (it2.hasNext()) {
                        try {
                            ((InterfaceC803790Vg1) it2.next()).LIZ();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (C803490VfX.LIZIZ) {
                    C802430Vdp.LJII.LIZJ(i, i2, jCurrentTimeMillis);
                    return;
                }
                C802430Vdp c802430Vdp2 = C802430Vdp.LJII;
                if (jCurrentTimeMillis - c802430Vdp2.LJI >= Mp4ScreenVideoLoadTimeout.CONTROL) {
                    c802430Vdp2.LJI = jCurrentTimeMillis;
                    c802430Vdp2.LIZ(jCurrentTimeMillis, true, null, i, i2);
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C802700VeG.LIZJ(th3);
            }
        }
    }

    public static void LJJJLIIL(int i, boolean z, boolean z2) {
        if (isSoLoaded) {
            nEnablePrioriryParams(z, z2, i);
        }
    }

    public static void LJJLIIIIJ(long j, char[] cArr, int i) {
        if (isSoLoaded) {
            nStringDumperDumpCharArray(j, cArr, i);
        }
    }

    public static void LJJLIIIJ(int i, long j, String str) {
        if (isSoLoaded) {
            nStringDumperDumpString(j, str, i);
        }
    }
}
