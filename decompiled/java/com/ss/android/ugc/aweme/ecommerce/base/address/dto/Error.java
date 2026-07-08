package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C1745340vWG;
import X.EnumC1154240g8s;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Error;

/* JADX INFO: loaded from: classes27.dex */
public final class Error implements Parcelable {

    @C09CT("invalid_reason_code")
    public final Integer code;

    @C09CT("error")
    public final String error;

    @C09CT("error_starling_key")
    public final String errorStarlingKey;

    @C09CT("key")
    public final String key;

    @C09CT("type")
    public final Integer type;
    public static final Parcelable.Creator<Error> CREATOR = new Parcelable.Creator<Error>() { // from class: X.0vV4
        @Override // android.os.Parcelable.Creator
        public final Error createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new Error(string, string2, numValueOf, numValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Error[] newArray(int i) {
            return new Error[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.error);
        Integer num = this.type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.code;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.errorStarlingKey);
    }

    public final C1745340vWG LIZ() {
        String str = this.error;
        Integer num = this.type;
        return new C1745340vWG(str, (num == null || num.intValue() != 1) ? EnumC1154240g8s.ERROR : EnumC1154240g8s.WEAK_ERROR, false, null, this.code, 12);
    }

    public Error(String str, String str2, Integer num, Integer num2, String str3) {
        this.key = str;
        this.error = str2;
        this.type = num;
        this.code = num2;
        this.errorStarlingKey = str3;
    }
}
