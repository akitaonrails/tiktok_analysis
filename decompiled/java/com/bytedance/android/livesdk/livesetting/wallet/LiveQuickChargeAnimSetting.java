package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_wallet_quick_charge_anim_enabled")
public final class LiveQuickChargeAnimSetting {
    public static final LiveQuickChargeAnimSetting INSTANCE = new LiveQuickChargeAnimSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_wallet_quick_charge_anim_enabled", DEFAULT);
    }
}
