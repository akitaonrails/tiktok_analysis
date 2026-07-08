package com.ss.android.ugc.aweme.request_combine.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ComplianceSettingCombineModel extends BaseCombineMode {

    @C09CT("body")
    public ComplianceSetting complianceSetting;

    public ComplianceSettingCombineModel() {
        this(null);
    }

    public final ComplianceSettingCombineModel copy(ComplianceSetting complianceSetting) {
        return new ComplianceSettingCombineModel(complianceSetting);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComplianceSettingCombineModel) && Intrinsics.LJFF(this.complianceSetting, ((ComplianceSettingCombineModel) obj).complianceSetting);
    }

    public int hashCode() {
        ComplianceSetting complianceSetting = this.complianceSetting;
        if (complianceSetting == null) {
            return 0;
        }
        return complianceSetting.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComplianceSettingCombineModel(complianceSetting=");
        sbLIZ.append(this.complianceSetting);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ComplianceSetting getComplianceSetting() {
        return this.complianceSetting;
    }

    public ComplianceSettingCombineModel(ComplianceSetting complianceSetting) {
        this.complianceSetting = complianceSetting;
    }

    public final void setComplianceSetting(ComplianceSetting complianceSetting) {
        this.complianceSetting = complianceSetting;
    }
}
