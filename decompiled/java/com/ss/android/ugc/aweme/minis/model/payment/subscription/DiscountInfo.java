package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import X.C1783160wVG;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1783150wVF;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.DiscountInfo;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class DiscountInfo implements Parcelable {

    @C09CT("discount_applied")
    public final boolean discountApplied;

    @C09CT("discount_rate")
    public final Integer discountRate;

    @C09CT("discount_source")
    public final Integer discountSourceValue;
    public static final Parcelable.Creator<DiscountInfo> CREATOR = new Parcelable.Creator<DiscountInfo>() { // from class: X.0wVE
        @Override // android.os.Parcelable.Creator
        public final DiscountInfo createFromParcel(Parcel parcel) {
            boolean z;
            Integer numValueOf;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new DiscountInfo(z, numValueOf, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final DiscountInfo[] newArray(int i) {
            return new DiscountInfo[i];
        }
    };
    public static final int $stable = 8;

    public DiscountInfo() {
        this(false, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscountInfo)) {
            return false;
        }
        DiscountInfo discountInfo = (DiscountInfo) obj;
        return this.discountApplied == discountInfo.discountApplied && Intrinsics.LJFF(this.discountSourceValue, discountInfo.discountSourceValue) && Intrinsics.LJFF(this.discountRate, discountInfo.discountRate);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.discountApplied) * 31;
        Integer num = this.discountSourceValue;
        int iHashCode = (iZ2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.discountRate;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiscountInfo(discountApplied=");
        sbLIZ.append(this.discountApplied);
        sbLIZ.append(", discountSourceValue=");
        sbLIZ.append(this.discountSourceValue);
        sbLIZ.append(", discountRate=");
        sbLIZ.append(this.discountRate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.discountApplied ? 1 : 0);
        Integer num = this.discountSourceValue;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.discountRate;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public final EnumC1783150wVF LIZ() {
        EnumC1783150wVF next;
        C1783160wVG c1783160wVG = EnumC1783150wVF.Companion;
        Integer num = this.discountSourceValue;
        int iIntValue = num != null ? num.intValue() : 0;
        c1783160wVG.getClass();
        Iterator<EnumC1783150wVF> it2 = EnumC1783150wVF.getEntries().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.getValue() == iIntValue) {
                break;
            }
        }
        EnumC1783150wVF enumC1783150wVF = next;
        return enumC1783150wVF == null ? EnumC1783150wVF.NONE : enumC1783150wVF;
    }

    public DiscountInfo(boolean z, Integer num, Integer num2) {
        this.discountApplied = z;
        this.discountSourceValue = num;
        this.discountRate = num2;
    }
}
