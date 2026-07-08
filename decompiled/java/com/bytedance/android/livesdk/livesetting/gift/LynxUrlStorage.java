package com.bytedance.android.livesdk.livesetting.gift;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_interactive_gift_schemes")
public final class LynxUrlStorage {
    public static final LynxUrlStorage INSTANCE = new LynxUrlStorage();
    public static final Map<String, String> DEFAULT = C2097608Jq.LJ();

    public final Map<String, String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, String> map = DEFAULT;
        Map<String, String> map2 = (Map) settingsManager.getValueSafely("live_interactive_gift_schemes", map);
        return map2 != null ? map2 : map;
    }

    public final Map<String, String> getDEFAULT() {
        return DEFAULT;
    }
}
