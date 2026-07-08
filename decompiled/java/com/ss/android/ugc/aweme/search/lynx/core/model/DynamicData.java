package com.ss.android.ugc.aweme.search.lynx.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;

/* JADX INFO: loaded from: classes11.dex */
public final class DynamicData {

    @C09CT("card_type")
    public final int cardType;

    @C09CT("dynamic_data")
    public final DynamicPatch dynamicPatch;

    public DynamicData(int i, DynamicPatch dynamicPatch) {
        this.cardType = i;
        this.dynamicPatch = dynamicPatch;
    }
}
