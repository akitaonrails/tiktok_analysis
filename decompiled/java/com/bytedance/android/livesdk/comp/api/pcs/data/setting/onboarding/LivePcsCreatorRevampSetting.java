package com.bytedance.android.livesdk.comp.api.pcs.data.setting.onboarding;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_creator_revamp")
public final class LivePcsCreatorRevampSetting {
    public static final int DEFAULT = 0;
    public static final LivePcsCreatorRevampSetting INSTANCE = new LivePcsCreatorRevampSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pcs_creator_revamp", DEFAULT);
    }

    public final boolean isEnabled() {
        return getValue() == 1;
    }
}
