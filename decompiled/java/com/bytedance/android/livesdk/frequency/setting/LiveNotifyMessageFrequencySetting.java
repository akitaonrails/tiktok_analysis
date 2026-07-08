package com.bytedance.android.livesdk.frequency.setting;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_message_fluency_config")
public final class LiveNotifyMessageFrequencySetting {
    public static final LiveNotifyMessageFrequencyConfig DEFAULT;
    public static final LiveNotifyMessageFrequencySetting INSTANCE = new LiveNotifyMessageFrequencySetting();
    public static final LiveNotifyMessageFrequencyConfig config;

    public static final class LiveNotifyMessageFrequencyConfig {
        public static final TypeAdapter ADAPTER = new LiveNotifyMessageFrequencySetting_LiveNotifyMessageFrequencyConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public Boolean enable;

        @C09CT("enable_bubble")
        public boolean enableBubble;

        @C09CT("enable_capsule")
        public boolean enableCapsule;

        @C09CT("report_cache_max")
        public int reportInfoMaxLength;

        @C09CT("report_interval")
        public long reportIntervalMs;

        @C09CT("report_interval_random_delay")
        public long reportIntervalRandomDelayMs;

        @C09CT("report_max_fail_times")
        public int reportMaxFailTimes;

        @C09CT("min_report_interval")
        public int reportMinIntervalMs;

        public LiveNotifyMessageFrequencyConfig() {
            this(Boolean.FALSE, 30000L, 0L, 10, 5000, 2, false, false);
        }

        public LiveNotifyMessageFrequencyConfig(Boolean bool, long j, long j2, int i, int i2, int i3, boolean z, boolean z2) {
            this.enable = bool;
            this.reportIntervalMs = j;
            this.reportIntervalRandomDelayMs = j2;
            this.reportInfoMaxLength = i;
            this.reportMinIntervalMs = i2;
            this.reportMaxFailTimes = i3;
            this.enableBubble = z;
            this.enableCapsule = z2;
        }
    }

    static {
        LiveNotifyMessageFrequencyConfig liveNotifyMessageFrequencyConfig = new LiveNotifyMessageFrequencyConfig(Boolean.FALSE, 30000L, 0L, 10, 5000, 2, false, false);
        DEFAULT = liveNotifyMessageFrequencyConfig;
        LiveNotifyMessageFrequencyConfig liveNotifyMessageFrequencyConfig2 = (LiveNotifyMessageFrequencyConfig) SettingsManager.INSTANCE.getValueSafely("live_message_fluency_config", liveNotifyMessageFrequencyConfig);
        if (liveNotifyMessageFrequencyConfig2 != null) {
            liveNotifyMessageFrequencyConfig = liveNotifyMessageFrequencyConfig2;
        }
        config = liveNotifyMessageFrequencyConfig;
    }

    public final boolean enable() {
        return Intrinsics.LJFF(config.enable, Boolean.TRUE);
    }

    public final boolean enableBubble() {
        return config.enableBubble && enable();
    }

    public final boolean enableCapsule() {
        return config.enableCapsule && enable();
    }

    public final int reportInfoMaxLength() {
        return config.reportInfoMaxLength;
    }

    public final long reportIntervalMs() {
        return config.reportIntervalMs;
    }

    public final long reportIntervalRandomDelayMs() {
        return config.reportIntervalRandomDelayMs;
    }

    public final int reportMaxFailTimes() {
        return config.reportMaxFailTimes;
    }

    public final int reportMinIntervalMs() {
        return config.reportMinIntervalMs;
    }
}
