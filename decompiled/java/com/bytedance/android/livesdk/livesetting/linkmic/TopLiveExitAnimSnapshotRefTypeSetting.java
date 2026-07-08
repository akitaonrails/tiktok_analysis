package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_toplive_exit_anim_snapshot_ref_type")
public final class TopLiveExitAnimSnapshotRefTypeSetting {
    public static final int DEFAULT = 1;
    public static final TopLiveExitAnimSnapshotRefTypeSetting INSTANCE = new TopLiveExitAnimSnapshotRefTypeSetting();
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(163));

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public static final boolean isSoftRef() {
        return INSTANCE.getValue() == 1 && TopLiveExitAnimEnableConfigSetting.isEnable();
    }

    public static final boolean isWeakRef() {
        return INSTANCE.getValue() == 0 && TopLiveExitAnimEnableConfigSetting.isEnable();
    }

    public final boolean isStrongRef() {
        return getValue() == 2 && TopLiveExitAnimEnableConfigSetting.isEnable();
    }
}
