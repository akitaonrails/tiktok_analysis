package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("live_share_post")
public final class LiveUserPostHighlightSetting {
    public static final boolean DEFAULT = false;
    public static final LiveUserPostHighlightSetting INSTANCE = new LiveUserPostHighlightSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_share_post", DEFAULT);
    }
}
