package com.bytedance.iap.core.model;

import X.AbstractC1789340wfE;
import X.C09CT;
import X.C2188811AlT;
import X.EnumC1780570wR5;
import android.app.Activity;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class IAPRedirectRequest {
    public final transient Activity LIZ;
    public final AbstractC1789340wfE LIZIZ;
    public final EnumC1780570wR5 LIZJ;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("merchant_id")
    public final String merchantId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IAPRedirectRequest)) {
            return false;
        }
        IAPRedirectRequest iAPRedirectRequest = (IAPRedirectRequest) obj;
        return Intrinsics.LJFF(this.LIZ, iAPRedirectRequest.LIZ) && Intrinsics.LJFF(this.LIZIZ, iAPRedirectRequest.LIZIZ) && this.LIZJ == iAPRedirectRequest.LIZJ && Intrinsics.LJFF(this.id, iAPRedirectRequest.id) && Intrinsics.LJFF(this.merchantId, iAPRedirectRequest.merchantId);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.merchantId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IAPRedirectRequest(activity=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scenario=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", paymentChannel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", merchantId=");
        sbLIZ.append(this.merchantId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IAPRedirectRequest(Activity activity, AbstractC1789340wfE abstractC1789340wfE, EnumC1780570wR5 enumC1780570wR5, String str, String str2) {
        this.LIZ = activity;
        this.LIZIZ = abstractC1789340wfE;
        this.LIZJ = enumC1780570wR5;
        this.id = str;
        this.merchantId = str2;
    }
}
