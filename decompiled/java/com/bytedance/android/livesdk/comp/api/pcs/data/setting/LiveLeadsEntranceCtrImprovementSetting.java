package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_leads_entrance_ctr_improvement")
public final class LiveLeadsEntranceCtrImprovementSetting {
    public static final int DEFAULT = 0;
    public static final int DEFAULT_1 = 1;
    public static final int DEFAULT_2 = 2;
    public static final int DEFAULT_3 = 3;
    public static final LiveLeadsEntranceCtrImprovementSetting INSTANCE = new LiveLeadsEntranceCtrImprovementSetting();

    public final boolean displayBizComponent() {
        return C1697810uHb.LJIIJJI(1, 2).contains(Integer.valueOf(getValue()));
    }

    public final boolean displayUpdatedIcon() {
        return C1697810uHb.LJIIJJI(1, 3).contains(Integer.valueOf(getValue()));
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_leads_entrance_ctr_improvement", DEFAULT);
    }
}
