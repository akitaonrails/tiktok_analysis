package com.ss.android.ugc.aweme.component.ugen.handler;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class LabelPhotoCarouselInfo {

    @C09CT("product_list")
    public final List<LabelProduct> productList;

    public LabelPhotoCarouselInfo() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LabelPhotoCarouselInfo) && Intrinsics.LJFF(this.productList, ((LabelPhotoCarouselInfo) obj).productList);
    }

    public final int hashCode() {
        List<LabelProduct> list = this.productList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LabelPhotoCarouselInfo(productList=");
        sbLIZ.append(this.productList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LabelPhotoCarouselInfo(List<LabelProduct> list) {
        this.productList = list;
    }
}
