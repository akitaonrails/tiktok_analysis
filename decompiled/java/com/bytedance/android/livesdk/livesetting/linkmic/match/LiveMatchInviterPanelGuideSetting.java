package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_inviter_panel_guide_count")
public final class LiveMatchInviterPanelGuideSetting {
    public static final LiveMatchInviterPanelGuideSetting INSTANCE = new LiveMatchInviterPanelGuideSetting();
    public static final int DEFAULT = 1;

    public final int getMaxCount() {
        return SettingsManager.INSTANCE.getIntValue("live_match_inviter_panel_guide_count", DEFAULT);
    }
}
