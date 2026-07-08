package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "mt_live_banner_render_strategy_anchor")
public final class LiveBannerRenderStrategyAnchorSetting {
    public static final int DEFAULT = 0;
    public static final LiveBannerRenderStrategyAnchorSetting INSTANCE = new LiveBannerRenderStrategyAnchorSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("mt_live_banner_render_strategy_anchor", DEFAULT);
    }
}
