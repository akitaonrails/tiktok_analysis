package com.bytedance.tt.reliability.queuemonitor.impl;

import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.tt.reliability.queuemonitor.QueueMonitorRegistry;
import com.bytedance.tt.reliability.queuemonitor.api.MetricsAggregator;
import com.bytedance.tt.reliability.queuemonitor.api.MonitorHelper;
import com.bytedance.tt.reliability.queuemonitor.model.QueueId;
import com.bytedance.tt.reliability.queuemonitor.model.QueueMonitorConfig;
import com.bytedance.tt.reliability.queuemonitor.model.QueueType;
import com.bytedance.tt.reliability.queuemonitor.util.ConfigResolver;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ThreadPoolCollector {
    public static final ThreadPoolCollector INSTANCE = new ThreadPoolCollector();
    public static final QueueMonitorRegistry registry = QueueMonitorRegistry.INSTANCE;
    public static final ConcurrentHashMap<Integer, ThreadPoolMeta> poolCache = new ConcurrentHashMap<>();

    public static final boolean enableMonitor() {
        return registry.enableMonitor();
    }

    public static final class ThreadPoolMeta {
        public WeakReference<ThreadPoolExecutor> executorRef;
        public boolean isShutdown;
        public boolean isTerminated;
        public final QueueId queueId;

        public final QueueId component1$arm_release() {
            return this.queueId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ThreadPoolMeta)) {
                return false;
            }
            ThreadPoolMeta threadPoolMeta = (ThreadPoolMeta) obj;
            return Intrinsics.LJFF(this.queueId, threadPoolMeta.queueId) && Intrinsics.LJFF(this.executorRef, threadPoolMeta.executorRef) && this.isShutdown == threadPoolMeta.isShutdown && this.isTerminated == threadPoolMeta.isTerminated;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        public int hashCode() {
            int iHashCode = ((this.queueId.hashCode() * 31) + this.executorRef.hashCode()) * 31;
            boolean z = this.isShutdown;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return ((iHashCode + r0) * 31) + (this.isTerminated ? 1 : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ThreadPoolMeta(queueId=");
            sbLIZ.append(this.queueId);
            sbLIZ.append(", executorRef=");
            sbLIZ.append(this.executorRef);
            sbLIZ.append(", isShutdown=");
            sbLIZ.append(this.isShutdown);
            sbLIZ.append(", isTerminated=");
            sbLIZ.append(this.isTerminated);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final QueueId getQueueId$arm_release() {
            return this.queueId;
        }

        public final boolean isShutdown() {
            return this.isShutdown;
        }

        public final boolean isTerminated() {
            return this.isTerminated;
        }

        public final void setExecutorRef(WeakReference<ThreadPoolExecutor> weakReference) {
            this.executorRef = weakReference;
        }

        public final void setShutdown(boolean z) {
            this.isShutdown = z;
        }

        public final void setTerminated(boolean z) {
            this.isTerminated = z;
        }

        public ThreadPoolMeta(QueueId queueId, WeakReference<ThreadPoolExecutor> weakReference, boolean z, boolean z2) {
            this.queueId = queueId;
            this.executorRef = weakReference;
            this.isShutdown = z;
            this.isTerminated = z2;
        }
    }

    private final boolean checkExecutorIsInvalid(ThreadPoolExecutor threadPoolExecutor) {
        if (!threadPoolExecutor.isShutdown() && !threadPoolExecutor.isTerminated()) {
            return false;
        }
        return true;
    }

    private final QueueId createQueueId(ThreadPoolExecutor threadPoolExecutor) {
        Map<String, Object> mapLJ;
        StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
        QueueType queueType = QueueType.THREAD_POOL;
        String strValueOf = String.valueOf(threadPoolExecutor.hashCode());
        String name = threadPoolExecutor.getClass().getName();
        String executorGroupType = getExecutorGroupType(threadPoolExecutor);
        String name2 = C786410Ut5.u3().getName();
        StackTraceElement stackTraceElementFindCallerKeyPoint = findCallerKeyPoint(stackTrace);
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
        MonitorHelper monitorHelper$arm_release = registry.getMonitorHelper$arm_release();
        if (monitorHelper$arm_release == null || (mapLJ = monitorHelper$arm_release.appendCommonParams(threadPoolExecutor)) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        return new QueueId(queueType, strValueOf, name, executorGroupType, name2, str, mapLJ);
    }

    private final ThreadPoolMeta ensureMeta(ThreadPoolExecutor threadPoolExecutor) {
        ThreadPoolAggregator threadPoolAggregator;
        int iHashCode = threadPoolExecutor.hashCode();
        ConcurrentHashMap<Integer, ThreadPoolMeta> concurrentHashMap = poolCache;
        ThreadPoolMeta threadPoolMeta = concurrentHashMap.get(Integer.valueOf(iHashCode));
        if (threadPoolMeta != null) {
            threadPoolMeta.setShutdown(threadPoolExecutor.isShutdown());
            threadPoolMeta.setTerminated(threadPoolExecutor.isTerminated());
            if (threadPoolMeta.executorRef.get() == null) {
                threadPoolMeta.setExecutorRef(new WeakReference<>(threadPoolExecutor));
            }
            MetricsAggregator aggregator$arm_release = registry.getAggregator$arm_release(threadPoolMeta.getQueueId$arm_release());
            if ((aggregator$arm_release instanceof ThreadPoolAggregator) && (threadPoolAggregator = (ThreadPoolAggregator) aggregator$arm_release) != null) {
                threadPoolAggregator.rebindExecutor(threadPoolExecutor);
            }
            return threadPoolMeta;
        }
        QueueId queueIdCreateQueueId = createQueueId(threadPoolExecutor);
        QueueMonitorRegistry queueMonitorRegistry = registry;
        QueueMonitorConfig queueMonitorConfig = queueMonitorRegistry.requireConfig$arm_release().monitorConfig;
        ConfigResolver configResolver = ConfigResolver.INSTANCE;
        queueMonitorRegistry.register$arm_release(queueIdCreateQueueId, new ThreadPoolAggregator(queueIdCreateQueueId, queueMonitorConfig, configResolver.resolve$arm_release(queueIdCreateQueueId, queueMonitorRegistry.requireConfig$arm_release().warningConfig), configResolver.resolve$arm_release(queueIdCreateQueueId, queueMonitorRegistry.requireConfig$arm_release().stackSamplingConfig), new WeakReference(threadPoolExecutor)));
        ThreadPoolMeta threadPoolMeta2 = new ThreadPoolMeta(queueIdCreateQueueId, new WeakReference(threadPoolExecutor), threadPoolExecutor.isShutdown(), threadPoolExecutor.isTerminated());
        concurrentHashMap.put(Integer.valueOf(iHashCode), threadPoolMeta2);
        return threadPoolMeta2;
    }

    private final StackTraceElement findCallerKeyPoint(StackTraceElement[] stackTraceElementArr) {
        for (int length = stackTraceElementArr.length - 1; length >= 0; length--) {
            StackTraceElement stackTraceElement = stackTraceElementArr[length];
            MonitorHelper monitorHelper$arm_release = registry.getMonitorHelper$arm_release();
            if (monitorHelper$arm_release != null && monitorHelper$arm_release.filterCallerKeyPoint(QueueType.THREAD_POOL, stackTraceElement)) {
                int i = length + 1;
                if (i < stackTraceElementArr.length) {
                    return stackTraceElementArr[i];
                }
                return null;
            }
        }
        return null;
    }

    private final String getExecutorGroupType(ThreadPoolExecutor threadPoolExecutor) {
        String strBuildGroupTag;
        MonitorHelper monitorHelper$arm_release = registry.getMonitorHelper$arm_release();
        if (monitorHelper$arm_release == null || (strBuildGroupTag = monitorHelper$arm_release.buildGroupTag(threadPoolExecutor)) == null) {
            return "";
        }
        return strBuildGroupTag;
    }

    private final ThreadPoolMeta updateMetaOrGetNull(ThreadPoolExecutor threadPoolExecutor) {
        ThreadPoolAggregator threadPoolAggregator;
        ThreadPoolMeta threadPoolMeta = poolCache.get(Integer.valueOf(threadPoolExecutor.hashCode()));
        if (threadPoolMeta != null) {
            threadPoolMeta.setShutdown(threadPoolExecutor.isShutdown());
            threadPoolMeta.setTerminated(threadPoolExecutor.isTerminated());
            if (threadPoolMeta.executorRef.get() == null) {
                threadPoolMeta.setExecutorRef(new WeakReference<>(threadPoolExecutor));
            }
            MetricsAggregator aggregator$arm_release = registry.getAggregator$arm_release(threadPoolMeta.getQueueId$arm_release());
            if ((aggregator$arm_release instanceof ThreadPoolAggregator) && (threadPoolAggregator = (ThreadPoolAggregator) aggregator$arm_release) != null) {
                threadPoolAggregator.rebindExecutor(threadPoolExecutor);
            }
        }
        return threadPoolMeta;
    }

    public static final void onBeforeTaskRun(ThreadPoolExecutor threadPoolExecutor, Object obj) {
        ThreadPoolCollector threadPoolCollector = INSTANCE;
        ThreadPoolMeta threadPoolMetaUpdateMetaOrGetNull = threadPoolCollector.updateMetaOrGetNull(threadPoolExecutor);
        if (threadPoolMetaUpdateMetaOrGetNull == null || threadPoolCollector.checkExecutorIsInvalid(threadPoolExecutor)) {
            return;
        }
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        MetricsAggregator aggregator$arm_release = registry.getAggregator$arm_release(threadPoolMetaUpdateMetaOrGetNull.getQueueId$arm_release());
        if (aggregator$arm_release != null) {
            aggregator$arm_release.onDequeue(hexString);
        }
    }

    public static final void onTaskSubmit(ThreadPoolExecutor threadPoolExecutor, Object obj) {
        ThreadPoolAggregator threadPoolAggregator;
        ThreadPoolCollector threadPoolCollector = INSTANCE;
        ThreadPoolMeta threadPoolMetaEnsureMeta = threadPoolCollector.ensureMeta(threadPoolExecutor);
        if (threadPoolMetaEnsureMeta == null || threadPoolCollector.checkExecutorIsInvalid(threadPoolExecutor)) {
            return;
        }
        MetricsAggregator aggregator$arm_release = registry.getAggregator$arm_release(threadPoolMetaEnsureMeta.getQueueId$arm_release());
        if ((aggregator$arm_release instanceof ThreadPoolAggregator) && (threadPoolAggregator = (ThreadPoolAggregator) aggregator$arm_release) != null) {
            threadPoolAggregator.onEnqueue(Integer.toHexString(System.identityHashCode(obj)), threadPoolAggregator.maybeSampleStack());
        }
    }

    public static final void onRejected(ThreadPoolExecutor threadPoolExecutor, Object obj, String str) {
        ThreadPoolAggregator threadPoolAggregator;
        ThreadPoolMeta threadPoolMetaUpdateMetaOrGetNull = INSTANCE.updateMetaOrGetNull(threadPoolExecutor);
        if (threadPoolMetaUpdateMetaOrGetNull == null) {
            return;
        }
        MetricsAggregator aggregator$arm_release = registry.getAggregator$arm_release(threadPoolMetaUpdateMetaOrGetNull.getQueueId$arm_release());
        if ((aggregator$arm_release instanceof ThreadPoolAggregator) && (threadPoolAggregator = (ThreadPoolAggregator) aggregator$arm_release) != null) {
            threadPoolAggregator.onRejected(str);
        }
    }
}
