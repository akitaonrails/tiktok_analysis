package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.insurance;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LynxInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class InsuranceInfoVO {

    @C09CT("default_insurance")
    public final InsuranceInfo defaultInsurance;

    @C09CT("insurance_display")
    public final InsuranceDisplay insuranceDisplay;

    @C09CT("insurance_lynx_info")
    public final LynxInfo lynxInfo;

    @C09CT("module_title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsuranceInfoVO)) {
            return false;
        }
        InsuranceInfoVO insuranceInfoVO = (InsuranceInfoVO) obj;
        return Intrinsics.LJFF(this.title, insuranceInfoVO.title) && Intrinsics.LJFF(this.insuranceDisplay, insuranceInfoVO.insuranceDisplay) && Intrinsics.LJFF(this.lynxInfo, insuranceInfoVO.lynxInfo) && Intrinsics.LJFF(this.defaultInsurance, insuranceInfoVO.defaultInsurance);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        InsuranceDisplay insuranceDisplay = this.insuranceDisplay;
        int iHashCode2 = (iHashCode + (insuranceDisplay == null ? 0 : insuranceDisplay.hashCode())) * 31;
        LynxInfo lynxInfo = this.lynxInfo;
        int iHashCode3 = (iHashCode2 + (lynxInfo == null ? 0 : lynxInfo.hashCode())) * 31;
        InsuranceInfo insuranceInfo = this.defaultInsurance;
        return iHashCode3 + (insuranceInfo != null ? insuranceInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InsuranceInfoVO(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", insuranceDisplay=");
        sbLIZ.append(this.insuranceDisplay);
        sbLIZ.append(", lynxInfo=");
        sbLIZ.append(this.lynxInfo);
        sbLIZ.append(", defaultInsurance=");
        sbLIZ.append(this.defaultInsurance);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InsuranceInfoVO(String str, InsuranceDisplay insuranceDisplay, LynxInfo lynxInfo, InsuranceInfo insuranceInfo) {
        this.title = str;
        this.insuranceDisplay = insuranceDisplay;
        this.lynxInfo = lynxInfo;
        this.defaultInsurance = insuranceInfo;
    }
}
