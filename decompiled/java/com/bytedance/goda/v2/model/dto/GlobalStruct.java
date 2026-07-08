package com.bytedance.goda.v2.model.dto;

import X.C09CS;
import X.C09CT;
import com.bytedance.goda.v2.model.adapter.MapAnyAdapter;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class GlobalStruct<T> {

    @C09CT("common_params_context")
    @C09CS(MapAnyAdapter.class)
    public final Map<String, Object> commonParamsContext;

    @C09CT("page_state_context")
    @C09CS(MapAnyAdapter.class)
    public final Map<String, Object> pageStateContext;

    @C09CT("product_info_resp")
    public T productInfo;

    @C09CT("track_params_context")
    @C09CS(MapAnyAdapter.class)
    public final Map<String, Object> trackParamsContext;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalStruct)) {
            return false;
        }
        GlobalStruct globalStruct = (GlobalStruct) obj;
        return Intrinsics.LJFF(this.productInfo, globalStruct.productInfo) && Intrinsics.LJFF(this.trackParamsContext, globalStruct.trackParamsContext) && Intrinsics.LJFF(this.commonParamsContext, globalStruct.commonParamsContext) && Intrinsics.LJFF(this.pageStateContext, globalStruct.pageStateContext);
    }

    public GlobalStruct(T t, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
        this.productInfo = t;
        this.trackParamsContext = map;
        this.commonParamsContext = map2;
        this.pageStateContext = map3;
    }
}
