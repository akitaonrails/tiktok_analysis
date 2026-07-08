package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("asia_beauty_gender_opt")
public final class LiveAsiaBeautyGenderOpt {
    public static final int DEFAULT = 0;
    public static final LiveAsiaBeautyGenderOpt INSTANCE = new LiveAsiaBeautyGenderOpt();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("asia_beauty_gender_opt", DEFAULT) == 1;
    }
}
