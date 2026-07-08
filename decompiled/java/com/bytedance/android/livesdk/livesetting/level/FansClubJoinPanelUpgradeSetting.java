package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_fans_club_join_panel_upgrade_group")
public final class FansClubJoinPanelUpgradeSetting {
    public static final int DEFAULT = 0;
    public static final FansClubJoinPanelUpgradeSetting INSTANCE = new FansClubJoinPanelUpgradeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_fans_club_join_panel_upgrade_group", DEFAULT);
    }

    public final boolean isExperimentalGroup() {
        return getValue() == 1 || getValue() == 2 || getValue() == 3;
    }
}
