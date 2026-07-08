package com.bytedance.android.livesdk.livefinishcard;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_finish_card_opt_config")
public final class LiveEndPageOptSetting {
    public static final LiveEndPageOptSetting INSTANCE = new LiveEndPageOptSetting();
    public static final EndPageOptConfig DEFAULT = new EndPageOptConfig(0, 1000, Mp4ScreenVideoLoadTimeout.CONTROL, 1);

    private final EndPageOptConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        EndPageOptConfig endPageOptConfig = DEFAULT;
        EndPageOptConfig endPageOptConfig2 = (EndPageOptConfig) settingsManager.getValueSafely("live_finish_card_opt_config", endPageOptConfig);
        return endPageOptConfig2 != null ? endPageOptConfig2 : endPageOptConfig;
    }

    public final long getAutoRemoveTimeMs() {
        return getValue().getAutoRemoveTimeMs();
    }

    public final long getAutoSwipeTimeMs() {
        return getValue().getAutoSwipeTimeMs();
    }

    public final int getOptType() {
        return getValue().getOptType();
    }

    public final int getScreenShotType() {
        return getValue().getScreenShotType();
    }

    public final boolean isEndCardEnable() {
        return getValue().getOptType() == 1;
    }

    public final boolean isEndPageOptEnable() {
        return getValue().getOptType() == 2;
    }

    public static final class EndPageOptConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("autoRemoveTimeMs")
        public long autoRemoveTimeMs;

        @C09CT("autoSwipeTimeMs")
        public long autoSwipeTimeMs;

        @C09CT("type")
        public int optType;

        @C09CT("screenShotType")
        public int screenShotType;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveEndPageOptSetting_EndPageOptConfig_OptTypeAdapter();
        }

        public EndPageOptConfig() {
            this(0, 1000L, Mp4ScreenVideoLoadTimeout.CONTROL, 1);
        }

        public final long getAutoRemoveTimeMs() {
            return this.autoRemoveTimeMs;
        }

        public final long getAutoSwipeTimeMs() {
            return this.autoSwipeTimeMs;
        }

        public final int getOptType() {
            return this.optType;
        }

        public final int getScreenShotType() {
            return this.screenShotType;
        }

        public final void setAutoRemoveTimeMs(long j) {
            this.autoRemoveTimeMs = j;
        }

        public final void setAutoSwipeTimeMs(long j) {
            this.autoSwipeTimeMs = j;
        }

        public final void setOptType(int i) {
            this.optType = i;
        }

        public final void setScreenShotType(int i) {
            this.screenShotType = i;
        }

        public EndPageOptConfig(int i, long j, long j2, int i2) {
            this.optType = i;
            this.autoSwipeTimeMs = j;
            this.autoRemoveTimeMs = j2;
            this.screenShotType = i2;
        }
    }
}
