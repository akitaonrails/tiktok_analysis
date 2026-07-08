package com.ss.android.ugc.tools.common.mob;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class AiTraceRequestBody {

    @C09CT("trace_items")
    public final List<AiTraceItem> traceItems;

    public AiTraceRequestBody() {
        this(null, 1, null);
    }

    public AiTraceRequestBody(List<AiTraceItem> list) {
        this.traceItems = list;
    }

    public AiTraceRequestBody(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
