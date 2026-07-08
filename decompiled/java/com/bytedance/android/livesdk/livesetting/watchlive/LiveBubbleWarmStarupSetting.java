package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C486960J7u;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey("live_bubble_warm_startup")
public final class LiveBubbleWarmStarupSetting {
    public static final boolean DEFAULT = true;
    public static final LiveBubbleWarmStarupSetting INSTANCE = new LiveBubbleWarmStarupSetting();

    public final boolean enable() {
        if (C486960J7u.LIZ()) {
            return true;
        }
        return SettingsManager.INSTANCE.getBooleanValue("live_bubble_warm_startup", DEFAULT);
    }
}
