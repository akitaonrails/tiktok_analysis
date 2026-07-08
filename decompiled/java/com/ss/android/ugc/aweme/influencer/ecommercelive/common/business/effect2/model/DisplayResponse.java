package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.DisplayResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class DisplayResponse implements Parcelable {

    @C09CT("billboard_id")
    public final String billboardId;
    public static final Parcelable.Creator<DisplayResponse> CREATOR = new Parcelable.Creator<DisplayResponse>() { // from class: X.0mdt
        @Override // android.os.Parcelable.Creator
        public final DisplayResponse createFromParcel(Parcel parcel) {
            return new DisplayResponse(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DisplayResponse[] newArray(int i) {
            return new DisplayResponse[i];
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
        return (obj instanceof DisplayResponse) && Intrinsics.LJFF(this.billboardId, ((DisplayResponse) obj).billboardId);
    }

    public final int hashCode() {
        return this.billboardId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisplayResponse(billboardId=");
        sbLIZ.append(this.billboardId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.billboardId);
    }

    public DisplayResponse(String str) {
        this.billboardId = str;
    }
}
