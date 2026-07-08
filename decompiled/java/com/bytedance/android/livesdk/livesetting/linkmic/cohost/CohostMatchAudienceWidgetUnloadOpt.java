package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_match_audience_widget_unload_opt")
public final class CohostMatchAudienceWidgetUnloadOpt {
    public static final int DEFAULT = 1;
    public static final CohostMatchAudienceWidgetUnloadOpt INSTANCE = new CohostMatchAudienceWidgetUnloadOpt();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("cohost_match_audience_widget_unload_opt", DEFAULT);
    }

    public final boolean isForAllLogic() {
        return getValue() == 2;
    }

    public final boolean isForEventTrackingWatchDurationOnly() {
        return getValue() == 1;
    }
}
