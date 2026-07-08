package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_gift_receiving_kotlinization_phase1")
public final class LiveGiftReceivingKotlinizationPhase1Setting {
    public static final LiveGiftReceivingKotlinizationPhase1Setting INSTANCE = new LiveGiftReceivingKotlinizationPhase1Setting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_receiving_kotlinization_phase1", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
