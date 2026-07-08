package com.bytedance.hybrid.spark.roma.expr;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import com.bytedance.hybrid.spark.roma.IRomaHostDepend;
import com.google.gson.q;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class ConditionModel {

    @C09CT("c")
    public final List<List<q>> conditions;

    @C09CT("pe")
    public final Map<String, PreciseExposureInfo> preciseExposureInfos;

    @C09CT("v")
    public final List<String> variants;

    public ConditionModel() {
        this(null, null, null, 7, null);
    }

    public static final class PreciseExposureInfo {

        @C09CT("t")
        public final IRomaHostDepend.ExposeType exposeType;

        @C09CT("v")
        public final String keyPath;

        public PreciseExposureInfo(IRomaHostDepend.ExposeType exposeType, String str) {
            this.exposeType = exposeType;
            this.keyPath = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConditionModel(Map<String, PreciseExposureInfo> map, List<String> list, List<? extends List<q>> list2) {
        this.preciseExposureInfos = map;
        this.variants = list;
        this.conditions = list2;
    }

    public ConditionModel(Map map, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2097608Jq.LJ() : map, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
