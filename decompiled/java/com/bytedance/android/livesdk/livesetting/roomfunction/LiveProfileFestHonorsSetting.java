package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_profile_fest_honors")
public final class LiveProfileFestHonorsSetting {
    public static final boolean DEFAULT = true;
    public static final LiveProfileFestHonorsSetting INSTANCE = new LiveProfileFestHonorsSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_profile_fest_honors", DEFAULT);
    }
}
