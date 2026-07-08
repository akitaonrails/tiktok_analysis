package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomSkuArchitectureRevampConfig {
    public static final SkuRevampConfig LIZ = new SkuRevampConfig(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);

    public static final class SkuRevampConfig {

        @C09CT("enable_buffer_strategy")
        public final Boolean enableBufferStrategy;

        @C09CT("enable_arch_revamp")
        public final Boolean enableRevamp;

        @C09CT("enable_spec_selection_refactor")
        public final Boolean enableSpecSecRefactor;

        public SkuRevampConfig() {
            this(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
        }

        public SkuRevampConfig(Boolean bool, Boolean bool2, Boolean bool3) {
            this.enableRevamp = bool;
            this.enableSpecSecRefactor = bool2;
            this.enableBufferStrategy = bool3;
        }
    }

    public static final SkuRevampConfig LIZ() {
        SkuRevampConfig skuRevampConfig = (SkuRevampConfig) C0C64.LJIILLIIL().LJJII(SkuRevampConfig.class, LIZ, "ecom_sku_arch_revamp", true);
        return skuRevampConfig == null ? new SkuRevampConfig(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE) : skuRevampConfig;
    }
}
