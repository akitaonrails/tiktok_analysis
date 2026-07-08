package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_inviter_panel_lynx_config_mock_error")
public final class LiveMatchInviterPanelLynxMockErrorSetting {
    public static final LiveMatchInviterPanelLynxMockErrorSetting INSTANCE = new LiveMatchInviterPanelLynxMockErrorSetting();
    public static final MatchInviterPanelLynxMockErrorConfig DEFAULT = new MatchInviterPanelLynxMockErrorConfig(false, false, false, false);

    public final MatchInviterPanelLynxMockErrorConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MatchInviterPanelLynxMockErrorConfig matchInviterPanelLynxMockErrorConfig = DEFAULT;
        MatchInviterPanelLynxMockErrorConfig matchInviterPanelLynxMockErrorConfig2 = (MatchInviterPanelLynxMockErrorConfig) settingsManager.getValueSafely("live_match_inviter_panel_lynx_config_mock_error", matchInviterPanelLynxMockErrorConfig);
        return matchInviterPanelLynxMockErrorConfig2 != null ? matchInviterPanelLynxMockErrorConfig2 : matchInviterPanelLynxMockErrorConfig;
    }

    public final boolean isErrorAfterInvite() {
        return getConfig().errorAfterInvite;
    }

    public final boolean isErrorBeforeInvite() {
        return getConfig().errorBeforeInvite;
    }

    public final boolean isStartUpError() {
        return getConfig().startUpError;
    }

    public final boolean isTimeoutError() {
        return getConfig().timeUpError;
    }
}
