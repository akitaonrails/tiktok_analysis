package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_enable_normal_gift_and_barrage_self_firstly")
public final class LiveEnableNormalGiftAndBarrageSelfFirstlySetting {
    public static final boolean DEFAULT = false;
    public static final LiveEnableNormalGiftAndBarrageSelfFirstlySetting INSTANCE = new LiveEnableNormalGiftAndBarrageSelfFirstlySetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_normal_gift_and_barrage_self_firstly", DEFAULT);
    }
}
