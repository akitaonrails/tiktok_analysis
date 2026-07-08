package com.ss.android.ugc.aweme.experiment.appinit;

import X.C086U;
import X.C08R2;
import X.C08R5;
import X.C0WP3;
import X.C202094145s;
import X.C2115808Qq;
import X.C2116008Qs;
import X.C2116408Qw;
import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.otis.optimise.system.so.SoPreloader;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.appinit.PreloaderInAppInit;
import com.ss.android.ugc.aweme.lifecycle.ScheduleGroupPromotionReceiver;
import dalvik.system.BaseDexClassLoader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class PreloaderInAppInit {
    public static Runnable LIZ;
    public static Runnable LIZIZ;
    public static Runnable LIZJ;
    public static final CountDownLatch LIZLLL = new CountDownLatch(1);
    public static final CountDownLatch LJ = new CountDownLatch(1);
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);

    public static int LIZ() {
        Integer numValueOf = C2115808Qq.LIZIZ;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(C2116408Qw.LIZ(0, "4530_app_init_preload_keep_stable_in_bg", false));
            C2115808Qq.LIZIZ = numValueOf;
        }
        return (numValueOf.intValue() == 1 && C086U.LIZIZ()) ? C2115808Qq.LIZIZ(false) : C2115808Qq.LIZIZ(true);
    }

    public static void LIZJ() {
        try {
            LIZLLL.await(300L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(Application application) {
        while (true) {
            if (application.getBaseContext() != null && C202094145s.LJIIL != 0) {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.08Qk] */
    public static void preloadInClassLoaderCreated(final ClassLoader classLoader, final ApplicationInfo applicationInfo) {
        if (Build.VERSION.SDK_INT < 28 || !Application.getProcessName().equals(applicationInfo.packageName)) {
            return;
        }
        final boolean[] zArr = {false};
        final int iLIZ = LIZ();
        int i = iLIZ & 524288;
        final ?? r8 = new Runnable() { // from class: X.08Qk
            /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    r12 = this;
                    android.content.pm.ApplicationInfo r0 = r2     // Catch: java.lang.Throwable -> L8b
                    long r6 = com.ss.android.ugc.aweme.classopt.ColdBootClassPreloader.LIZ(r0)     // Catch: java.lang.Throwable -> L8b
                    java.lang.String r0 = "cold_boot_class_mark_no_cinit"
                    r5 = 0
                    int r4 = X.C2116408Qw.LIZ(r5, r0, r5)     // Catch: java.lang.Throwable -> L8b
                    java.lang.String r1 = "class_preload_dex_image_size_threshold"
                    r0 = 12000(0x2ee0, float:1.6816E-41)
                    int r0 = X.C2116408Qw.LIZ(r0, r1, r5)     // Catch: java.lang.Throwable -> L8b
                    long r1 = (long) r0     // Catch: java.lang.Throwable -> L8b
                    int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                    r11 = 1
                    if (r0 < 0) goto L1c
                    goto L1e
                L1c:
                    r6 = 0
                    goto L1f
                L1e:
                    r6 = 1
                L1f:
                    r3 = 262144(0x40000, float:3.67342E-40)
                    if (r6 == 0) goto L67
                    int r0 = r1     // Catch: java.lang.Throwable -> L8b
                    r0 = r0 & r3
                    if (r0 != r3) goto L65
                    android.content.pm.ApplicationInfo r0 = r2     // Catch: java.lang.Throwable -> L8b
                    r9 = 0
                    X.0VSJ r7 = new X.0VSJ     // Catch: java.lang.Throwable -> L58
                    java.lang.String r0 = r0.sourceDir     // Catch: java.lang.Throwable -> L58
                    r7.<init>(r0)     // Catch: java.lang.Throwable -> L58
                    java.lang.String[] r0 = android.os.Build.SUPPORTED_64_BIT_ABIS     // Catch: java.lang.Throwable -> L58
                    int r0 = r0.length     // Catch: java.lang.Throwable -> L58
                    if (r0 != 0) goto L55
                    java.lang.String r2 = "oat/arm/split_df_a_dex.art"
                L3a:
                    X.0VSJ r1 = new X.0VSJ     // Catch: java.lang.Throwable -> L58
                    java.io.File r0 = r7.getParentFile()     // Catch: java.lang.Throwable -> L58
                    r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L58
                    boolean r0 = r1.isFile()     // Catch: java.lang.Throwable -> L58
                    if (r0 == 0) goto L63
                    long r7 = r1.length()     // Catch: java.lang.Throwable -> L58
                    int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                    if (r0 <= 0) goto L63
                    r0 = 1024(0x400, double:5.06E-321)
                    long r7 = r7 / r0
                    goto L5d
                L55:
                    java.lang.String r2 = "oat/arm64/split_df_a_dex.art"
                    goto L3a
                L58:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8b
                    goto L63
                L5d:
                    r1 = 500(0x1f4, double:2.47E-321)
                    int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L65
                L63:
                    r6 = 0
                    goto L67
                L65:
                    if (r4 <= 0) goto L8f
                L67:
                    X.08Ql r2 = new X.08Ql     // Catch: java.lang.Throwable -> L8b
                    r2.<init>()     // Catch: java.lang.Throwable -> L8b
                    java.lang.ClassLoader r1 = r3     // Catch: java.lang.Throwable -> L8b
                    android.content.pm.ApplicationInfo r0 = r2     // Catch: java.lang.Throwable -> L8b
                    boolean r0 = com.ss.android.ugc.aweme.classopt.ColdBootClassPreloader.LJFF(r1, r0, r4, r2)     // Catch: java.lang.Throwable -> L8b
                    if (r0 != 0) goto L8f
                    boolean[] r0 = r4     // Catch: java.lang.Throwable -> L8b
                    r0[r5] = r11     // Catch: java.lang.Throwable -> L8b
                    android.content.pm.ApplicationInfo r2 = r2     // Catch: java.lang.Throwable -> L8b
                    X.08Ql r1 = new X.08Ql     // Catch: java.lang.Throwable -> L8b
                    r1.<init>()     // Catch: java.lang.Throwable -> L8b
                    int r0 = r1     // Catch: java.lang.Throwable -> L8b
                    r0 = r0 & r3
                    if (r0 != r3) goto L87
                    r5 = 1
                L87:
                    com.ss.android.ugc.aweme.classopt.ColdBootClassPreloader.LJI(r2, r1, r4, r6, r5)     // Catch: java.lang.Throwable -> L8b
                    return
                L8b:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                L8f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2115208Qk.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PreloaderInAppInit@7d81.preloadInClassLoaderCreated$7");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PreloaderInAppInit@7d81.preloadInClassLoaderCreated$7");
            }
        };
        if ((iLIZ & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 2048) {
            C0WP3.LIZLLL(new AsyncTask() { // from class: X.08Qn
                @Override // android.os.AsyncTask
                public final Object doInBackground(Object[] objArr) {
                    try {
                        C0X35.LJII(applicationInfo);
                        int i2 = iLIZ;
                        if ((i2 & 1024) == 1024) {
                            if ((i2 & 16384) != 16384 || !C086U.LIZIZ()) {
                                r8.run();
                                return null;
                            }
                            return null;
                        }
                        return null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return null;
                    }
                }
            }, C0WP3.LIZ(AsyncTask.THREAD_POOL_EXECUTOR), new Object[0]);
        }
        Integer numValueOf = C2115808Qq.LIZJ;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(C2116408Qw.LIZ(0, "4580_push_process_schedule_group_promotion", false));
            C2115808Qq.LIZJ = numValueOf;
        }
        if (numValueOf.intValue() > 0 && C086U.LIZIZ() && C086U.LIZJ) {
            Integer numValueOf2 = C2115808Qq.LIZJ;
            if (numValueOf2 == null) {
                numValueOf2 = Integer.valueOf(C2116408Qw.LIZ(0, "4580_push_process_schedule_group_promotion", false));
                C2115808Qq.LIZJ = numValueOf2;
            }
            long jIntValue = numValueOf2.intValue();
            final String str = applicationInfo.packageName;
            try {
                final long jElapsedRealtime = SystemClock.elapsedRealtime() + jIntValue;
                C0WP3.LIZLLL(new AsyncTask() { // from class: X.08Mm
                    @Override // android.os.AsyncTask
                    public final Object doInBackground(Object[] objArr) {
                        try {
                            if (PreloaderInAppInit.LJFF.compareAndSet(false, true)) {
                                C20129813pY.LIZ();
                            }
                            Method declaredMethod = Process.class.getDeclaredMethod("getProcessGroup", Integer.TYPE);
                            declaredMethod.setAccessible(true);
                            while (SystemClock.elapsedRealtime() < jElapsedRealtime) {
                                Thread.sleep(50L);
                                if (((Integer) declaredMethod.invoke(null, Integer.valueOf(Process.myPid()))).intValue() == 0) {
                                    ScheduleGroupPromotionReceiver.LIZIZ(1000L, str);
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        return null;
                    }
                }, C0WP3.LIZ(AsyncTask.THREAD_POOL_EXECUTOR), new Object[0]);
                ScheduleGroupPromotionReceiver.LIZIZ(1000L, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if ((iLIZ & 131072) == 131072 && Build.VERSION.SDK_INT >= 30) {
            C0WP3.LIZLLL(new AsyncTask() { // from class: X.08Qt
                @Override // android.os.AsyncTask
                public final Object doInBackground(Object[] objArr) {
                    return null;
                }
            }, C0WP3.LIZ(AsyncTask.THREAD_POOL_EXECUTOR), new Object[0]);
        }
        if ((iLIZ & 256) == 256 && (iLIZ & 1024) != 1024 && ((iLIZ & 16384) != 16384 || !C086U.LIZIZ())) {
            C0WP3.LIZLLL(new AsyncTask() { // from class: X.08Qo
                @Override // android.os.AsyncTask
                public final Object doInBackground(Object[] objArr) {
                    r8.run();
                    return null;
                }
            }, C0WP3.LIZ(AsyncTask.THREAD_POOL_EXECUTOR), new Object[0]);
        }
        if ((C08R2.LIZIZ() & 1) == 1) {
            if (C08R2.LIZJ == -1) {
                C08R2.LIZJ = C2116408Qw.LIZ(0, "cold_boot_keva_adv_opt_safety_catch_v2", false);
            }
            if ((C08R2.LIZJ & 1) != 1) {
                C0WP3.LIZLLL(new C08R5(applicationInfo), C0WP3.LIZ(AsyncTask.THREAD_POOL_EXECUTOR), new Object[0]);
            }
        }
        if (C2116008Qs.LIZLLL == -1) {
            C2116008Qs.LIZLLL = C2116408Qw.LIZ(0, "cold_boot_preload_pumbaa_so", true);
        }
        if ((C2116008Qs.LIZLLL & 1) == 1) {
            if (C2116008Qs.LJ == -1) {
                C2116008Qs.LJ = C2116408Qw.LIZ(0, "cold_boot_preload_pumbaa_so_safety_catch_v2", false);
            }
            if ((C2116008Qs.LJ & 1) != 1) {
                C0WP3.LIZLLL(new AsyncTask() { // from class: X.08Qp
                    @Override // android.os.AsyncTask
                    public final Object doInBackground(Object[] objArr) {
                        try {
                            ArrayList<String> arrayList = new ArrayList();
                            arrayList.addAll(C2116008Qs.LIZ);
                            arrayList.addAll(C2116008Qs.LIZIZ);
                            for (String str2 : arrayList) {
                                SystemClock.currentThreadTimeMillis();
                                System.loadLibrary(str2);
                            }
                            return null;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C2116408Qw.LIZJ("cold_boot_preload_pumbaa_so_safety_catch_v2", 1);
                            return null;
                        }
                    }
                }, C0WP3.LIZ(AsyncTask.THREAD_POOL_EXECUTOR), new Object[0]);
            }
        }
        if ((C08R2.LIZIZ() & 2) == 2) {
            C0WP3.LIZLLL(new AsyncTask() { // from class: X.08R1
                @Override // android.os.AsyncTask
                public final Object doInBackground(Object[] objArr) {
                    boolean z;
                    try {
                        Map<Integer, String[]> map = C08TK.LIZ;
                        String[] strArr = C08TK.LIZ.get(30);
                        if (strArr == null) {
                            strArr = new String[0];
                        }
                        for (String str2 : strArr) {
                            System.loadLibrary(str2);
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C2116408Qw.LIZJ("cold_boot_keva_adv_opt_safety_catch_v2", 1);
                        C08R2.LJ = th2;
                    }
                    if ((C08R2.LIZIZ() & 4) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        try {
                            if (!PreloaderInAppInit.LJ.await(1000L, TimeUnit.MILLISECONDS)) {
                                C08R2.LJIIIZ = -99L;
                                return null;
                            }
                            if (C202094145s.LIZIZ > 0) {
                                C08R2.LJIIIZ = -66L;
                                return null;
                            }
                            if (classLoader instanceof BaseDexClassLoader) {
                                long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                String[] strArr2 = {"fileprotect", "quick", "napi", "videodec", "bytehook", "orbuculumadapter", "ByteVC1_dec", "byteVC2dec", "TTMachineCore", "bdzstd", "wcdb", "delta"};
                                ArrayList arrayList = new ArrayList(12);
                                int i2 = 0;
                                do {
                                    String str3 = strArr2[i2];
                                    Objects.requireNonNull(str3);
                                    arrayList.add(str3);
                                    i2++;
                                } while (i2 < 12);
                                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                                BaseDexClassLoader baseDexClassLoader = (BaseDexClassLoader) classLoader;
                                Iterator it2 = listUnmodifiableList.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    String str4 = (String) it2.next();
                                    if (C202094145s.LIZIZ > 0) {
                                        C08R2.LJI = str4;
                                        break;
                                    }
                                    SystemClock.currentThreadTimeMillis();
                                    String strFindLibrary = baseDexClassLoader.findLibrary(str4);
                                    if (strFindLibrary != null) {
                                        if ((C08R2.LIZIZ() & 8) == 8) {
                                            SoPreloader.loadSoByDlOpen(null);
                                        } else {
                                            SoPreloader.loadSoByDlOpen(strFindLibrary);
                                            SystemClock.currentThreadTimeMillis();
                                        }
                                    }
                                }
                                C08R2.LJII = SystemClock.currentThreadTimeMillis() - jCurrentThreadTimeMillis;
                                C08R2.LJIIIIZZ = System.currentTimeMillis() - jCurrentTimeMillis;
                                C08R2.LJIIIZ = SystemClock.uptimeMillis() - C202094145s.LIZ;
                                return null;
                            }
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            C08R2.LJFF = th3;
                        }
                    }
                    return null;
                }
            }, C0WP3.LIZ(AsyncTask.THREAD_POOL_EXECUTOR), new Object[0]);
        }
        C0WP3.LIZLLL(new AsyncTask(iLIZ, applicationInfo, classLoader, zArr) { // from class: X.08Qr
            public final /* synthetic */ int LIZ;
            public final /* synthetic */ ApplicationInfo LIZIZ;
            public final /* synthetic */ boolean[] LIZJ;

            /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
            @Override // android.os.AsyncTask
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object doInBackground(java.lang.Object[] r9) {
                /*
                    r8 = this;
                    int r1 = r8.LIZ     // Catch: java.lang.Throwable -> Lac
                    r0 = 524288(0x80000, float:7.34684E-40)
                    r1 = r1 & r0
                    r7 = 1
                    r5 = 0
                    if (r1 != r0) goto L10
                    java.lang.Runnable r0 = com.ss.android.ugc.aweme.experiment.appinit.PreloaderInAppInit.LIZ     // Catch: java.lang.Throwable -> Lc
                    goto L10
                Lc:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lac
                L10:
                    int r1 = r8.LIZ     // Catch: java.lang.Throwable -> Lac
                    r0 = 65536(0x10000, float:9.1835E-41)
                    r1 = r1 & r0
                    if (r1 != r0) goto L4b
                    boolean r0 = X.C086U.LIZIZ()     // Catch: java.lang.Throwable -> Lac
                    if (r0 != 0) goto L4b
                    android.content.pm.ApplicationInfo r0 = r8.LIZIZ     // Catch: java.lang.Throwable -> Lac
                    com.google.gson.internal.bind.GsonBoundFieldsPreloader.LIZ(r0)     // Catch: java.lang.Throwable -> Lac
                    boolean r0 = com.google.gson.internal.bind.GsonBoundFieldsPreloader.LIZJ     // Catch: java.lang.Throwable -> Lac
                    if (r0 != 0) goto L4b
                    X.0VSJ r0 = com.google.gson.internal.bind.GsonBoundFieldsPreloader.LIZLLL     // Catch: java.lang.Throwable -> Lac
                    if (r0 == 0) goto L2e
                    com.google.gson.internal.bind.GsonBoundFieldsPreloader.LIZIZ = r7     // Catch: java.lang.Throwable -> Lac
                    com.google.gson.internal.bind.GsonBoundFieldsPreloader.LIZ = r7     // Catch: java.lang.Throwable -> Lac
                L2e:
                    java.lang.String r0 = "cold_boot_gson_record_delay_duration"
                    int r6 = X.C2116408Qw.LIZ(r5, r0, r5)     // Catch: java.lang.Throwable -> Lac
                L34:
                    r1 = 5000(0x1388, double:2.4703E-320)
                    java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> Lac
                    boolean[] r0 = r8.LIZJ     // Catch: java.lang.Throwable -> Lac
                    boolean r0 = r0[r5]     // Catch: java.lang.Throwable -> Lac
                    if (r0 == 0) goto L4e
                    java.lang.String r0 = "cold_boot_class_record_delay_duration"
                    int r4 = X.C2116408Qw.LIZ(r5, r0, r5)     // Catch: java.lang.Throwable -> Lac
                    if (r4 > 0) goto L4f
                    com.ss.android.ugc.aweme.classopt.ColdBootClassPreloader.LJII()     // Catch: java.lang.Throwable -> Lac
                    goto L4f
                L4b:
                    r6 = 0
                    r7 = 0
                    goto L34
                L4e:
                    r4 = 0
                L4f:
                    if (r7 == 0) goto L56
                    if (r6 > 0) goto L56
                    com.google.gson.internal.bind.GsonBoundFieldsPreloader.LIZLLL()     // Catch: java.lang.Throwable -> Lac
                L56:
                    java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> Lac
                    java.lang.Integer r0 = X.C2115808Qq.LIZ     // Catch: java.lang.Throwable -> Lac
                    if (r0 == 0) goto L6e
                    java.lang.String r2 = "4130_app_init_preload_opt"
                    int r1 = r0.intValue()     // Catch: java.lang.Throwable -> Lac
                    java.util.Set<java.lang.String> r0 = X.C2116408Qw.LIZIZ     // Catch: java.lang.Throwable -> Lac
                    boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> Lac
                    if (r0 != 0) goto L6e
                    X.C2116408Qw.LIZJ(r2, r1)     // Catch: java.lang.Throwable -> Lac
                L6e:
                    int r2 = X.C08R2.LIZIZ     // Catch: java.lang.Throwable -> Lac
                    r3 = -1
                    if (r2 == r3) goto L80
                    java.lang.String r1 = "cold_boot_keva_adv_opt"
                    java.util.Set<java.lang.String> r0 = X.C2116408Qw.LIZIZ     // Catch: java.lang.Throwable -> Lac
                    boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> Lac
                    if (r0 != 0) goto L80
                    X.C2116408Qw.LIZJ(r1, r2)     // Catch: java.lang.Throwable -> Lac
                L80:
                    int r2 = X.C2116008Qs.LIZLLL     // Catch: java.lang.Throwable -> Lac
                    if (r2 == r3) goto L91
                    java.lang.String r1 = "cold_boot_preload_pumbaa_so"
                    java.util.Set<java.lang.String> r0 = X.C2116408Qw.LIZIZ     // Catch: java.lang.Throwable -> Lac
                    boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> Lac
                    if (r0 != 0) goto L91
                    X.C2116408Qw.LIZJ(r1, r2)     // Catch: java.lang.Throwable -> Lac
                L91:
                    if (r7 == 0) goto L9c
                    if (r6 <= 0) goto L9c
                    long r0 = (long) r6     // Catch: java.lang.Throwable -> Lac
                    java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> Lac
                    com.google.gson.internal.bind.GsonBoundFieldsPreloader.LIZLLL()     // Catch: java.lang.Throwable -> Lac
                L9c:
                    boolean[] r0 = r8.LIZJ     // Catch: java.lang.Throwable -> Lac
                    boolean r0 = r0[r5]     // Catch: java.lang.Throwable -> Lac
                    if (r0 == 0) goto Lb0
                    if (r4 <= 0) goto Lb0
                    long r0 = (long) r4     // Catch: java.lang.Throwable -> Lac
                    java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> Lac
                    com.ss.android.ugc.aweme.classopt.ColdBootClassPreloader.LJII()     // Catch: java.lang.Throwable -> Lac
                    goto Lb0
                Lac:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                Lb0:
                    r0 = 0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AsyncTaskC2115908Qr.doInBackground(java.lang.Object[]):java.lang.Object");
            }

            {
                this.LIZJ = zArr;
            }
        }, C0WP3.LIZ(AsyncTask.THREAD_POOL_EXECUTOR), new Object[0]);
    }
}
