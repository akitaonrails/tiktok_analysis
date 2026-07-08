package com.ss.android.ugc.aweme.poi.hybrid.interceptor.settings;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class AppendDefaultParams {

    @C09CT("channels_with_bundles")
    public final Map<String, Map<String, Map<String, Object>>> channelsWithBundles;

    @C09CT("channels_without_bundles")
    public final Map<String, Map<String, Object>> channelsWithoutBundles;

    public AppendDefaultParams() {
        this(C2097608Jq.LJ(), C2097608Jq.LJ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppendDefaultParams(Map<String, ? extends Map<String, ? extends Object>> map, Map<String, ? extends Map<String, ? extends Map<String, ? extends Object>>> map2) {
        this.channelsWithoutBundles = map;
        this.channelsWithBundles = map2;
    }
}
