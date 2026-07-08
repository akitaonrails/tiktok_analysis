package com.ss.android.ugc.aweme.property;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class EffectPlatformSingleConfig {
    public static final PlatformAPIConfig LIZ = new PlatformAPIConfig(false, 400);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(85));

    public static final class PlatformAPIConfig {

        @C09CT("dirCacheSizeInMB")
        public final int dirCacheSizeInMB;

        @C09CT("useIOExecutor")
        public final boolean useIOExecutor;

        public PlatformAPIConfig() {
            this(false, 400);
        }

        public PlatformAPIConfig(boolean z, int i) {
            this.useIOExecutor = z;
            this.dirCacheSizeInMB = i;
        }
    }
}
