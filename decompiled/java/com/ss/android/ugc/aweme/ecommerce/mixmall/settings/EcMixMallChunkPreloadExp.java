package com.ss.android.ugc.aweme.ecommerce.mixmall.settings;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMixMallChunkPreloadExp {
    public static final EcMixMallChunkPreloadConfig LIZ;

    static {
        EcMixMallChunkPreloadConfig ecMixMallChunkPreloadConfig = new EcMixMallChunkPreloadConfig(0, 0, 0, 0);
        EcMixMallChunkPreloadConfig ecMixMallChunkPreloadConfig2 = (EcMixMallChunkPreloadConfig) C0C64.LJIILLIIL().LJJII(EcMixMallChunkPreloadConfig.class, ecMixMallChunkPreloadConfig, "ec_mix_mall_chunk_preload_exp", true);
        if (ecMixMallChunkPreloadConfig2 != null) {
            ecMixMallChunkPreloadConfig = ecMixMallChunkPreloadConfig2;
        }
        LIZ = ecMixMallChunkPreloadConfig;
    }

    public static final class EcMixMallChunkPreloadConfig {

        @C09CT("enable")
        public final int enable;

        @C09CT("enable_preread")
        public final int enablePreread;

        @C09CT("opt_anr")
        public final int optAnr;

        @C09CT("opt_task")
        public final int optTask;

        public EcMixMallChunkPreloadConfig() {
            this(0, 0, 0, 0);
        }

        public EcMixMallChunkPreloadConfig(int i, int i2, int i3, int i4) {
            this.enable = i;
            this.enablePreread = i2;
            this.optAnr = i3;
            this.optTask = i4;
        }
    }
}
