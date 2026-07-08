package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CornerModel {

    @C09CT("position")
    public final List<Integer> position;

    @C09CT("radius")
    public final Float radius;

    public CornerModel() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CornerModel)) {
            return false;
        }
        CornerModel cornerModel = (CornerModel) obj;
        return Intrinsics.LJFF(this.radius, cornerModel.radius) && Intrinsics.LJFF(this.position, cornerModel.position);
    }

    public final int hashCode() {
        Float f = this.radius;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        List<Integer> list = this.position;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CornerModel(radius=");
        sbLIZ.append(this.radius);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CornerModel(Float f, List<Integer> list) {
        this.radius = f;
        this.position = list;
    }
}
