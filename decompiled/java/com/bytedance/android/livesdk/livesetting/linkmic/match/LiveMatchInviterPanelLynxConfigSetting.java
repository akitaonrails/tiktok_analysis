package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_inviter_panel_lynx_config")
public final class LiveMatchInviterPanelLynxConfigSetting {
    public static final LiveMatchInviterPanelLynxConfigSetting INSTANCE = new LiveMatchInviterPanelLynxConfigSetting();
    public static final MatchInviterPanelLynxConfig DEFAULT = new MatchInviterPanelLynxConfig(false, 1, 3, 3, true, "aweme://roma_redirect/?spark_page=live_match_panel_inner_part", false, "tiktok_live_tt_live_lynx_match_panel", false);

    public final MatchInviterPanelLynxConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MatchInviterPanelLynxConfig matchInviterPanelLynxConfig = DEFAULT;
        MatchInviterPanelLynxConfig matchInviterPanelLynxConfig2 = (MatchInviterPanelLynxConfig) settingsManager.getValueSafely("live_match_inviter_panel_lynx_config", matchInviterPanelLynxConfig);
        return matchInviterPanelLynxConfig2 != null ? matchInviterPanelLynxConfig2 : matchInviterPanelLynxConfig;
    }

    public final String getResourceFetchTriggerKey() {
        return getConfig().resourceFetchTriggerKey;
    }

    public final boolean isEnabled() {
        return getConfig().enabled;
    }

    public final boolean isGuideEnabled() {
        return getConfig().isGuideEnabled;
    }

    public final boolean isSkipMatchModePanel() {
        return getConfig().skipMatchModePanel;
    }

    public final int getDefaultMatchType(int i) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return 0;
                }
                return getConfig().fourPersonDefaultMatchType;
            }
            return getConfig().threePersonDefaultMatchType;
        }
        return getConfig().twoPersonDefaultMatchType;
    }
}
