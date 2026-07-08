package com.bytedance.android.livesdk.livesetting.performance;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.LiveSettingManagerSolidifyUtils;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("setting_cache_opt")
public final class LiveSettingCacheOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveSettingCacheOptSetting INSTANCE = new LiveSettingCacheOptSetting();
    public static final C01GW solidifyValue$delegate = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(338));
    public static int value = -1;

    public static final boolean enableSettingCacheOpt() {
        if (value < 0) {
            value = LiveSettingManagerSolidifyUtils.INSTANCE.isSolidifyEnable("setting_cache_opt") ? INSTANCE.getSolidifyValue() : SettingsManager.INSTANCE.getIntValue("setting_cache_opt", DEFAULT);
        }
        return value == 1;
    }

    private final int getSolidifyValue() {
        return ((Number) solidifyValue$delegate.getValue()).intValue();
    }
}
