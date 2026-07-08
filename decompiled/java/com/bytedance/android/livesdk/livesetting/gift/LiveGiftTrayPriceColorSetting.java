package com.bytedance.android.livesdk.livesetting.gift;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_gift_tray_price_color")
public final class LiveGiftTrayPriceColorSetting {
    public static final LiveGiftTrayPriceColorSetting INSTANCE = new LiveGiftTrayPriceColorSetting();
    public static final Map<String, List<String>> DEFAULT = C2097608Jq.LJ();

    public final Map<String, List<String>> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, List<String>> map = DEFAULT;
        Map<String, List<String>> map2 = (Map) settingsManager.getValueSafely("live_gift_tray_price_color", map);
        return map2 != null ? map2 : map;
    }

    public final Map<String, List<String>> getDEFAULT() {
        return DEFAULT;
    }
}
