package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_superfan_show_precheck_fail_dialog")
public final class LiveFansClubSuperFanShowPreCheckFailDialogSettings {
    public static final boolean DEFAULT = true;
    public static final LiveFansClubSuperFanShowPreCheckFailDialogSettings INSTANCE = new LiveFansClubSuperFanShowPreCheckFailDialogSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_superfan_show_precheck_fail_dialog", DEFAULT);
    }
}
