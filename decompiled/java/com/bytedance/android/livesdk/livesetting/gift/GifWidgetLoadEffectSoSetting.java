package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_widget_load_effect_so_setting")
public final class GifWidgetLoadEffectSoSetting {
    public static final int config;
    public static final boolean enabled;
    public static final GifWidgetLoadEffectSoSetting INSTANCE = new GifWidgetLoadEffectSoSetting();
    public static final int DEFAULT = 1;

    static {
        int intValue = SettingsManager.INSTANCE.getIntValue("gift_widget_load_effect_so_setting", 1);
        config = intValue;
        enabled = intValue > 0;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getEnabled() {
        return enabled;
    }
}
