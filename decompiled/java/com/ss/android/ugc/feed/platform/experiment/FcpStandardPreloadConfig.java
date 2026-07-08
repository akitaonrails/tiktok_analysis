package com.ss.android.ugc.feed.platform.experiment;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpStandardPreloadConfig {

    @C09CT("block_list")
    public final List<String> blockList;

    @C09CT("customized_config")
    public final Map<String, Map<String, Object>> customizedConfig;

    @C09CT("default_config")
    public final Map<String, Object> defaultConfig;

    public FcpStandardPreloadConfig() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FcpStandardPreloadConfig(List<String> list, Map<String, ? extends Object> map, Map<String, ? extends Map<String, ? extends Object>> map2) {
        this.blockList = list;
        this.defaultConfig = map;
        this.customizedConfig = map2;
    }

    public FcpStandardPreloadConfig(List list, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? new LinkedHashMap() : map, (i & 4) != 0 ? C2097608Jq.LJ() : map2);
    }
}
