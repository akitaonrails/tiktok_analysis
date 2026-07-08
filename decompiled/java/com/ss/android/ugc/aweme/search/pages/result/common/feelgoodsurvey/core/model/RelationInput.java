package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class RelationInput implements Serializable {

    @C09CT("enable")
    public final Boolean enable;

    @C09CT(alternate = {"is_must"}, value = "isMust")
    public final Boolean isMust;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelationInput(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", isMust=");
        sbLIZ.append(this.isMust);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isMust() {
        return this.isMust;
    }

    public RelationInput(Boolean bool, Boolean bool2) {
        this.enable = bool;
        this.isMust = bool2;
    }
}
