package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "studio_nle_public_enable_model_fusion_live")
public final class MultiGuestNoticeBoardFusion {
    public static final boolean DEFAULT = false;
    public static final MultiGuestNoticeBoardFusion INSTANCE = new MultiGuestNoticeBoardFusion();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("studio_nle_public_enable_model_fusion_live", DEFAULT);
    }
}
