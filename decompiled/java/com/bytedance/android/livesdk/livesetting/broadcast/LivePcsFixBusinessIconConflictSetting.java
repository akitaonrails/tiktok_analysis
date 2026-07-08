package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_fix_business_icon_conflict")
public final class LivePcsFixBusinessIconConflictSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsFixBusinessIconConflictSetting INSTANCE = new LivePcsFixBusinessIconConflictSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pcs_fix_business_icon_conflict", DEFAULT);
    }
}
