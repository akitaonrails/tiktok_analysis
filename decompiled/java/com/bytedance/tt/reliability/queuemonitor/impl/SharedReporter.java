package com.bytedance.tt.reliability.queuemonitor.impl;

import X.C1C7U;
import X.C786410Ut5;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.queuemonitor.QueueMonitorRegistry;
import com.bytedance.tt.reliability.queuemonitor.api.MetricsAggregator;
import com.bytedance.tt.reliability.queuemonitor.api.Reporter;
import com.bytedance.tt.reliability.queuemonitor.model.QueueEvent;
import com.bytedance.tt.reliability.queuemonitor.model.QueueMetricsKt;
import com.bytedance.tt.reliability.queuemonitor.model.QueueMonitorBaseConfig;
import com.bytedance.tt.reliability.queuemonitor.model.QueueMonitorConfig;
import com.bytedance.tt.reliability.queuemonitor.model.WarnConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class SharedReporter {
    public static final Companion Companion = new Companion();
    public QueueMonitorConfig config;
    public Handler handler;
    public final QueueMonitorRegistry registry;
    public long reportPeriodMs;
    public final Reporter sink;
    public final AtomicBoolean started = new AtomicBoolean(false);
    public final HandlerThread thread = new HandlerThread("QueueMonitorReporter");
    public long warnPeriodMs;
    public WarnConfig warningConfig;

    public static final class Companion {
    }

    private final void reportEvents() {
        QueueMonitorConfig queueMonitorConfig = this.config;
        if (queueMonitorConfig == null) {
            queueMonitorConfig = null;
        }
        if (queueMonitorConfig.enableWarn) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            QueueMonitorConfig queueMonitorConfig2 = this.config;
            double d = (queueMonitorConfig2 != null ? queueMonitorConfig2 : null).warnPeriodSec;
            if (d < 1.0d) {
                d = 1.0d;
            }
            Iterator<MetricsAggregator> it2 = this.registry.getAllAggregators$arm_release().iterator();
            while (it2.hasNext()) {
                try {
                    QueueEvent queueEventEvaluateWarnEvent = it2.next().evaluateWarnEvent(jCurrentTimeMillis, d);
                    if (queueEventEvaluateWarnEvent != null) {
                        this.sink.reportEvent("queue_monitor_blocking_event", QueueMetricsKt.toJsonObject(queueEventEvaluateWarnEvent));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    System.err.println(Intrinsics.LJIIJJI(Log.getStackTraceString(th), "QueueMonitor reportEvent error, "));
                }
            }
        }
    }

    private final void scheduleNextMetrics() {
        Handler handler;
        long j = this.reportPeriodMs;
        if (j <= 0 || (handler = this.handler) == null) {
            return;
        }
        C786410Ut5.LJLJJI(101, j, handler);
    }

    private final void scheduleWarnEvent() {
        Handler handler;
        long j = this.warnPeriodMs;
        if (j <= 0 || (handler = this.handler) == null) {
            return;
        }
        C786410Ut5.LJLJJI(100, j, handler);
    }

    public final void start() {
        if (this.started.get()) {
            return;
        }
        this.thread.start();
        this.handler = new BPEAHandler(C786410Ut5.W2(this.thread)) { // from class: com.bytedance.tt.reliability.queuemonitor.impl.SharedReporter.start.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                C1C7U.LIZ("SharedReporter@a829.start$1");
                super.handleMessage(message);
                SharedReporter.this.onMessage(message);
                C1C7U.LIZIZ("SharedReporter@a829.start$1");
            }
        };
        QueueMonitorBaseConfig queueMonitorBaseConfigRequireConfig$arm_release = this.registry.requireConfig$arm_release();
        QueueMonitorConfig queueMonitorConfig = queueMonitorBaseConfigRequireConfig$arm_release.monitorConfig;
        this.config = queueMonitorConfig;
        double d = (queueMonitorConfig == null ? null : queueMonitorConfig).reportPeriodSec;
        double d2 = LSPassThroughRecordSizeConfig.DEFAULT;
        this.reportPeriodMs = (long) (d * d2);
        if (queueMonitorConfig == null) {
            queueMonitorConfig = null;
        }
        this.warnPeriodMs = (long) (queueMonitorConfig.warnPeriodSec * d2);
        this.warningConfig = queueMonitorBaseConfigRequireConfig$arm_release.warningConfig;
        this.started.set(true);
        scheduleNextMetrics();
        QueueMonitorConfig queueMonitorConfig2 = this.config;
        if (!(queueMonitorConfig2 != null ? queueMonitorConfig2 : null).enableWarn || this.warningConfig == null) {
            return;
        }
        scheduleWarnEvent();
    }

    public final void stop() {
        if (this.started.get()) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.thread.quitSafely();
            this.started.set(false);
        }
    }

    private final void reportMetrics() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        QueueMonitorConfig queueMonitorConfig = this.config;
        if (queueMonitorConfig == null) {
            queueMonitorConfig = null;
        }
        double d = queueMonitorConfig.reportPeriodSec;
        Iterator<MetricsAggregator> it2 = this.registry.getAllAggregators$arm_release().iterator();
        while (it2.hasNext()) {
            try {
                this.sink.reportEvent("queue_monitor_metrics_event", QueueMetricsKt.toJsonObject(it2.next().buildPeriodicSnapshot(jCurrentTimeMillis, d)));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                System.err.println(Intrinsics.LJIIJJI(Log.getStackTraceString(th), "QueueMonitor reportMetrics error, "));
            }
        }
    }

    public final void onMessage(Message message) {
        int i = message.what;
        try {
            if (i != 100) {
                if (i == 101) {
                    try {
                        try {
                            reportMetrics();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            System.err.println(Intrinsics.LJIIJJI(Log.getStackTraceString(e), "QueueMonitor reportMetrics error, "));
                        }
                        scheduleNextMetrics();
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        scheduleNextMetrics();
                        throw th;
                    }
                }
                return;
            }
            try {
                reportEvents();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                System.err.println(Intrinsics.LJIIJJI(Log.getStackTraceString(e2), "QueueMonitor reportEvent error, "));
            }
            scheduleWarnEvent();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            scheduleWarnEvent();
            throw th2;
        }
    }

    public SharedReporter(Reporter reporter, QueueMonitorRegistry queueMonitorRegistry) {
        this.sink = reporter;
        this.registry = queueMonitorRegistry;
    }
}
