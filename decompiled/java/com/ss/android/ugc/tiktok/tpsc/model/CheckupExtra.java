package com.ss.android.ugc.tiktok.tpsc.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CheckupExtra extends PopupExtra {

    @C09CT("descript_type")
    public final int descriptType;

    @C09CT("experiment_user_types")
    public final String experimentUserTypes;

    @C09CT("show_summary_page")
    public final boolean showSummaryPage;

    public CheckupExtra() {
        this(true, 0, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckupExtra)) {
            return false;
        }
        CheckupExtra checkupExtra = (CheckupExtra) obj;
        return this.showSummaryPage == checkupExtra.showSummaryPage && this.descriptType == checkupExtra.descriptType && Intrinsics.LJFF(this.experimentUserTypes, checkupExtra.experimentUserTypes);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.showSummaryPage) * 31) + this.descriptType) * 31) + this.experimentUserTypes.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckupExtra(showSummaryPage=");
        sbLIZ.append(this.showSummaryPage);
        sbLIZ.append(", descriptType=");
        sbLIZ.append(this.descriptType);
        sbLIZ.append(", experimentUserTypes=");
        sbLIZ.append(this.experimentUserTypes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CheckupExtra(boolean z, int i, String str) {
        super(0);
        this.showSummaryPage = z;
        this.descriptType = i;
        this.experimentUserTypes = str;
    }
}
