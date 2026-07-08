package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class EcTransactionPbSwitch {
    public static final EcTransactionPbSwitchConfig LIZ = new EcTransactionPbSwitchConfig(false, false, false, false, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(132));

    public static EcTransactionPbSwitchConfig LIZ() {
        return (EcTransactionPbSwitchConfig) LIZIZ.getValue();
    }

    public static final class EcTransactionPbSwitchConfig {

        @C09CT("osp_enable_async_data_parse")
        public final boolean ospEnableAsyncDataParse;

        @C09CT("osp_enable_async_dispatch")
        public final boolean ospEnableAsyncDispatch;

        @C09CT("osp_enable_chunk_pb")
        public final boolean ospEnableChunkPb;

        @C09CT("osp_enable_express_pb")
        public final boolean ospEnableExpressPb;

        @C09CT("osp_enable_normal_pb")
        public final boolean ospEnableNormalPb;

        @C09CT("osp_enable_preload_pb")
        public final boolean ospEnablePreloadPb;

        public EcTransactionPbSwitchConfig() {
            this(false, false, false, false, false, false);
        }

        public EcTransactionPbSwitchConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            this.ospEnableNormalPb = z;
            this.ospEnableExpressPb = z2;
            this.ospEnablePreloadPb = z3;
            this.ospEnableChunkPb = z4;
            this.ospEnableAsyncDataParse = z5;
            this.ospEnableAsyncDispatch = z6;
        }
    }
}
