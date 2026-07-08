package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticMeta;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PDPLogisticMeta implements Parcelable {

    @C09CT("pdp_to_logistic_list_info")
    public final String pdpToLogisticListInfo;
    public static final Parcelable.Creator<PDPLogisticMeta> CREATOR = new Parcelable.Creator<PDPLogisticMeta>() { // from class: X.03KO
        @Override // android.os.Parcelable.Creator
        public final PDPLogisticMeta createFromParcel(Parcel parcel) {
            return new PDPLogisticMeta(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PDPLogisticMeta[] newArray(int i) {
            return new PDPLogisticMeta[i];
        }
    };
    public static final int $stable = 8;

    public PDPLogisticMeta() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PDPLogisticMeta) && Intrinsics.LJFF(this.pdpToLogisticListInfo, ((PDPLogisticMeta) obj).pdpToLogisticListInfo);
    }

    public final int hashCode() {
        String str = this.pdpToLogisticListInfo;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PDPLogisticMeta(pdpToLogisticListInfo=");
        sbLIZ.append(this.pdpToLogisticListInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pdpToLogisticListInfo);
    }

    public PDPLogisticMeta(String str) {
        this.pdpToLogisticListInfo = str;
    }
}
