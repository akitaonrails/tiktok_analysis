package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPdpPreviewInfoOpt {
    public static final EcPdpPreviewInfoOpt LIZ = new EcPdpPreviewInfoOpt();
    public static final EcPdpPreviewInfoOptConfig LIZIZ = new EcPdpPreviewInfoOptConfig(Boolean.FALSE, Boolean.FALSE);

    public static final class EcPdpPreviewInfoOptConfig {

        @C09CT("ec_live_pop_cart_opt")
        public final Boolean livePopCartOpt;

        @C09CT("ec_shop_recommend_opt")
        public final Boolean shopRecommendOpt;

        public EcPdpPreviewInfoOptConfig() {
            this(Boolean.FALSE, Boolean.FALSE);
        }

        public EcPdpPreviewInfoOptConfig(Boolean bool, Boolean bool2) {
            this.livePopCartOpt = bool;
            this.shopRecommendOpt = bool2;
        }
    }
}
