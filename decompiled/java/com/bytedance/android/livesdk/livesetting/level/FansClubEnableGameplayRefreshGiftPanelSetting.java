package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("fans_club_enable_gameplay_refresh_gift_panel")
public final class FansClubEnableGameplayRefreshGiftPanelSetting {
    public static final boolean DEFAULT = true;
    public static final FansClubEnableGameplayRefreshGiftPanelSetting INSTANCE = new FansClubEnableGameplayRefreshGiftPanelSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("fans_club_enable_gameplay_refresh_gift_panel", DEFAULT);
    }
}
