package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes19.dex */
public final class SectionMaterial {

    @C09CT("type")
    public final Integer type;

    @C09CT("value")
    public final SectionValue value;

    public int hashCode() {
        SectionValue sectionValue = this.value;
        int iHashCode = (sectionValue == null ? 0 : sectionValue.hashCode()) * 31;
        Integer num = this.type;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SectionMaterial(value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SectionMaterial(SectionValue sectionValue, Integer num) {
        this.value = sectionValue;
        this.type = num;
    }
}
