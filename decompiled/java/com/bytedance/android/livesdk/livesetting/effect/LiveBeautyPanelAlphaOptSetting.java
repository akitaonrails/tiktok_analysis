package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_beauty_panel_alpha_opt")
public final class LiveBeautyPanelAlphaOptSetting {
    public static final LiveBeautyPanelAlphaOptSetting INSTANCE = new LiveBeautyPanelAlphaOptSetting();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_beauty_panel_alpha_opt", DEFAULT);

    public final boolean enable() {
        return value > 0;
    }

    public final boolean inV2() {
        return value == 2;
    }
}
