package com.ss.android.ugc.aweme.ecommerce.sec;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class EcomCsSdkTokenModel {

    @C09CT("enable_tk")
    public final boolean enableTk;

    @C09CT("tk")
    public final String tk;

    @C09CT("tkid")
    public final String tkId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcomCsSdkTokenModel)) {
            return false;
        }
        EcomCsSdkTokenModel ecomCsSdkTokenModel = (EcomCsSdkTokenModel) obj;
        return Intrinsics.LJFF(this.tk, ecomCsSdkTokenModel.tk) && Intrinsics.LJFF(this.tkId, ecomCsSdkTokenModel.tkId) && this.enableTk == ecomCsSdkTokenModel.enableTk;
    }

    public final int hashCode() {
        return (((this.tk.hashCode() * 31) + this.tkId.hashCode()) * 31) + C786410Ut5.Z2(this.enableTk);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcomCsSdkTokenModel(tk=");
        sbLIZ.append(this.tk);
        sbLIZ.append(", tkId=");
        sbLIZ.append(this.tkId);
        sbLIZ.append(", enableTk=");
        sbLIZ.append(this.enableTk);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcomCsSdkTokenModel() {
        this("", "", false);
    }

    public EcomCsSdkTokenModel(String str, String str2, boolean z) {
        this.tk = str;
        this.tkId = str2;
        this.enableTk = z;
    }
}
