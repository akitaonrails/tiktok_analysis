package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class ECSearchMixSortConfig {

    @C09CT("common_ab_params")
    public final String commonABParams;

    @C09CT("filter_request_update_whitelist")
    public final List<Integer> filterRequestUpdateWhitelist;

    @C09CT("new_background_runtime_config")
    public final SingleLynxCardConfig newBackgroundRuntimeConfig;

    @C09CT("page_config")
    public final Map<String, SingleLynxCardConfig> pageConfig;

    @C09CT("runtime_config")
    public final SingleLynxCardConfig runtimeConfig;

    @C09CT("android_schema_params")
    public final Map<String, Object> schemaParams;

    public ECSearchMixSortConfig() {
        this(null, null, null, null, null, null);
    }

    public ECSearchMixSortConfig(String str, Map<String, ? extends Object> map, Map<String, SingleLynxCardConfig> map2, SingleLynxCardConfig singleLynxCardConfig, SingleLynxCardConfig singleLynxCardConfig2, List<Integer> list) {
        this.commonABParams = str;
        this.schemaParams = map;
        this.pageConfig = map2;
        this.runtimeConfig = singleLynxCardConfig;
        this.newBackgroundRuntimeConfig = singleLynxCardConfig2;
        this.filterRequestUpdateWhitelist = list;
    }
}
