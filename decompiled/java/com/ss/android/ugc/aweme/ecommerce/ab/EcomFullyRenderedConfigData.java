package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class EcomFullyRenderedConfigData {

    @C09CT("deals_to_subpage_names")
    public final Map<String, String> dealsToSubPageNames;

    @C09CT("is_enabled")
    public final boolean enabled;

    @C09CT("page_configs")
    public final Map<String, PageConfig> pageConfigs;

    @C09CT("server_equivalent_api_config")
    public final List<EquivalentApi> serverEquivalentApiConfig;

    public EcomFullyRenderedConfigData() {
        this(false, null, null, null, 15, null);
    }

    public EcomFullyRenderedConfigData(boolean z, Map<String, PageConfig> map, List<EquivalentApi> list, Map<String, String> map2) {
        this.enabled = z;
        this.pageConfigs = map;
        this.serverEquivalentApiConfig = list;
        this.dealsToSubPageNames = map2;
    }

    public EcomFullyRenderedConfigData(boolean z, Map map, List list, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C2097608Jq.LJ() : map, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C2097608Jq.LJ() : map2);
    }
}
