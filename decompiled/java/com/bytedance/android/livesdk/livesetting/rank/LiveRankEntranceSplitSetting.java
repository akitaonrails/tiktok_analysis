package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("live_music_spotlight_dual_entrance_config")
public final class LiveRankEntranceSplitSetting {
    public static final LiveRankEntranceSplitSetting INSTANCE = new LiveRankEntranceSplitSetting();
    public static final Config DEFAULT = new Config(0, 3, 3, 3, 86400, 10, 5);

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_music_spotlight_dual_entrance_config", config);
        return config2 != null ? config2 : config;
    }

    public final boolean isSplitEnabled() {
        return getValue().style != 0;
    }

    public final int splitStyle() {
        return getValue().style;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER;

        @C09CT("pre_collapse_cooldown_seconds")
        public int collapseAfterAnimationEndS;

        @C09CT("education_max_count")
        public int guideCount;

        @C09CT("education_delay_seconds")
        public int guideDelayS;

        @C09CT("education_expand_seconds")
        public int guideExpandDurationS;

        @C09CT("education_cooldown_seconds")
        public int guideIntervalS;

        @C09CT("min_expand_duration_seconds")
        public int minExpandDurationS;

        @C09CT("dual_entrance_style")
        public int style;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveRankEntranceSplitSetting_Config_OptTypeAdapter();
        }

        public Config() {
            this(0, 3, 3, 3, 86400, 10, 5);
        }

        public Config(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.style = i;
            this.guideCount = i2;
            this.guideDelayS = i3;
            this.guideExpandDurationS = i4;
            this.guideIntervalS = i5;
            this.minExpandDurationS = i6;
            this.collapseAfterAnimationEndS = i7;
        }
    }
}
