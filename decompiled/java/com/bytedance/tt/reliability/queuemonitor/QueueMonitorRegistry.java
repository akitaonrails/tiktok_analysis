package com.bytedance.tt.reliability.queuemonitor;

import X.C13BV;
import X.C13LP;
import X.C15438062q;
import com.bytedance.tt.reliability.queuemonitor.api.MetricsAggregator;
import com.bytedance.tt.reliability.queuemonitor.api.MonitorHelper;
import com.bytedance.tt.reliability.queuemonitor.api.Reporter;
import com.bytedance.tt.reliability.queuemonitor.impl.SharedReporter;
import com.bytedance.tt.reliability.queuemonitor.model.QueueId;
import com.bytedance.tt.reliability.queuemonitor.model.QueueMonitorBaseConfig;
import com.bytedance.tt.reliability.queuemonitor.model.QueueMonitorConfig;
import com.bytedance.tt.reliability.queuemonitor.model.QueueSnapshot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class QueueMonitorRegistry {
    public static final QueueMonitorRegistry INSTANCE = new QueueMonitorRegistry();
    public static final ConcurrentHashMap<QueueId, MetricsAggregator> aggregatorMap = new ConcurrentHashMap<>();
    public static QueueMonitorBaseConfig baseConfig;
    public static QueueMonitorConfig config;
    public static volatile boolean enable;
    public static MonitorHelper monitorLogHelper;
    public static SharedReporter sharedReporter;

    public final List<MetricsAggregator> getAllAggregators$arm_release() {
        return C13LP.LLIIII(aggregatorMap.values());
    }

    public final QueueMonitorBaseConfig requireConfig$arm_release() {
        QueueMonitorBaseConfig queueMonitorBaseConfig = baseConfig;
        if (queueMonitorBaseConfig == null) {
            return null;
        }
        return queueMonitorBaseConfig;
    }

    public final List<QueueSnapshot> snapshotAll() {
        if (!enable) {
            return C13BV.INSTANCE;
        }
        Collection<MetricsAggregator> collectionValues = aggregatorMap.values();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayList.add(((MetricsAggregator) it2.next()).snapshot());
        }
        return arrayList;
    }

    public final boolean enableMonitor() {
        return enable;
    }

    public final MonitorHelper getMonitorHelper$arm_release() {
        return monitorLogHelper;
    }

    public final MetricsAggregator getAggregator$arm_release(QueueId queueId) {
        return aggregatorMap.get(queueId);
    }

    public final void register$arm_release(QueueId queueId, MetricsAggregator metricsAggregator) {
        aggregatorMap.put(queueId, metricsAggregator);
    }

    public final void init(boolean z, QueueMonitorBaseConfig queueMonitorBaseConfig, Reporter reporter, MonitorHelper monitorHelper) {
        baseConfig = queueMonitorBaseConfig;
        config = queueMonitorBaseConfig.monitorConfig;
        monitorLogHelper = monitorHelper;
        SharedReporter sharedReporter2 = new SharedReporter(reporter, this);
        sharedReporter2.start();
        sharedReporter = sharedReporter2;
        enable = z;
    }
}
