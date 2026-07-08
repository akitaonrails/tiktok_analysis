package com.ss.android.ugc.aweme.localservice.passthrough.settings;

import X.C01GW;
import X.C1087660ePU;
import X.C13LP;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class LSPassThroughRDMobConfig {
    public static final LSPassThroughRDMobConfig INSTANCE = new LSPassThroughRDMobConfig();
    public static final LSPassThroughRDMobModel defaultConfig = new LSPassThroughRDMobModel(null, true, 1.0f);
    public static final C01GW config$delegate = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(75));

    private final LSPassThroughRDMobModel getConfig() {
        return (LSPassThroughRDMobModel) config$delegate.getValue();
    }

    public final boolean enable() {
        LSPassThroughRDMobModel config = getConfig();
        if (config != null) {
            return config.enable;
        }
        return true;
    }

    public final boolean isReportEvent() {
        LSPassThroughRDMobModel config = getConfig();
        if (config != null) {
            return C1087660ePU.LIZ(config.sampleRate);
        }
        return true;
    }

    public final boolean isBlocked(String str) {
        List<String> list;
        LSPassThroughRDMobModel config = getConfig();
        if (config != null && (list = config.filterEventNameList) != null) {
            return C13LP.LJJJJ(str, list);
        }
        return false;
    }
}
