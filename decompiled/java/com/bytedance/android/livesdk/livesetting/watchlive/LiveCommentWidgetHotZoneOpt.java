package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_comment_widget_bottom_hot_zone_opt")
public final class LiveCommentWidgetHotZoneOpt {
    public static final boolean DEFAULT = false;
    public static final LiveCommentWidgetHotZoneOpt INSTANCE = new LiveCommentWidgetHotZoneOpt();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_comment_widget_bottom_hot_zone_opt", DEFAULT);
    }
}
