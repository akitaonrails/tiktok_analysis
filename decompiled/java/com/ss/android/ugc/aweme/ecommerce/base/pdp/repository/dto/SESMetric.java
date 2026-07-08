package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SESMetric;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SESMetric implements Parcelable {

    @C09CT("description")
    public String content;

    @C09CT("type")
    public Integer detailedMetricType;

    @C09CT("value")
    public Integer rate;
    public static final Parcelable.Creator<SESMetric> CREATOR = new Parcelable.Creator<SESMetric>() { // from class: X.02Xi
        @Override // android.os.Parcelable.Creator
        public final SESMetric createFromParcel(Parcel parcel) {
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
            return new SESMetric(numValueOf, numValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SESMetric[] newArray(int i) {
            return new SESMetric[i];
        }
    };
    public static final int $stable = 8;

    public SESMetric() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SESMetric)) {
            return false;
        }
        SESMetric sESMetric = (SESMetric) obj;
        return Intrinsics.LJFF(this.detailedMetricType, sESMetric.detailedMetricType) && Intrinsics.LJFF(this.rate, sESMetric.rate) && Intrinsics.LJFF(this.content, sESMetric.content);
    }

    public final int hashCode() {
        Integer num = this.detailedMetricType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.rate;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.content;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SESMetric(detailedMetricType=");
        sbLIZ.append(this.detailedMetricType);
        sbLIZ.append(", rate=");
        sbLIZ.append(this.rate);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.detailedMetricType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.rate;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.content);
    }

    public SESMetric(Integer num, Integer num2, String str) {
        this.detailedMetricType = num;
        this.rate = num2;
        this.content = str;
    }
}
