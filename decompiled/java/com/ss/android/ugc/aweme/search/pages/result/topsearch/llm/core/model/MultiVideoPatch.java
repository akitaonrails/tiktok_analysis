package com.ss.android.ugc.aweme.search.pages.result.topsearch.llm.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.MultiVideo;

/* JADX INFO: loaded from: classes11.dex */
public final class MultiVideoPatch {

    @C09CT("index")
    public final int index;

    @C09CT("op")
    public final String op;

    @C09CT("value")
    public final MultiVideo value;

    public MultiVideoPatch() {
        this(null, -1, null);
    }

    public MultiVideoPatch(String str, int i, MultiVideo multiVideo) {
        this.op = str;
        this.index = i;
        this.value = multiVideo;
    }
}
