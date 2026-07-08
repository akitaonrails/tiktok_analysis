package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("share_guide_tooltip_id")
public final class LiveShareGuideTooltipIdSetting {
    public static final String DEFAULT = "ShareGuideBubble";
    public static final LiveShareGuideTooltipIdSetting INSTANCE = new LiveShareGuideTooltipIdSetting();

    public final String getId() {
        return SettingsManager.INSTANCE.getStringValue("share_guide_tooltip_id", DEFAULT);
    }
}
