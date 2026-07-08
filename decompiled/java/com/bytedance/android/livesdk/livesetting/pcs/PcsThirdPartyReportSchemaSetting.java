package com.bytedance.android.livesdk.livesetting.pcs;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("pcs_third_party_biolink_schema")
public final class PcsThirdPartyReportSchemaSetting {
    public static PcsThirdPartyReportSchemaMap schemaMap;
    public static final PcsThirdPartyReportSchemaSetting INSTANCE = new PcsThirdPartyReportSchemaSetting();
    public static final String DEFAULT = "";

    public final PcsThirdPartyReportSchemaMap getValue() {
        if (schemaMap == null) {
            schemaMap = new PcsThirdPartyReportSchemaMap(SettingsManager.INSTANCE.getStringValue("pcs_third_party_biolink_schema", DEFAULT));
        }
        PcsThirdPartyReportSchemaMap pcsThirdPartyReportSchemaMap = schemaMap;
        return pcsThirdPartyReportSchemaMap == null ? new PcsThirdPartyReportSchemaMap("") : pcsThirdPartyReportSchemaMap;
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
