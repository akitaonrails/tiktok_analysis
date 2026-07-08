package com.bytedance.goda.v2.model.dto;

import X.C09CS;
import X.C09CT;
import com.bytedance.goda.v2.model.adapter.MapAnyAdapter;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class GodaV2Feature {

    @C09CT("custom_config")
    @C09CS(MapAnyAdapter.class)
    public final Map<String, Object> customConfig;

    @C09CT("data_behavior")
    public final Integer dataBehavior;

    @C09CT("ignore_cache")
    public final Boolean ignoreCache;

    @C09CT("type")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GodaV2Feature)) {
            return false;
        }
        GodaV2Feature godaV2Feature = (GodaV2Feature) obj;
        return Intrinsics.LJFF(this.type, godaV2Feature.type) && Intrinsics.LJFF(this.customConfig, godaV2Feature.customConfig) && Intrinsics.LJFF(this.dataBehavior, godaV2Feature.dataBehavior) && Intrinsics.LJFF(this.ignoreCache, godaV2Feature.ignoreCache);
    }

    public GodaV2Feature(String str, Map<String, ? extends Object> map, Integer num, Boolean bool) {
        this.type = str;
        this.customConfig = map;
        this.dataBehavior = num;
        this.ignoreCache = bool;
    }
}
