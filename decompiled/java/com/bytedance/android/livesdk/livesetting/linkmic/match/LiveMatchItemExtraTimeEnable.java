package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_match_item_extra_time_enable")
public final class LiveMatchItemExtraTimeEnable {
    public static final boolean DEFAULT = false;
    public static final LiveMatchItemExtraTimeEnable INSTANCE = new LiveMatchItemExtraTimeEnable();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_item_extra_time_enable", DEFAULT);
    }
}
