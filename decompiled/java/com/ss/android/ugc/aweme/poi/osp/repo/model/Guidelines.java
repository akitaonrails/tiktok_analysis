package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class Guidelines {

    @C09CT("info_elements")
    public final List<SectionInfoItem> infoItems;

    @C09CT("popup")
    public final GuidelinePopupData popup;

    public int hashCode() {
        List<SectionInfoItem> list = this.infoItems;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        GuidelinePopupData guidelinePopupData = this.popup;
        return iHashCode + (guidelinePopupData != null ? guidelinePopupData.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Guidelines(infoItems=");
        sbLIZ.append(this.infoItems);
        sbLIZ.append(", popup=");
        sbLIZ.append(this.popup);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Guidelines(List<SectionInfoItem> list, GuidelinePopupData guidelinePopupData) {
        this.infoItems = list;
        this.popup = guidelinePopupData;
    }
}
