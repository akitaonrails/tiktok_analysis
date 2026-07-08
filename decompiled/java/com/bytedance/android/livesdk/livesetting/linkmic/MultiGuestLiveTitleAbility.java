package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_live_title_ability")
public final class MultiGuestLiveTitleAbility {
    public static final int DEFAULT = 0;
    public static final MultiGuestLiveTitleAbility INSTANCE = new MultiGuestLiveTitleAbility();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestLiveTitleAbility.class);
    }
}
