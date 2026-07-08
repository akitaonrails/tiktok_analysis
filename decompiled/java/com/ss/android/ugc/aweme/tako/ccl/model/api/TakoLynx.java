package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoLynx {

    @C09CT("raw_data")
    public final String rawData;

    @C09CT("schema")
    public final String schema;

    public TakoLynx() {
        this("", "");
    }

    public TakoLynx(String str, String str2) {
        this.schema = str;
        this.rawData = str2;
    }
}
