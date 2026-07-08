package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes19.dex */
public final class SectionInfoItem {

    @C09CT("color_type")
    public final Integer colorType;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("value")
    public final String value;

    public int hashCode() {
        String str = this.value;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.colorType;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SectionInfoItem(value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(", colorType=");
        sbLIZ.append(this.colorType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SectionInfoItem(String str, String str2, Integer num) {
        this.value = str;
        this.iconUrl = str2;
        this.colorType = num;
    }
}
