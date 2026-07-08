package com.ss.android.ugc.aweme.ab;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class SubsOptOutRefetchConfigSetting {
    public static final SubsOptOutRefetchConfigSetting INSTANCE = new SubsOptOutRefetchConfigSetting();
    public static final RefetchConfig DEFAULT_VALUE = new RefetchConfig(0, 3000L, 10000L);
    public static final C01GW config$delegate = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(106));

    private final RefetchConfig getConfig() {
        return (RefetchConfig) config$delegate.getValue();
    }

    public final long getInterval() {
        Long l = getConfig().interval;
        if (l != null) {
            return l.longValue();
        }
        return 3000L;
    }

    public final int getNumRepeat() {
        Integer num = getConfig().numRepeat;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final long getPendingOptOutTimeoutMillis() {
        Long l = getConfig().optOutPendingStoreExpiry;
        if (l != null) {
            return l.longValue();
        }
        return 10000L;
    }

    public final RefetchConfig getDEFAULT_VALUE$live_api_release() {
        return DEFAULT_VALUE;
    }
}
