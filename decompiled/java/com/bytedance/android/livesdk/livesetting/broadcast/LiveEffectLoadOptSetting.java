package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_effect_load_opt")
public final class LiveEffectLoadOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveEffectLoadOptSetting INSTANCE = new LiveEffectLoadOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_effect_load_opt", DEFAULT);
    }

    public final boolean allowPageLoad() {
        return getValue() > 1;
    }

    public final boolean isEnable() {
        return getValue() > 0;
    }

    public final int getStickerPageSize(String str) {
        if (allowPageLoad() && Intrinsics.LJFF(str, "trending")) {
            return 50;
        }
        return 0;
    }
}
