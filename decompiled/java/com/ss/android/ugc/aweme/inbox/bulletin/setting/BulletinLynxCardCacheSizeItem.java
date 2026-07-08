package com.ss.android.ugc.aweme.inbox.bulletin.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinLynxCardCacheSizeItem {

    @C09CT("cache_size")
    public final Integer cacheSize;

    @C09CT("schema")
    public final String schema;

    public BulletinLynxCardCacheSizeItem() {
        this(null, 0);
    }

    public BulletinLynxCardCacheSizeItem(String str, Integer num) {
        this.schema = str;
        this.cacheSize = num;
    }
}
