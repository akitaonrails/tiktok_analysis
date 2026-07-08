package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class AdLabel implements Serializable {

    @C09CT("ad_label_name")
    public String adLabelName;

    @C09CT("ad_label_position")
    public Integer adLabelPosition;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdLabel(adLabelName=");
        sbLIZ.append(this.adLabelName);
        sbLIZ.append(", adLabelPosition=");
        sbLIZ.append(this.adLabelPosition);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getAdLabelName() {
        return this.adLabelName;
    }

    public final Integer getAdLabelPosition() {
        return this.adLabelPosition;
    }

    public final void setAdLabelName(String str) {
        this.adLabelName = str;
    }

    public final void setAdLabelPosition(Integer num) {
        this.adLabelPosition = num;
    }
}
