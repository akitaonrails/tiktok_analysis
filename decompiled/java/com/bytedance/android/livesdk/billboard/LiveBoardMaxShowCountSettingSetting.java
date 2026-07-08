package com.bytedance.android.livesdk.billboard;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_board_max_show_count_setting")
public final class LiveBoardMaxShowCountSettingSetting {
    public static final LiveBoardMaxShowCountSettingSetting INSTANCE = new LiveBoardMaxShowCountSettingSetting();
    public static final Map<String, Integer> DEFAULT = C2097608Jq.LJIIJ(new Pair("default", 1), new Pair("e-commerce", 2));

    private final Map<String, Integer> getValue() {
        return (Map) SettingsManager.INSTANCE.getValueSafely("live_board_max_show_count_setting", DEFAULT);
    }

    public final int getDefaultMaxCount() {
        Integer num;
        Map<String, Integer> value = getValue();
        if (value == null || (num = value.get("default")) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final int getBizMaxCount(String str) {
        Integer num;
        Map<String, Integer> value = getValue();
        if (value != null && (num = value.get(str)) != null) {
            return num.intValue();
        }
        return 1;
    }
}
