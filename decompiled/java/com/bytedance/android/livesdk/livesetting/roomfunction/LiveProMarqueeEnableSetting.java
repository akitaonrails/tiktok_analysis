package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_pro_marquee_enable")
public final class LiveProMarqueeEnableSetting {
    public static final LiveProMarqueeEnableSetting INSTANCE = new LiveProMarqueeEnableSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_pro_marquee_enable", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
