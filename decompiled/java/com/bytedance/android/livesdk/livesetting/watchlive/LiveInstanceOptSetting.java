package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_inst_ctl_opt")
public final class LiveInstanceOptSetting {
    public static final LiveInstanceOptSetting INSTANCE = new LiveInstanceOptSetting();
    public static final CtlConfig DEFAULT = new CtlConfig(false, 1, 30000, 0, false, true, false);

    public static final boolean doRemoveOpt() {
        return INSTANCE.getConfig().doPerfOpt;
    }

    private final CtlConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        CtlConfig ctlConfig = DEFAULT;
        CtlConfig ctlConfig2 = (CtlConfig) settingsManager.getValueSafely("live_inst_ctl_opt", ctlConfig);
        return ctlConfig2 != null ? ctlConfig2 : ctlConfig;
    }

    public static final boolean ignorePlayerState() {
        return INSTANCE.getConfig().ignorePlayerState;
    }

    public final boolean enable() {
        return getConfig().enable;
    }

    public final boolean enableNonTabSwitchStrategy() {
        return enableSwitchStrategy() && getConfig().enableInflowStrategy;
    }

    public final boolean enableScrollStrategy() {
        return getConfig().strategyOption == 0 || getConfig().strategyOption == 2;
    }

    public final boolean enableSwitchStrategy() {
        return getConfig().strategyOption == 0 || getConfig().strategyOption == 1;
    }

    public final int getDistance() {
        return getConfig().distance;
    }

    public final long getPollInterval() {
        return getConfig().interval;
    }
}
