package com.ss.android.ugc.aweme.app.crash.launchguard;

import X.C0C64;
import X.C0CN1;
import X.C0CN5;
import X.C0VU0;
import X.C0W8H;
import X.C1BCA;
import X.C1C7U;
import X.C2085208Ew;
import X.C2155808cW;
import X.C2156008cY;
import X.C2156208ca;
import X.C2156708cf;
import X.C7740030o;
import X.C786410Ut5;
import X.C810670Vr7;
import X.EnumC312610CNf;
import X.InterfaceC2156608ce;
import Y.ARunnableS6S0210000_3;
import Y.ARunnableS83S0000000_3;
import Y.ARunnableS9S1100000_3;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.crash.Npth;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.app.crash.emergencychannel.EmergencyConfig;
import com.ss.android.ugc.aweme.app.crash.launchguard.LaunchCrashGuard;
import com.ss.android.ugc.aweme.app.crash.launchguard.ServerGuardConfig;
import java.lang.Thread;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class LaunchCrashGuard {
    public static Context context;
    public static volatile boolean launchGuardEndPointFinished;
    public static Thread.UncaughtExceptionHandler npthHandler;
    public static SharedPreferences preferences;
    public static ServerGuardConfig serverGuardConfig;
    public static Thread.UncaughtExceptionHandler systemHandler;
    public static final Thread.UncaughtExceptionHandler crashGuardHandler = new Thread.UncaughtExceptionHandler() { // from class: X.08cb
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            LaunchCrashGuard.doGuardIfNeed(thread, th, false);
        }
    };
    public static final Thread.UncaughtExceptionHandler afterNpthGuardHandler = new Thread.UncaughtExceptionHandler() { // from class: X.08cc
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            LaunchCrashGuard.doGuardIfNeed(thread, th, true);
        }
    };

    public static void fetchServerConfig() {
        String str;
        String str2;
        if (serverGuardConfig != null) {
            return;
        }
        final Context context2 = context;
        String str3 = C2155808cW.LIZ;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            str = C786410Ut5.Y3(context2.getPackageManager(), context2.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            str = null;
        }
        StringBuilder sb = new StringBuilder("https://sf-launch-protect.tiktokcdn.com/obj/tt-launch-protect-sg/android/");
        String packageName = context2.getPackageName();
        if (packageName.contains("musically")) {
            str2 = "m";
        } else if (packageName.contains("trill")) {
            str2 = "t";
        } else {
            str2 = "usmain";
            if (!packageName.contains("usmain")) {
                str2 = "coin";
            }
        }
        sb.append(str2);
        if (!TextUtils.isEmpty(str)) {
            sb.append("/");
            sb.append(str);
        }
        sb.append("/emergency_config");
        String string = sb.toString();
        C0W8H.LIZIZ("emergency_channel_request", "request emergency channel config", new C2156008cY());
        C2156708cf.LIZ.execute(new ARunnableS9S1100000_3(new InterfaceC2156608ce() { // from class: X.08cX
            @Override // X.InterfaceC2156608ce
            public final void onSuccess(String str4) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetch emergency channel config success, response:");
                sbLIZ.append(str4);
                C0W8H.LIZIZ("emergency_channel_request_success", C2188811AlT.LIZIZ(sbLIZ), new C2156008cY());
                Context context3 = context2;
                if (!TextUtils.isEmpty(str4)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(context3.getExternalFilesDir("emergency_channel"));
                    sbLIZ2.append("/");
                    sbLIZ2.append("emergency_config");
                    C2155808cW.LIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    try {
                        C794210VDn c794210VDn = new C794210VDn(C2155808cW.LIZ);
                        try {
                            c794210VDn.write(str4);
                            c794210VDn.close();
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                            try {
                                c794210VDn.close();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                th.addSuppressed(th);
                            }
                        }
                    } catch (Throwable th2) {
                    }
                }
                try {
                    C2155808cW.LIZJ = (EmergencyConfig) C2155808cW.LIZIZ.LJII(str4, EmergencyConfig.class);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
                countDownLatch.countDown();
            }

            @Override // X.InterfaceC2156608ce
            public final void onError(int i, String str4) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetch emergency channel config failed,code:");
                sbLIZ.append(i);
                sbLIZ.append(" msg:");
                sbLIZ.append(str4);
                C0W8H.LIZIZ("emergency_channel_request_failed", C2188811AlT.LIZIZ(sbLIZ), new C2156008cY());
                countDownLatch.countDown();
            }
        }, string, 5));
        try {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        EmergencyConfig emergencyConfig = C2155808cW.LIZJ;
        if (emergencyConfig != null) {
            for (C2156208ca c2156208ca : emergencyConfig.emergencyChannelConfig) {
                if ("launch_crash_guard".equals(c2156208ca.component)) {
                    Gson gson = C7740030o.LIZ().getGson();
                    List list = (List) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJsonTree(gson, c2156208ca.config), new TypeToken<List<ServerGuardConfig>>() { // from class: X.08cZ
                    }.getType());
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    serverGuardConfig = (ServerGuardConfig) ListProtector.get(list, 0);
                    return;
                }
            }
        }
    }

    public static SharedPreferences getPreferences() {
        if (preferences == null) {
            preferences = C810670Vr7.LIZJ(context, 0, "launch_crash_guard_sp");
        }
        return preferences;
    }

    public static boolean isLaunchPeriod() {
        return !launchGuardEndPointFinished;
    }

    public static /* synthetic */ void lambda$waitForLaunchGuardEndPointUpdate$0() {
        C1C7U.LIZ("LaunchCrashGuard@1bd2.waitForLaunchGuardEndPointUpdate$1L");
        launchGuardEndPointFinished = true;
        C1C7U.LIZIZ("LaunchCrashGuard@1bd2.waitForLaunchGuardEndPointUpdate$1L");
    }

    public static void registerGuardExceptionHandlerAfterNpthInit() {
        npthHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(afterNpthGuardHandler);
    }

    public static void waitForLaunchGuardEndPointUpdate() {
        ARunnableS83S0000000_3 aRunnableS83S0000000_3 = new ARunnableS83S0000000_3(10);
        if (!C0CN5.LIZIZ || C0CN5.LIZJ) {
            C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, new C0CN1(150000L, aRunnableS83S0000000_3, false));
        } else {
            C0CN5.LIZJ = true;
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS6S0210000_3(150000L, aRunnableS83S0000000_3, 0));
        }
    }

    public static void init(Context context2) {
        context = context2;
        systemHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(crashGuardHandler);
        waitForLaunchGuardEndPointUpdate();
    }

    public static boolean isTwiceCrash(Throwable th) {
        return getPreferences().getString("last_crash_hash", "").equals(C2085208Ew.LIZ(th));
    }

    public static void recordCrashHash(String str) {
        getPreferences().edit().putString("last_crash_hash", str).commit();
    }

    public static void reportGuardSuccess(Throwable th) {
        Npth.reportBizException("LaunchCrashGuard", (Throwable) new RuntimeException("LaunchCrashGuard", th), "LaunchCrashGuard", (Map<String, String>) null, true);
        C0W8H.LIZIZ("crash_guard_success", Log.getStackTraceString(th), new InterfaceC2156608ce() { // from class: X.08cd
            @Override // X.InterfaceC2156608ce
            public final void onError(int i, String str) {
            }

            @Override // X.InterfaceC2156608ce
            public final void onSuccess(String str) {
            }
        });
    }

    public static boolean isEmergencyGuard(Thread thread, Throwable th) {
        List<ServerGuardConfig.ExceptionInfo> list;
        ServerGuardConfig serverGuardConfig2 = serverGuardConfig;
        if (serverGuardConfig2 != null && (list = serverGuardConfig2.emergencyList) != null) {
            Iterator<ServerGuardConfig.ExceptionInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                if (C2085208Ew.LIZIZ(th, it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isEmergencyRollback(Thread thread, Throwable th) {
        List<ServerGuardConfig.ExceptionInfo> list;
        ServerGuardConfig serverGuardConfig2 = serverGuardConfig;
        if (serverGuardConfig2 != null && (list = serverGuardConfig2.rollbackList) != null) {
            Iterator<ServerGuardConfig.ExceptionInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                if (C2085208Ew.LIZIZ(th, it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isNeedGuard(Thread thread, Throwable th) {
        if ((th instanceof OutOfMemoryError) || !isTwiceCrash(th)) {
            return false;
        }
        int iLJIIZILJ = C0C64.LJIILLIIL().LJIIZILJ(31744, 2, 2, "launch_crash_guard_strategy", true);
        if (iLJIIZILJ == 0) {
            if (thread == Looper.getMainLooper().getThread()) {
                return false;
            }
            return true;
        }
        if (iLJIIZILJ != 1) {
            return false;
        }
        return true;
    }

    public static boolean isServerAutoGuard(Thread thread, Throwable th) {
        if (th instanceof OutOfMemoryError) {
            return false;
        }
        try {
            fetchServerConfig();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        if (isEmergencyRollback(thread, th) || !isEmergencyGuard(thread, th)) {
            return false;
        }
        return true;
    }

    public static void recordGuardCrashHashAndTime(long j, String str) {
        getPreferences().edit().putString("last_guard_crash_hash", str).putLong("last_crash_time", j).commit();
    }

    public static void callOriginalHandler(Thread thread, Throwable th, boolean z) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        if (z && (uncaughtExceptionHandler = npthHandler) != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = systemHandler;
        if (uncaughtExceptionHandler2 == null) {
            return;
        }
        uncaughtExceptionHandler2.uncaughtException(thread, th);
    }

    public static void doGuardForMainThread(Thread thread, boolean z, boolean z2) {
        while (true) {
            try {
                Looper.loop();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!isNeedGuard(thread, th) && !z) {
                    callOriginalHandler(thread, th, z2);
                    return;
                } else {
                    reportGuardSuccess(th);
                    recordCrashHash(C2085208Ew.LIZ(th));
                }
            }
        }
    }

    public static void doGuardIfNeed(Thread thread, Throwable th, boolean z) {
        try {
            boolean zIsLaunchPeriod = isLaunchPeriod();
            boolean zIsServerAutoGuard = isServerAutoGuard(thread, th);
            if (zIsLaunchPeriod || zIsServerAutoGuard) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if ((!zIsLaunchPeriod || !isNeedGuard(thread, th)) && !zIsServerAutoGuard) {
                    recordCrashHash(C2085208Ew.LIZ(th));
                } else {
                    if (!Npth.isInit()) {
                        Npth.init(context, new C0VU0("-1"), true, true, true);
                    }
                    reportGuardSuccess(th);
                    recordGuardCrashHashAndTime(jCurrentTimeMillis, C2085208Ew.LIZ(th));
                    if (Looper.getMainLooper().getThread() == thread) {
                        doGuardForMainThread(thread, zIsServerAutoGuard, z);
                        return;
                    }
                    return;
                }
            }
            callOriginalHandler(thread, th, z);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            callOriginalHandler(C786410Ut5.u3(), th2, z);
        }
    }
}
