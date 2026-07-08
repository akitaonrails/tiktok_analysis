package com.bytedance.android.livesdk.livesetting.level;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_celebration_gift_ids")
public final class FansClubCelebrationGiftIdsSetting {
    public static final FansClubCelebrationGiftIdsSetting INSTANCE = new FansClubCelebrationGiftIdsSetting();
    public static final List<String> DEFAULT = C1697810uHb.LJIIJJI("12678", "12679", "12680");

    public final List<String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<String> list = DEFAULT;
        List<String> list2 = (List) settingsManager.getValueSafely("live_gift_celebration_gift_ids", list);
        return list2 != null ? list2 : list;
    }
}
