package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_service_bio_revamp_opt")
public final class LivePcsServiceBioRevampOptSetting {
    public static final int DEFAULT = 0;
    public static final LivePcsServiceBioRevampOptSetting INSTANCE = new LivePcsServiceBioRevampOptSetting();
    public static final int V1 = 1;
    public static final int V2 = 2;
    public static final int V3 = 3;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pcs_service_bio_revamp_opt", DEFAULT);
    }

    public final boolean enableCatchInFlightRequest() {
        return getValue() == 1 || getValue() == 3;
    }

    public final boolean enableOpeningAnimationOpt() {
        return getValue() > 0;
    }

    public final boolean enablePreloadUI() {
        return getValue() == 2 || getValue() == 3;
    }
}
