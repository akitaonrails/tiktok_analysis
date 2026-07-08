package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_creator_ranking_midday_sprint_config")
public final class LiveCreatorRankingMiddaySprintConfig {
    public static HashMap<Integer, Long> middaySprintConfig;
    public static HashMap<Integer, Long> middaySprintEndTimeToRankingSettlementIntervalMap;
    public static final LiveCreatorRankingMiddaySprintConfig INSTANCE = new LiveCreatorRankingMiddaySprintConfig();
    public static final List<Config> DEFAULT = Collections.singletonList(new Config(8, 7200));

    private final HashMap<Integer, Long> getMiddaySprintConfig() {
        HashMap<Integer, Long> map = middaySprintConfig;
        if (map != null) {
            return map;
        }
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<Config> list = DEFAULT;
        List<Config> list2 = (List) settingsManager.getValueSafely("live_creator_ranking_midday_sprint_config", list);
        if (list2 != null) {
            list = list2;
        }
        HashMap<Integer, Long> map2 = new HashMap<>();
        for (Config config : list) {
            map2.put(Integer.valueOf(config.rankType), Long.valueOf(config.middaySprintDurationInSeconds));
        }
        middaySprintConfig = map2;
        return map2;
    }

    public final long getMiddaySprintEndTimeToRankingSettlementInterval(int i) {
        Long l;
        HashMap<Integer, Long> map = middaySprintEndTimeToRankingSettlementIntervalMap;
        if (map != null && (l = map.get(Integer.valueOf(i))) != null) {
            return l.longValue();
        }
        return -1L;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER;

        @C09CT("midday_sprint_duration_in_seconds")
        public long middaySprintDurationInSeconds;

        @C09CT("rank_type")
        public int rankType;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveCreatorRankingMiddaySprintConfig_Config_OptTypeAdapter();
        }

        public Config() {
            this(-1, 0L);
        }

        public Config(int i, long j) {
            this.rankType = i;
            this.middaySprintDurationInSeconds = j;
        }
    }

    public final boolean isInMiddaySprintPeriod(int i, long j) {
        Long l;
        long jLongValue;
        Long l2;
        HashMap<Integer, Long> map = middaySprintEndTimeToRankingSettlementIntervalMap;
        if (map == null || (l = map.get(Integer.valueOf(i))) == null) {
            return false;
        }
        long jLongValue2 = l.longValue();
        HashMap<Integer, Long> middaySprintConfig2 = getMiddaySprintConfig();
        if (middaySprintConfig2 != null && (l2 = middaySprintConfig2.get(Integer.valueOf(i))) != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        long j2 = j - jLongValue2;
        if (0 > j2 || j2 > jLongValue) {
            return false;
        }
        return true;
    }

    public final boolean isInMiddaySprintPeriodForEventTracking(int i, long j) {
        Long l;
        HashMap<Integer, Long> map = middaySprintEndTimeToRankingSettlementIntervalMap;
        if (map == null || (l = map.get(Integer.valueOf(i))) == null) {
            return false;
        }
        long jLongValue = j - l.longValue();
        if ((0 > jLongValue || jLongValue >= 1801) && (85800 > jLongValue || jLongValue >= 86401)) {
            return false;
        }
        return true;
    }

    public final void updateMiddaySprintInfo(int i, long j, long j2) {
        if (j2 <= 0) {
            return;
        }
        if (middaySprintEndTimeToRankingSettlementIntervalMap == null) {
            middaySprintEndTimeToRankingSettlementIntervalMap = new HashMap<>();
        }
        HashMap<Integer, Long> map = middaySprintEndTimeToRankingSettlementIntervalMap;
        if (map != null) {
            map.put(Integer.valueOf(i), Long.valueOf(j - j2));
        }
    }
}
