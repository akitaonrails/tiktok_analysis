package com.bytedance.android.livesdk.livesetting.pcs;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("pcs_course_page_schema")
public final class PcsCoursePageSchemaSetting {
    public static PcsCoursePageSchemaMap schemaMap;
    public static final PcsCoursePageSchemaSetting INSTANCE = new PcsCoursePageSchemaSetting();
    public static final String DEFAULT = "";

    public final PcsCoursePageSchemaMap getValue() {
        if (schemaMap == null) {
            schemaMap = new PcsCoursePageSchemaMap(SettingsManager.INSTANCE.getStringValue("pcs_course_page_schema", DEFAULT));
        }
        PcsCoursePageSchemaMap pcsCoursePageSchemaMap = schemaMap;
        return pcsCoursePageSchemaMap == null ? new PcsCoursePageSchemaMap("") : pcsCoursePageSchemaMap;
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
