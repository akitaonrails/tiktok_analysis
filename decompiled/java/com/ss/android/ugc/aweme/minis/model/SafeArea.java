package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.SafeArea;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class SafeArea implements Parcelable {

    @C09CT("bottom")
    public final Integer bottom;

    @C09CT("height")
    public final Integer height;

    @C09CT("left")
    public final Integer left;

    @C09CT("right")
    public final Integer right;

    @C09CT("top")
    public final Integer top;

    @C09CT("width")
    public final Integer width;
    public static final Parcelable.Creator<SafeArea> CREATOR = new Parcelable.Creator<SafeArea>() { // from class: X.0huZ
        @Override // android.os.Parcelable.Creator
        public final SafeArea createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4;
            Integer numValueOf5;
            Integer numValueOf6 = null;
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
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf5 = null;
            } else {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf6 = Integer.valueOf(parcel.readInt());
            }
            return new SafeArea(numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6);
        }

        @Override // android.os.Parcelable.Creator
        public final SafeArea[] newArray(int i) {
            return new SafeArea[i];
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
        if (!(obj instanceof SafeArea)) {
            return false;
        }
        SafeArea safeArea = (SafeArea) obj;
        return Intrinsics.LJFF(this.left, safeArea.left) && Intrinsics.LJFF(this.right, safeArea.right) && Intrinsics.LJFF(this.top, safeArea.top) && Intrinsics.LJFF(this.bottom, safeArea.bottom) && Intrinsics.LJFF(this.width, safeArea.width) && Intrinsics.LJFF(this.height, safeArea.height);
    }

    public final int hashCode() {
        Integer num = this.left;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.right;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.top;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.bottom;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.width;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.height;
        return iHashCode5 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SafeArea(left=");
        sbLIZ.append(this.left);
        sbLIZ.append(", right=");
        sbLIZ.append(this.right);
        sbLIZ.append(", top=");
        sbLIZ.append(this.top);
        sbLIZ.append(", bottom=");
        sbLIZ.append(this.bottom);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.left;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.right;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.top;
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
        Integer num5 = this.width;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.height;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
    }

    public SafeArea(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.left = num;
        this.right = num2;
        this.top = num3;
        this.bottom = num4;
        this.width = num5;
        this.height = num6;
    }
}
