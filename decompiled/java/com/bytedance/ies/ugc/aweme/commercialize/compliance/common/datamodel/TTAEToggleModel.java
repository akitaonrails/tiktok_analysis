package com.bytedance.ies.ugc.aweme.commercialize.compliance.common.datamodel;

import X.C09CT;
import X.C2188811AlT;
import X.C746130TOp;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class TTAEToggleModel extends BaseResponse implements Serializable {

    @C09CT("toggle_desc")
    public final String toggleDesc;

    @C09CT("toggle_display_status")
    public final Integer toggleDisplayStatus;

    @C09CT("toggle_title")
    public final String toggleTitle;

    @C09CT("toggle_value_status")
    public final Integer toggleValueStatus;
    public static final C746130TOp Companion = new Object() { // from class: X.0TOp
    };
    public static final int $stable = 8;

    public TTAEToggleModel() {
        this(0, 0, null, null);
    }

    public final TTAEToggleModel copy(Integer num, Integer num2, String str, String str2) {
        return new TTAEToggleModel(num, num2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTAEToggleModel)) {
            return false;
        }
        TTAEToggleModel tTAEToggleModel = (TTAEToggleModel) obj;
        return Intrinsics.LJFF(this.toggleValueStatus, tTAEToggleModel.toggleValueStatus) && Intrinsics.LJFF(this.toggleDisplayStatus, tTAEToggleModel.toggleDisplayStatus) && Intrinsics.LJFF(this.toggleTitle, tTAEToggleModel.toggleTitle) && Intrinsics.LJFF(this.toggleDesc, tTAEToggleModel.toggleDesc);
    }

    public int hashCode() {
        Integer num = this.toggleValueStatus;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.toggleDisplayStatus;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.toggleTitle;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.toggleDesc;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTAEToggleModel(toggleValueStatus=");
        sbLIZ.append(this.toggleValueStatus);
        sbLIZ.append(", toggleDisplayStatus=");
        sbLIZ.append(this.toggleDisplayStatus);
        sbLIZ.append(", toggleTitle=");
        sbLIZ.append(this.toggleTitle);
        sbLIZ.append(", toggleDesc=");
        sbLIZ.append(this.toggleDesc);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getToggleDesc() {
        return this.toggleDesc;
    }

    public final Integer getToggleDisplayStatus() {
        return this.toggleDisplayStatus;
    }

    public final String getToggleTitle() {
        return this.toggleTitle;
    }

    public final Integer getToggleValueStatus() {
        return this.toggleValueStatus;
    }

    public TTAEToggleModel(Integer num, Integer num2, String str, String str2) {
        this.toggleValueStatus = num;
        this.toggleDisplayStatus = num2;
        this.toggleTitle = str;
        this.toggleDesc = str2;
    }
}
