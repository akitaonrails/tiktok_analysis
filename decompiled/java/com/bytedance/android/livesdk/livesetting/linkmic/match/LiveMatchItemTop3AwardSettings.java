package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_match_item_top3_control")
public final class LiveMatchItemTop3AwardSettings {
    public static final boolean DEFAULT = false;
    public static final LiveMatchItemTop3AwardSettings INSTANCE = new LiveMatchItemTop3AwardSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_item_top3_control", DEFAULT);
    }
}
