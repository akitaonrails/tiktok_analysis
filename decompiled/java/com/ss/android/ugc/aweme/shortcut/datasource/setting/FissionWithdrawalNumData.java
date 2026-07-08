package com.ss.android.ugc.aweme.shortcut.datasource.setting;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FissionWithdrawalNumData extends BaseResponse {

    @C09CT("data")
    public final FissionWithdrawalNum data;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FissionWithdrawalNumData) && Intrinsics.LJFF(this.data, ((FissionWithdrawalNumData) obj).data);
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FissionWithdrawalNumData(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FissionWithdrawalNumData(FissionWithdrawalNum fissionWithdrawalNum) {
        this.data = fissionWithdrawalNum;
    }
}
