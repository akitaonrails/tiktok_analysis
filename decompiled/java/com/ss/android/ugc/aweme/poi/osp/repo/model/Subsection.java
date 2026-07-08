package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class Subsection {

    @C09CT("contents")
    public final List<SectionMaterial> contents;

    @C09CT("icon_key")
    public final String iconKey;

    @C09CT("sub_title")
    public final String subTitle;

    public int hashCode() {
        String str = this.subTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<SectionMaterial> list = this.contents;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Subsection(subTitle=");
        sbLIZ.append(this.subTitle);
        sbLIZ.append(", iconKey=");
        sbLIZ.append(this.iconKey);
        sbLIZ.append(", contents=");
        sbLIZ.append(this.contents);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Subsection(String str, String str2, List<SectionMaterial> list) {
        this.subTitle = str;
        this.iconKey = str2;
        this.contents = list;
    }
}
