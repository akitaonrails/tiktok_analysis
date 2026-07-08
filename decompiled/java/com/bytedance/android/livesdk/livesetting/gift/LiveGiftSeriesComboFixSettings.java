package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_panel_series_combo_fix_enable")
public final class LiveGiftSeriesComboFixSettings {
    public static final boolean DEFAULT = true;
    public static final LiveGiftSeriesComboFixSettings INSTANCE = new LiveGiftSeriesComboFixSettings();

    public final boolean getEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_panel_series_combo_fix_enable", DEFAULT);
    }
}
