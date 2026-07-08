package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_quick_gift_zone_enable")
public final class LiveFoldScreenFastGiftsSettings {
    public static final boolean DEFAULT = false;
    public static final LiveFoldScreenFastGiftsSettings INSTANCE = new LiveFoldScreenFastGiftsSettings();

    public final boolean getEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_quick_gift_zone_enable", DEFAULT);
    }
}
