package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("enable_catch_bean_high_bitrate")
public final class LiveMatchCatchBeanHighBitrateSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMatchCatchBeanHighBitrateSetting INSTANCE = new LiveMatchCatchBeanHighBitrateSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_catch_bean_high_bitrate", DEFAULT);
    }
}
