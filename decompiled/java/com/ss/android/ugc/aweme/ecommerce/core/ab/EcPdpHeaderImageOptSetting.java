package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class EcPdpHeaderImageOptSetting {
    public static final EcPdpHeaderImageOptConfig LIZ = new EcPdpHeaderImageOptConfig(6, 6);

    public static final class EcPdpHeaderImageOptConfig {

        @C09CT("store_low_image_max_size")
        public final int storeLowImageMaxSize;

        @C09CT("store_low_skc_image_max_size")
        public final int storeLowSkcImageMaxSize;

        public EcPdpHeaderImageOptConfig() {
            this(6, 6);
        }

        public EcPdpHeaderImageOptConfig(int i, int i2) {
            this.storeLowImageMaxSize = i;
            this.storeLowSkcImageMaxSize = i2;
        }
    }
}
