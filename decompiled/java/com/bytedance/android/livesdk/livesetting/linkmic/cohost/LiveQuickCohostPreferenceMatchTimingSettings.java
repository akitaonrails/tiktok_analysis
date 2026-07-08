package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_quick_cohost_preference_match_timing_settings")
public final class LiveQuickCohostPreferenceMatchTimingSettings {
    public static final LiveQuickCohostPreferenceMatchTimingSettings INSTANCE = new LiveQuickCohostPreferenceMatchTimingSettings();
    public static final TimingConfigs DEFAULT = new TimingConfigs(5, 0.5d);

    private final TimingConfigs config() {
        TimingConfigs timingConfigs = (TimingConfigs) SettingsManager.INSTANCE.getValueSafely(LiveQuickCohostPreferenceMatchTimingSettings.class);
        return timingConfigs == null ? DEFAULT : timingConfigs;
    }

    public final long getMatchSuccessMinDurationMs() {
        double d = config().matchSuccessMinDurationSeconds;
        if (d < 0.0d) {
            d = 0.0d;
        }
        return (long) (d * 1000.0d);
    }

    public final long getSetPreferenceEntryDelayMs() {
        int i = config().setPreferenceEntryDelaySeconds;
        if (i < 0) {
            i = 0;
        }
        return ((long) i) * 1000;
    }

    public static final class TimingConfigs {
        public static final TypeAdapter ADAPTER;

        @C09CT("match_success_min_duration_seconds")
        public double matchSuccessMinDurationSeconds;

        @C09CT("set_preference_entry_delay_seconds")
        public int setPreferenceEntryDelaySeconds;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveQuickCohostPreferenceMatchTimingSettings_TimingConfigs_OptTypeAdapter();
        }

        public TimingConfigs() {
            this(5, 0.5d);
        }

        public TimingConfigs(int i, double d) {
            this.setPreferenceEntryDelaySeconds = i;
            this.matchSuccessMinDurationSeconds = d;
        }
    }
}
