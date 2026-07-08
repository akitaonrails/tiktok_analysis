package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FrontendRule {

    @C09CT("error_key_params")
    public Map<String, String> errorKeyParams;

    @C09CT("error_keyval")
    public String errorKeyVal;

    @C09CT("error_msg")
    public String errorMsg;

    @C09CT("type")
    public String type;

    @C09CT("value")
    public String value;

    public FrontendRule() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrontendRule)) {
            return false;
        }
        FrontendRule frontendRule = (FrontendRule) obj;
        return Intrinsics.LJFF(this.type, frontendRule.type) && Intrinsics.LJFF(this.value, frontendRule.value) && Intrinsics.LJFF(this.errorKeyVal, frontendRule.errorKeyVal) && Intrinsics.LJFF(this.errorMsg, frontendRule.errorMsg) && Intrinsics.LJFF(this.errorKeyParams, frontendRule.errorKeyParams);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorKeyVal;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorMsg;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, String> map = this.errorKeyParams;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrontendRule(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", errorKeyVal=");
        sbLIZ.append(this.errorKeyVal);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.errorMsg);
        sbLIZ.append(", errorKeyParams=");
        sbLIZ.append(this.errorKeyParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FrontendRule(String str, String str2, String str3, String str4, Map<String, String> map) {
        this.type = str;
        this.value = str2;
        this.errorKeyVal = str3;
        this.errorMsg = str4;
        this.errorKeyParams = map;
    }
}
