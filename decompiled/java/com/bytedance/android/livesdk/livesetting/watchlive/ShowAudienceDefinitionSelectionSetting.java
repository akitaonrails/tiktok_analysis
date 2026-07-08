package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("show_audience_definition_selection")
public final class ShowAudienceDefinitionSelectionSetting {
    public static final int DEFAULT = 0;
    public static final int ENABLE = 1;
    public static final ShowAudienceDefinitionSelectionSetting INSTANCE = new ShowAudienceDefinitionSelectionSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("show_audience_definition_selection", DEFAULT) == 1;
    }
}
