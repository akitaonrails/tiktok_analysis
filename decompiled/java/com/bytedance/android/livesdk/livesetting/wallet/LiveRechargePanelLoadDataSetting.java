package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_wallet_recharge_panel_load_data_enabled")
public final class LiveRechargePanelLoadDataSetting {
    public static final LiveRechargePanelLoadDataSetting INSTANCE = new LiveRechargePanelLoadDataSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_wallet_recharge_panel_load_data_enabled", DEFAULT);
    }
}
