package com.ss.android.ugc.aweme.component.underwaterbottombanner;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleJumpData implements Serializable {
    public static final int $stable = 8;

    @C09CT("schema")
    public String schema;

    public AnoleJumpData() {
        this(null);
    }

    public final String getSchema() {
        return this.schema;
    }

    public AnoleJumpData(String str) {
        this.schema = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }
}
