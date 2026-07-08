package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_panel_v2")
public final class FansClubPanelV2Settings {
    public static final int DEFAULT = 0;
    public static final FansClubPanelV2Settings INSTANCE = new FansClubPanelV2Settings();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_fans_club_panel_v2", DEFAULT);
    }

    public final boolean enableFansClubPanelV2() {
        return getValue() > 0;
    }

    public final boolean isLynxFansClubJoinDialogEnable() {
        return getValue() == 2;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
