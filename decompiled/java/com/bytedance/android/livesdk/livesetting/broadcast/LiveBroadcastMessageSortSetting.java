package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("host_public_screen_message_sort")
public final class LiveBroadcastMessageSortSetting {
    public static final LiveBroadcastMessageSortConfig DEFAULT;
    public static final LiveBroadcastMessageSortSetting INSTANCE = new LiveBroadcastMessageSortSetting();
    public static final LiveBroadcastMessageSortConfig config;

    static {
        LiveBroadcastMessageSortConfig liveBroadcastMessageSortConfig = new LiveBroadcastMessageSortConfig(0, "");
        DEFAULT = liveBroadcastMessageSortConfig;
        config = (LiveBroadcastMessageSortConfig) SettingsManager.INSTANCE.getValueSafely("host_public_screen_message_sort", liveBroadcastMessageSortConfig);
    }

    public final String getSortPriority() {
        return config.getSortPriority();
    }

    public final boolean isAllMessageSort() {
        return config.getSortType() == 2;
    }

    public final boolean isCommentSort() {
        return config.getSortType() == 1;
    }

    public final boolean isInExperiment() {
        return config.getSortType() != 0;
    }
}
