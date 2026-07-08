package com.bytedance.android.livesdk.livesetting.gift;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_tray_price_color_v2")
public final class LiveGiftTrayPriceColorSettingNew {
    public static final LiveGiftTrayPriceColorSettingNew INSTANCE = new LiveGiftTrayPriceColorSettingNew();
    public static final Map<String, Object> DEFAULT = C2097608Jq.LJ();

    public final Map<String, Object> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, Object> map = DEFAULT;
        Map<String, Object> map2 = (Map) settingsManager.getValueSafely("live_gift_tray_price_color_v2", map);
        return map2 != null ? map2 : map;
    }

    public final Map<String, Object> getDEFAULT() {
        return DEFAULT;
    }
}
