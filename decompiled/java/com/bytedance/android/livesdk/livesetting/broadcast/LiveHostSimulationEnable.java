package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_simulation_enable")
public final class LiveHostSimulationEnable {
    public static final boolean DEFAULT = true;
    public static final LiveHostSimulationEnable INSTANCE = new LiveHostSimulationEnable();

    public static final boolean enable() {
        return (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLiveInhouse() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) && SettingsManager.INSTANCE.getBooleanValue("live_simulation_enable", DEFAULT);
    }
}
