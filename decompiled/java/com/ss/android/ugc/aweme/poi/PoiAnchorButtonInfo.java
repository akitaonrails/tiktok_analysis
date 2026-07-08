package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class PoiAnchorButtonInfo implements Serializable {

    @C09CT("style")
    public Integer style;

    @C09CT("title")
    public String title;

    @C09CT("type")
    public Integer type;

    public PoiAnchorButtonInfo() {
        this(null, null, null);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.style;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.type;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAnchorButtonInfo(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiAnchorButtonInfo(String str, Integer num, Integer num2) {
        this.title = str;
        this.style = num;
        this.type = num2;
    }
}
