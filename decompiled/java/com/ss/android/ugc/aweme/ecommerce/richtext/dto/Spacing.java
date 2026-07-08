package com.ss.android.ugc.aweme.ecommerce.richtext.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Spacing;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class Spacing implements Parcelable {
    public static final Parcelable.Creator<Spacing> CREATOR = new Parcelable.Creator<Spacing>() { // from class: X.0mgm
        @Override // android.os.Parcelable.Creator
        public final Spacing createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            return new Spacing(numValueOf, numValueOf2, numValueOf3, numValueOf4);
        }

        @Override // android.os.Parcelable.Creator
        public final Spacing[] newArray(int i) {
            return new Spacing[i];
        }
    };

    @C09CT("bottom")
    public final Integer bottom;

    @C09CT("end")
    public final Integer end;

    @C09CT("start")
    public final Integer start;

    @C09CT("top")
    public final Integer top;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Spacing)) {
            return false;
        }
        Spacing spacing = (Spacing) obj;
        return Intrinsics.LJFF(this.start, spacing.start) && Intrinsics.LJFF(this.top, spacing.top) && Intrinsics.LJFF(this.end, spacing.end) && Intrinsics.LJFF(this.bottom, spacing.bottom);
    }

    public final int hashCode() {
        Integer num = this.start;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.top;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.end;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.bottom;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Spacing(start=");
        sbLIZ.append(this.start);
        sbLIZ.append(", top=");
        sbLIZ.append(this.top);
        sbLIZ.append(", end=");
        sbLIZ.append(this.end);
        sbLIZ.append(", bottom=");
        sbLIZ.append(this.bottom);
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
        Integer num2 = this.top;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.end;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.bottom;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
    }

    public Spacing(Integer num, Integer num2, Integer num3, Integer num4) {
        this.start = num;
        this.top = num2;
        this.end = num3;
        this.bottom = num4;
    }
}
