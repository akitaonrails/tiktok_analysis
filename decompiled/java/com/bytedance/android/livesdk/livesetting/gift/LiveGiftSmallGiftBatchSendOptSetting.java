package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_small_gift_batch_send_opt")
public final class LiveGiftSmallGiftBatchSendOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveGiftSmallGiftBatchSendOptSetting INSTANCE = new LiveGiftSmallGiftBatchSendOptSetting();

    public static final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_small_gift_batch_send_opt", DEFAULT);
    }
}
