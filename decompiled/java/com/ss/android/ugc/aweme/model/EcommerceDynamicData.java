package com.ss.android.ugc.aweme.model;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;

/* JADX INFO: loaded from: classes11.dex */
public final class EcommerceDynamicData {

    @C09CT("card_type")
    public final int cardType;

    @C09CT("dynamic_data")
    public final DynamicPatch dynamicPatch;

    public EcommerceDynamicData(int i, DynamicPatch dynamicPatch) {
        this.cardType = i;
        this.dynamicPatch = dynamicPatch;
    }
}
