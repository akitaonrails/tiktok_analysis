package com.ss.android.ugc.aweme.nows.experiment;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class AIGCPhotoGenerationOptimization {
    public static final int CONTROL = 0;
    public static final int V1 = 1;
    public static final int V2 = 2;
    public static final AIGCPhotoGenerationOptimization INSTANCE = new AIGCPhotoGenerationOptimization();
    public static final C01GW isEnabled$delegate = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(101));
    public static final C01GW isV2VariantEnabled$delegate = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(102));

    public final boolean isEnabled() {
        return ((Boolean) isEnabled$delegate.getValue()).booleanValue();
    }

    public final boolean isV2VariantEnabled() {
        return ((Boolean) isV2VariantEnabled$delegate.getValue()).booleanValue();
    }
}
