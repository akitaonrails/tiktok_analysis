package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C20441214yg;
import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_toplive_exit_anim_enable_config")
public final class TopLiveExitAnimEnableConfigSetting {
    public static final TopLiveExitAnimEnableConfigSetting INSTANCE = new TopLiveExitAnimEnableConfigSetting();
    public static final TopLiveExitAnimationDeviceConfig DEFAULT = new TopLiveExitAnimationDeviceConfig(true, 0.0f);

    private final TopLiveExitAnimationDeviceConfig getValue() {
        TopLiveExitAnimationDeviceConfig topLiveExitAnimationDeviceConfig = (TopLiveExitAnimationDeviceConfig) SettingsManager.INSTANCE.getValueSafely(TopLiveExitAnimEnableConfigSetting.class);
        return topLiveExitAnimationDeviceConfig == null ? DEFAULT : topLiveExitAnimationDeviceConfig;
    }

    public static final boolean isEnable() {
        TopLiveExitAnimationDeviceConfig value = INSTANCE.getValue();
        float value2 = TTliveAudienceDeviceScoreSetting.INSTANCE.getValue();
        if (!value.enable) {
            return false;
        }
        float f = value.scoreLow;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExitAnimEnableConfig, isEnable: ");
        sbLIZ.append(f);
        sbLIZ.append(", deviceScore: ");
        sbLIZ.append(value2);
        sbLIZ.append(", scoreLow: ");
        sbLIZ.append(value.scoreLow);
        C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return value2 >= f;
    }
}
