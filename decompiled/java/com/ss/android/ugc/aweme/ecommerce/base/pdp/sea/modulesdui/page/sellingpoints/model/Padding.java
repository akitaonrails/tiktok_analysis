package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.Padding;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Padding implements Parcelable {

    @C09CT("end")
    public Integer end;

    @C09CT("start")
    public Integer start;
    public static final Parcelable.Creator<Padding> CREATOR = new Parcelable.Creator<Padding>() { // from class: X.02iO
        @Override // android.os.Parcelable.Creator
        public final Padding createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new Padding(numValueOf, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final Padding[] newArray(int i) {
            return new Padding[i];
        }
    };
    public static final int $stable = 8;

    public Padding() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Padding)) {
            return false;
        }
        Padding padding = (Padding) obj;
        return Intrinsics.LJFF(this.start, padding.start) && Intrinsics.LJFF(this.end, padding.end);
    }

    public final int hashCode() {
        Integer num = this.start;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.end;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Padding(start=");
        sbLIZ.append(this.start);
        sbLIZ.append(", end=");
        sbLIZ.append(this.end);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.start;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.end;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public Padding(Integer num, Integer num2) {
        this.start = num;
        this.end = num2;
    }
}
