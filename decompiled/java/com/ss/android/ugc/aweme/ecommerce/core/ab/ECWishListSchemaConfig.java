package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class ECWishListSchemaConfig {
    public static final RomaSchemaGroupFavoritePageModel LIZ;

    static {
        new ECWishListSchemaConfig();
        LIZ = new RomaSchemaGroupFavoritePageModel("sslocal://lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fgecko-internal-loose-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_favorite_product%2Fpages%2Ffavorite-product.js&__live_platform__=webcast&target_handler=webcast&thread_strategy=2&use_new_container=1&use_spark=1&hide_nav_bar=1&container_bg_color=FFFFFF&should_full_screen=1&trans_status_bar=1");
    }

    public static final class RomaSchemaGroupFavoritePageModel {

        @C09CT("roma_schema_page_favorite_product")
        public final String romaSchemaPageFavoriteProduct;

        public RomaSchemaGroupFavoritePageModel(String str) {
            this.romaSchemaPageFavoriteProduct = str;
        }
    }
}
