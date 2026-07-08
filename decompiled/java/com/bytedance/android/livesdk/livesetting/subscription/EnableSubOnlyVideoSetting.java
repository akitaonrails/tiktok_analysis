package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("enable_sub_only_video")
public final class EnableSubOnlyVideoSetting {
    public static final boolean DEFAULT = false;
    public static final EnableSubOnlyVideoSetting INSTANCE = new EnableSubOnlyVideoSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_sub_only_video", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
