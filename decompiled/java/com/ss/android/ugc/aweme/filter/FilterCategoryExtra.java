package com.ss.android.ugc.aweme.filter;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class FilterCategoryExtra implements Serializable {

    @C09CT("ab_group")
    public final String abGroup;

    @C09CT("panel_camera_type")
    public final String cameraFacing;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FilterCategoryExtra(abGroup=");
        sbLIZ.append(this.abGroup);
        sbLIZ.append(", cameraFacing=");
        sbLIZ.append(this.cameraFacing);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FilterCategoryExtra() {
        this(CardStruct.IStatusCode.DEFAULT, "");
    }

    public FilterCategoryExtra(String str, String str2) {
        this.abGroup = str;
        this.cameraFacing = str2;
    }
}
