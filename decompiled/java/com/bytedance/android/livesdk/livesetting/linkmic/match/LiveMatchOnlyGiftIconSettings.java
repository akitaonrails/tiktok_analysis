package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_only_gift_icon_enable")
public final class LiveMatchOnlyGiftIconSettings {
    public static final boolean DEFAULT = true;
    public static final LiveMatchOnlyGiftIconSettings INSTANCE = new LiveMatchOnlyGiftIconSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_only_gift_icon_enable", DEFAULT);
    }
}
