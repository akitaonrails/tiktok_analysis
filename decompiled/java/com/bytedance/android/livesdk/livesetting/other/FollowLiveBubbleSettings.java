package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("follow_live_bubble")
public final class FollowLiveBubbleSettings {
    public static final FollowLiveBubbleConfig DEFAULT;
    public static final FollowLiveBubbleSettings INSTANCE = new FollowLiveBubbleSettings();
    public static final FollowLiveBubbleConfig V2;
    public static final FollowLiveBubbleConfig V3;

    static {
        FollowLiveBubbleConfig followLiveBubbleConfig = FollowLiveBubbleConfig.LIZ;
        DEFAULT = FollowLiveBubbleConfig.LIZ;
        FollowLiveBubbleConfig followLiveBubbleConfig2 = new FollowLiveBubbleConfig();
        followLiveBubbleConfig2.expGroup = 2;
        V2 = followLiveBubbleConfig2;
        FollowLiveBubbleConfig followLiveBubbleConfig3 = new FollowLiveBubbleConfig();
        followLiveBubbleConfig3.expGroup = 3;
        V3 = followLiveBubbleConfig3;
    }

    public final int getDiffTime() {
        FollowLiveBubbleConfig followLiveBubbleConfig = (FollowLiveBubbleConfig) SettingsManager.INSTANCE.getValueSafely("follow_live_bubble", DEFAULT);
        if (followLiveBubbleConfig != null) {
            return followLiveBubbleConfig.diffTime;
        }
        return 0;
    }

    public final int getExpGroup() {
        FollowLiveBubbleConfig followLiveBubbleConfig = (FollowLiveBubbleConfig) SettingsManager.INSTANCE.getValueSafely("follow_live_bubble", DEFAULT);
        if (followLiveBubbleConfig != null) {
            return followLiveBubbleConfig.expGroup;
        }
        return 0;
    }
}
