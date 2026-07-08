package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("double_match_audience_gift_tray_enable")
public final class LiveMatchAudience1v1ArchGiftTraySetting {
    public static final int DEFAULT = 0;
    public static final LiveMatchAudience1v1ArchGiftTraySetting INSTANCE = new LiveMatchAudience1v1ArchGiftTraySetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("double_match_audience_gift_tray_enable", DEFAULT) == 1;
    }
}
