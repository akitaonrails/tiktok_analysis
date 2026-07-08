package com.bytedance.tt.reliability.monitor.viewchecker;

import X.C2188811AlT;
import X.C822650WOx;
import android.app.Activity;
import android.content.Context;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.DialogChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.PopupTraceSampler;
import com.bytedance.tt.reliability.monitor.viewchecker.model.PopupBlockConfig;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class PopupTraceSampler {
    public static final ExecutorService EXECUTOR = new C822650WOx(1, 1, 0, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(64), new ThreadFactory() { // from class: X.08U4
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            BPEAThread bPEAThread = new BPEAThread(runnable, "popup-trace-reporter");
            bPEAThread.setDaemon(true);
            ThreadMethodProxy.setPriority(bPEAThread, 1);
            return bPEAThread;
        }
    }, new ThreadPoolExecutor.DiscardPolicy());
    public static final List<String> SLICE_HOOK_KEYWORDS = Collections.unmodifiableList(Arrays.asList("GlobalHookDialog", "GlobalHookDialogFragment", "DialogHooksLancet", "DialogLancet"));
    public static volatile DialogChecker.CheckerCallback sCallback;
    public static volatile PopupBlockConfig.TraceConfig sConfig;
    public static volatile SigDailyQuota sQuota;

    public static String coldStartBucket(long j) {
        return j <= 10000 ? "0-10s" : j <= 60000 ? "10-60s" : j <= 300000 ? "60-300s" : "300s+";
    }

    public static int effectiveSampleBps(Activity activity) {
        List<String> targetActivitiesBoost;
        if (activity != null && (targetActivitiesBoost = sConfig.getTargetActivitiesBoost()) != null && !targetActivitiesBoost.isEmpty() && targetActivitiesBoost.contains(activity.getClass().getName())) {
            return 10000;
        }
        return sConfig.getSampleRatioBps();
    }

    public static boolean matchesSliceKeyword(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null) {
            return false;
        }
        String methodName = stackTraceElement.getMethodName();
        String className = stackTraceElement.getClassName();
        int i = 0;
        while (true) {
            List<String> list = SLICE_HOOK_KEYWORDS;
            if (i >= list.size()) {
                return false;
            }
            String str = (String) ListProtector.get(list, i);
            if (methodName != null && methodName.contains(str)) {
                return true;
            }
            if (className != null && className.contains(str)) {
                return true;
            }
            i++;
        }
    }

    public static String safe(String str) {
        if (str == null) {
            return "";
        }
        return truncate(str.replace('\n', '_').replace('\r', '_').replace(' ', '_').replace('|', '_'));
    }

    public static StackTraceElement[] sliceTopHookFrames(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            int i = 0;
            while (true) {
                if (i >= stackTraceElementArr.length) {
                    break;
                }
                if (matchesSliceKeyword(stackTraceElementArr[i])) {
                    if (i >= 0) {
                        for (int i2 = i + 1; i2 < stackTraceElementArr.length; i2++) {
                            if (matchesSliceKeyword(stackTraceElementArr[i2])) {
                                i = i2;
                            }
                        }
                        int i3 = i + 1;
                        if (i3 < stackTraceElementArr.length) {
                            i3++;
                        }
                        if (i3 >= stackTraceElementArr.length) {
                            return new StackTraceElement[0];
                        }
                        int length = stackTraceElementArr.length - i3;
                        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[length];
                        System.arraycopy(stackTraceElementArr, i3, stackTraceElementArr2, 0, length);
                        return stackTraceElementArr2;
                    }
                } else {
                    i++;
                }
            }
            return stackTraceElementArr;
        }
        return stackTraceElementArr;
    }

    public static String truncate(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 200) {
            return str;
        }
        return str.substring(0, 200);
    }

    public static String buildMessage(String str, String str2) {
        StringBuilder sb = new StringBuilder(128);
        sb.append("[popup_show] host=");
        sb.append(safe(StackSignature.shortenClassName(str)));
        sb.append(" popup=");
        sb.append(safe(StackSignature.shortenClassName(str2)));
        return sb.toString();
    }

    public static void init(Context context, PopupBlockConfig.TraceConfig traceConfig, DialogChecker.CheckerCallback checkerCallback) {
        sConfig = traceConfig;
        sCallback = checkerCallback;
        sQuota = new SigDailyQuota(context, traceConfig.getMaxPerSigPerDay());
    }

    public static void tryReport(String str, Activity activity, final long j) {
        final String name;
        final String str2 = str;
        int iEffectiveSampleBps = effectiveSampleBps(activity);
        if (iEffectiveSampleBps <= 0) {
            return;
        }
        if (iEffectiveSampleBps < 10000 && ThreadLocalRandom.current().nextInt(10000) >= iEffectiveSampleBps) {
            return;
        }
        final Throwable th = new Throwable();
        if (activity == null) {
            name = "";
        } else {
            name = activity.getClass().getName();
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            EXECUTOR.execute(new Runnable() { // from class: X.08U3
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PopupTraceSampler@46b7.tryReport$1");
                    try {
                        PopupTraceSampler.handle(th, name, str2, j);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PopupTraceSampler@46b7.tryReport$1");
                }
            });
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static Map<String, String> buildTags(String str, String str2, String str3, long j) {
        HashMap map = new HashMap(8);
        map.put("host_activity", truncate(str));
        map.put("popup_name", truncate(str2));
        return map;
    }

    public static void handle(Throwable th, String str, String str2, long j) {
        try {
            StackTraceElement[] stackTraceElementArrSliceTopHookFrames = sliceTopHookFrames(th.getStackTrace());
            String strCompute = StackSignature.compute(StackSignature.filter(stackTraceElementArrSliceTopHookFrames, sConfig.getHookTargetKeywords()), sConfig.getSigFrameCount());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strCompute);
            sbLIZ.append("|");
            sbLIZ.append(str);
            sbLIZ.append("|");
            sbLIZ.append(str2);
            String strShortHash = StackSignature.shortHash(C2188811AlT.LIZIZ(sbLIZ));
            List<String> knownSigBlacklist = sConfig.getKnownSigBlacklist();
            if ((knownSigBlacklist != null && knownSigBlacklist.contains(strShortHash)) || !sQuota.tryAcquire(strShortHash)) {
                return;
            }
            String strBuildMessage = buildMessage(str, str2);
            Map<String, String> mapBuildTags = buildTags(str, str2, strShortHash, j);
            Throwable th2 = new Throwable(strBuildMessage);
            th2.setStackTrace(stackTraceElementArrSliceTopHookFrames);
            sCallback.onPopupTraceException(th2, mapBuildTags);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
    }
}
