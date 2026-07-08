package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_landscape_chat_display_memory")
public final class LandscapeWatchLiveResetMessagePanelState {
    public static final int DEFAULT = 0;
    public static final LandscapeWatchLiveResetMessagePanelState INSTANCE = new LandscapeWatchLiveResetMessagePanelState();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_landscape_chat_display_memory", DEFAULT);
    }

    public final boolean isBlockMessageIconChangedToV2InLandscapeMode() {
        return getValue() > 1;
    }

    public final boolean isResetMessagePanelInLandscapeMode() {
        return getValue() > 0;
    }
}
