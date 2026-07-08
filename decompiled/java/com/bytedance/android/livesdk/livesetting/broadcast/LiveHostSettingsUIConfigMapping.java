package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_host_settings_ui_config_mapping")
public final class LiveHostSettingsUIConfigMapping {
    public static final Map<String, String> DEFAULT;
    public static final LiveHostSettingsUIConfigMapping INSTANCE = new LiveHostSettingsUIConfigMapping();
    public static final Map<String, String> value;

    static {
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("STABLE_MODE", "live_stable_mode"));
        DEFAULT = mapLJIIJ;
        Map<String, String> map = (Map) SettingsManager.INSTANCE.getValueSafely("live_host_settings_ui_config_mapping", mapLJIIJ);
        if (map != null) {
            mapLJIIJ = map;
        }
        value = mapLJIIJ;
    }

    public final String needMapping2NewSettings(String str) {
        String str2 = value.get(str);
        if (str2 == null) {
            return null;
        }
        return str2;
    }
}
