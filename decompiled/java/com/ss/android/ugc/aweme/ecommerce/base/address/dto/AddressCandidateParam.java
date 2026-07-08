package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressCandidateParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressCandidateParam implements Parcelable {

    @C09CT("autocomplete_address_id")
    public final String autocompleteAddressId;

    @C09CT("place_type")
    public final Integer placeType;

    @C09CT("session_key")
    public final String sessionKey;
    public static final Parcelable.Creator<AddressCandidateParam> CREATOR = new Parcelable.Creator<AddressCandidateParam>() { // from class: X.0vVJ
        @Override // android.os.Parcelable.Creator
        public final AddressCandidateParam createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new AddressCandidateParam(numValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddressCandidateParam[] newArray(int i) {
            return new AddressCandidateParam[i];
        }
    };
    public static final int $stable = 8;

    public AddressCandidateParam() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressCandidateParam)) {
            return false;
        }
        AddressCandidateParam addressCandidateParam = (AddressCandidateParam) obj;
        return Intrinsics.LJFF(this.placeType, addressCandidateParam.placeType) && Intrinsics.LJFF(this.sessionKey, addressCandidateParam.sessionKey) && Intrinsics.LJFF(this.autocompleteAddressId, addressCandidateParam.autocompleteAddressId);
    }

    public final int hashCode() {
        Integer num = this.placeType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.sessionKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.autocompleteAddressId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressCandidateParam(placeType=");
        sbLIZ.append(this.placeType);
        sbLIZ.append(", sessionKey=");
        sbLIZ.append(this.sessionKey);
        sbLIZ.append(", autocompleteAddressId=");
        sbLIZ.append(this.autocompleteAddressId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.placeType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.sessionKey);
        parcel.writeString(this.autocompleteAddressId);
    }

    public AddressCandidateParam(Integer num, String str, String str2) {
        this.placeType = num;
        this.sessionKey = str;
        this.autocompleteAddressId = str2;
    }
}
