package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AdditionalInfoItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AdditionalInfoItem implements Parcelable {

    @C09CT("key")
    public final String key;

    @C09CT("value")
    public final String values;
    public static final Parcelable.Creator<AdditionalInfoItem> CREATOR = new Parcelable.Creator<AdditionalInfoItem>() { // from class: X.0mgV
        @Override // android.os.Parcelable.Creator
        public final AdditionalInfoItem createFromParcel(Parcel parcel) {
            return new AdditionalInfoItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdditionalInfoItem[] newArray(int i) {
            return new AdditionalInfoItem[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalInfoItem)) {
            return false;
        }
        AdditionalInfoItem additionalInfoItem = (AdditionalInfoItem) obj;
        return Intrinsics.LJFF(this.key, additionalInfoItem.key) && Intrinsics.LJFF(this.values, additionalInfoItem.values);
    }

    public final int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.values;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdditionalInfoItem(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", values=");
        sbLIZ.append(this.values);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.values);
    }

    public AdditionalInfoItem(String str, String str2) {
        this.key = str;
        this.values = str2;
    }
}
