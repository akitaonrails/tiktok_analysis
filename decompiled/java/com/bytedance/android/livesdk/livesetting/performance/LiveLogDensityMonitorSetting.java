package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes32.dex */
@SettingsKey("live_log_density_monitor_setting")
public final class LiveLogDensityMonitorSetting {
    public static final LiveLogDensityMonitorSetting INSTANCE = new LiveLogDensityMonitorSetting();
    public static final LiveLogDensityMonitorModel DEFAULT = new LiveLogDensityMonitorModel(new LiveLogDensityMonitorModelItem(1000, 100, 0.001d, 5), new LiveLogDensityMonitorModelItem(1000, 100, 0.001d, 5));

    public static final class LiveLogDensityMonitorModel {
        public static final TypeAdapter ADAPTER = new LiveLogDensityMonitorSetting_LiveLogDensityMonitorModel_OptTypeAdapter(NormalGson.singleton());

        @C09CT("alog_monitor_config_item")
        public LiveLogDensityMonitorModelItem monitorAlogSampleRate;

        @C09CT("app_log_monitor_config_item")
        public LiveLogDensityMonitorModelItem monitorAppLogSampleRate;

        public LiveLogDensityMonitorModel() {
            this(new LiveLogDensityMonitorModelItem(1000L, 100, 0.001d, 5), new LiveLogDensityMonitorModelItem(1000L, 100, 0.001d, 5));
        }

        public final LiveLogDensityMonitorModelItem getMonitorAlogSampleRate() {
            return this.monitorAlogSampleRate;
        }

        public final LiveLogDensityMonitorModelItem getMonitorAppLogSampleRate() {
            return this.monitorAppLogSampleRate;
        }

        public final void setMonitorAlogSampleRate(LiveLogDensityMonitorModelItem liveLogDensityMonitorModelItem) {
            this.monitorAlogSampleRate = liveLogDensityMonitorModelItem;
        }

        public final void setMonitorAppLogSampleRate(LiveLogDensityMonitorModelItem liveLogDensityMonitorModelItem) {
            this.monitorAppLogSampleRate = liveLogDensityMonitorModelItem;
        }

        public LiveLogDensityMonitorModel(LiveLogDensityMonitorModelItem liveLogDensityMonitorModelItem, LiveLogDensityMonitorModelItem liveLogDensityMonitorModelItem2) {
            this.monitorAppLogSampleRate = liveLogDensityMonitorModelItem;
            this.monitorAlogSampleRate = liveLogDensityMonitorModelItem2;
        }
    }

    public static final class LiveLogDensityMonitorModelItem {
        public static final TypeAdapter ADAPTER;

        @C09CT("monitor_interval_ms")
        public long monitorIntervalMs;

        @C09CT("monitor_queue_len")
        public int monitorQueueLen;

        @C09CT("monitor_report_top_n")
        public int monitorReportTopN;

        @C09CT("monitor_sample_rate")
        public double monitorSampleRate;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveLogDensityMonitorSetting_LiveLogDensityMonitorModelItem_OptTypeAdapter();
        }

        public LiveLogDensityMonitorModelItem() {
            this(1000L, 100, 0.001d, 5);
        }

        public final long getMonitorIntervalMs() {
            return this.monitorIntervalMs;
        }

        public final int getMonitorQueueLen() {
            return this.monitorQueueLen;
        }

        public final int getMonitorReportTopN() {
            return this.monitorReportTopN;
        }

        public final double getMonitorSampleRate() {
            return this.monitorSampleRate;
        }

        public final void setMonitorIntervalMs(long j) {
            this.monitorIntervalMs = j;
        }

        public final void setMonitorQueueLen(int i) {
            this.monitorQueueLen = i;
        }

        public final void setMonitorReportTopN(int i) {
            this.monitorReportTopN = i;
        }

        public final void setMonitorSampleRate(double d) {
            this.monitorSampleRate = d;
        }

        public LiveLogDensityMonitorModelItem(long j, int i, double d, int i2) {
            this.monitorIntervalMs = j;
            this.monitorQueueLen = i;
            this.monitorSampleRate = d;
            this.monitorReportTopN = i2;
        }
    }

    private final LiveLogDensityMonitorModel getValue() {
        LiveLogDensityMonitorModel liveLogDensityMonitorModel = (LiveLogDensityMonitorModel) SettingsManager.INSTANCE.getValueSafely(LiveLogDensityMonitorSetting.class);
        return liveLogDensityMonitorModel == null ? DEFAULT : liveLogDensityMonitorModel;
    }

    public final LiveLogDensityMonitorModelItem getAlogSampleConfig() {
        return getValue().getMonitorAlogSampleRate();
    }

    public final LiveLogDensityMonitorModelItem getAppLogSampleConfig() {
        return getValue().getMonitorAppLogSampleRate();
    }
}
