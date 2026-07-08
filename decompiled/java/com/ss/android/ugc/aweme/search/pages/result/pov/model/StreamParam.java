package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class StreamParam implements Serializable {

    @C09CT("process_info_async_key")
    public final String aBaseKey;

    public StreamParam() {
        this("");
    }

    public StreamParam(String str) {
        this.aBaseKey = str;
    }
}
