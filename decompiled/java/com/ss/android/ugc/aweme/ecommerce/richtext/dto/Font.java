package com.ss.android.ugc.aweme.ecommerce.richtext.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C691202ms;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Font;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Font implements Parcelable {

    @C09CT("font_class")
    public Integer fontClass;

    @C09CT("font_weight")
    public Integer fontWeight;
    public static final C691202ms Companion = new Object() { // from class: X.02ms
    };
    public static final Parcelable.Creator<Font> CREATOR = new Parcelable.Creator<Font>() { // from class: X.02mr
        @Override // android.os.Parcelable.Creator
        public final Font createFromParcel(Parcel parcel) {
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
            return new Font(numValueOf, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final Font[] newArray(int i) {
            return new Font[i];
        }
    };

    public Font() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Font)) {
            return false;
        }
        Font font = (Font) obj;
        return Intrinsics.LJFF(this.fontWeight, font.fontWeight) && Intrinsics.LJFF(this.fontClass, font.fontClass);
    }

    public final int hashCode() {
        Integer num = this.fontWeight;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.fontClass;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Font(fontWeight=");
        sbLIZ.append(this.fontWeight);
        sbLIZ.append(", fontClass=");
        sbLIZ.append(this.fontClass);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.fontWeight;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.fontClass;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public final Integer LIZ() {
        Integer num = this.fontWeight;
        if (num != null) {
            num.intValue();
            Integer num2 = this.fontClass;
            if (num2 != null) {
                num2.intValue();
                if (this.fontWeight.intValue() > 0 && this.fontClass.intValue() >= 0) {
                    return Integer.valueOf(((this.fontClass.intValue() + 1) * 10) + this.fontWeight.intValue());
                }
            }
        }
        return null;
    }

    public Font(Integer num, Integer num2) {
        this.fontWeight = num;
        this.fontClass = num2;
    }
}
