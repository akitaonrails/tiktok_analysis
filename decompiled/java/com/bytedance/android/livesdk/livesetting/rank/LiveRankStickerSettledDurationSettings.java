package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("rank_settle_message_max_wait_durations1")
public final class LiveRankStickerSettledDurationSettings {
    public static final Map<Integer, Integer> DEFAULT;
    public static final LiveRankStickerSettledDurationSettings INSTANCE = new LiveRankStickerSettledDurationSettings();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(0, 30);
        linkedHashMap.put(8, 30);
        linkedHashMap.put(11, 120);
        linkedHashMap.put(16, 600);
        DEFAULT = linkedHashMap;
    }

    public final Map<Integer, Integer> getValue() {
        return (Map) SettingsManager.INSTANCE.getValueSafely("rank_settle_message_max_wait_durations1", DEFAULT);
    }

    public final int obtainRankSettledDuration(Integer num) {
        Integer num2;
        if (num == null) {
            return 30;
        }
        num.intValue();
        Map<Integer, Integer> value = getValue();
        if (value == null || (num2 = value.get(num)) == null) {
            return 30;
        }
        return num2.intValue();
    }
}
