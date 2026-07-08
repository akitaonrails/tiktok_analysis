package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_text_operation_state_parse_enable")
public final class LiveTextOperationStateParserSetting {
    public static final LiveTextOperationStateParserSetting INSTANCE = new LiveTextOperationStateParserSetting();
    public static final boolean DEFAULT = true;

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_text_operation_state_parse_enable", DEFAULT);
    }
}
