package com.ss.android.ugc.aweme.ecommerce.network.config;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes4.dex */
public final class EcNetInterceptPerfConfig {
    public static final EcNetInterceptPerfConfigModel LIZ;

    static {
        EcNetInterceptPerfConfigModel ecNetInterceptPerfConfigModel = new EcNetInterceptPerfConfigModel(0);
        EcNetInterceptPerfConfigModel ecNetInterceptPerfConfigModel2 = (EcNetInterceptPerfConfigModel) C0C64.LJIILLIIL().LJJII(EcNetInterceptPerfConfigModel.class, ecNetInterceptPerfConfigModel, "ecom_intercept_perf_config", true);
        if (ecNetInterceptPerfConfigModel2 != null) {
            ecNetInterceptPerfConfigModel = ecNetInterceptPerfConfigModel2;
        }
        LIZ = ecNetInterceptPerfConfigModel;
    }

    public static final class EcNetInterceptPerfConfigModel {

        @C09CT("mem_opt")
        public final int memOpt;

        public EcNetInterceptPerfConfigModel() {
            this(0);
        }

        public EcNetInterceptPerfConfigModel(int i) {
            this.memOpt = i;
        }
    }
}
