package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.LiveSettingManagerSolidifyUtils;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_banner_optimize")
public final class LiveBannerOptimizeSetting {
    public static final boolean DEFAULT = true;
    public static final LiveBannerOptimizeSetting INSTANCE = new LiveBannerOptimizeSetting();
    public static final C01GW solidifyValue$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(37));

    private final boolean getSolidifyValue() {
        return ((Boolean) solidifyValue$delegate.getValue()).booleanValue();
    }

    public final boolean enable() {
        return LiveSettingManagerSolidifyUtils.INSTANCE.isSolidifyEnable("live_banner_optimize") ? getSolidifyValue() : SettingsManager.INSTANCE.getBooleanValue("live_banner_optimize", DEFAULT);
    }
}
