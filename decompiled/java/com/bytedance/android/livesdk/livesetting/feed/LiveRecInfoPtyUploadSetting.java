package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_rec_info_update_pty")
public final class LiveRecInfoPtyUploadSetting {
    public static final boolean DEFAULT = false;
    public static final LiveRecInfoPtyUploadSetting INSTANCE = new LiveRecInfoPtyUploadSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_rec_info_update_pty", DEFAULT);
    }
}
