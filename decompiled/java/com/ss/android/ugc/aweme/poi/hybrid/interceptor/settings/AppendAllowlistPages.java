package com.ss.android.ugc.aweme.poi.hybrid.interceptor.settings;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class AppendAllowlistPages {

    @C09CT("channels_with_bundles")
    public final Map<String, List<String>> channelsWithBundles;

    @C09CT("channels_without_bundles")
    public final List<String> channelsWithoutBundles;

    public AppendAllowlistPages() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppendAllowlistPages(List<String> list, Map<String, ? extends List<String>> map) {
        this.channelsWithoutBundles = list;
        this.channelsWithBundles = map;
    }

    public AppendAllowlistPages(List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C2097608Jq.LJ() : map);
    }
}
