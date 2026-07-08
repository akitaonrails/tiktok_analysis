package com.ss.android.ugc.aweme.ecommerce.showcase.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class StoreMynaFirstScreenPreloadConfig {

    @C09CT("preload_count")
    public Integer preloadCount;

    @C09CT("schema")
    public String schema;

    public StoreMynaFirstScreenPreloadConfig() {
        this(null, 6);
    }

    public final Integer getPreloadCount() {
        return this.preloadCount;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final void setPreloadCount(Integer num) {
        this.preloadCount = num;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public StoreMynaFirstScreenPreloadConfig(String str, Integer num) {
        this.schema = str;
        this.preloadCount = num;
    }
}
