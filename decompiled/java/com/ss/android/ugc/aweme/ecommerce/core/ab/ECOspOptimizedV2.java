package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class ECOspOptimizedV2 {
    public static final EComOSPEnterConfig LIZ;

    public static final class EComOSPEnterConfig {

        @C09CT("ecom_osp_full_chunk")
        public final Boolean enableChunk;

        public EComOSPEnterConfig() {
            this(Boolean.FALSE);
        }

        public EComOSPEnterConfig(Boolean bool) {
            this.enableChunk = bool;
        }
    }

    static {
        new ECOspOptimizedV2();
        LIZ = new EComOSPEnterConfig(Boolean.FALSE);
    }
}
