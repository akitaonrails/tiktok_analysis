package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_pad_more_fast_gift_position")
public final class LivePadMoreFastGiftPositionSetting {
    public static final boolean DEFAULT = false;
    public static final LivePadMoreFastGiftPositionSetting INSTANCE = new LivePadMoreFastGiftPositionSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pad_more_fast_gift_position", DEFAULT);
    }
}
