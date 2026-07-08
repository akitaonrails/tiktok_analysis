package com.bytedance.android.livesdk.livesetting.pcs;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("pcs_faq_chatbot_urls")
public final class PcsCoursePageFaqSetting {
    public static PcsCourseFaqSchemaMap schemaMap;
    public static final PcsCoursePageFaqSetting INSTANCE = new PcsCoursePageFaqSetting();
    public static final String DEFAULT = "";

    public final PcsCourseFaqSchemaMap getValue() {
        if (schemaMap == null) {
            schemaMap = new PcsCourseFaqSchemaMap(SettingsManager.INSTANCE.getStringValue("pcs_faq_chatbot_urls", DEFAULT));
        }
        PcsCourseFaqSchemaMap pcsCourseFaqSchemaMap = schemaMap;
        return pcsCourseFaqSchemaMap == null ? new PcsCourseFaqSchemaMap("") : pcsCourseFaqSchemaMap;
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
