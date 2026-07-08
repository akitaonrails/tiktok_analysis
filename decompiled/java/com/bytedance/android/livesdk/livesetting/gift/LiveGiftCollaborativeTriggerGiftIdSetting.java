package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("collaborative_trigger_gift_id")
public final class LiveGiftCollaborativeTriggerGiftIdSetting {
    public static final long DEFAULT = 62819;
    public static final LiveGiftCollaborativeTriggerGiftIdSetting INSTANCE = new LiveGiftCollaborativeTriggerGiftIdSetting();

    public final long getGiftId() {
        return SettingsManager.INSTANCE.getLongValue("collaborative_trigger_gift_id", DEFAULT);
    }
}
