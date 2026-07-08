package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_task_panel_opt")
public final class FansClubTaskPanelOptSetting {
    public static final int DEFAULT = 0;
    public static final FansClubTaskPanelOptSetting INSTANCE = new FansClubTaskPanelOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_fans_club_task_panel_opt", DEFAULT);
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
