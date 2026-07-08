package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_smb_audience_badge_detail_schema")
public final class LiveSmbAudienceBadgeDetailSchemaSetting {
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=TT_CSP_Live_sevice_bio_bot&entrance=service_badge_bot";
    public static final LiveSmbAudienceBadgeDetailSchemaSetting INSTANCE = new LiveSmbAudienceBadgeDetailSchemaSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_smb_audience_badge_detail_schema", DEFAULT);
    }
}
