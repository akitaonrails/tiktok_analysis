package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_bytevc1_opt_enable")
public final class LiveGiftByteVC1OptResourceSetting {
    public static final boolean DEFAULT = false;
    public static final LiveGiftByteVC1OptResourceSetting INSTANCE = new LiveGiftByteVC1OptResourceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("gift_bytevc1_opt_enable", DEFAULT);
    }
}
