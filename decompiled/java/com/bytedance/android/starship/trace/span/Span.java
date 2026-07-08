package com.bytedance.android.starship.trace.span;

import X.C09CT;
import X.C1308210k9D;
import X.C13BV;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes21.dex */
public final class Span implements AutoCloseable {

    @C09CT("context")
    public final SpanContext context;

    @C09CT("end_ts")
    public volatile Long endTs;

    @C09CT("full_path")
    public final List<String> fullPath;

    @C09CT("name")
    public final String name;

    @C09CT("start_ts")
    public final long startTs;

    @C09CT("tags")
    public ConcurrentHashMap<String, Object> tags;

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.endTs = Long.valueOf(System.currentTimeMillis());
        this.context.LL = true;
    }

    public Span(String str) {
        this(new SpanContext(null, C1308210k9D.LIZ(), null, 5, null), str, null, 4, null);
    }

    public Span(SpanContext spanContext, String str, List<String> list) {
        this.context = spanContext;
        this.name = str;
        this.fullPath = list;
        this.startTs = System.currentTimeMillis();
    }

    public Span(SpanContext spanContext, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(spanContext, str, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
