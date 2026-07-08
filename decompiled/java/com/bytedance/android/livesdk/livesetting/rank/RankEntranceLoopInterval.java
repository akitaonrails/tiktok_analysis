package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_rank_entrance_loop_config")
public final class RankEntranceLoopInterval {
    public static final RankEntranceLoopInterval INSTANCE = new RankEntranceLoopInterval();
    public static final Config DEFAULT = new Config(Mp4ScreenVideoLoadTimeout.CONTROL, 15000);

    public static final class Config {
        public static final TypeAdapter ADAPTER;

        @C09CT("rank_loop_interval")
        public long rankLoopInterval;

        @C09CT("rank_loop_time_limit")
        public long rankLoopTimeLimit;

        static {
            NormalGson.singleton();
            ADAPTER = new RankEntranceLoopInterval_Config_OptTypeAdapter();
        }

        public Config() {
            this(Mp4ScreenVideoLoadTimeout.CONTROL, 15000L);
        }

        public Config(long j, long j2) {
            this.rankLoopInterval = j;
            this.rankLoopTimeLimit = j2;
        }
    }

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_rank_entrance_loop_config", config);
        return config2 != null ? config2 : config;
    }
}
