package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_match_thumb_not_showing_fix")
public final class LiveMatchThumbNotShowingFixSetting {
    public static final LiveMatchThumbNotShowingFixSetting INSTANCE = new LiveMatchThumbNotShowingFixSetting();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_thumb_not_showing_fix", DEFAULT);
    }
}
