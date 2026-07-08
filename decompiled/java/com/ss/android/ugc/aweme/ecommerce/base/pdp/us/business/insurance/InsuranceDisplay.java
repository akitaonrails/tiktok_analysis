package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.insurance;

import X.C04DW;
import X.C09CT;
import X.C2188811AlT;
import X.C703902ov;
import X.InterfaceC1891350zJl;
import X.InterfaceC746802vq;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class InsuranceDisplay implements InterfaceC746802vq, C04DW {
    public InsuranceInfo LL;
    public String LLILLJJLI;
    public String LLILLL = "undefined";

    @C09CT("title")
    public final String RecommendedProtectionPlanTitle;

    @C09CT("insurance_plan_pop_up")
    public final BasicPopUp insurancePopup;

    @C09CT("insurance_plan_pop_up_text")
    public final ECRichText popupText;

    @C09CT("insurance_provider_info")
    public final ECRichText providerInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsuranceDisplay)) {
            return false;
        }
        InsuranceDisplay insuranceDisplay = (InsuranceDisplay) obj;
        return Intrinsics.LJFF(this.RecommendedProtectionPlanTitle, insuranceDisplay.RecommendedProtectionPlanTitle) && Intrinsics.LJFF(this.popupText, insuranceDisplay.popupText) && Intrinsics.LJFF(this.providerInfo, insuranceDisplay.providerInfo) && Intrinsics.LJFF(this.insurancePopup, insuranceDisplay.insurancePopup) && Intrinsics.LJFF(this.LL, insuranceDisplay.LL) && Intrinsics.LJFF(this.LLILLJJLI, insuranceDisplay.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        String str = this.RecommendedProtectionPlanTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ECRichText eCRichText = this.popupText;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        ECRichText eCRichText2 = this.providerInfo;
        int iHashCode3 = (iHashCode2 + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        BasicPopUp basicPopUp = this.insurancePopup;
        int iHashCode4 = (iHashCode3 + (basicPopUp == null ? 0 : basicPopUp.hashCode())) * 31;
        InsuranceInfo insuranceInfo = this.LL;
        int iHashCode5 = (iHashCode4 + (insuranceInfo == null ? 0 : insuranceInfo.hashCode())) * 31;
        String str2 = this.LLILLJJLI;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InsuranceDisplay(RecommendedProtectionPlanTitle=");
        sbLIZ.append(this.RecommendedProtectionPlanTitle);
        sbLIZ.append(", popupText=");
        sbLIZ.append(this.popupText);
        sbLIZ.append(", providerInfo=");
        sbLIZ.append(this.providerInfo);
        sbLIZ.append(", insurancePopup=");
        sbLIZ.append(this.insurancePopup);
        sbLIZ.append(", displayInsurance=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", skuId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.C04DW
    public final void setGodaNodeId(String str) {
        this.LLILLL = str;
    }

    public InsuranceDisplay(String str, ECRichText eCRichText, ECRichText eCRichText2, BasicPopUp basicPopUp, InsuranceInfo insuranceInfo, String str2) {
        this.RecommendedProtectionPlanTitle = str;
        this.popupText = eCRichText;
        this.providerInfo = eCRichText2;
        this.insurancePopup = basicPopUp;
        this.LL = insuranceInfo;
        this.LLILLJJLI = str2;
    }
}
