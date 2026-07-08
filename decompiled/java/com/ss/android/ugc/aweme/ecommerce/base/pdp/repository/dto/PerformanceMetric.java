package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PerformanceMetric;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PerformanceMetric implements Parcelable {

    @C09CT("description")
    public String description;

    @C09CT("platform_rate_type")
    public Integer platformRateType;

    @C09CT("type")
    public Integer type;

    @C09CT("value")
    public String value;
    public static final Parcelable.Creator<PerformanceMetric> CREATOR = new Parcelable.Creator<PerformanceMetric>() { // from class: X.02Qz
        @Override // android.os.Parcelable.Creator
        public final PerformanceMetric createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new PerformanceMetric(numValueOf, string, string2, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final PerformanceMetric[] newArray(int i) {
            return new PerformanceMetric[i];
        }
    };
    public static final int $stable = 8;

    public PerformanceMetric() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerformanceMetric)) {
            return false;
        }
        PerformanceMetric performanceMetric = (PerformanceMetric) obj;
        return Intrinsics.LJFF(this.type, performanceMetric.type) && Intrinsics.LJFF(this.value, performanceMetric.value) && Intrinsics.LJFF(this.description, performanceMetric.description) && Intrinsics.LJFF(this.platformRateType, performanceMetric.platformRateType);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.value;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.platformRateType;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PerformanceMetric(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", platformRateType=");
        sbLIZ.append(this.platformRateType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.value);
        parcel.writeString(this.description);
        Integer num2 = this.platformRateType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public PerformanceMetric(Integer num, String str, String str2, Integer num2) {
        this.type = num;
        this.value = str;
        this.description = str2;
        this.platformRateType = num2;
    }
}
