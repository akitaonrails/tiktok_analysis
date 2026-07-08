package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_game_permission_auto_cancel_fix_setting")
public final class LiveGameBroadcastPermissionAutoCancelSettingSetting {
    public static final long DEFAULT = 1000;
    public static final LiveGameBroadcastPermissionAutoCancelSettingSetting INSTANCE = new LiveGameBroadcastPermissionAutoCancelSettingSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_game_permission_auto_cancel_fix_setting", DEFAULT);
    }
}
