package com.bytedance.android.livesdk.api.revenue.crm;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "crm_lynx_widget_setting_2")
public final class CRMUseLynxWidget {
    public static final int DEFAULT = 0;
    public static final CRMUseLynxWidget INSTANCE = new CRMUseLynxWidget();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("crm_lynx_widget_setting_2", DEFAULT);
    }
}
