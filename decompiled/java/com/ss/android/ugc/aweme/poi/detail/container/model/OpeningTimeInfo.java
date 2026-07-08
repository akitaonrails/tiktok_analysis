package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class OpeningTimeInfo implements Serializable {

    @C09CT("opening_time_list")
    public final List<OpeningTime> openingTimeList;

    @C09CT("opening_time_text")
    public final String openingTimeText;

    public OpeningTimeInfo() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpeningTimeInfo)) {
            return false;
        }
        OpeningTimeInfo openingTimeInfo = (OpeningTimeInfo) obj;
        return Intrinsics.LJFF(this.openingTimeText, openingTimeInfo.openingTimeText) && Intrinsics.LJFF(this.openingTimeList, openingTimeInfo.openingTimeList);
    }

    public int hashCode() {
        String str = this.openingTimeText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<OpeningTime> list = this.openingTimeList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpeningTimeInfo(openingTimeText=");
        sbLIZ.append(this.openingTimeText);
        sbLIZ.append(", openingTimeList=");
        sbLIZ.append(this.openingTimeList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OpeningTimeInfo(String str, List<OpeningTime> list) {
        this.openingTimeText = str;
        this.openingTimeList = list;
    }
}
