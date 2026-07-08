package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_batch_send_ttp_setting")
public final class LiveGiftBatchSendTTPSetting {
    public static final int DEFAULT = 0;
    public static final LiveGiftBatchSendTTPSetting INSTANCE = new LiveGiftBatchSendTTPSetting();

    public static final boolean showMoreForTTP() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_batch_send_ttp_setting", DEFAULT) != 0;
    }
}
