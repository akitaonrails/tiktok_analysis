package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes2.dex */
public final class EcCombinedSkuOspRollbackConfig {
    public static final EcPdpHeaderImageOptConfig LIZ = new EcPdpHeaderImageOptConfig(false, false, false, false, false);

    public static final EcPdpHeaderImageOptConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcPdpHeaderImageOptConfig ecPdpHeaderImageOptConfig = LIZ;
        EcPdpHeaderImageOptConfig ecPdpHeaderImageOptConfig2 = (EcPdpHeaderImageOptConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_combined_sku_osp_rollback_config", EcPdpHeaderImageOptConfig.class, ecPdpHeaderImageOptConfig);
        return ecPdpHeaderImageOptConfig2 != null ? ecPdpHeaderImageOptConfig2 : ecPdpHeaderImageOptConfig;
    }

    public static final class EcPdpHeaderImageOptConfig {

        @C09CT("checked_specs_to_pdp_rollback")
        public final boolean checkedSpecsToPdpRollback;

        @C09CT("expandable_flow_rollback")
        public final boolean expandableFlowRollback;

        @C09CT("osp_preload_on_pdp_rollback")
        public final boolean ospPreloadOnPdpRollback;

        @C09CT("set_cache_on_pdp_rollback")
        public final boolean setCacheOnPdpRollback;

        @C09CT("sku_router_interceptor_rollback")
        public final boolean skuRouterInterceptorRollback;

        public EcPdpHeaderImageOptConfig() {
            this(false, false, false, false, false);
        }

        public EcPdpHeaderImageOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.checkedSpecsToPdpRollback = z;
            this.setCacheOnPdpRollback = z2;
            this.skuRouterInterceptorRollback = z3;
            this.ospPreloadOnPdpRollback = z4;
            this.expandableFlowRollback = z5;
        }
    }
}
