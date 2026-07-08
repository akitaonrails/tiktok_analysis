package com.ss.android.ugc.aweme.bytebench;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS214S0000000_25;
import w1p.a;

/* JADX INFO: loaded from: classes26.dex */
public final class ShootingEffectPanelPreloadExperiment {
    public static final C01GW LIZ;
    public static final C01GW LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;

    public static final class ShootEffectPanelPreloadConfig {

        @C09CT("enable_prop_panel_preload")
        public final boolean enablePropPanelPreload;

        @C09CT("prop_panel_left_preload_count")
        public final int leftPropPanelPreloadCount;

        @C09CT("prop_panel_right_preload_count")
        public final int rightPropPanelPreloadCount;

        public ShootEffectPanelPreloadConfig() {
            this(a.LIZ().propPanelLeftPreloadCount > 0 || a.LIZ().propPanelRightPreloadCount > 0, a.LIZ().propPanelLeftPreloadCount, a.LIZ().propPanelRightPreloadCount);
        }

        public ShootEffectPanelPreloadConfig(boolean z, int i, int i2) {
            this.enablePropPanelPreload = z;
            this.leftPropPanelPreloadCount = i;
            this.rightPropPanelPreloadCount = i2;
        }
    }

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(93));
        LIZ = c01gwLIZIZ;
        LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(956));
        LIZJ = ((ShootEffectPanelPreloadConfig) c01gwLIZIZ.getValue()).leftPropPanelPreloadCount;
        LIZLLL = ((ShootEffectPanelPreloadConfig) c01gwLIZIZ.getValue()).rightPropPanelPreloadCount;
    }
}
