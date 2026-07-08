package com.ss.android.ugc.aweme.ecommerce.search.suggest.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class MiddleCouponModel {

    @C09CT("rights_info")
    public final RightsInfo rightsInfo;

    public MiddleCouponModel() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MiddleCouponModel) && Intrinsics.LJFF(this.rightsInfo, ((MiddleCouponModel) obj).rightsInfo);
    }

    public MiddleCouponModel(RightsInfo rightsInfo) {
        this.rightsInfo = rightsInfo;
    }
}
