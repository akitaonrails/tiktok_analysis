package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_monitor_invalidate_msg_switch")
public final class FansClubMonitorInvalidateMsgSettings {
    public static final boolean DEFAULT = false;
    public static final FansClubMonitorInvalidateMsgSettings INSTANCE = new FansClubMonitorInvalidateMsgSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_monitor_invalidate_msg_switch", DEFAULT);
    }
}
