package com.bytedance.android.livesdk.livesetting.pcs;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_smb_entrance_opt")
public final class LivePcsSmbEntranceOpt {
    public static final boolean DEFAULT = false;
    public static final LivePcsSmbEntranceOpt INSTANCE = new LivePcsSmbEntranceOpt();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pcs_smb_entrance_opt", DEFAULT);
    }
}
