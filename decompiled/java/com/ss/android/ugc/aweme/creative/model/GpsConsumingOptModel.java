package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.GpsConsumingOptModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class GpsConsumingOptModel implements Parcelable {
    public static final Parcelable.Creator<GpsConsumingOptModel> CREATOR = new Parcelable.Creator<GpsConsumingOptModel>() { // from class: X.0hNx
        @Override // android.os.Parcelable.Creator
        public final GpsConsumingOptModel createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            boolean z2 = true;
            Long lValueOf = null;
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
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() != 0) {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new GpsConsumingOptModel(boolValueOf, parcel.readString(), boolValueOf2, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final GpsConsumingOptModel[] newArray(int i) {
            return new GpsConsumingOptModel[i];
        }
    };

    @C040H
    public Boolean hasHitPreload;

    @C040H
    public Boolean locationAllowed;

    @C040H
    public Long page;

    @C040H
    public String scenario;

    public GpsConsumingOptModel() {
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
        if (!(obj instanceof GpsConsumingOptModel)) {
            return false;
        }
        GpsConsumingOptModel gpsConsumingOptModel = (GpsConsumingOptModel) obj;
        return Intrinsics.LJFF(this.hasHitPreload, gpsConsumingOptModel.hasHitPreload) && Intrinsics.LJFF(this.locationAllowed, gpsConsumingOptModel.locationAllowed) && Intrinsics.LJFF(this.page, gpsConsumingOptModel.page) && Intrinsics.LJFF(this.scenario, gpsConsumingOptModel.scenario);
    }

    public final int hashCode() {
        Boolean bool = this.hasHitPreload;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.locationAllowed;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.page;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.scenario;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GpsConsumingOptModel(hasHitPreload=");
        sbLIZ.append(this.hasHitPreload);
        sbLIZ.append(", locationAllowed=");
        sbLIZ.append(this.locationAllowed);
        sbLIZ.append(", page=");
        sbLIZ.append(this.page);
        sbLIZ.append(", scenario=");
        sbLIZ.append(this.scenario);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.hasHitPreload;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.locationAllowed;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Long l = this.page;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.scenario);
    }

    public /* synthetic */ GpsConsumingOptModel(int i) {
        this(null, null, null, null);
    }

    public GpsConsumingOptModel(Boolean bool, String str, Boolean bool2, Long l) {
        this.hasHitPreload = bool;
        this.locationAllowed = bool2;
        this.page = l;
        this.scenario = str;
    }
}
