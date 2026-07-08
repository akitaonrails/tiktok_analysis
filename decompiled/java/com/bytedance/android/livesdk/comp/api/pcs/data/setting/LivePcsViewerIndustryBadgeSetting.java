package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_smb_viewer_industry_badge")
public final class LivePcsViewerIndustryBadgeSetting {
    public static final boolean DEFAULT = true;
    public static final LivePcsViewerIndustryBadgeSetting INSTANCE = new LivePcsViewerIndustryBadgeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_smb_viewer_industry_badge", DEFAULT);
    }
}
