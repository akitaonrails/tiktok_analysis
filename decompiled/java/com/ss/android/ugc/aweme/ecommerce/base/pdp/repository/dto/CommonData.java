package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class CommonData implements Parcelable {

    @C09CT("product_id")
    public final String productId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;
    public static final Parcelable.Creator<CommonData> CREATOR = new Parcelable.Creator<CommonData>() { // from class: X.0wQy
        @Override // android.os.Parcelable.Creator
        public final CommonData createFromParcel(Parcel parcel) {
            return new CommonData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommonData[] newArray(int i) {
            return new CommonData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonData)) {
            return false;
        }
        CommonData commonData = (CommonData) obj;
        return Intrinsics.LJFF(this.productId, commonData.productId) && Intrinsics.LJFF(this.status, commonData.status);
    }

    public final int hashCode() {
        String str = this.productId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.status;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonData(productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.productId);
        parcel.writeString(this.status);
    }

    public CommonData(String str, String str2) {
        this.productId = str;
        this.status = str2;
    }
}
