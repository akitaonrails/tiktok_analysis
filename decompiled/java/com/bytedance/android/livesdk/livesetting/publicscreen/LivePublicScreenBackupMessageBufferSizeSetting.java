package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_backup_message_buffer_size")
public final class LivePublicScreenBackupMessageBufferSizeSetting {
    public static final LivePublicScreenBackupMessageBufferSizeSetting INSTANCE = new LivePublicScreenBackupMessageBufferSizeSetting();
    public static final int DEFAULT = 50;

    public static /* synthetic */ void getPublicScreenBackupBufferSize$annotations() {
    }

    public static final int getPublicScreenBackupBufferSize() {
        return SettingsManager.INSTANCE.getIntValue("live_public_screen_backup_message_buffer_size", DEFAULT);
    }
}
