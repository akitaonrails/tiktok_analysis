package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_team_pair_feature_configuration")
public final class LiveMatchTeamPairConfigSetting {
    public static final LiveMatchTeamPairConfigSetting INSTANCE = new LiveMatchTeamPairConfigSetting();
    public static final LiveMatchTeamPairConfigSettingData DEFAULT = new LiveMatchTeamPairConfigSettingData(300, 60, 30, C1697810uHb.LJIIJJI(0, 2, 3, 4));

    public final LiveMatchTeamPairConfigSettingData getValue() {
        LiveMatchTeamPairConfigSettingData liveMatchTeamPairConfigSettingData = (LiveMatchTeamPairConfigSettingData) SettingsManager.INSTANCE.getValueSafely(LiveMatchTeamPairConfigSetting.class);
        return liveMatchTeamPairConfigSettingData == null ? DEFAULT : liveMatchTeamPairConfigSettingData;
    }

    public final LiveMatchTeamPairConfigSettingData getDEFAULT() {
        return DEFAULT;
    }
}
