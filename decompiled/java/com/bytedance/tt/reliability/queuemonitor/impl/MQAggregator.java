package com.bytedance.tt.reliability.queuemonitor.impl;

import X.C2097608Jq;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.queuemonitor.api.MetricsAggregator;
import com.bytedance.tt.reliability.queuemonitor.model.QueueEvent;
import com.bytedance.tt.reliability.queuemonitor.model.QueueId;
import com.bytedance.tt.reliability.queuemonitor.model.QueueMetrics;
import com.bytedance.tt.reliability.queuemonitor.model.QueueMonitorConfig;
import com.bytedance.tt.reliability.queuemonitor.model.QueueSnapshot;
import com.bytedance.tt.reliability.queuemonitor.model.QueueType;
import com.bytedance.tt.reliability.queuemonitor.model.StackInfo;
import com.bytedance.tt.reliability.queuemonitor.model.StackSamplingConfig;
import com.bytedance.tt.reliability.queuemonitor.model.WarnThresholdConfig;
import com.bytedance.tt.reliability.queuemonitor.util.StackUtil;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public final class MQAggregator implements MetricsAggregator {
    public final QueueMonitorConfig baseConfig;
    public QueueMetrics lastMetrics;
    public long lastMetricsTime;
    public final QueueId queueId;
    public final StackSamplingConfig stackConfig;
    public final WarnThresholdConfig warnConfig;
    public final AtomicInteger enqueueCount = new AtomicInteger(0);
    public final AtomicInteger dequeueCount = new AtomicInteger(0);
    public final AtomicInteger periodicEnqueueCount = new AtomicInteger(0);
    public final AtomicInteger periodicDequeueCount = new AtomicInteger(0);
    public final AtomicInteger shortPeriodicEnqueueCount = new AtomicInteger(0);
    public final AtomicInteger shortPeriodicDequeueCount = new AtomicInteger(0);
    public final LruStackInfoCache stackCountMap = new LruStackInfoCache();
    public final ReentrantLock stackCountMapLock = new ReentrantLock();

    @Override // com.bytedance.tt.reliability.queuemonitor.api.MetricsAggregator
    public StackInfo maybeSampleStack() {
        StackSamplingConfig stackSamplingConfig = this.stackConfig;
        if (stackSamplingConfig == null || stackSamplingConfig.samplingRate <= 0.0d || Math.random() >= stackSamplingConfig.samplingRate) {
            return null;
        }
        return StackUtil.INSTANCE.capture$arm_release(stackSamplingConfig.stackFrameFilters);
    }

    @Override // com.bytedance.tt.reliability.queuemonitor.api.MetricsAggregator
    public QueueSnapshot snapshot() {
        int i = this.enqueueCount.get() - this.dequeueCount.get();
        QueueId queueId = this.queueId;
        return new QueueSnapshot(queueId.id, queueId.name, queueId.type, queueId.groupType, queueId.createStack, Math.max(0, i));
    }

    public final QueueMonitorConfig getBaseConfig() {
        return this.baseConfig;
    }

    public final QueueId getQueueId() {
        return this.queueId;
    }

    public final StackSamplingConfig getStackConfig() {
        return this.stackConfig;
    }

    public final WarnThresholdConfig getWarnConfig() {
        return this.warnConfig;
    }

    @Override // com.bytedance.tt.reliability.queuemonitor.api.MetricsAggregator
    public void onDequeue(String str) {
        this.dequeueCount.incrementAndGet();
        this.periodicDequeueCount.incrementAndGet();
        this.shortPeriodicDequeueCount.incrementAndGet();
    }

    @Override // com.bytedance.tt.reliability.queuemonitor.api.MetricsAggregator
    public QueueMetrics buildPeriodicSnapshot(long j, double d) {
        return buildPeriodicSnapshotCore(j, d, this.periodicEnqueueCount.getAndSet(0), this.periodicDequeueCount.getAndSet(0));
    }

    @Override // com.bytedance.tt.reliability.queuemonitor.api.MetricsAggregator
    public QueueEvent evaluateWarnEvent(long j, double d) {
        int i;
        double d2;
        Long lValueOf;
        String str;
        Double dValueOf;
        if (this.warnConfig == null) {
            return null;
        }
        if (this.periodicEnqueueCount.get() == 0 && this.periodicDequeueCount.get() == 0) {
            return null;
        }
        double d3 = ((double) LSPassThroughRecordSizeConfig.DEFAULT) * d;
        QueueMetrics queueMetricsBuildPeriodicSnapshotCore = this.lastMetrics;
        if (queueMetricsBuildPeriodicSnapshotCore == null || j - this.lastMetricsTime >= d3) {
            queueMetricsBuildPeriodicSnapshotCore = buildPeriodicSnapshotCore(System.currentTimeMillis(), d, this.shortPeriodicEnqueueCount.getAndSet(0), this.shortPeriodicDequeueCount.getAndSet(0));
            if (queueMetricsBuildPeriodicSnapshotCore == null) {
                return null;
            }
        }
        WarnThresholdConfig warnThresholdConfig = this.warnConfig;
        int i2 = warnThresholdConfig.lengthWarnSlope;
        if (i2 > 0 && queueMetricsBuildPeriodicSnapshotCore.queueLength > i2) {
            i = 1;
        } else {
            i = 0;
        }
        double d4 = warnThresholdConfig.trafficWarn;
        double d5 = 0.0d;
        if (d4 > 0.0d && queueMetricsBuildPeriodicSnapshotCore.enqueueRate / queueMetricsBuildPeriodicSnapshotCore.dequeueRate > d4) {
            i |= 2;
        }
        int i3 = warnThresholdConfig.enqueueRateWarn;
        if (i3 > 0 && queueMetricsBuildPeriodicSnapshotCore.enqueueRate > i3) {
            i |= 4;
        }
        ReentrantLock reentrantLock = this.stackCountMapLock;
        reentrantLock.lock();
        try {
            Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(this.stackCountMap);
            reentrantLock.unlock();
            StackInfo stackInfo = null;
            int i4 = 0;
            int i5 = 0;
            for (Map.Entry entry : mapLJIIZILJ.entrySet()) {
                StackInfo stackInfo2 = (StackInfo) entry.getKey();
                int i6 = ((AtomicInteger) entry.getValue()).get();
                i5 += i6;
                if (i6 > i4) {
                    i4 = i6;
                    stackInfo = stackInfo2;
                }
            }
            if (i4 > 0) {
                double d6 = i4;
                if (i5 < 1) {
                    i5 = 1;
                }
                d2 = d6 / ((double) i5);
            } else {
                d2 = 0.0d;
            }
            double d7 = this.warnConfig.contribWarn;
            if (d7 > 0.0d && d2 > d7) {
                i |= 8;
            }
            if (i == 0) {
                return null;
            }
            QueueId queueId = this.queueId;
            String str2 = queueId.name;
            QueueType queueType = queueId.type;
            String str3 = queueId.groupType;
            String str4 = queueId.callerThreadName;
            String str5 = queueId.createStack;
            String strValueOf = String.valueOf(i);
            long j2 = queueMetricsBuildPeriodicSnapshotCore.queueLength;
            double d8 = queueMetricsBuildPeriodicSnapshotCore.dequeueRate;
            if (d8 > 0.0d) {
                d5 = queueMetricsBuildPeriodicSnapshotCore.enqueueRate / d8;
            }
            double d9 = queueMetricsBuildPeriodicSnapshotCore.enqueueRate;
            if (stackInfo == null) {
                lValueOf = null;
                str = null;
            } else {
                lValueOf = Long.valueOf(stackInfo.stackId);
                str = stackInfo.stackTrace;
            }
            StackSamplingConfig stackSamplingConfig = this.stackConfig;
            if (stackSamplingConfig == null) {
                dValueOf = null;
            } else {
                dValueOf = Double.valueOf(stackSamplingConfig.samplingRate);
            }
            return new QueueEvent(str2, str2, queueType, str3, str4, str5, true, strValueOf, j2, d5, d9, d8, lValueOf, str, dValueOf, Double.valueOf(d2), this.baseConfig.id);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.bytedance.tt.reliability.queuemonitor.api.MetricsAggregator
    public void onEnqueue(String str, StackInfo stackInfo) {
        this.enqueueCount.incrementAndGet();
        this.periodicEnqueueCount.incrementAndGet();
        this.shortPeriodicEnqueueCount.incrementAndGet();
        if (stackInfo != null) {
            ReentrantLock reentrantLock = this.stackCountMapLock;
            reentrantLock.lock();
            try {
                LruStackInfoCache lruStackInfoCache = this.stackCountMap;
                AtomicInteger atomicInteger = lruStackInfoCache.get((Object) stackInfo);
                if (atomicInteger == null) {
                    atomicInteger = new AtomicInteger(0);
                    lruStackInfoCache.put(stackInfo, atomicInteger);
                }
                atomicInteger.incrementAndGet();
                reentrantLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    @Override // com.bytedance.tt.reliability.queuemonitor.api.MetricsAggregator
    public void onStart(String str, long j, long j2) {
        MetricsAggregator.DefaultImpls.onStart(this, str, j, j2);
    }

    public MQAggregator(QueueId queueId, QueueMonitorConfig queueMonitorConfig, WarnThresholdConfig warnThresholdConfig, StackSamplingConfig stackSamplingConfig) {
        this.queueId = queueId;
        this.baseConfig = queueMonitorConfig;
        this.warnConfig = warnThresholdConfig;
        this.stackConfig = stackSamplingConfig;
    }

    private final QueueMetrics buildPeriodicSnapshotCore(long j, double d, int i, int i2) {
        int iMax = Math.max(0, this.enqueueCount.get() - this.dequeueCount.get());
        QueueId queueId = this.queueId;
        QueueMetrics queueMetrics = new QueueMetrics(queueId.id, queueId.name, queueId.type, queueId.groupType, queueId.callerThreadName, queueId.createStack, ((double) i) / d, ((double) i2) / d, iMax, d, this.baseConfig.id);
        this.lastMetrics = queueMetrics;
        this.lastMetricsTime = j;
        return queueMetrics;
    }

    @Override // com.bytedance.tt.reliability.queuemonitor.api.MetricsAggregator
    public void onFinish(String str, long j, long j2, long j3) {
        MetricsAggregator.DefaultImpls.onFinish(this, str, j, j2, j3);
    }
}
