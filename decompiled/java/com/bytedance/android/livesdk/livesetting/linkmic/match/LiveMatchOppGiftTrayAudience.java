package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_multi_match_opposite_gift_tray_audience")
public final class LiveMatchOppGiftTrayAudience {
    public static final boolean DEFAULT = false;
    public static final LiveMatchOppGiftTrayAudience INSTANCE = new LiveMatchOppGiftTrayAudience();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_multi_match_opposite_gift_tray_audience", DEFAULT);
    }
}
