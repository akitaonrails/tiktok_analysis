package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_remove_chat_message_while_showing_ai_summary")
public final class LivePublicScreenAiSummaryOptSetting {
    public static final boolean DEFAULT = false;
    public static final LivePublicScreenAiSummaryOptSetting INSTANCE = new LivePublicScreenAiSummaryOptSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_remove_chat_message_while_showing_ai_summary", DEFAULT);
    }
}
