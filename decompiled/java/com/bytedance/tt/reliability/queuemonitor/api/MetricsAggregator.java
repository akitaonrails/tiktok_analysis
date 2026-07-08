package com.bytedance.tt.reliability.queuemonitor.api;

import com.bytedance.tt.reliability.queuemonitor.model.QueueEvent;
import com.bytedance.tt.reliability.queuemonitor.model.QueueMetrics;
import com.bytedance.tt.reliability.queuemonitor.model.QueueSnapshot;
import com.bytedance.tt.reliability.queuemonitor.model.StackInfo;

/* JADX INFO: loaded from: classes4.dex */
public interface MetricsAggregator {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    public static final class DefaultImpls {
        public static void onFinish(MetricsAggregator metricsAggregator, String str, long j, long j2, long j3) {
        }

        public static void onStart(MetricsAggregator metricsAggregator, String str, long j, long j2) {
        }
    }

    QueueMetrics buildPeriodicSnapshot(long j, double d);

    QueueEvent evaluateWarnEvent(long j, double d);

    StackInfo maybeSampleStack();

    void onDequeue(String str);

    void onEnqueue(String str, StackInfo stackInfo);

    void onFinish(String str, long j, long j2, long j3);

    void onStart(String str, long j, long j2);

    QueueSnapshot snapshot();
}
