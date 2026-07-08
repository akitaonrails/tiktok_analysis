package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_tooltip_nudge_share_guide")
public final class LiveTooltipNudgeShareGuideSetting {
    public static final int DEFAULT = 0;
    public static final LiveTooltipNudgeShareGuideSetting INSTANCE = new LiveTooltipNudgeShareGuideSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getIntValue("live_tooltip_nudge_share_guide", DEFAULT) > 0;
    }
}
