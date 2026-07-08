package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_multi_name")
public final class LiveGiftMultiNameSetting {
    public static final LiveGiftMultiNameSetting INSTANCE = new LiveGiftMultiNameSetting();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_multi_name", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
