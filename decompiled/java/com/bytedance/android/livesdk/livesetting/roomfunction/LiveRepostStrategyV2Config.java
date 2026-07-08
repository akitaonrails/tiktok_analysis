package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_repost_strategy_v2_config")
public final class LiveRepostStrategyV2Config {
    public static final LiveRepostStrategyV2Config INSTANCE = new LiveRepostStrategyV2Config();
    public static final RepostConfig DEFAULT = new RepostConfig(10000, 10000, 5, 2, 3);
    public static final C01GW config$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(72));

    private final RepostConfig getConfig() {
        return (RepostConfig) config$delegate.getValue();
    }

    public final RepostConfig config() {
        return getConfig();
    }

    public static final class RepostConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("bubble_delay")
        public long bubbleDelay;

        @C09CT("bubble_duration")
        public long bubbleDuration;

        @C09CT("max_count")
        public int maxCount;

        @C09CT("max_daily_count")
        public int maxDailyCount;

        @C09CT("no_repost_return_day")
        public int noRepostReturnDay;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveRepostStrategyV2Config_RepostConfig_OptTypeAdapter();
        }

        public RepostConfig() {
            this(10000L, 10000L, 5, 2, 3);
        }

        public RepostConfig(long j, long j2, int i, int i2, int i3) {
            this.bubbleDuration = j;
            this.bubbleDelay = j2;
            this.maxCount = i;
            this.maxDailyCount = i2;
            this.noRepostReturnDay = i3;
        }
    }
}
