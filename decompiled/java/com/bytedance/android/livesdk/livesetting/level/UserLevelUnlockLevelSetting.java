package com.bytedance.android.livesdk.livesetting.level;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_user_level_unlock_level")
public final class UserLevelUnlockLevelSetting {
    public static final UserLevelUnlockLevelSetting INSTANCE = new UserLevelUnlockLevelSetting();
    public static final List<Integer> DEFAULT = C1697810uHb.LJIIJJI(10, 15, 20, 25, 30, 40);

    public final List<Integer> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<Integer> list = DEFAULT;
        List<Integer> list2 = (List) settingsManager.getValueSafely("live_user_level_unlock_level", list);
        return list2 != null ? list2 : list;
    }
}
