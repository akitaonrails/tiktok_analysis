package com.bytedance.android.livesdk.api.revenue.crm;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "crm_lynx_widget_setting_2_lazyload")
public final class CRMUseLynxWidgetLazyLoad {
    public static final boolean DEFAULT = false;
    public static final CRMUseLynxWidgetLazyLoad INSTANCE = new CRMUseLynxWidgetLazyLoad();

    public final boolean needLazy() {
        return SettingsManager.INSTANCE.getBooleanValue("crm_lynx_widget_setting_2_lazyload", DEFAULT);
    }
}
