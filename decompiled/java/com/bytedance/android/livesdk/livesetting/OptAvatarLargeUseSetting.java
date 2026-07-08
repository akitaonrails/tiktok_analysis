package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "opt_avatar_large_use")
public final class OptAvatarLargeUseSetting {
    public static final OptAvatarLargeUseSetting INSTANCE = new OptAvatarLargeUseSetting();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("opt_avatar_large_use", DEFAULT);

    public final boolean enable() {
        return value > 0;
    }

    public final boolean v2() {
        return value == 2;
    }
}
