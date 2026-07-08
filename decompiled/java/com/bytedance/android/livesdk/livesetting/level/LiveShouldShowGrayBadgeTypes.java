package com.bytedance.android.livesdk.livesetting.level;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_should_show_gray_badge_scene_type")
public final class LiveShouldShowGrayBadgeTypes {
    public static final LiveShouldShowGrayBadgeTypes INSTANCE = new LiveShouldShowGrayBadgeTypes();
    public static final String[] DEFAULT = {"10"};

    private final String[] getBadgeTypes() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_should_show_gray_badge_scene_type", DEFAULT);
    }

    public final boolean isShouldShowGrayBadgeType(int i) {
        return C13LQ.LJIILLIIL(String.valueOf(i), getBadgeTypes());
    }
}
