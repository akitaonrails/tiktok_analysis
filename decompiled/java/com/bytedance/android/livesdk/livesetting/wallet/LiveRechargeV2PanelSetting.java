package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("gbl_recharge_v2_toggle")
public final class LiveRechargeV2PanelSetting {
    public static final boolean DEFAULT = true;
    public static final LiveRechargeV2PanelSetting INSTANCE = new LiveRechargeV2PanelSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("gbl_recharge_v2_toggle", DEFAULT);
    }
}
