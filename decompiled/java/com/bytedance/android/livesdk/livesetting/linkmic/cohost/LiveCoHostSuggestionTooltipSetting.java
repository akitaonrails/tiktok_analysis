package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_suggestion_tooltip")
public final class LiveCoHostSuggestionTooltipSetting {
    public static final LiveCoHostSuggestionTooltipSetting INSTANCE = new LiveCoHostSuggestionTooltipSetting();
    public static final CoHostSuggestionToolTip DEFAULT = new CoHostSuggestionToolTip();

    public final CoHostSuggestionToolTip getValue() {
        return (CoHostSuggestionToolTip) SettingsManager.INSTANCE.getValueSafely("live_cohost_suggestion_tooltip", DEFAULT);
    }

    public final int getTooltipDelay() {
        CoHostSuggestionToolTip value = getValue();
        if (value != null) {
            return value.tooltipDelay;
        }
        return 0;
    }
}
