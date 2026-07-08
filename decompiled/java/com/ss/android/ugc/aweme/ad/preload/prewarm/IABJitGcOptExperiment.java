package com.ss.android.ugc.aweme.ad.preload.prewarm;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class IABJitGcOptExperiment {
    public static final IABJitGcOptModel LIZ = new IABJitGcOptModel(0, 0, 0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(94));

    public static final class IABJitGcOptModel {

        @C09CT("enable_block_gc_ms")
        public long enableBlockGcMs;

        @C09CT("enable_block_gc_ms_load_url")
        public long enableBlockGcMsLoadUrl;

        @C09CT("enable_block_jit_ms")
        public long enableBlockJitMs;

        @C09CT("enable_block_jit_ms_load_url")
        public long enableBlockJitMsLoadUrl;

        public IABJitGcOptModel() {
            this(0L, 0L, 0L, 0L);
        }

        public IABJitGcOptModel(long j, long j2, long j3, long j4) {
            this.enableBlockGcMs = j;
            this.enableBlockJitMs = j2;
            this.enableBlockGcMsLoadUrl = j3;
            this.enableBlockJitMsLoadUrl = j4;
        }
    }

    public static IABJitGcOptModel LIZ() {
        return (IABJitGcOptModel) LIZIZ.getValue();
    }
}
