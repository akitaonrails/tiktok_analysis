package com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup.MaxWidthRule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class MaxWidthRule implements Parcelable {

    @C09CT("max_char")
    public final Integer maxChar;

    @C09CT("max_width")
    public final Integer maxWidth;
    public static final Parcelable.Creator<MaxWidthRule> CREATOR = new Parcelable.Creator<MaxWidthRule>() { // from class: X.0mhI
        @Override // android.os.Parcelable.Creator
        public final MaxWidthRule createFromParcel(Parcel parcel) {
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
            return new MaxWidthRule(numValueOf, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final MaxWidthRule[] newArray(int i) {
            return new MaxWidthRule[i];
        }
    };
    public static final int $stable = 8;

    public MaxWidthRule() {
        this(-1, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaxWidthRule)) {
            return false;
        }
        MaxWidthRule maxWidthRule = (MaxWidthRule) obj;
        return Intrinsics.LJFF(this.maxChar, maxWidthRule.maxChar) && Intrinsics.LJFF(this.maxWidth, maxWidthRule.maxWidth);
    }

    public final int hashCode() {
        Integer num = this.maxChar;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.maxWidth;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaxWidthRule(maxChar=");
        sbLIZ.append(this.maxChar);
        sbLIZ.append(", maxWidth=");
        sbLIZ.append(this.maxWidth);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.maxChar;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.maxWidth;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public MaxWidthRule(Integer num, Integer num2) {
        this.maxChar = num;
        this.maxWidth = num2;
    }
}
