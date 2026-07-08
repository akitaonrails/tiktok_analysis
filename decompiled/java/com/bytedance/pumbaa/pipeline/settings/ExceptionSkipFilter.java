package com.bytedance.pumbaa.pipeline.settings;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ExceptionSkipFilter {

    @C09CT("by_data")
    public final Map<String, List<String>> byData;

    @C09CT("by_message")
    public final List<String> byMessage;

    public ExceptionSkipFilter() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExceptionSkipFilter)) {
            return false;
        }
        ExceptionSkipFilter exceptionSkipFilter = (ExceptionSkipFilter) obj;
        return Intrinsics.LJFF(this.byMessage, exceptionSkipFilter.byMessage) && Intrinsics.LJFF(this.byData, exceptionSkipFilter.byData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExceptionSkipFilter(List<String> list, Map<String, ? extends List<String>> map) {
        this.byMessage = list;
        this.byData = map;
    }

    public ExceptionSkipFilter(List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C2097608Jq.LJ() : map);
    }
}
