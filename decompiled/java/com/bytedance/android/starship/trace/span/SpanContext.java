package com.bytedance.android.starship.trace.span;

import X.AbstractC19994813Le;
import X.C09CT;
import X.C1308210k9D;
import X.C19970013Bq;
import X.C2188811AlT;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes21.dex */
public final class SpanContext implements AutoCloseable {
    public volatile transient boolean LL;

    @C09CT("parent_id")
    public String parentId;

    @C09CT("span_id")
    public final String spanId;

    @C09CT("trace_id")
    public final String traceId;

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.LL = true;
    }

    public final SpanContext LIZ() {
        if (this.LL) {
            throw new IllegalStateException("Cannot create child span from closed context");
        }
        return new SpanContext(this.traceId, C1308210k9D.LIZ(), this.spanId);
    }

    public SpanContext(String str, String str2, String str3) {
        this.traceId = str;
        this.spanId = str2;
        this.parentId = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SpanContext(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("01");
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append(a0.LJJJJJL('0', 17, C19970013Bq.LIZ(AbstractC19994813Le.Default.nextLong())));
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        this(str, (i & 2) != 0 ? C1308210k9D.LIZ() : str2, (i & 4) != 0 ? null : str3);
    }
}
