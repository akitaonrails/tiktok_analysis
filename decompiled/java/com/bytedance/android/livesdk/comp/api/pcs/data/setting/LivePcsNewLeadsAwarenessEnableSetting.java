package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_new_leads_awareness_enable")
public final class LivePcsNewLeadsAwarenessEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsNewLeadsAwarenessEnableSetting INSTANCE = new LivePcsNewLeadsAwarenessEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pcs_new_leads_awareness_enable", DEFAULT);
    }
}
