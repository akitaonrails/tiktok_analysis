package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class MentionQueryPaginationParam implements Serializable {

    @C09CT("need")
    public final boolean need;

    @C09CT("offset")
    public final long offset;

    public MentionQueryPaginationParam() {
        this(true, 0L);
    }

    public MentionQueryPaginationParam(boolean z, long j) {
        this.need = z;
        this.offset = j;
    }
}
