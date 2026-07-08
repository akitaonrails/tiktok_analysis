package com.bytedance.android.livesdk.livesetting.slot;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_barrage_show_map")
public final class LiveBarrageShowMapSetting {
    public static final LiveBarrageShowMapSetting INSTANCE = new LiveBarrageShowMapSetting();
    public static final Map<String, Boolean> DEFAULT = C2097608Jq.LJ();

    public final Map<String, Boolean> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, Boolean> map = DEFAULT;
        Map<String, Boolean> map2 = (Map) settingsManager.getValueSafely("live_barrage_show_map", map);
        return map2 != null ? map2 : map;
    }
}
