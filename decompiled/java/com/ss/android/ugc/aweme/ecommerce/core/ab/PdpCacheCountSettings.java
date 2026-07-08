package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpCacheCountSettings {
    public static final PdpCacheCountConfig LIZ = new PdpCacheCountConfig(100);

    public static final class PdpCacheCountConfig {

        @C09CT("pdp_sku_cache_count")
        public int pdpSkuCacheCount;

        public PdpCacheCountConfig() {
            this(100);
        }

        public PdpCacheCountConfig(int i) {
            this.pdpSkuCacheCount = i;
        }
    }
}
