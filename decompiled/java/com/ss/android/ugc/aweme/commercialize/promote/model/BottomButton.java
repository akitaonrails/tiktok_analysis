package com.ss.android.ugc.aweme.commercialize.promote.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class BottomButton implements Serializable {

    @C09CT("schema")
    public String schema;

    public BottomButton() {
        this(null);
    }

    public final String getSchema() {
        return this.schema;
    }

    public BottomButton(String str) {
        this.schema = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }
}
