package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.RecommendListResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RecommendListResponse implements Parcelable {
    public static final Parcelable.Creator<RecommendListResponse> CREATOR = new Parcelable.Creator<RecommendListResponse>() { // from class: X.04IC
        @Override // android.os.Parcelable.Creator
        public final RecommendListResponse createFromParcel(Parcel parcel) {
            return new RecommendListResponse(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendListResponse[] newArray(int i) {
            return new RecommendListResponse[i];
        }
    };

    @C09CT("data")
    public final String data;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendListResponse) && Intrinsics.LJFF(this.data, ((RecommendListResponse) obj).data);
    }

    public final int hashCode() {
        String str = this.data;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendListResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.data);
    }

    public RecommendListResponse(String str) {
        this.data = str;
    }
}
