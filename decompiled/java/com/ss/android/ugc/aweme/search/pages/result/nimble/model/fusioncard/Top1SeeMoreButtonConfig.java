package com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Top1SeeMoreButtonConfig implements Serializable {

    @C09CT("show_arrow_type")
    public final Integer showArrowType;

    public Top1SeeMoreButtonConfig() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Top1SeeMoreButtonConfig) && Intrinsics.LJFF(this.showArrowType, ((Top1SeeMoreButtonConfig) obj).showArrowType);
    }

    public int hashCode() {
        Integer num = this.showArrowType;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Top1SeeMoreButtonConfig(showArrowType=");
        sbLIZ.append(this.showArrowType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Top1SeeMoreButtonConfig(Integer num) {
        this.showArrowType = num;
    }
}
