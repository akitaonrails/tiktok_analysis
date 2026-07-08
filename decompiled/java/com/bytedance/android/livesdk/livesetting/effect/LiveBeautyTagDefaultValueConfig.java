package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_beauty_tag_default_value")
public final class LiveBeautyTagDefaultValueConfig {
    public static final LiveBeautyTagDefaultValueConfig INSTANCE = new LiveBeautyTagDefaultValueConfig();
    public static final Map<String, Double> DEFAULT = new LinkedHashMap();

    public final double getValue(String str, double d) {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, Double> map = DEFAULT;
        Map<String, Double> map2 = (Map) settingsManager.getValueSafely("live_beauty_tag_default_value", map);
        if (map2 != null) {
            map = map2;
        }
        Double d2 = (Double) new LinkedHashMap(map).get(str);
        if (d2 != null) {
            return d2.doubleValue();
        }
        return d;
    }
}
