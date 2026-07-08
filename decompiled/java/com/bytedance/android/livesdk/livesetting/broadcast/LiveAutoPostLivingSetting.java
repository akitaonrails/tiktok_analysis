package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("auto_post_living")
public final class LiveAutoPostLivingSetting {
    public static final int DEFAULT = 0;
    public static final LiveAutoPostLivingSetting INSTANCE = new LiveAutoPostLivingSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getIntValue("auto_post_living", DEFAULT) != 0;
    }
}
