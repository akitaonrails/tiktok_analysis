package com.ss.android.ugc.aweme.feed.model.similarvideo;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class SimilarVideoInfo implements Serializable {

    @C09CT("similar_tag")
    public boolean tag;

    public SimilarVideoInfo() {
        this(false);
    }

    public SimilarVideoInfo(boolean z) {
        this.tag = z;
    }
}
