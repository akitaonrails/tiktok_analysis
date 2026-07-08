package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsNewFormEnableSettingV2;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey(preciseExperiment = false, value = "live_smb_service_bio_design_opt")
public final class LiveSmbServiceBioDesignOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveSmbServiceBioDesignOptSetting INSTANCE = new LiveSmbServiceBioDesignOptSetting();
    public static final int NEW_AGGREGATED_SKU_STYLE = 1;
    public static final int NEW_AGGREGATED_SKU_STYLE_WITHOUT_CAUTION_BUTTON = 3;
    public static final int NEW_INDIVIDUAL_SKU_STYLE = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_smb_service_bio_design_opt", DEFAULT);
    }

    public final boolean useNewNativeForm() {
        return LivePcsNewFormEnableSettingV2.INSTANCE.getValue();
    }

    public final boolean enableAggregatedSkuStyle() {
        return getValue() == 1 || getValue() == 3;
    }

    public final boolean enableAggregatedSkuStyleWithoutCautionBtn() {
        return getValue() == 3;
    }

    public final boolean enableIndividualSkuStyle() {
        return getValue() == 2;
    }

    public final boolean useNewBioPage() {
        return getValue() >= 1;
    }
}
