package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_match_top2_top3_card_enable")
public final class LiveMatchTop2Top3CardSettings {
    public static final boolean DEFAULT = false;
    public static final LiveMatchTop2Top3CardSettings INSTANCE = new LiveMatchTop2Top3CardSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_top2_top3_card_enable", DEFAULT);
    }
}
