package com.bytedance.android.livesdk.livesetting.feed;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_square_refresh_params")
public final class LiveSquareRefreshParamsSetting {
    public static final LiveSquareRefreshParamsSetting INSTANCE = new LiveSquareRefreshParamsSetting();
    public static final Map<String, String> DEFAULT = C2097608Jq.LJ();

    public final Map<String, String> getDEFAULT() {
        return DEFAULT;
    }

    public final String getValue(String str) {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, String> map = DEFAULT;
        Map<String, String> map2 = (Map) settingsManager.getValueSafely("live_square_refresh_params", map);
        if (map2 != null) {
            map = map2;
        }
        String str2 = map.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}
