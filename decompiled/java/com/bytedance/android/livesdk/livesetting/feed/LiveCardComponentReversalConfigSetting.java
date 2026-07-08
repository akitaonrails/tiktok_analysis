package com.bytedance.android.livesdk.livesetting.feed;

import X.C01GW;
import X.C13LQ;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_card_component_reversal_config")
public final class LiveCardComponentReversalConfigSetting {
    public static final LiveCardComponentReversalConfigSetting INSTANCE = new LiveCardComponentReversalConfigSetting();
    public static final String[] DEFAULT = new String[0];
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(45));

    private final String[] getValue() {
        return (String[]) value$delegate.getValue();
    }

    public static final boolean reversalComponent(String str) {
        return C13LQ.LJIILLIIL(str, INSTANCE.getValue());
    }
}
