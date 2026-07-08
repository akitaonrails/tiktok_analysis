package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoRichText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CBIInstallmentPlan {

    @C09CT("installment_agreement_info")
    public final PipoRichText agreementInfo;

    @C09CT("availability")
    public final CBIInstallmentPlanAvailability availability;

    @C09CT("installment_plan_display_raw_name")
    public final String displayRawName;

    @C09CT("installment_option_id")
    public final String installmentOptionId;

    @C09CT("installment_plan_id")
    public final String installmentPlanId;

    @C09CT("installment_plan_tips")
    public final List<CBIInstallmentPlanTip> installmentPlanTips;

    @C09CT("is_default")
    public final Boolean isDefault;

    @C09CT("tenure")
    public final Long tenure;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CBIInstallmentPlan)) {
            return false;
        }
        CBIInstallmentPlan cBIInstallmentPlan = (CBIInstallmentPlan) obj;
        return Intrinsics.LJFF(this.tenure, cBIInstallmentPlan.tenure) && Intrinsics.LJFF(this.installmentPlanId, cBIInstallmentPlan.installmentPlanId) && Intrinsics.LJFF(this.installmentOptionId, cBIInstallmentPlan.installmentOptionId) && Intrinsics.LJFF(this.isDefault, cBIInstallmentPlan.isDefault) && Intrinsics.LJFF(this.availability, cBIInstallmentPlan.availability) && Intrinsics.LJFF(this.displayRawName, cBIInstallmentPlan.displayRawName) && Intrinsics.LJFF(this.installmentPlanTips, cBIInstallmentPlan.installmentPlanTips) && Intrinsics.LJFF(this.agreementInfo, cBIInstallmentPlan.agreementInfo);
    }

    public final int hashCode() {
        Long l = this.tenure;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.installmentPlanId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.installmentOptionId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isDefault;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        CBIInstallmentPlanAvailability cBIInstallmentPlanAvailability = this.availability;
        int iHashCode5 = (iHashCode4 + (cBIInstallmentPlanAvailability == null ? 0 : cBIInstallmentPlanAvailability.hashCode())) * 31;
        String str3 = this.displayRawName;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<CBIInstallmentPlanTip> list = this.installmentPlanTips;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        PipoRichText pipoRichText = this.agreementInfo;
        return iHashCode7 + (pipoRichText != null ? pipoRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CBIInstallmentPlan(tenure=");
        sbLIZ.append(this.tenure);
        sbLIZ.append(", installmentPlanId=");
        sbLIZ.append(this.installmentPlanId);
        sbLIZ.append(", installmentOptionId=");
        sbLIZ.append(this.installmentOptionId);
        sbLIZ.append(", isDefault=");
        sbLIZ.append(this.isDefault);
        sbLIZ.append(", availability=");
        sbLIZ.append(this.availability);
        sbLIZ.append(", displayRawName=");
        sbLIZ.append(this.displayRawName);
        sbLIZ.append(", installmentPlanTips=");
        sbLIZ.append(this.installmentPlanTips);
        sbLIZ.append(", agreementInfo=");
        sbLIZ.append(this.agreementInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        return !(this.availability != null ? Intrinsics.LJFF(r0.isAvailable, Boolean.FALSE) : false);
    }

    public CBIInstallmentPlan(Long l, String str, String str2, Boolean bool, CBIInstallmentPlanAvailability cBIInstallmentPlanAvailability, String str3, List<CBIInstallmentPlanTip> list, PipoRichText pipoRichText) {
        this.tenure = l;
        this.installmentPlanId = str;
        this.installmentOptionId = str2;
        this.isDefault = bool;
        this.availability = cBIInstallmentPlanAvailability;
        this.displayRawName = str3;
        this.installmentPlanTips = list;
        this.agreementInfo = pipoRichText;
    }
}
