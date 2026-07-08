package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_panel_top_leaf_new_arch")
public final class LiveGiftPanelTopLeafNewArchSetting {
    public static final int DEFAULT = 0;
    public static final int ENABLED = 1;
    public static final int ENABLED_WITH_PRELOAD = 2;
    public static final LiveGiftPanelTopLeafNewArchSetting INSTANCE = new LiveGiftPanelTopLeafNewArchSetting();

    private final int getSettingValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_panel_top_leaf_new_arch", DEFAULT);
    }

    public final boolean isEnabled() {
        return getSettingValue() > 0;
    }

    public final boolean isPreloadEnabled() {
        return getSettingValue() == 2;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
