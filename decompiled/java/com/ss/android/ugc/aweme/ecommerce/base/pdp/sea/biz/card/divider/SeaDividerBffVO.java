package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.divider;

import X.AbstractC1066304Ez;
import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes19.dex */
public final class SeaDividerBffVO extends AbstractC1066304Ez {

    @C09CT("height")
    public final float height;

    public SeaDividerBffVO() {
        this(0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SeaDividerBffVO) && Float.compare(this.height, ((SeaDividerBffVO) obj).height) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaDividerBffVO(height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.height);
    }

    public SeaDividerBffVO(float f) {
        this.height = f;
    }
}
