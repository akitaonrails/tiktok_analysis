package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_public_screen_backup_message_valid_time")
public final class LivePublicScreenBackupMessageExpiredTime {
    public static final LivePublicScreenBackupMessageExpiredTime INSTANCE = new LivePublicScreenBackupMessageExpiredTime();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_public_screen_backup_message_valid_time", DEFAULT);

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final int getValue() {
        return value;
    }
}
