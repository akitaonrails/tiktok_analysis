package com.bytedance.android.livesdk.rank.api.config;

import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_rank_entrance_filter_rank_types")
public final class LiveRankingFilterTypesConfig {
    public static final LiveRankingFilterTypesConfig INSTANCE = new LiveRankingFilterTypesConfig();
    public static final List<Integer> DEFAULT = C13BV.INSTANCE;

    private final List<Integer> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<Integer> list = DEFAULT;
        List<Integer> list2 = (List) settingsManager.getValueSafely("live_rank_entrance_filter_rank_types", list);
        return list2 != null ? list2 : list;
    }

    public final boolean shouldFilterRankingType(int i) {
        Iterator<Integer> it2 = getValue().iterator();
        while (it2.hasNext()) {
            if (it2.next().intValue() == i) {
                return true;
            }
        }
        return false;
    }
}
