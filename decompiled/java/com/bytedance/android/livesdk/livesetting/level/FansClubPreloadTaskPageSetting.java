package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("fans_club_preload_task_page")
public final class FansClubPreloadTaskPageSetting {
    public static final int DEFAULT = 0;
    public static final FansClubPreloadTaskPageSetting INSTANCE = new FansClubPreloadTaskPageSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("fans_club_preload_task_page", DEFAULT);
    }
}
