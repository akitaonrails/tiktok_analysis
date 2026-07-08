package com.ss.android.ugc.aweme.ecommerce.showcase.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class StoreMynaFirstScreenPreloadItem {

    @C09CT("preload_config")
    public StoreMynaFirstScreenPreloadConfig[] preloadConfig;

    @C09CT("product_list_layout")
    public String productListLayout;

    public StoreMynaFirstScreenPreloadItem() {
        this(null, null);
    }

    public final StoreMynaFirstScreenPreloadConfig[] getPreloadConfig() {
        return this.preloadConfig;
    }

    public final String getProductListLayout() {
        return this.productListLayout;
    }

    public final void setPreloadConfig(StoreMynaFirstScreenPreloadConfig[] storeMynaFirstScreenPreloadConfigArr) {
        this.preloadConfig = storeMynaFirstScreenPreloadConfigArr;
    }

    public final void setProductListLayout(String str) {
        this.productListLayout = str;
    }

    public StoreMynaFirstScreenPreloadItem(String str, StoreMynaFirstScreenPreloadConfig[] storeMynaFirstScreenPreloadConfigArr) {
        this.productListLayout = str;
        this.preloadConfig = storeMynaFirstScreenPreloadConfigArr;
    }
}
