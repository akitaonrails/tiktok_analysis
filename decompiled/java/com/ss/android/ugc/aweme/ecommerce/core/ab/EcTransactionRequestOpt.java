package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class EcTransactionRequestOpt {
    public static final EcTransactionRequestOptConfig LIZ = new EcTransactionRequestOptConfig(false, false, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(69));

    public static boolean LIZ() {
        return ((EcTransactionRequestOptConfig) LIZIZ.getValue()).ospRequestOpt;
    }

    public static final class EcTransactionRequestOptConfig {

        @C09CT("fix_concurrent_modification")
        public final boolean fixConcurrentModification;

        @C09CT("osp_preload_pb_class")
        public final boolean opsPreloadPbClass;

        @C09CT("osp_preload_class")
        public final boolean ospPreloadClass;

        @C09CT("osp_request_opt")
        public final boolean ospRequestOpt;

        public EcTransactionRequestOptConfig() {
            this(false, false, false, false);
        }

        public EcTransactionRequestOptConfig(boolean z, boolean z2, boolean z3, boolean z4) {
            this.ospRequestOpt = z;
            this.ospPreloadClass = z2;
            this.opsPreloadPbClass = z3;
            this.fixConcurrentModification = z4;
        }
    }
}
