package com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.BillboardTrackParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class BillboardTrackParams implements Parcelable {
    public final boolean isAutoDisplay;
    public final String operatedFrom;
    public static final Parcelable.Creator<BillboardTrackParams> CREATOR = new Parcelable.Creator<BillboardTrackParams>() { // from class: X.0v5g
        @Override // android.os.Parcelable.Creator
        public final BillboardTrackParams createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new BillboardTrackParams(string, z);
        }

        @Override // android.os.Parcelable.Creator
        public final BillboardTrackParams[] newArray(int i) {
            return new BillboardTrackParams[i];
        }
    };
    public static final int $stable = 8;

    public BillboardTrackParams() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillboardTrackParams)) {
            return false;
        }
        BillboardTrackParams billboardTrackParams = (BillboardTrackParams) obj;
        return Intrinsics.LJFF(this.operatedFrom, billboardTrackParams.operatedFrom) && this.isAutoDisplay == billboardTrackParams.isAutoDisplay;
    }

    public final int hashCode() {
        String str = this.operatedFrom;
        return ((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.isAutoDisplay);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BillboardTrackParams(operatedFrom=");
        sbLIZ.append(this.operatedFrom);
        sbLIZ.append(", isAutoDisplay=");
        sbLIZ.append(this.isAutoDisplay);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.operatedFrom);
        parcel.writeInt(this.isAutoDisplay ? 1 : 0);
    }

    public /* synthetic */ BillboardTrackParams(int i) {
        this(null, false);
    }

    public BillboardTrackParams(String str, boolean z) {
        this.operatedFrom = str;
        this.isAutoDisplay = z;
    }
}
