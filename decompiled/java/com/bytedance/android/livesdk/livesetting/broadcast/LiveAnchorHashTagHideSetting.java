package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_anchor_topic_hide")
public final class LiveAnchorHashTagHideSetting {
    public static final LiveAnchorHashTagHideSetting INSTANCE = new LiveAnchorHashTagHideSetting();
    public static final int DEFAULT = 1;

    private final int getSettingValue() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_topic_hide", DEFAULT);
    }

    public final boolean enable() {
        return getSettingValue() > 0;
    }
}
