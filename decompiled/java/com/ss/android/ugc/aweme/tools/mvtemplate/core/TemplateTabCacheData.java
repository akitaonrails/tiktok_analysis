package com.ss.android.ugc.aweme.tools.mvtemplate.core;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplateTabCacheData {

    @C09CT("asset_list")
    public final List<TemplateTabCacheAsset> assets;

    @C09CT("cache_time")
    public final long cacheTime;

    @C09CT("pin_asset_list")
    public final List<TemplateTabCacheAsset> pinAssets;

    public TemplateTabCacheData() {
        this(null, null, 0L, 7, null);
    }

    public TemplateTabCacheData(List<TemplateTabCacheAsset> list, List<TemplateTabCacheAsset> list2, long j) {
        this.assets = list;
        this.pinAssets = list2;
        this.cacheTime = j;
    }

    public TemplateTabCacheData(List list, List list2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? 0L : j);
    }
}
