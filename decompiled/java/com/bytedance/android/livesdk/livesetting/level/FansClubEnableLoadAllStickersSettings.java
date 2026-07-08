package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_enable_load_all_stickers")
public final class FansClubEnableLoadAllStickersSettings {
    public static final boolean DEFAULT = false;
    public static final FansClubEnableLoadAllStickersSettings INSTANCE = new FansClubEnableLoadAllStickersSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_enable_load_all_stickers", DEFAULT);
    }
}
