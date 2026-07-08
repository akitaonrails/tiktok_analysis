package com.bytedance.goda.v2.model.dto;

import X.C09CS;
import X.C09CT;
import com.bytedance.goda.v2.model.adapter.MapAnyAdapter;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class EventParam {

    @C09CT("item_data_params")
    public final Map<String, String> itemDataParams;

    @C09CT("page_params")
    public final Map<String, String> pageParams;

    @C09CT("static_params")
    @C09CS(MapAnyAdapter.class)
    public final Map<String, Object> staticParam;

    @C09CT("trace_params")
    public final Map<String, String> traceParams;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventParam)) {
            return false;
        }
        EventParam eventParam = (EventParam) obj;
        return Intrinsics.LJFF(this.staticParam, eventParam.staticParam) && Intrinsics.LJFF(this.itemDataParams, eventParam.itemDataParams) && Intrinsics.LJFF(this.traceParams, eventParam.traceParams) && Intrinsics.LJFF(this.pageParams, eventParam.pageParams);
    }

    public EventParam(Map<String, ? extends Object> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4) {
        this.staticParam = map;
        this.itemDataParams = map2;
        this.traceParams = map3;
        this.pageParams = map4;
    }
}
