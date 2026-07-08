package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_scroll_angle")
public final class LiveScrollAngleSetting {
    public static final int DEFAULT = 0;
    public static final LiveScrollAngleSetting INSTANCE = new LiveScrollAngleSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_scroll_angle", DEFAULT);
    }
}
