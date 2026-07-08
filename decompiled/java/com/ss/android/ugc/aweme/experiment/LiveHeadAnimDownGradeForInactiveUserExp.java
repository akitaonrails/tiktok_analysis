package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C0C64;
import X.C452501pT;
import X.EnumC452301pR;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveHeadAnimDownGradeForInactiveUserExp {
    public static final LiveHeadAnimDownGradeForInactiveUserExp INSTANCE = new LiveHeadAnimDownGradeForInactiveUserExp();
    public static final LiveHeadAnimDownGradeForInactiveUserConfig DEFAULT = new LiveHeadAnimDownGradeForInactiveUserConfig(false, 2);
    public static final C01GW isEnable$delegate = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS213S0000000_24.get$arr$(120));
    public static final C01GW downGradeFraction$delegate = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(119));

    public final int getDownGradeFraction() {
        return ((Number) downGradeFraction$delegate.getValue()).intValue();
    }

    public final boolean isEnable() {
        return ((Boolean) isEnable$delegate.getValue()).booleanValue();
    }

    public final LiveHeadAnimDownGradeForInactiveUserConfig value() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LiveHeadAnimDownGradeForInactiveUserConfig liveHeadAnimDownGradeForInactiveUserConfig = DEFAULT;
        LiveHeadAnimDownGradeForInactiveUserConfig liveHeadAnimDownGradeForInactiveUserConfig2 = (LiveHeadAnimDownGradeForInactiveUserConfig) c0c64LJIILLIIL.LJJII(LiveHeadAnimDownGradeForInactiveUserConfig.class, liveHeadAnimDownGradeForInactiveUserConfig, "live_head_anim_downgrade_for_inactive_user", true);
        return liveHeadAnimDownGradeForInactiveUserConfig2 != null ? liveHeadAnimDownGradeForInactiveUserConfig2 : liveHeadAnimDownGradeForInactiveUserConfig;
    }
}
