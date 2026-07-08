package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("m2l_enable_init_time_cost_opt")
public final class M2LEnableInitTimeCostOpt {
    public static final boolean DEFAULT = false;
    public static final M2LEnableInitTimeCostOpt INSTANCE = new M2LEnableInitTimeCostOpt();
    public static final C01GW isEnable$delegate = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(145));

    private final boolean isEnable() {
        return ((Boolean) isEnable$delegate.getValue()).booleanValue();
    }

    public final boolean enabled() {
        return isEnable();
    }
}
