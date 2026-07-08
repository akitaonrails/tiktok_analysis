package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class InputItemOption implements Parcelable {

    @C09CT("address_map_unavailable")
    public final Boolean addressMapUnavailable;

    @C09CT("context_params")
    public final String contextParams;

    @C09CT("gps_accuracy_level")
    public final Integer gpsAccuracyLevel;

    @C09CT("location_authorized")
    public final Boolean locationAuthorized;

    @C09CT("need_tax_id_item")
    public final Boolean needTaxIdItem;
    public static final Parcelable.Creator<InputItemOption> CREATOR = new Parcelable.Creator<InputItemOption>() { // from class: X.03sF
        @Override // android.os.Parcelable.Creator
        public final InputItemOption createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            boolean z3 = true;
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
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new InputItemOption(boolValueOf, boolValueOf2, string, boolValueOf3, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final InputItemOption[] newArray(int i) {
            return new InputItemOption[i];
        }
    };
    public static final int $stable = 8;

    public InputItemOption() {
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
        if (!(obj instanceof InputItemOption)) {
            return false;
        }
        InputItemOption inputItemOption = (InputItemOption) obj;
        return Intrinsics.LJFF(this.addressMapUnavailable, inputItemOption.addressMapUnavailable) && Intrinsics.LJFF(this.needTaxIdItem, inputItemOption.needTaxIdItem) && Intrinsics.LJFF(this.contextParams, inputItemOption.contextParams) && Intrinsics.LJFF(this.locationAuthorized, inputItemOption.locationAuthorized) && Intrinsics.LJFF(this.gpsAccuracyLevel, inputItemOption.gpsAccuracyLevel);
    }

    public final int hashCode() {
        Boolean bool = this.addressMapUnavailable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.needTaxIdItem;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.contextParams;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool3 = this.locationAuthorized;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.gpsAccuracyLevel;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InputItemOption(addressMapUnavailable=");
        sbLIZ.append(this.addressMapUnavailable);
        sbLIZ.append(", needTaxIdItem=");
        sbLIZ.append(this.needTaxIdItem);
        sbLIZ.append(", contextParams=");
        sbLIZ.append(this.contextParams);
        sbLIZ.append(", locationAuthorized=");
        sbLIZ.append(this.locationAuthorized);
        sbLIZ.append(", gpsAccuracyLevel=");
        sbLIZ.append(this.gpsAccuracyLevel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.addressMapUnavailable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.needTaxIdItem;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.contextParams);
        Boolean bool3 = this.locationAuthorized;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Integer num = this.gpsAccuracyLevel;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public InputItemOption(Boolean bool, Boolean bool2, String str, Boolean bool3, Integer num) {
        this.addressMapUnavailable = bool;
        this.needTaxIdItem = bool2;
        this.contextParams = str;
        this.locationAuthorized = bool3;
        this.gpsAccuracyLevel = num;
    }
}
