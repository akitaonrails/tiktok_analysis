package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_follow_view_single_line")
public final class LiveFollowViewSingleLineSetting {
    public static final LiveFollowViewSingleLineSetting INSTANCE = new LiveFollowViewSingleLineSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_follow_view_single_line", true);

    public final boolean enable() {
        return value;
    }
}
