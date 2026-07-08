package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ExploreDetailComponentOptExperiment {
    public static final ExploreDetailComponentOptExperiment INSTANCE = new ExploreDetailComponentOptExperiment();
    public static final ExploreDetailComponentOptConfig DEFAULT = new ExploreDetailComponentOptConfig(false, false, false);
    public static final C01GW config$delegate = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(393));

    private final ExploreDetailComponentOptConfig getConfig() {
        return (ExploreDetailComponentOptConfig) config$delegate.getValue();
    }

    public final ExploreDetailComponentOptConfig getDEFAULT() {
        return DEFAULT;
    }

    public final boolean addCommentEntranceEnabled(String str) {
        ExploreDetailComponentOptConfig config = getConfig();
        if (config != null && config.addCommentEntrance && Intrinsics.LJFF(str, "homepage_explore")) {
            return true;
        }
        return false;
    }

    public final boolean anchorStyleOptEnabled(String str) {
        ExploreDetailComponentOptConfig config = getConfig();
        if (config != null && config.anchorStyleOpt && Intrinsics.LJFF(str, "homepage_explore")) {
            return true;
        }
        return false;
    }

    public final boolean musicAnchorChange(String str) {
        ExploreDetailComponentOptConfig config = getConfig();
        if (config != null && config.musicAnchorChange && Intrinsics.LJFF(str, "homepage_explore")) {
            return true;
        }
        return false;
    }
}
