package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("enable_moderator_new_advice")
public final class LiveModeratorNewSuggestionSetting {
    public static final int DEFAULT = 0;
    public static final LiveModeratorNewSuggestionSetting INSTANCE = new LiveModeratorNewSuggestionSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("enable_moderator_new_advice", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() > 0;
    }
}
