package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_chat_line_margin")
public final class LiveChatLineMarginSetting {
    public static final int DEFAULT = -1;
    public static final LiveChatLineMarginSetting INSTANCE = new LiveChatLineMarginSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_chat_line_margin", DEFAULT);
    }
}
