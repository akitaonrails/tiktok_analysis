package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.DeleteImageResponseData;

/* JADX INFO: loaded from: classes27.dex */
public final class DeleteImageResponseData implements Parcelable {

    @C09CT("total")
    public final int totalImageCount;
    public static final Parcelable.Creator<DeleteImageResponseData> CREATOR = new Parcelable.Creator<DeleteImageResponseData>() { // from class: X.0v6R
        @Override // android.os.Parcelable.Creator
        public final DeleteImageResponseData createFromParcel(Parcel parcel) {
            return new DeleteImageResponseData(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DeleteImageResponseData[] newArray(int i) {
            return new DeleteImageResponseData[i];
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
        return (obj instanceof DeleteImageResponseData) && this.totalImageCount == ((DeleteImageResponseData) obj).totalImageCount;
    }

    public final int hashCode() {
        return this.totalImageCount;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeleteImageResponseData(totalImageCount=");
        sbLIZ.append(this.totalImageCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.totalImageCount);
    }

    public DeleteImageResponseData(int i) {
        this.totalImageCount = i;
    }
}
