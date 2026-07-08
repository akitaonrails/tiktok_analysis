package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopupTrigger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class PopupTrigger implements Parcelable {

    @C09CT("cart_refresh")
    public final Boolean cartRefresh;

    @C09CT("delay_time_sec")
    public final Integer delayTimeSec;

    @C09CT("next_request_scene_key")
    public final Integer nextRequestSceneKey;

    @C09CT("selected_address_refresh")
    public final Boolean selectedAddressRefresh;

    @C09CT("type")
    public final Integer target;
    public static final Parcelable.Creator<PopupTrigger> CREATOR = new Parcelable.Creator<PopupTrigger>() { // from class: X.0NLA
        @Override // android.os.Parcelable.Creator
        public final PopupTrigger createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            boolean z;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Integer numValueOf3 = null;
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
            boolean z2 = true;
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
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new PopupTrigger(numValueOf, numValueOf2, boolValueOf, boolValueOf2, numValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final PopupTrigger[] newArray(int i) {
            return new PopupTrigger[i];
        }
    };
    public static final int $stable = 8;

    public PopupTrigger() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupTrigger)) {
            return false;
        }
        PopupTrigger popupTrigger = (PopupTrigger) obj;
        return Intrinsics.LJFF(this.target, popupTrigger.target) && Intrinsics.LJFF(this.delayTimeSec, popupTrigger.delayTimeSec) && Intrinsics.LJFF(this.cartRefresh, popupTrigger.cartRefresh) && Intrinsics.LJFF(this.selectedAddressRefresh, popupTrigger.selectedAddressRefresh) && Intrinsics.LJFF(this.nextRequestSceneKey, popupTrigger.nextRequestSceneKey);
    }

    public final int hashCode() {
        Integer num = this.target;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.delayTimeSec;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.cartRefresh;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.selectedAddressRefresh;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.nextRequestSceneKey;
        return iHashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopupTrigger(target=");
        sbLIZ.append(this.target);
        sbLIZ.append(", delayTimeSec=");
        sbLIZ.append(this.delayTimeSec);
        sbLIZ.append(", cartRefresh=");
        sbLIZ.append(this.cartRefresh);
        sbLIZ.append(", selectedAddressRefresh=");
        sbLIZ.append(this.selectedAddressRefresh);
        sbLIZ.append(", nextRequestSceneKey=");
        sbLIZ.append(this.nextRequestSceneKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.target;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.delayTimeSec;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool = this.cartRefresh;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.selectedAddressRefresh;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Integer num3 = this.nextRequestSceneKey;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public PopupTrigger(Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3) {
        this.target = num;
        this.delayTimeSec = num2;
        this.cartRefresh = bool;
        this.selectedAddressRefresh = bool2;
        this.nextRequestSceneKey = num3;
    }
}
