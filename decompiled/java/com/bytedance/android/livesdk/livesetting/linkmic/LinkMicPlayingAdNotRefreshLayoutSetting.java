package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("multi_guest_play_ad_not_refresh_layout")
public final class LinkMicPlayingAdNotRefreshLayoutSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicPlayingAdNotRefreshLayoutSetting INSTANCE = new LinkMicPlayingAdNotRefreshLayoutSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_play_ad_not_refresh_layout", DEFAULT);
    }
}
