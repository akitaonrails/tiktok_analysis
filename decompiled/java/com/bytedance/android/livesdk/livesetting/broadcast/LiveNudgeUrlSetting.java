package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_nudge_url")
public final class LiveNudgeUrlSetting {
    public static final String DEFAULT = "";
    public static final LiveNudgeUrlSetting INSTANCE = new LiveNudgeUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_nudge_url", DEFAULT);
    }
}
