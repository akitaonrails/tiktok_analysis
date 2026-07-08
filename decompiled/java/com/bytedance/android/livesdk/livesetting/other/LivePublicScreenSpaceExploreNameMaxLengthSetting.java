package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_comment_user_name_max_length")
public final class LivePublicScreenSpaceExploreNameMaxLengthSetting {
    public static final LivePublicScreenSpaceExploreNameMaxLengthSetting INSTANCE = new LivePublicScreenSpaceExploreNameMaxLengthSetting();
    public static final int DEFAULT = 15;

    public final int getNameMaxLength() {
        return SettingsManager.INSTANCE.getIntValue(LivePublicScreenSpaceExploreNameMaxLengthSetting.class);
    }
}
