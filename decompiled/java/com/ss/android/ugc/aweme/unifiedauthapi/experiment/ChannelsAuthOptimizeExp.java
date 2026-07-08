package com.ss.android.ugc.aweme.unifiedauthapi.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class ChannelsAuthOptimizeExp {
    public static final ChannelsAuthOptimizeExp INSTANCE = new ChannelsAuthOptimizeExp();
    public static final MetaData DEFAULT = new MetaData(false);
    public static final C01GW expValue$delegate = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(269));
    public static final C01GW optDeepCopy$delegate = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(270));

    public final MetaData getExpValue() {
        return (MetaData) expValue$delegate.getValue();
    }

    public final boolean getOptDeepCopy() {
        return ((Boolean) optDeepCopy$delegate.getValue()).booleanValue();
    }

    public final MetaData getDEFAULT() {
        return DEFAULT;
    }

    public static final class MetaData {

        @C09CT("optimize_deep_copy")
        public final boolean optDeepCopy;

        public MetaData() {
            this(false);
        }

        public MetaData(boolean z) {
            this.optDeepCopy = z;
        }
    }
}
