package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("ai_reply_assistant_watcher_dismiss_duration")
public final class AIReplyAssistantWatcherDismissDurationSetting {
    public static final int DEFAULT = 2000;
    public static final AIReplyAssistantWatcherDismissDurationSetting INSTANCE = new AIReplyAssistantWatcherDismissDurationSetting();

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ai_reply_assistant_watcher_dismiss_duration", DEFAULT);
    }
}
