package com.bytedance.sysoptimizer;

import X.C08PL;
import X.C1AF0;
import X.C1C7U;
import X.C20129813pY;
import X.C2112108Pf;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class FindCatchBlockOpt {
    public static volatile ICallback sCallback;
    public static volatile boolean sInit;

    public interface ICallback {
        int d(String str, String str2);

        int e(String str, String str2);

        int e(String str, String str2, Throwable th);
    }

    public static class Tester {
        public static long sMethodB4Called;

        public static Object getO() {
            return null;
        }

        public static void methodB3() {
        }

        public static ConnectivityManager.NetworkCallback methodB1() {
            return new ConnectivityManager.NetworkCallback();
        }

        public static void methodB4() {
            sMethodB4Called++;
            Object o = getO();
            if (o == null) {
                o.hashCode();
            }
        }

        static {
            FindCatchBlockOpt.getCallback().e("Tester", " <clinit> called.");
        }

        public Tester() {
        }

        public static void nullPointerCrash() {
            throw null;
        }

        public Tester(int i) {
        }

        public static void methodA(Context context) {
            methodB4();
            methodB2(methodB0(context), methodB1());
            methodB3();
        }

        public static ConnectivityManager methodB0(Context context) {
            return (ConnectivityManager) C786410Ut5.H2(context, "connectivity");
        }

        public Tester(long j) {
        }

        public static void methodB2(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
            int i = 0;
            do {
                methodC0(connectivityManager, networkCallback);
                i++;
            } while (i < 100);
        }

        public static void methodC0(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
            connectivityManager.unregisterNetworkCallback(networkCallback);
        }

        public static void start(Context context, boolean z, final int i) {
            if (!FindCatchBlockOpt.isEnable()) {
                return;
            }
            new BPEAThread(new Runnable() { // from class: com.bytedance.sysoptimizer.FindCatchBlockOpt.Tester.1
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("FindCatchBlockOpt$Tester@c02c.start$1");
                    com_bytedance_sysoptimizer_FindCatchBlockOpt$Tester$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("FindCatchBlockOpt$Tester@c02c.start$1");
                }

                public void com_bytedance_sysoptimizer_FindCatchBlockOpt$Tester$1__run$___twin___() {
                    SystemClock.sleep(i);
                    int i2 = 0;
                    do {
                        try {
                            Tester.methodB4();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            ICallback callback = FindCatchBlockOpt.getCallback();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("methodB4 Crash, ");
                            sbLIZ.append(th);
                            callback.e("Tester", C2188811AlT.LIZIZ(sbLIZ));
                            C1AF0.LJ(th);
                        }
                        i2++;
                    } while (i2 < 5);
                }

                public static void com_bytedance_sysoptimizer_FindCatchBlockOpt$Tester$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_bytedance_sysoptimizer_FindCatchBlockOpt$Tester$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            }).start();
        }
    }

    public static native int nStart(boolean z, boolean z2, CatchException[] catchExceptionArr, String str);

    public static native int nStartV2(boolean z, boolean z2, CatchException[] catchExceptionArr, String str);

    public static native void reservedForJniOffset();

    public static class CatchException {
        public int crashDexPc;
        public String declaringClass;
        public String detailMessage;
        public int offset;
        public CatchStackTrace[] stackTrace;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CatchException{declaringClass='");
            sbLIZ.append(this.declaringClass);
            sbLIZ.append('\'');
            sbLIZ.append(", detailMessage='");
            sbLIZ.append(this.detailMessage);
            sbLIZ.append('\'');
            sbLIZ.append(", crashDexPc='");
            sbLIZ.append(this.crashDexPc);
            sbLIZ.append('\'');
            sbLIZ.append(", offset='");
            sbLIZ.append(this.offset);
            sbLIZ.append('\'');
            sbLIZ.append(", stackTrace=");
            sbLIZ.append(Arrays.toString(this.stackTrace));
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static class CatchStackTrace {
        public String declaringClass;
        public boolean isStatic;
        public String methodName;
        public String methodSig;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CatchStackTrace{declaringClass='");
            sbLIZ.append(this.declaringClass);
            sbLIZ.append('\'');
            sbLIZ.append(", methodName='");
            sbLIZ.append(this.methodName);
            sbLIZ.append('\'');
            sbLIZ.append(", methodSig='");
            sbLIZ.append(this.methodSig);
            sbLIZ.append('\'');
            sbLIZ.append(", isStatic=");
            sbLIZ.append(this.isStatic);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final class ForReadInstrumentation {
        static {
            FindCatchBlockOpt.getCallback().e("FindCatchBlockOpt", "called ForReadInstrumentation <clinit>");
        }

        public static void A() {
            FindCatchBlockOpt.getCallback().e("FindCatchBlockOpt", "called ForReadInstrumentation A");
        }

        public static void gc() {
            FindCatchBlockOpt.getCallback().e("FindCatchBlockOpt", "called ForReadInstrumentation gc");
            Runtime.getRuntime().gc();
            Runtime.getRuntime().runFinalization();
        }
    }

    public static ICallback getCallback() {
        ICallback iCallback;
        synchronized (FindCatchBlockOpt.class) {
            try {
                iCallback = sCallback;
                if (iCallback == null) {
                    iCallback = new ICallback() { // from class: com.bytedance.sysoptimizer.FindCatchBlockOpt.1
                        @Override // com.bytedance.sysoptimizer.FindCatchBlockOpt.ICallback
                        public int d(String str, String str2) {
                            PrintStream printStream = System.out;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str);
                            sbLIZ.append(", ");
                            sbLIZ.append(str2);
                            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                            return 0;
                        }

                        @Override // com.bytedance.sysoptimizer.FindCatchBlockOpt.ICallback
                        public int e(String str, String str2) {
                            PrintStream printStream = System.err;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str);
                            sbLIZ.append(", ");
                            sbLIZ.append(str2);
                            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                            return 0;
                        }

                        @Override // com.bytedance.sysoptimizer.FindCatchBlockOpt.ICallback
                        public int e(String str, String str2, Throwable th) {
                            PrintStream printStream = System.err;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str);
                            sbLIZ.append(", ");
                            sbLIZ.append(str2);
                            sbLIZ.append(", ");
                            sbLIZ.append(th);
                            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                            return 0;
                        }
                    };
                    updateCallback(iCallback);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iCallback;
    }

    public static boolean isEnable() {
        ICallback callback = getCallback();
        int i = Build.VERSION.SDK_INT;
        if (i < 27 || i > 34) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NOT SUPPORT API LEVEL ");
            sbLIZ.append(i);
            callback.e("FindCatchBlockOpt", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        if (!Process.is64Bit()) {
            callback.e("FindCatchBlockOpt", "NOT SUPPORT 32Bit");
            return false;
        }
        for (String str : Build.SUPPORTED_ABIS) {
            if (!TextUtils.isEmpty(str) && str.startsWith("x86")) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ONLY SUPPORT arm64-v8a.But current are ");
                sbLIZ2.append(TextUtils.join(",", Build.SUPPORTED_ABIS));
                callback.e("FindCatchBlockOpt", C2188811AlT.LIZIZ(sbLIZ2));
                return false;
            }
        }
        return true;
    }

    public static void replaceClassName(CatchException[] catchExceptionArr) {
        for (CatchException catchException : catchExceptionArr) {
            catchException.declaringClass = catchException.declaringClass.replace('.', '/');
            for (CatchStackTrace catchStackTrace : catchException.stackTrace) {
                catchStackTrace.declaringClass = catchStackTrace.declaringClass.replace('.', '/');
            }
            getCallback().e("FindCatchBlockOpt", catchException.toString());
        }
    }

    public static void updateCallback(ICallback iCallback) {
        synchronized (FindCatchBlockOpt.class) {
            try {
                sCallback = iCallback;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static int start(Context context, int i, boolean z, boolean z2, boolean z3, CatchException[] catchExceptionArr, ICallback iCallback, String str) {
        int iNStartV2 = -1;
        if (!isEnable()) {
            return -1;
        }
        if (sInit) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Already sInit.");
            sbLIZ.append(Log.getStackTraceString(new Throwable()));
            iCallback.e("FindCatchBlockOpt", C2188811AlT.LIZIZ(sbLIZ));
            return 1;
        }
        if (SysOptimizer.loadOptimizerLibrary(context) && !sInit) {
            if (z2) {
                C20129813pY.LIZ();
            }
            updateCallback(iCallback);
            C2112108Pf c2112108Pf = new C2112108Pf();
            c2112108Pf.LIZ = C08PL.SHARED.value;
            c2112108Pf.LIZIZ = true;
            ShadowHook.init(c2112108Pf.LIZ());
            reservedForJniOffset();
            replaceClassName(catchExceptionArr);
            if ((i & 1) == 1) {
                iNStartV2 = nStart(z, z3, catchExceptionArr, str);
            } else if ((i & 2) == 2) {
                iNStartV2 = nStartV2(z, z3, catchExceptionArr, str);
            }
            sInit = true;
        }
        return iNStartV2;
    }
}
