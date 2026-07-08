package com.bytedance.apm.agent.tracing;

import X.C07RX;
import X.C1C7U;
import X.C2179971ATj;
import X.C787900UvU;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes14.dex */
public class AutoPageTraceHelper {
    public static boolean sIsFirstWindowFocusChangedActivity;
    public static final HashSet<String> sMethodSet = new HashSet<>(32);
    public static final ConcurrentLinkedQueue<PageTraceEntity> sPageList = new ConcurrentLinkedQueue<>();
    public static long sMaxValidTimeMs = 20000;

    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:3:0x0007, B:5:0x0010, B:7:0x001a, B:9:0x0022, B:12:0x002a, B:14:0x0036, B:16:0x0081, B:17:0x0094, B:19:0x00b0, B:21:0x00bd, B:29:0x00dc, B:33:0x00f0, B:34:0x0117, B:24:0x00c5, B:26:0x00d4), top: B:39:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void reportStats() {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.agent.tracing.AutoPageTraceHelper.reportStats():void");
    }

    public static void setMaxValidTimeMs(long j) {
        sMaxValidTimeMs = j;
    }

    public static void reportViewIdStats(long j, String str) {
        PageTraceEntity pageTraceEntityPeek = sPageList.peek();
        if (pageTraceEntityPeek != null && TextUtils.equals(str, pageTraceEntityPeek.pageName)) {
            pageTraceEntityPeek.onViewShowTs = j;
            C787900UvU.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.tracing.AutoPageTraceHelper.2
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("AutoPageTraceHelper@57c0.reportViewIdStats$1");
                    com_bytedance_apm_agent_tracing_AutoPageTraceHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("AutoPageTraceHelper@57c0.reportViewIdStats$1");
                }

                public void com_bytedance_apm_agent_tracing_AutoPageTraceHelper$2__run$___twin___() {
                    AutoPageTraceHelper.reportStats();
                }

                public static void com_bytedance_apm_agent_tracing_AutoPageTraceHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    try {
                        anonymousClass2.com_bytedance_apm_agent_tracing_AutoPageTraceHelper$2__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    public static void onTrace(String str, String str2, boolean z) {
        if (TextUtils.equals("onCreate", str2)) {
            if (z) {
                if (!sIsFirstWindowFocusChangedActivity) {
                    AutoLaunchTraceHelper.launcherActivityOnCreateStart(str);
                }
                ConcurrentLinkedQueue<PageTraceEntity> concurrentLinkedQueue = sPageList;
                if (concurrentLinkedQueue.size() > 50) {
                    concurrentLinkedQueue.poll();
                }
                concurrentLinkedQueue.add(new PageTraceEntity(str, System.currentTimeMillis()));
                return;
            }
            if (!sIsFirstWindowFocusChangedActivity) {
                AutoLaunchTraceHelper.launcherActivityOnCreateEnd();
            }
            PageTraceEntity pageTraceEntityPeek = sPageList.peek();
            if (pageTraceEntityPeek == null) {
                return;
            }
            pageTraceEntityPeek.onCreateEndTs = System.currentTimeMillis();
            return;
        }
        if (TextUtils.equals("onResume", str2)) {
            if (z) {
                if (!sIsFirstWindowFocusChangedActivity) {
                    AutoLaunchTraceHelper.launcherActivityOnResumeStart(str);
                }
                PageTraceEntity pageTraceEntityPeek2 = sPageList.peek();
                if (pageTraceEntityPeek2 == null) {
                    return;
                }
                pageTraceEntityPeek2.onResumeStartTs = System.currentTimeMillis();
                return;
            }
            if (!sIsFirstWindowFocusChangedActivity) {
                AutoLaunchTraceHelper.launcherActivityOnResumeEnd();
            }
            PageTraceEntity pageTraceEntityPeek3 = sPageList.peek();
            if (pageTraceEntityPeek3 == null) {
                return;
            }
            pageTraceEntityPeek3.onResumeEndTs = System.currentTimeMillis();
            return;
        }
        if (TextUtils.equals("onWindowFocusChanged", str2)) {
            if (!z) {
                return;
            }
            if (!sIsFirstWindowFocusChangedActivity) {
                AutoLaunchTraceHelper.launcherActivityOnWindowFocusChangedStart(str);
                sIsFirstWindowFocusChangedActivity = true;
            }
            PageTraceEntity pageTraceEntityPeek4 = sPageList.peek();
            if (pageTraceEntityPeek4 == null || pageTraceEntityPeek4.onWindowFocusTs != 0) {
                return;
            }
            pageTraceEntityPeek4.onWindowFocusTs = System.currentTimeMillis();
            if (C07RX.LIZ(str) != null) {
                return;
            }
            C787900UvU.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.tracing.AutoPageTraceHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("AutoPageTraceHelper@57c0.onTrace$1");
                    com_bytedance_apm_agent_tracing_AutoPageTraceHelper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("AutoPageTraceHelper@57c0.onTrace$1");
                }

                public void com_bytedance_apm_agent_tracing_AutoPageTraceHelper$1__run$___twin___() {
                    AutoPageTraceHelper.reportStats();
                }

                public static void com_bytedance_apm_agent_tracing_AutoPageTraceHelper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_bytedance_apm_agent_tracing_AutoPageTraceHelper$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
            return;
        }
        if (!TextUtils.equals("onStart", str2)) {
            return;
        }
        if (z) {
            if (sIsFirstWindowFocusChangedActivity) {
                return;
            }
            AutoLaunchTraceHelper.launcherActivityOnStartStart(str);
        } else {
            if (sIsFirstWindowFocusChangedActivity) {
                return;
            }
            AutoLaunchTraceHelper.launcherActivityOnStartEnd(str);
        }
    }
}
