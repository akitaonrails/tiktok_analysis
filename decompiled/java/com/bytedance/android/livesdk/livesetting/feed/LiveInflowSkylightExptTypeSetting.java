package com.bytedance.android.livesdk.livesetting.feed;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.LiveSettingManagerSolidifyUtils;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_inflow_skylight_expt_type")
public final class LiveInflowSkylightExptTypeSetting {
    public static final int DEFAULT = 0;
    public static final LiveInflowSkylightExptTypeSetting INSTANCE = new LiveInflowSkylightExptTypeSetting();
    public static final C01GW solidifyValue$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(71));

    private final int getSolidifyValue() {
        return ((Number) solidifyValue$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return LiveSettingManagerSolidifyUtils.INSTANCE.isSolidifyEnable("live_inflow_skylight_expt_type") ? getSolidifyValue() : SettingsManager.INSTANCE.getIntValue("live_inflow_skylight_expt_type", DEFAULT);
    }
}
