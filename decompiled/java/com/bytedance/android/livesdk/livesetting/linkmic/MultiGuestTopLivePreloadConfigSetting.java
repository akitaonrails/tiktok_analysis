package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_top_live_preload_config")
public final class MultiGuestTopLivePreloadConfigSetting {
    public static final MultiGuestTopLivePreloadConfigSetting INSTANCE = new MultiGuestTopLivePreloadConfigSetting();
    public static final TopLivePreloadConfig DEFAULT = new TopLivePreloadConfig(false, false, false, false, 1800, false, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, C1697810uHb.LJIIJJI("hangout_mg_agg_playlabel_dating", "hangout_mg_agg_playlabel_debating"), 0, false, false);

    public static final TopLivePreloadConfig getValue() {
        TopLivePreloadConfig topLivePreloadConfig = (TopLivePreloadConfig) SettingsManager.INSTANCE.getValueSafely(MultiGuestTopLivePreloadConfigSetting.class);
        return topLivePreloadConfig == null ? DEFAULT : topLivePreloadConfig;
    }
}
