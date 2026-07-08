package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_fold_landscape")
public final class LiveFoldLandscapeSetting {
    public static final LiveFoldLandscapeSetting INSTANCE = new LiveFoldLandscapeSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fold_landscape", DEFAULT);
    }
}
