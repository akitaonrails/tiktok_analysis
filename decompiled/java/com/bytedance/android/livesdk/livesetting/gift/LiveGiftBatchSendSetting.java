package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_batch_send")
public final class LiveGiftBatchSendSetting {
    public static final int DEFAULT = 0;
    public static final int ENABLED_LONG_PRESS = 1;
    public static final int ENABLED_LONG_PRESS_AND_COMBO = 2;
    public static final LiveGiftBatchSendSetting INSTANCE = new LiveGiftBatchSendSetting();

    public static final boolean enabled() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_batch_send", DEFAULT) != 0;
    }
}
