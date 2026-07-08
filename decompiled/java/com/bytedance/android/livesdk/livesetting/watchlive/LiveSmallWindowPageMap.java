package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttec_live_small_window_page_map_android")
public final class LiveSmallWindowPageMap {
    public static final LiveSmallWindowPageMap INSTANCE = new LiveSmallWindowPageMap();
    public static final Map<String, String> DEFAULT = C2097608Jq.LJ();

    public final Map<String, String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, String> map = DEFAULT;
        Map<String, String> map2 = (Map) settingsManager.getValueSafely("ttec_live_small_window_page_map_android", map);
        return map2 != null ? map2 : map;
    }
}
