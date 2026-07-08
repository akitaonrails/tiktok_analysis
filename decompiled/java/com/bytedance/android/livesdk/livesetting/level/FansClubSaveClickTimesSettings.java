package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_level_save_entrance_click_times")
public final class FansClubSaveClickTimesSettings {
    public static final long DEFAULT = 400;
    public static final FansClubSaveClickTimesSettings INSTANCE = new FansClubSaveClickTimesSettings();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_fans_level_save_entrance_click_times", DEFAULT);
    }
}
