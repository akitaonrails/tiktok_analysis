package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C047P;
import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButtonAreaExtraInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpButtonAreaExtraInfo implements Parcelable {

    @C09CT("atc_same_fulfillment_version")
    public final Integer atcFulfillmentVersion;

    @C09CT("mute_same_fulfillment_feature")
    public final Boolean muteFulfillmentFeature;
    public static final C047P Companion = new Object() { // from class: X.047P
    };
    public static final Parcelable.Creator<PdpButtonAreaExtraInfo> CREATOR = new Parcelable.Creator<PdpButtonAreaExtraInfo>() { // from class: X.0461
        @Override // android.os.Parcelable.Creator
        public final PdpButtonAreaExtraInfo createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf = null;
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
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PdpButtonAreaExtraInfo(boolValueOf, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final PdpButtonAreaExtraInfo[] newArray(int i) {
            return new PdpButtonAreaExtraInfo[i];
        }
    };
    public static final int $stable = 8;

    public PdpButtonAreaExtraInfo() {
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
        if (!(obj instanceof PdpButtonAreaExtraInfo)) {
            return false;
        }
        PdpButtonAreaExtraInfo pdpButtonAreaExtraInfo = (PdpButtonAreaExtraInfo) obj;
        return Intrinsics.LJFF(this.muteFulfillmentFeature, pdpButtonAreaExtraInfo.muteFulfillmentFeature) && Intrinsics.LJFF(this.atcFulfillmentVersion, pdpButtonAreaExtraInfo.atcFulfillmentVersion);
    }

    public final int hashCode() {
        Boolean bool = this.muteFulfillmentFeature;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.atcFulfillmentVersion;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpButtonAreaExtraInfo(muteFulfillmentFeature=");
        sbLIZ.append(this.muteFulfillmentFeature);
        sbLIZ.append(", atcFulfillmentVersion=");
        sbLIZ.append(this.atcFulfillmentVersion);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.muteFulfillmentFeature;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.atcFulfillmentVersion;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public final boolean LIZ() {
        Integer num = this.atcFulfillmentVersion;
        return num != null && num.intValue() == 3;
    }

    public PdpButtonAreaExtraInfo(Boolean bool, Integer num) {
        this.muteFulfillmentFeature = bool;
        this.atcFulfillmentVersion = num;
    }
}
