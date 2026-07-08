package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_popularity_ranking_bonus_time_setting")
public final class LivePopularityRankingBonusTimeSetting {
    public static final Config DEFAULT;
    public static final LivePopularityRankingBonusTimeSetting INSTANCE = new LivePopularityRankingBonusTimeSetting();
    public static long endTimestamp;
    public static long startTimestamp;
    public static Config value;

    static {
        Config config = new Config(false);
        DEFAULT = config;
        Config config2 = (Config) SettingsManager.INSTANCE.getValueSafely("live_popularity_ranking_bonus_time_setting", config);
        if (config2 != null) {
            config = config2;
        }
        value = config;
    }

    public final long getBonusTimeCountdownInSeconds() {
        return endTimestamp - (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
    }

    public final boolean getOverallOpt() {
        return value.overallOpt;
    }

    public final boolean isInBonusTime() {
        long j = startTimestamp;
        long j2 = endTimestamp;
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        return j <= jCurrentTimeMillis && jCurrentTimeMillis <= j2 && getOverallOpt();
    }

    public final long getBonusTimeStartTimeStamp() {
        return startTimestamp;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LivePopularityRankingBonusTimeSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("overall_opt")
        public boolean overallOpt;

        public Config() {
            this(false);
        }

        public Config(boolean z) {
            this.overallOpt = z;
        }
    }

    public final void setOverallOpt(boolean z) {
        value.overallOpt = z;
    }

    public final void updateBonusTimeRange(long j, long j2) {
        startTimestamp = j;
        endTimestamp = j2;
    }
}
