package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C03FM;
import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShipFromInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShipFromInfo implements Parcelable {

    @C09CT("from_overseas")
    public final String fromOverseas;
    public static final C03FM Companion = new Object() { // from class: X.03FM
    };
    public static final Parcelable.Creator<ShipFromInfo> CREATOR = new Parcelable.Creator<ShipFromInfo>() { // from class: X.03FL
        @Override // android.os.Parcelable.Creator
        public final ShipFromInfo createFromParcel(Parcel parcel) {
            return new ShipFromInfo(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShipFromInfo[] newArray(int i) {
            return new ShipFromInfo[i];
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
        return (obj instanceof ShipFromInfo) && Intrinsics.LJFF(this.fromOverseas, ((ShipFromInfo) obj).fromOverseas);
    }

    public final int hashCode() {
        String str = this.fromOverseas;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShipFromInfo(fromOverseas=");
        sbLIZ.append(this.fromOverseas);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fromOverseas);
    }

    public ShipFromInfo(String str) {
        this.fromOverseas = str;
    }
}
