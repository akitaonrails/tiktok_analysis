package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PDPSeaHeaderListItemStyle {

    @C09CT("ratio")
    public final Float ratio;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PDPSeaHeaderListItemStyle) && Intrinsics.LJFF(this.ratio, ((PDPSeaHeaderListItemStyle) obj).ratio);
    }

    public PDPSeaHeaderListItemStyle(Float f) {
        this.ratio = f;
    }
}
