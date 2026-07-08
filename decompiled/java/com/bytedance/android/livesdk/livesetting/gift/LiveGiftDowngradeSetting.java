package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_overload_downgrade_config")
public final class LiveGiftDowngradeSetting {
    public static final LiveGiftDowngradeSetting INSTANCE = new LiveGiftDowngradeSetting();
    public static final LiveGiftDowngradeConfig DEFAULT = new LiveGiftDowngradeConfig(null, null, null);

    public final LiveGiftDowngradeConfig getValue() {
        return (LiveGiftDowngradeConfig) SettingsManager.INSTANCE.getValueSafely("live_gift_overload_downgrade_config", DEFAULT);
    }
}
