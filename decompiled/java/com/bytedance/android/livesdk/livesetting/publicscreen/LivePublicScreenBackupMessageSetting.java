package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_backup_message_max_count")
public final class LivePublicScreenBackupMessageSetting {
    public static final int DEFAULT = 0;
    public static final LivePublicScreenBackupMessageSetting INSTANCE = new LivePublicScreenBackupMessageSetting();

    public static /* synthetic */ void getPublicScreenBackupMaxCount$annotations() {
    }

    public static final int getPublicScreenBackupMaxCount() {
        return SettingsManager.INSTANCE.getIntValue("live_public_screen_backup_message_max_count", DEFAULT);
    }
}
