package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("creator_team_manually_collect_mode_opt")
public final class LiveCreatorTeamManuallyCollectModeOpt {
    public static final int DEFAULT = 0;
    public static final LiveCreatorTeamManuallyCollectModeOpt INSTANCE = new LiveCreatorTeamManuallyCollectModeOpt();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("creator_team_manually_collect_mode_opt", DEFAULT);
    }

    public final boolean isManualCollectOPTMode() {
        return getValue() == 1;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
