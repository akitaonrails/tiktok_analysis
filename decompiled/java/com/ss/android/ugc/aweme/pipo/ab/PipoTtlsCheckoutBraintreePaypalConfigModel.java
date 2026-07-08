package com.ss.android.ugc.aweme.pipo.ab;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoTtlsCheckoutBraintreePaypalConfigModel {

    @C09CT("display_name")
    public final String displayName;

    @C09CT("merchant_account_id")
    public final String merchantAccountId;

    @C09CT("token")
    public final String token;

    public PipoTtlsCheckoutBraintreePaypalConfigModel() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PipoTtlsCheckoutBraintreePaypalConfigModel)) {
            return false;
        }
        PipoTtlsCheckoutBraintreePaypalConfigModel pipoTtlsCheckoutBraintreePaypalConfigModel = (PipoTtlsCheckoutBraintreePaypalConfigModel) obj;
        return Intrinsics.LJFF(this.token, pipoTtlsCheckoutBraintreePaypalConfigModel.token) && Intrinsics.LJFF(this.merchantAccountId, pipoTtlsCheckoutBraintreePaypalConfigModel.merchantAccountId) && Intrinsics.LJFF(this.displayName, pipoTtlsCheckoutBraintreePaypalConfigModel.displayName);
    }

    public final int hashCode() {
        String str = this.token;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.merchantAccountId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayName;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoTtlsCheckoutBraintreePaypalConfigModel(token=");
        sbLIZ.append(this.token);
        sbLIZ.append(", merchantAccountId=");
        sbLIZ.append(this.merchantAccountId);
        sbLIZ.append(", displayName=");
        sbLIZ.append(this.displayName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PipoTtlsCheckoutBraintreePaypalConfigModel(String str, String str2, String str3) {
        this.token = str;
        this.merchantAccountId = str2;
        this.displayName = str3;
    }
}
