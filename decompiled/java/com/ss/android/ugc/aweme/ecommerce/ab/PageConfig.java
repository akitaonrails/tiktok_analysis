package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class PageConfig {

    @C09CT("apis")
    public final List<String> apis;

    @C09CT("custom_params_whitelist")
    public final List<String> customParamsWhitelist;

    @C09CT("biz_scenes")
    public final List<String> ecBizScenes;

    @C09CT("maximum_intervals_for_intercept_image_requests")
    public final long timeThreshold;

    public PageConfig() {
        this(null, null, 0L, null, 15, null);
    }

    public PageConfig(List<String> list, List<String> list2, long j, List<String> list3) {
        this.apis = list;
        this.ecBizScenes = list2;
        this.timeThreshold = j;
        this.customParamsWhitelist = list3;
    }

    public PageConfig(List list, List list2, long j, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? C13BV.INSTANCE : list3);
    }
}
