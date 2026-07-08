package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_backup_for_push_stream_setting")
public final class MultiGuestBackupForPushStreamSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestBackupForPushStreamSetting INSTANCE = new MultiGuestBackupForPushStreamSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_backup_for_push_stream_setting", DEFAULT);
    }
}
