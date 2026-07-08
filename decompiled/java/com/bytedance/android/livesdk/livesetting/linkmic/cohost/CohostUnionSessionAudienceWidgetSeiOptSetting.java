package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_unionsession_audience_widget_sei_opt")
public final class CohostUnionSessionAudienceWidgetSeiOptSetting {
    public static final boolean DEFAULT = true;
    public static final CohostUnionSessionAudienceWidgetSeiOptSetting INSTANCE = new CohostUnionSessionAudienceWidgetSeiOptSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_unionsession_audience_widget_sei_opt", DEFAULT);
    }
}
