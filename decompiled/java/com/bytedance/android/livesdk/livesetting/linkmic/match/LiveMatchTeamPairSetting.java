package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("team_pair_enable")
public final class LiveMatchTeamPairSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMatchTeamPairSetting INSTANCE = new LiveMatchTeamPairSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("team_pair_enable", DEFAULT);
    }
}
