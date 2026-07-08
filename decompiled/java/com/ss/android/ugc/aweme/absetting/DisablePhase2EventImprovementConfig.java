package com.ss.android.ugc.aweme.absetting;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class DisablePhase2EventImprovementConfig {
    public static final boolean DISABLED = true;
    public static final boolean ENABLED = false;
    public static final DisablePhase2EventImprovementConfig INSTANCE = new DisablePhase2EventImprovementConfig();
    public static final C01GW isDisabled$delegate = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(374));

    public static /* synthetic */ void isDisabled$annotations() {
    }

    public static final boolean isDisabled() {
        return ((Boolean) isDisabled$delegate.getValue()).booleanValue();
    }
}
