package com.bytedance.tt.reliability.queuemonitor.impl;

import X.C1C7U;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Printer;
import com.bytedance.tt.reliability.queuemonitor.QueueMonitorRegistry;
import com.bytedance.tt.reliability.queuemonitor.api.MetricsAggregator;
import com.bytedance.tt.reliability.queuemonitor.api.MonitorHelper;
import com.bytedance.tt.reliability.queuemonitor.impl.MQCollector;
import com.bytedance.tt.reliability.queuemonitor.model.QueueId;
import com.bytedance.tt.reliability.queuemonitor.model.QueueMonitorConfig;
import com.bytedance.tt.reliability.queuemonitor.model.QueueType;
import com.bytedance.tt.reliability.queuemonitor.model.StackInfo;
import com.bytedance.tt.reliability.queuemonitor.util.ConfigResolver;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class MQCollector {
    public static final MQCollector INSTANCE = new MQCollector();
    public static final QueueMonitorRegistry registry = QueueMonitorRegistry.INSTANCE;
    public static final ConcurrentHashMap<Integer, QueueId> handlerToQueueMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: lambda$semisugar$setLogger$lambda-0$0, reason: not valid java name */
    public static /* synthetic */ void m142lambda$semisugar$setLogger$lambda0$0(Printer printer, Handler handler, String str) {
        C1C7U.LIZ("MQCollector@373d.setLogger$1L");
        m143setLogger$lambda0(printer, handler, str);
        C1C7U.LIZIZ("MQCollector@373d.setLogger$1L");
    }

    private final QueueId createQueueId(Handler handler) {
        Map<String, Object> mapLJ;
        StackTraceElement stackTraceElementFindCallerKeyPoint = findCallerKeyPoint(ThreadMethodProxy.getStackTrace(C786410Ut5.u3()));
        String str = "";
        if (stackTraceElementFindCallerKeyPoint != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((Object) stackTraceElementFindCallerKeyPoint.getClassName());
            sbLIZ.append('.');
            sbLIZ.append((Object) stackTraceElementFindCallerKeyPoint.getMethodName());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ != null) {
                str = strLIZIZ;
            }
        }
        QueueType queueType = QueueType.MESSAGE_QUEUE;
        String strLJIIJJI = Intrinsics.LJIIJJI(Integer.valueOf(handler.getLooper().hashCode()), "handler_");
        String name = handler.getClass().getName();
        String groupType = getGroupType(handler);
        String name2 = C786410Ut5.u3().getName();
        MonitorHelper monitorHelper$arm_release = registry.getMonitorHelper$arm_release();
        if (monitorHelper$arm_release == null || (mapLJ = monitorHelper$arm_release.appendCommonParams(handler)) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        return new QueueId(queueType, strLJIIJJI, name, groupType, name2, str, mapLJ);
    }

    private final StackTraceElement findCallerKeyPoint(StackTraceElement[] stackTraceElementArr) {
        MonitorHelper monitorHelper$arm_release;
        for (int length = stackTraceElementArr.length - 1; length >= 0; length--) {
            StackTraceElement stackTraceElement = stackTraceElementArr[length];
            if (a0.LJJIIZI(stackTraceElement.getClassName(), "MessageQueueHook", false) || a0.LJJIIZI(stackTraceElement.getMethodName(), "MessageQueueHook", false) || ((monitorHelper$arm_release = registry.getMonitorHelper$arm_release()) != null && monitorHelper$arm_release.filterCallerKeyPoint(QueueType.MESSAGE_QUEUE, stackTraceElement))) {
                int i = length + 1;
                if (i < stackTraceElementArr.length) {
                    return stackTraceElementArr[i];
                }
                return null;
            }
        }
        return null;
    }

    private final String getGroupType(Handler handler) {
        String strBuildGroupTag;
        MonitorHelper monitorHelper$arm_release = registry.getMonitorHelper$arm_release();
        if (monitorHelper$arm_release == null || (strBuildGroupTag = monitorHelper$arm_release.buildGroupTag(handler)) == null) {
            return "";
        }
        return strBuildGroupTag;
    }

    private final void onMessageDequeue(Handler handler) {
        MetricsAggregator aggregator$arm_release;
        QueueId queueId = handlerToQueueMap.get(Integer.valueOf(handler.getLooper().hashCode()));
        if (queueId != null && (aggregator$arm_release = registry.getAggregator$arm_release(queueId)) != null) {
            aggregator$arm_release.onDequeue("");
        }
    }

    private final synchronized void setLogger(final Handler handler) {
        final Printer printerTryGetLogger = MQCollectorKt.tryGetLogger(handler.getLooper());
        C786410Ut5.LJIIZILJ(handler.getLooper(), new Printer() { // from class: X.08KY
            @Override // android.util.Printer
            public final void println(String str) {
                MQCollector.m142lambda$semisugar$setLogger$lambda0$0(printerTryGetLogger, handler, str);
            }
        });
    }

    public static final boolean shouldTrack(Handler handler) {
        QueueMonitorRegistry queueMonitorRegistry = registry;
        if (!queueMonitorRegistry.enableMonitor()) {
            return false;
        }
        if (Intrinsics.LJFF(handler.getLooper(), Looper.getMainLooper()) && !queueMonitorRegistry.requireConfig$arm_release().monitorConfig.enableUIThreadMonitor) {
            return false;
        }
        int iHashCode = handler.getLooper().hashCode();
        ConcurrentHashMap<Integer, QueueId> concurrentHashMap = handlerToQueueMap;
        if (!concurrentHashMap.containsKey(Integer.valueOf(iHashCode))) {
            MQCollector mQCollector = INSTANCE;
            QueueId queueIdCreateQueueId = mQCollector.createQueueId(handler);
            concurrentHashMap.put(Integer.valueOf(iHashCode), queueIdCreateQueueId);
            QueueMonitorConfig queueMonitorConfig = queueMonitorRegistry.requireConfig$arm_release().monitorConfig;
            ConfigResolver configResolver = ConfigResolver.INSTANCE;
            queueMonitorRegistry.register$arm_release(queueIdCreateQueueId, new MQAggregator(queueIdCreateQueueId, queueMonitorConfig, configResolver.resolve$arm_release(queueIdCreateQueueId, queueMonitorRegistry.requireConfig$arm_release().warningConfig), configResolver.resolve$arm_release(queueIdCreateQueueId, queueMonitorRegistry.requireConfig$arm_release().stackSamplingConfig)));
            mQCollector.setLogger(handler);
            return true;
        }
        return true;
    }

    public static final void onMessage(Handler handler, Message message) {
        INSTANCE.stamp(handler, message);
    }

    public static final void onPostMessage(Handler handler, Runnable runnable) {
        INSTANCE.stamp(handler, runnable);
    }

    private final void stamp(Handler handler, Object obj) {
        MetricsAggregator aggregator$arm_release;
        QueueId queueId = handlerToQueueMap.get(Integer.valueOf(handler.getLooper().hashCode()));
        if (queueId == null || (aggregator$arm_release = registry.getAggregator$arm_release(queueId)) == null) {
            return;
        }
        StackInfo stackInfoMaybeSampleStack = aggregator$arm_release.maybeSampleStack();
        if (obj == null) {
            obj = "";
        }
        aggregator$arm_release.onEnqueue(Integer.toHexString(System.identityHashCode(obj)), stackInfoMaybeSampleStack);
    }

    /* JADX INFO: renamed from: setLogger$lambda-0, reason: not valid java name */
    public static final void m143setLogger$lambda0(Printer printer, Handler handler, String str) {
        if (printer != null) {
            printer.println(str);
        }
        if (u.LJJIIJZLJL(str, ">>>>> ", false)) {
            INSTANCE.onMessageDequeue(handler);
        }
    }
}
