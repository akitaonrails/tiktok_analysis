package com.bytedance.android.livesdk.impl.revenue.strategy.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_recharge_campaign_panel_fallback")
public final class LiveRechargePanelFallBackSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = false;
    public static final LiveRechargePanelFallBackSetting INSTANCE = new LiveRechargePanelFallBackSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_recharge_campaign_panel_fallback", DEFAULT);
    }
}
