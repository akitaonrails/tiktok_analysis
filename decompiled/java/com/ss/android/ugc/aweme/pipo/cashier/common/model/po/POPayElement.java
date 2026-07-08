package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C09CT;
import X.C1710500uc4;
import X.C2188811AlT;
import X.EnumC1710490uc3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class POPayElement {

    @C09CT("element")
    public final String id;

    @C09CT("is_encrypted")
    public final Boolean isEncrypted;

    @C09CT("param_name")
    public final String paramName;

    @C09CT("param_value")
    public final String paramValue;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POPayElement)) {
            return false;
        }
        POPayElement pOPayElement = (POPayElement) obj;
        return Intrinsics.LJFF(this.id, pOPayElement.id) && Intrinsics.LJFF(this.paramName, pOPayElement.paramName) && Intrinsics.LJFF(this.paramValue, pOPayElement.paramValue) && Intrinsics.LJFF(this.isEncrypted, pOPayElement.isEncrypted);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paramName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paramValue;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isEncrypted;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("POPayElement(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", paramName=");
        sbLIZ.append(this.paramName);
        sbLIZ.append(", paramValue=");
        sbLIZ.append(this.paramValue);
        sbLIZ.append(", isEncrypted=");
        sbLIZ.append(this.isEncrypted);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final EnumC1710490uc3 LIZ() {
        return C1710500uc4.LIZ(this.paramName);
    }

    public POPayElement(String str, String str2, String str3, Boolean bool) {
        this.id = str;
        this.paramName = str2;
        this.paramValue = str3;
        this.isEncrypted = bool;
    }
}
