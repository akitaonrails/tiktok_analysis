package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SnsPeriodInfo implements Parcelable {

    @C09CT("is_selected")
    public Boolean isSelect;

    @C09CT("period")
    public Integer period;

    @C09CT("period_text")
    public String periodText;

    @C09CT("period_unit")
    public Integer periodUnit;
    public static final Parcelable.Creator<SnsPeriodInfo> CREATOR = new Parcelable.Creator<SnsPeriodInfo>() { // from class: X.02qi
        @Override // android.os.Parcelable.Creator
        public final SnsPeriodInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            boolean z;
            Boolean boolValueOf = null;
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
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new SnsPeriodInfo(numValueOf, numValueOf2, string, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SnsPeriodInfo[] newArray(int i) {
            return new SnsPeriodInfo[i];
        }
    };
    public static final int $stable = 8;

    public SnsPeriodInfo() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnsPeriodInfo)) {
            return false;
        }
        SnsPeriodInfo snsPeriodInfo = (SnsPeriodInfo) obj;
        return Intrinsics.LJFF(this.period, snsPeriodInfo.period) && Intrinsics.LJFF(this.periodUnit, snsPeriodInfo.periodUnit) && Intrinsics.LJFF(this.periodText, snsPeriodInfo.periodText) && Intrinsics.LJFF(this.isSelect, snsPeriodInfo.isSelect);
    }

    public final int hashCode() {
        Integer num = this.period;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.periodUnit;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.periodText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isSelect;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SnsPeriodInfo(period=");
        sbLIZ.append(this.period);
        sbLIZ.append(", periodUnit=");
        sbLIZ.append(this.periodUnit);
        sbLIZ.append(", periodText=");
        sbLIZ.append(this.periodText);
        sbLIZ.append(", isSelect=");
        sbLIZ.append(this.isSelect);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.period;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.periodUnit;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.periodText);
        Boolean bool = this.isSelect;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public final String LIZIZ() {
        Integer num = this.periodUnit;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        return iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? "" : "month" : "week" : "day";
    }

    public static SnsPeriodInfo LIZ(SnsPeriodInfo snsPeriodInfo, Boolean bool) {
        return new SnsPeriodInfo(snsPeriodInfo.period, snsPeriodInfo.periodUnit, snsPeriodInfo.periodText, bool);
    }

    public SnsPeriodInfo(Integer num, Integer num2, String str, Boolean bool) {
        this.period = num;
        this.periodUnit = num2;
        this.periodText = str;
        this.isSelect = bool;
    }
}
