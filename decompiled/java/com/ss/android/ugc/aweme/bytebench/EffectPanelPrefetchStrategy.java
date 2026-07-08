package com.ss.android.ugc.aweme.bytebench;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS214S0000000_25;
import w1p.a;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectPanelPrefetchStrategy {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(91));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(954));
    public static final int LIZJ = LIZIZ().leftPropPanelPrefetchCount;
    public static final int LIZLLL = LIZIZ().rightPropPanelPrefetchCount;
    public static final int LJ = LIZIZ().leftEditEffectPanelPrefetchCount;
    public static final int LJFF = LIZIZ().rightEditEffectPanelPrefetchCount;

    public static final class EffectPanelPrefetchConfig {

        @C09CT("edit_effect_panel_enable_prefetch")
        public final boolean enableEditEffectPanelPrefetch;

        @C09CT("enable_prop_panel_prefetch")
        public final boolean enablePropPanelPrefetch;

        @C09CT("edit_effect_panel_left_prefetch_count")
        public final int leftEditEffectPanelPrefetchCount;

        @C09CT("prop_panel_left_prefetch_count")
        public final int leftPropPanelPrefetchCount;

        @C09CT("edit_effect_panel_right_prefetch_count")
        public final int rightEditEffectPanelPrefetchCount;

        @C09CT("prop_panel_right_prefetch_count")
        public final int rightPropPanelPrefetchCount;

        public EffectPanelPrefetchConfig() {
            this(a.LIZ().propPanelLeftPreDownloadCount > 0 || a.LIZ().propPanelRightPreDownloadCount > 0, a.LIZ().propPanelLeftPreDownloadCount, a.LIZ().propPanelRightPreDownloadCount, a.LIZ().editEffectPanelLeftPreDownloadCount > 0 || a.LIZ().editEffectPanelRightPreDownloadCount > 0, a.LIZ().editEffectPanelLeftPreDownloadCount, a.LIZ().editEffectPanelRightPreDownloadCount);
        }

        public EffectPanelPrefetchConfig(boolean z, int i, int i2, boolean z2, int i3, int i4) {
            this.enablePropPanelPrefetch = z;
            this.leftPropPanelPrefetchCount = i;
            this.rightPropPanelPrefetchCount = i2;
            this.enableEditEffectPanelPrefetch = z2;
            this.leftEditEffectPanelPrefetchCount = i3;
            this.rightEditEffectPanelPrefetchCount = i4;
        }
    }

    public static boolean LIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue() && LIZIZ().enableEditEffectPanelPrefetch;
    }

    public static EffectPanelPrefetchConfig LIZIZ() {
        return (EffectPanelPrefetchConfig) LIZ.getValue();
    }

    public static boolean LIZJ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue() && LIZIZ().enablePropPanelPrefetch;
    }
}
