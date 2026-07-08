package com.ss.android.ugc.aweme.poi.mapdetail.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PoiFeedCenterRecallAreaGroup implements Serializable {

    @C09CT("area_option_list")
    public final List<PoiFeedCenterRecallArea> areaOptionList;

    @C09CT("area_text")
    public final String areaText;

    public PoiFeedCenterRecallAreaGroup() {
        this(null, null);
    }

    public int hashCode() {
        String str = this.areaText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PoiFeedCenterRecallArea> list = this.areaOptionList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiFeedCenterRecallAreaGroup(areaText=");
        sbLIZ.append(this.areaText);
        sbLIZ.append(", areaOptionList=");
        sbLIZ.append(this.areaOptionList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiFeedCenterRecallAreaGroup(String str, List<PoiFeedCenterRecallArea> list) {
        this.areaText = str;
        this.areaOptionList = list;
    }
}
