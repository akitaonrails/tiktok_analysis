package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_multi_match_opposite_gift_tray_anchor")
public final class LiveMatchOppGiftTrayAnchor {
    public static final boolean DEFAULT = true;
    public static final LiveMatchOppGiftTrayAnchor INSTANCE = new LiveMatchOppGiftTrayAnchor();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_multi_match_opposite_gift_tray_anchor", DEFAULT);
    }
}
