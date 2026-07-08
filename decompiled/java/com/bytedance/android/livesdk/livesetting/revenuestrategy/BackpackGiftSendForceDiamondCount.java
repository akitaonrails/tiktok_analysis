package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_backpack_gift_send_force_diamond_count")
public final class BackpackGiftSendForceDiamondCount {
    public static final BackpackGiftSendForceDiamondCount INSTANCE = new BackpackGiftSendForceDiamondCount();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_backpack_gift_send_force_diamond_count", DEFAULT);
    }
}
