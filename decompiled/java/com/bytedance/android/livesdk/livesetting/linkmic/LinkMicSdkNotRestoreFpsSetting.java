package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_sdk_not_restore_fps")
public final class LinkMicSdkNotRestoreFpsSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicSdkNotRestoreFpsSetting INSTANCE = new LinkMicSdkNotRestoreFpsSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_sdk_not_restore_fps", DEFAULT);
    }
}
