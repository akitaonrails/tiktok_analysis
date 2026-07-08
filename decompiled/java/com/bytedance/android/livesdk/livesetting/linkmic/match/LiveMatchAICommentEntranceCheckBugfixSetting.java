package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("ai_commentary_entrance_check_bugfix")
public final class LiveMatchAICommentEntranceCheckBugfixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchAICommentEntranceCheckBugfixSetting INSTANCE = new LiveMatchAICommentEntranceCheckBugfixSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ai_commentary_entrance_check_bugfix", DEFAULT);
    }
}
