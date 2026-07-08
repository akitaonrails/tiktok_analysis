package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsEventInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SnsEventInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SnsEventInfo> CREATOR = new Parcelable.Creator<SnsEventInfo>() { // from class: X.02qj
        @Override // android.os.Parcelable.Creator
        public final SnsEventInfo createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            SnsPeriodInfo snsPeriodInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() != 0) {
                snsPeriodInfoCreateFromParcel = SnsPeriodInfo.CREATOR.createFromParcel(parcel);
            }
            return new SnsEventInfo(boolValueOf, snsPeriodInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SnsEventInfo[] newArray(int i) {
            return new SnsEventInfo[i];
        }
    };

    @C09CT("is_success")
    public final Boolean isSuccess;

    @C09CT("selected_period")
    public final SnsPeriodInfo selectPeriod;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnsEventInfo)) {
            return false;
        }
        SnsEventInfo snsEventInfo = (SnsEventInfo) obj;
        return Intrinsics.LJFF(this.isSuccess, snsEventInfo.isSuccess) && Intrinsics.LJFF(this.selectPeriod, snsEventInfo.selectPeriod);
    }

    public final int hashCode() {
        Boolean bool = this.isSuccess;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        SnsPeriodInfo snsPeriodInfo = this.selectPeriod;
        return iHashCode + (snsPeriodInfo != null ? snsPeriodInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SnsEventInfo(isSuccess=");
        sbLIZ.append(this.isSuccess);
        sbLIZ.append(", selectPeriod=");
        sbLIZ.append(this.selectPeriod);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isSuccess;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        SnsPeriodInfo snsPeriodInfo = this.selectPeriod;
        if (snsPeriodInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            snsPeriodInfo.writeToParcel(parcel, i);
        }
    }

    public SnsEventInfo(Boolean bool, SnsPeriodInfo snsPeriodInfo) {
        this.isSuccess = bool;
        this.selectPeriod = snsPeriodInfo;
    }
}
