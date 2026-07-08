package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_enable_restore_stage_snap_shot")
public final class TTLHEnableRestoreStageSnapShot {
    public static final int DEFAULT = 0;
    public static final TTLHEnableRestoreStageSnapShot INSTANCE = new TTLHEnableRestoreStageSnapShot();

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_enable_restore_stage_snap_shot", DEFAULT);
    }
}
