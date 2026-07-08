package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlh_disable_finish_probe_gear_restrict")
public final class TTLHDisableFinishProbeGearRestrict {
    public static final int DEFAULT = 0;
    public static final TTLHDisableFinishProbeGearRestrict INSTANCE = new TTLHDisableFinishProbeGearRestrict();

    public final boolean disable() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_disable_finish_probe_gear_restrict", DEFAULT) == 1;
    }
}
