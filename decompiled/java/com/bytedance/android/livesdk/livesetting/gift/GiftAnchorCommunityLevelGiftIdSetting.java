package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_anchor_community_level_gift_id")
public final class GiftAnchorCommunityLevelGiftIdSetting {
    public static final GiftAnchorCommunityLevelGiftIdSetting INSTANCE = new GiftAnchorCommunityLevelGiftIdSetting();
    public static final long DEFAULT = 7934;
    public static final long value = SettingsManager.INSTANCE.getLongValue("live_anchor_community_level_gift_id", 7934);

    public final long getValue() {
        return value;
    }
}
