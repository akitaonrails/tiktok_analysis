package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("enable_match_gift_panel_community_default_opt")
public final class LiveMatchGiftPanelBehaviorOpt {
    public static final boolean DEFAULT = true;
    public static final LiveMatchGiftPanelBehaviorOpt INSTANCE = new LiveMatchGiftPanelBehaviorOpt();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_match_gift_panel_community_default_opt", DEFAULT);
    }
}
