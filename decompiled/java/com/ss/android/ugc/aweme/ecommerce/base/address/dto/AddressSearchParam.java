package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressSearchParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressSearchParam implements Parcelable {

    @C09CT("search_item_key")
    public final String searchItemKey;
    public static final Parcelable.Creator<AddressSearchParam> CREATOR = new Parcelable.Creator<AddressSearchParam>() { // from class: X.0vVI
        @Override // android.os.Parcelable.Creator
        public final AddressSearchParam createFromParcel(Parcel parcel) {
            return new AddressSearchParam(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddressSearchParam[] newArray(int i) {
            return new AddressSearchParam[i];
        }
    };
    public static final int $stable = 8;

    public AddressSearchParam() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressSearchParam) && Intrinsics.LJFF(this.searchItemKey, ((AddressSearchParam) obj).searchItemKey);
    }

    public final int hashCode() {
        String str = this.searchItemKey;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressSearchParam(searchItemKey=");
        sbLIZ.append(this.searchItemKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.searchItemKey);
    }

    public AddressSearchParam(String str) {
        this.searchItemKey = str;
    }
}
