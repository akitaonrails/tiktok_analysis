package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_campaign_schema")
public final class LiveCampaignSchemaSetting {
    public static final LiveCampaignSchemaSetting INSTANCE = new LiveCampaignSchemaSetting();
    public static final CampaignSchemaData DEFAULT = new CampaignSchemaData("", "");

    public final String getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        CampaignSchemaData campaignSchemaData = DEFAULT;
        CampaignSchemaData campaignSchemaData2 = (CampaignSchemaData) settingsManager.getValueSafely("live_campaign_schema", campaignSchemaData);
        if (campaignSchemaData2 != null) {
            campaignSchemaData = campaignSchemaData2;
        }
        return campaignSchemaData.popup;
    }
}
