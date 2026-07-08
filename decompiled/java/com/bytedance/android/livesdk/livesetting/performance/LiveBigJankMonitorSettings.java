package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_big_jank_monitor_settings")
public final class LiveBigJankMonitorSettings {
    public static final LiveBigJankMonitorSettings INSTANCE = new LiveBigJankMonitorSettings();
    public static final Option DEFAULT = new Option(false, 300, 30, 30000, 5);

    public final Option getValue() {
        Option option = (Option) SettingsManager.INSTANCE.getValueSafely(LiveBigJankMonitorSettings.class);
        return option == null ? DEFAULT : option;
    }

    public final boolean isEnable() {
        return getValue().enable;
    }

    public static final class Option {
        public static final TypeAdapter ADAPTER = new LiveBigJankMonitorSettings_Option_OptTypeAdapter(NormalGson.singleton());

        @C09CT("dump_interval")
        public long dumpInterval;

        @C09CT("feature_enable")
        public boolean enable;

        @C09CT("measure_time")
        public long measureTime;

        @C09CT("report_pool_size")
        public int reportPoolSize;

        @C09CT("sample_interval")
        public long sampleInterval;

        public Option() {
            this(false, 300L, 30L, 30000L, 5);
        }

        public Option(boolean z, long j, long j2, long j3, int i) {
            this.enable = z;
            this.measureTime = j;
            this.dumpInterval = j2;
            this.sampleInterval = j3;
            this.reportPoolSize = i;
        }
    }
}
