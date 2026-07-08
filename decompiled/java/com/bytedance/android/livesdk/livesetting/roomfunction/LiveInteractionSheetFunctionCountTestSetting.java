package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_interaction_sheet_function_count_test_setting")
public final class LiveInteractionSheetFunctionCountTestSetting {
    public static final int DEFAULT = -1;
    public static final LiveInteractionSheetFunctionCountTestSetting INSTANCE = new LiveInteractionSheetFunctionCountTestSetting();

    public final int getTestCount() {
        return SettingsManager.INSTANCE.getIntValue("live_interaction_sheet_function_count_test_setting", DEFAULT);
    }
}
