package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_capsule_style")
public final class LiveCapsuleStyleSetting {
    public static final int DEFAULT = 0;
    public static final LiveCapsuleStyleSetting INSTANCE = new LiveCapsuleStyleSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_capsule_style", DEFAULT);
    }
}
