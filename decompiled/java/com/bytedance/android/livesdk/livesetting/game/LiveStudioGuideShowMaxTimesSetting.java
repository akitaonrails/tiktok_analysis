package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("max_show_guideLS_times")
public final class LiveStudioGuideShowMaxTimesSetting {
    public static final int DEFAULT = 1;
    public static final LiveStudioGuideShowMaxTimesSetting INSTANCE = new LiveStudioGuideShowMaxTimesSetting();

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue("max_show_guideLS_times", DEFAULT);
    }
}
