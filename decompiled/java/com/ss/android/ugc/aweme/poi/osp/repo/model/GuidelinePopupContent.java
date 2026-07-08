package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GuidelinePopupContent {

    @C09CT("subsections")
    public final List<Subsection> subsections;

    @C09CT("title")
    public final String title;

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Subsection> list = this.subsections;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuidelinePopupContent(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subsections=");
        sbLIZ.append(this.subsections);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GuidelinePopupContent(String str, List<Subsection> list) {
        this.title = str;
        this.subsections = list;
    }
}
