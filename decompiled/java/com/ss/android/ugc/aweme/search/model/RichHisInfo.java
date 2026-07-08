package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes11.dex */
public final class RichHisInfo {

    @C09CT("icon_type")
    public final Integer iconType;

    @C09CT("sub_title")
    public final String subTitle;

    @C09CT("sub_title_label")
    public final String subTitleLabel;

    @C09CT("sub_title_type")
    public final Integer subTitleType;

    public RichHisInfo() {
        this(null, null, null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RichHisInfo(iconType=");
        sbLIZ.append(this.iconType);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.subTitle);
        sbLIZ.append(", subTitleType=");
        sbLIZ.append(this.subTitleType);
        sbLIZ.append(", subTitleLabel=");
        sbLIZ.append(this.subTitleLabel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RichHisInfo(Integer num, String str, Integer num2, String str2) {
        this.iconType = num;
        this.subTitle = str;
        this.subTitleType = num2;
        this.subTitleLabel = str2;
    }
}
