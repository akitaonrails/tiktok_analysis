package com.ss.android.ugc.aweme.ecommerce.base.osp.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class InsuranceModule {

    @C09CT("change_plan")
    public String changePlanText;

    @C09CT("change_plan_url")
    public String changePlanUrl;

    @C09CT("exposure_insurance_info_list")
    public List<InsuranceInfo> exposureInsuranceInfoList;

    @C09CT("icon")
    public Icon icon;

    @C09CT("insurance_info_list")
    public List<InsuranceInfo> insuranceInfoList;

    @C09CT("insurance_plan")
    public USInsurancePlan insurancePlan;

    public InsuranceModule() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsuranceModule)) {
            return false;
        }
        InsuranceModule insuranceModule = (InsuranceModule) obj;
        return Intrinsics.LJFF(this.icon, insuranceModule.icon) && Intrinsics.LJFF(this.changePlanText, insuranceModule.changePlanText) && Intrinsics.LJFF(this.changePlanUrl, insuranceModule.changePlanUrl) && Intrinsics.LJFF(this.insuranceInfoList, insuranceModule.insuranceInfoList) && Intrinsics.LJFF(this.exposureInsuranceInfoList, insuranceModule.exposureInsuranceInfoList) && Intrinsics.LJFF(this.insurancePlan, insuranceModule.insurancePlan);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.changePlanText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.changePlanUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<InsuranceInfo> list = this.insuranceInfoList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<InsuranceInfo> list2 = this.exposureInsuranceInfoList;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        USInsurancePlan uSInsurancePlan = this.insurancePlan;
        return iHashCode5 + (uSInsurancePlan != null ? uSInsurancePlan.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InsuranceModule(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", changePlanText=");
        sbLIZ.append(this.changePlanText);
        sbLIZ.append(", changePlanUrl=");
        sbLIZ.append(this.changePlanUrl);
        sbLIZ.append(", insuranceInfoList=");
        sbLIZ.append(this.insuranceInfoList);
        sbLIZ.append(", exposureInsuranceInfoList=");
        sbLIZ.append(this.exposureInsuranceInfoList);
        sbLIZ.append(", insurancePlan=");
        sbLIZ.append(this.insurancePlan);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InsuranceModule(Icon icon, String str, String str2, List<InsuranceInfo> list, List<InsuranceInfo> list2, USInsurancePlan uSInsurancePlan) {
        this.icon = icon;
        this.changePlanText = str;
        this.changePlanUrl = str2;
        this.insuranceInfoList = list;
        this.exposureInsuranceInfoList = list2;
        this.insurancePlan = uSInsurancePlan;
    }
}
