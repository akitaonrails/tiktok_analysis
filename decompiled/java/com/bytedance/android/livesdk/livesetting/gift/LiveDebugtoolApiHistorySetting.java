package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_debugtool_api_history")
public final class LiveDebugtoolApiHistorySetting {
    public static final LiveDebugtoolApiHistorySetting INSTANCE = new LiveDebugtoolApiHistorySetting();
    public static final ApiHistorySettingParams DEFAULT = new ApiHistorySettingParams(false, null, 3, null);

    private final ApiHistorySettingParams getSettingParams() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ApiHistorySettingParams apiHistorySettingParams = DEFAULT;
        ApiHistorySettingParams apiHistorySettingParams2 = (ApiHistorySettingParams) settingsManager.getValueSafely("live_debugtool_api_history", apiHistorySettingParams);
        return apiHistorySettingParams2 != null ? apiHistorySettingParams2 : apiHistorySettingParams;
    }

    public final List<String> getAllowlist() {
        return getSettingParams().allowlist;
    }

    public final boolean isEnabled() {
        return getSettingParams().enabled;
    }

    public final ApiHistorySettingParams getDEFAULT() {
        return DEFAULT;
    }
}
