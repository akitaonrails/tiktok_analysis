package com.bytedance.android.livesdk.livesetting.creatorteam;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_creator_celebration_recently_upgraded_members_limit")
public final class LiveCreatorCelebrationRecentlyUpgradedMembersLimit {
    public static final int DEFAULT = 20;
    public static final LiveCreatorCelebrationRecentlyUpgradedMembersLimit INSTANCE = new LiveCreatorCelebrationRecentlyUpgradedMembersLimit();

    public final int maxValue() {
        return SettingsManager.INSTANCE.getIntValue("live_creator_celebration_recently_upgraded_members_limit", DEFAULT);
    }
}
