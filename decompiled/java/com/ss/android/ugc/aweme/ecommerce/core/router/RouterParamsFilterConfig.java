package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class RouterParamsFilterConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("block_interceptor_urls")
    public final List<String> blockInterceptorUrls;

    @C09CT("filter_config")
    public final List<FilterParamInfo> filterConfig;

    @C09CT("filter_event_upload")
    public final int filterEventUpload;

    public RouterParamsFilterConfig() {
        this(null, 0, null, 7, null);
    }

    public RouterParamsFilterConfig(List<String> list, int i, List<FilterParamInfo> list2) {
        this.blockInterceptorUrls = list;
        this.filterEventUpload = i;
        this.filterConfig = list2;
    }

    public RouterParamsFilterConfig(List list, int i, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
