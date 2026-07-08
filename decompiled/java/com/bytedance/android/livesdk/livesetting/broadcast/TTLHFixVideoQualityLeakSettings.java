package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("fix_video_quality_leak")
public final class TTLHFixVideoQualityLeakSettings {
    public static final int DEFAULT = 0;
    public static final TTLHFixVideoQualityLeakSettings INSTANCE = new TTLHFixVideoQualityLeakSettings();
    public static final int ENABLE = 1;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("fix_video_quality_leak", DEFAULT) == ENABLE;
    }
}
