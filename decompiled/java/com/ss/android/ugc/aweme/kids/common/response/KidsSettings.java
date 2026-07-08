package com.ss.android.ugc.aweme.kids.common.response;

import X.C09CT;
import X.C2188811AlT;
import com.google.gson.k;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class KidsSettings extends BaseResponse {

    @C09CT("ab_test_params")
    public final k abTestParamStruct;

    @C09CT("compliance_settings")
    public final KidsComplianceSettings complianceSettings;

    public final KidsSettings copy(KidsComplianceSettings kidsComplianceSettings, k kVar) {
        return new KidsSettings(kidsComplianceSettings, kVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KidsSettings)) {
            return false;
        }
        KidsSettings kidsSettings = (KidsSettings) obj;
        return Intrinsics.LJFF(this.complianceSettings, kidsSettings.complianceSettings) && Intrinsics.LJFF(this.abTestParamStruct, kidsSettings.abTestParamStruct);
    }

    public int hashCode() {
        KidsComplianceSettings kidsComplianceSettings = this.complianceSettings;
        int iHashCode = (kidsComplianceSettings == null ? 0 : kidsComplianceSettings.hashCode()) * 31;
        k kVar = this.abTestParamStruct;
        return iHashCode + (kVar != null ? kVar.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KidsSettings(complianceSettings=");
        sbLIZ.append(this.complianceSettings);
        sbLIZ.append(", abTestParamStruct=");
        sbLIZ.append(this.abTestParamStruct);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final k getAbTestParamStruct() {
        return this.abTestParamStruct;
    }

    public final KidsComplianceSettings getComplianceSettings() {
        return this.complianceSettings;
    }

    public KidsSettings(KidsComplianceSettings kidsComplianceSettings, k kVar) {
        this.complianceSettings = kidsComplianceSettings;
        this.abTestParamStruct = kVar;
    }
}
