package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_hangout_live_card_trace_success_opt")
public final class MultiHangoutLiveCardTraceSuccessOptSetting {
    public static final boolean DEFAULT = false;
    public static final MultiHangoutLiveCardTraceSuccessOptSetting INSTANCE = new MultiHangoutLiveCardTraceSuccessOptSetting();
    public static final C01GW enable$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(66));

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public static final boolean isEnable() {
        return INSTANCE.getEnable();
    }
}
