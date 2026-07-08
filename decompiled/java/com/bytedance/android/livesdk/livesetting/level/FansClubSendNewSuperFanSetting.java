package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("fans_club_send_new_super_fan")
public final class FansClubSendNewSuperFanSetting {
    public static final boolean DEFAULT = true;
    public static final FansClubSendNewSuperFanSetting INSTANCE = new FansClubSendNewSuperFanSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("fans_club_send_new_super_fan", DEFAULT);
    }
}
