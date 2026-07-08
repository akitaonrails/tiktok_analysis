package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.config.LiveGameFloatMsgPanelConfig;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_game_float_msg_panel_config")
public final class LiveGameFloatMsgPanelConfigSetting {
    public static final LiveGameFloatMsgPanelConfigSetting INSTANCE = new LiveGameFloatMsgPanelConfigSetting();
    public static final LiveGameFloatMsgPanelConfig DEFAULT = new LiveGameFloatMsgPanelConfig();

    public final LiveGameFloatMsgPanelConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveGameFloatMsgPanelConfig liveGameFloatMsgPanelConfig = DEFAULT;
        LiveGameFloatMsgPanelConfig liveGameFloatMsgPanelConfig2 = (LiveGameFloatMsgPanelConfig) settingsManager.getValueSafely("live_game_float_msg_panel_config", liveGameFloatMsgPanelConfig);
        return liveGameFloatMsgPanelConfig2 != null ? liveGameFloatMsgPanelConfig2 : liveGameFloatMsgPanelConfig;
    }
}
