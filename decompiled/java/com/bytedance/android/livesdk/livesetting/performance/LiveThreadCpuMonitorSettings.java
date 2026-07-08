package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_thread_cpu_monitor_settings")
public final class LiveThreadCpuMonitorSettings {
    public static final LiveThreadCpuMonitorSettings INSTANCE = new LiveThreadCpuMonitorSettings();
    public static final Option DEFAULT = new Option(false, 2, 0.25d, 3000, 0.8d, 20, 1000);

    public final Option getValue() {
        Option option = (Option) SettingsManager.INSTANCE.getValueSafely(LiveThreadCpuMonitorSettings.class);
        return option == null ? DEFAULT : option;
    }

    public final boolean isEnable() {
        return getValue().enable;
    }

    public static final class Option {
        public static final TypeAdapter ADAPTER = new LiveThreadCpuMonitorSettings_Option_OptTypeAdapter(NormalGson.singleton());

        @C09CT("diff_dump_ratio")
        public double diffDumpRatio;

        @C09CT("dump_cpu_time_ms")
        public long dumpCpuTimeMs;

        @C09CT("dump_interval_ms")
        public int dumpIntervalMs;

        @C09CT("feature_enable")
        public boolean enable;

        @C09CT("exception_ratio")
        public double exceptionRatio;

        @C09CT("measure_cpu_time_ms")
        public long measureCpuTimeMs;

        @C09CT("pre_measure_count")
        public int preMeasureCount;

        public Option() {
            this(false, 2, 0.25d, 3000L, 0.8d, 20, 1000L);
        }

        public Option(boolean z, int i, double d, long j, double d2, int i2, long j2) {
            this.enable = z;
            this.preMeasureCount = i;
            this.exceptionRatio = d;
            this.measureCpuTimeMs = j;
            this.diffDumpRatio = d2;
            this.dumpIntervalMs = i2;
            this.dumpCpuTimeMs = j2;
        }
    }
}
