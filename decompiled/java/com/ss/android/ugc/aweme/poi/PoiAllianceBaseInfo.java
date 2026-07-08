package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAllianceBaseInfo implements Serializable {

    @C09CT("is_commission")
    public final boolean isCommission;

    @C09CT("is_has_service")
    public final boolean isHasService;

    @C09CT("score")
    public final String score;

    public PoiAllianceBaseInfo() {
        this(null, false, false);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAllianceBaseInfo(score=");
        sbLIZ.append(this.score);
        sbLIZ.append(", isHasService=");
        sbLIZ.append(this.isHasService);
        sbLIZ.append(", isCommission=");
        sbLIZ.append(this.isCommission);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean shouldShowScore() {
        String str;
        return (!this.isHasService || (str = this.score) == null || str.length() == 0) ? false : true;
    }

    public final boolean isCommission() {
        return this.isCommission;
    }

    public final boolean isHasService() {
        return this.isHasService;
    }

    public PoiAllianceBaseInfo(String str, boolean z, boolean z2) {
        this.score = str;
        this.isHasService = z;
        this.isCommission = z2;
    }
}
