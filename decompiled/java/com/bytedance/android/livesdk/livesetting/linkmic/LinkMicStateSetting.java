package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_state_cmd")
public final class LinkMicStateSetting {
    public static final LinkMicStateSetting INSTANCE = new LinkMicStateSetting();
    public static final StateConfig DEFAULT = new StateConfig(15, false, true, true, 1, 60);

    private final boolean isEnable(int i, int i2) {
        return (i2 & i) == i;
    }

    public final boolean enableIMReceive() {
        return isEnable(2, config().getImConfig());
    }

    public final boolean enableIMSend() {
        return isEnable(1, config().getImConfig());
    }

    public final boolean enableRTCSend() {
        return isEnable(4, config().getImConfig());
    }

    public final boolean timeCostReport() {
        return true;
    }

    private final StateConfig config() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        StateConfig stateConfig = DEFAULT;
        StateConfig stateConfig2 = (StateConfig) settingsManager.getValueSafely("linkmic_state_cmd", stateConfig);
        return stateConfig2 != null ? stateConfig2 : stateConfig;
    }

    public final boolean enableRTCReceive() {
        return isEnable(8, config().getImConfig());
    }

    public final int checkDuration() {
        return config().getCheckDuration();
    }

    public final boolean enableStatReport() {
        return config().getEnableStat();
    }

    public final boolean filterStateType() {
        return config().getFilterStateType();
    }

    public final boolean rtcDoubleCheck() {
        return isEnable(2, config().getDoubleCheck());
    }

    public final boolean stateDoubleCheck() {
        return isEnable(1, config().getDoubleCheck());
    }

    public final boolean syncWithRTC() {
        return config().getSyncWithRTC();
    }
}
