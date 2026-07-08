package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_chain_pl_enable")
public final class LiveChainEnableSetting {
    public static final int DEFAULT = 0;
    public static final LiveChainEnableSetting INSTANCE = new LiveChainEnableSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_chain_pl_enable", DEFAULT) == 1;
    }
}
