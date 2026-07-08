package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_new_form_enable")
public final class LivePcsNewFormEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsNewFormEnableSetting INSTANCE = new LivePcsNewFormEnableSetting();
    public static final C01GW isEnabled$delegate = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(37));

    private final boolean isEnabled() {
        return ((Boolean) isEnabled$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return isEnabled();
    }
}
