package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_cohost_badge_shown_before_animation")
public final class LiveCohostBadgeShownBeforeAnimation {
    public static final boolean DEFAULT = true;
    public static final LiveCohostBadgeShownBeforeAnimation INSTANCE = new LiveCohostBadgeShownBeforeAnimation();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_badge_shown_before_animation", DEFAULT);
    }
}
