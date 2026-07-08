package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_takestage_experience_opt")
public final class LiveMatchTakeStageOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveMatchTakeStageOptSetting INSTANCE = new LiveMatchTakeStageOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_match_takestage_experience_opt", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() > 0;
    }

    public final boolean isEnableOptInvitationLogic() {
        return (getValue() & 8) == 8;
    }

    public final boolean isEnableOptMatchButton() {
        return (getValue() & 1) == 1;
    }

    public final boolean isEnableOptPublicScreenOverlap() {
        return (getValue() & 4) == 4;
    }

    public final boolean isEnableOptRedundantApi() {
        return (getValue() & 2) == 2;
    }
}
