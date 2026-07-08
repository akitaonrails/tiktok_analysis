package com.bytedance.android.livesdk.api.revenue.crm;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_hide_crm_tips_widget")
public final class LiveHideCrmTipsWidgetSetting {
    public static final int DEFAULT = 0;
    public static final LiveHideCrmTipsWidgetSetting INSTANCE = new LiveHideCrmTipsWidgetSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_hide_crm_tips_widget", DEFAULT);
    }
}
