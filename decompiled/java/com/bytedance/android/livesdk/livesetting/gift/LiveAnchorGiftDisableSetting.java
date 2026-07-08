package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_anchor_gift_disable")
public final class LiveAnchorGiftDisableSetting {
    public static final boolean DEFAULT = true;
    public static final LiveAnchorGiftDisableSetting INSTANCE = new LiveAnchorGiftDisableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_anchor_gift_disable", DEFAULT);
    }
}
