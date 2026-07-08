package com.ss.android.ugc.aweme.trace;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.trace.model.TraceItem;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class TraceLogUploadRequest {

    @C09CT("trace_items")
    public final List<TraceItem> traceItems;

    public TraceLogUploadRequest() {
        this(null, 1, null);
    }

    public TraceLogUploadRequest(List<TraceItem> list) {
        this.traceItems = list;
    }

    public TraceLogUploadRequest(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
