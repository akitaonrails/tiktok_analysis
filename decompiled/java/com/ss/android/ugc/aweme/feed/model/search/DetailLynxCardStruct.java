package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class DetailLynxCardStruct implements Serializable {

    @C09CT("dynamic_patch")
    public DynamicPatch dynamicPatch;

    public DetailLynxCardStruct() {
        this(null);
    }

    public DetailLynxCardStruct(DynamicPatch dynamicPatch) {
        this.dynamicPatch = dynamicPatch;
    }
}
