package com.ss.android.ugc.aweme.poi.hybrid.interceptor.settings;

import X.C09CT;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class AppendSpecifiedParamsKey {

    @C09CT("channels_with_bundles")
    public final Map<String, Map<String, List<String>>> channelsWithBundles;

    @C09CT("channels_without_bundles")
    public final Map<String, List<String>> channelsWithoutBundles;

    public AppendSpecifiedParamsKey() {
        this(C2097608Jq.LJ(), C2097608Jq.LJ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppendSpecifiedParamsKey(Map<String, ? extends List<String>> map, Map<String, ? extends Map<String, ? extends List<String>>> map2) {
        this.channelsWithoutBundles = map;
        this.channelsWithBundles = map2;
    }
}
