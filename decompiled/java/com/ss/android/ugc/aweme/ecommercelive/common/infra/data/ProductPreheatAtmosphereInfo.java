package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ProductPreheatAtmosphereInfo {

    @C09CT("animation_price_list")
    public final List<String> animationPriceList;

    public ProductPreheatAtmosphereInfo() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductPreheatAtmosphereInfo) && Intrinsics.LJFF(this.animationPriceList, ((ProductPreheatAtmosphereInfo) obj).animationPriceList);
    }

    public final int hashCode() {
        List<String> list = this.animationPriceList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductPreheatAtmosphereInfo(animationPriceList=");
        sbLIZ.append(this.animationPriceList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProductPreheatAtmosphereInfo(List<String> list) {
        this.animationPriceList = list;
    }
}
