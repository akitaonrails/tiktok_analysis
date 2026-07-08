package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_fans_community_gift_new_expiration_date")
public final class LiveFansCommunityGiftNewExpirationDateSetting {
    public static final long DEFAULT = 1771051257;
    public static final LiveFansCommunityGiftNewExpirationDateSetting INSTANCE = new LiveFansCommunityGiftNewExpirationDateSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_fans_community_gift_new_expiration_date", DEFAULT);
    }
}
