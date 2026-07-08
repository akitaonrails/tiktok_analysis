package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_level_report_abnormal_event")
public final class FansClubAbnormalEventEnableSetting {
    public static final boolean DEFAULT = false;
    public static final FansClubAbnormalEventEnableSetting INSTANCE = new FansClubAbnormalEventEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_level_report_abnormal_event", DEFAULT);
    }
}
