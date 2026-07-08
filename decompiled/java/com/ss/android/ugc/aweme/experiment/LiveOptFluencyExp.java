package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C292401Bi;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveOptFluencyExp {
    public static final boolean DEFAULT = true;
    public static final LiveOptFluencyExp INSTANCE = new LiveOptFluencyExp();
    public static final C01GW config$delegate = C292401Bi.LIZ(AFwS189S0000000_3.get$arr$(394));

    public static final boolean isEnable() {
        return INSTANCE.getConfig();
    }

    public final boolean getConfig() {
        return ((Boolean) config$delegate.getValue()).booleanValue();
    }
}
