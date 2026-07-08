package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ColorEntity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ColorEntity implements Parcelable {

    @C09CT("dark_value")
    public final String darkValue;

    @C09CT("name")
    public final String name;

    @C09CT("value")
    public final String value;
    public static final Parcelable.Creator<ColorEntity> CREATOR = new Parcelable.Creator<ColorEntity>() { // from class: X.0ux9
        @Override // android.os.Parcelable.Creator
        public final ColorEntity createFromParcel(Parcel parcel) {
            return new ColorEntity(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ColorEntity[] newArray(int i) {
            return new ColorEntity[i];
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
        if (!(obj instanceof ColorEntity)) {
            return false;
        }
        ColorEntity colorEntity = (ColorEntity) obj;
        return Intrinsics.LJFF(this.name, colorEntity.name) && Intrinsics.LJFF(this.value, colorEntity.value) && Intrinsics.LJFF(this.darkValue, colorEntity.darkValue);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.darkValue;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ColorEntity(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", darkValue=");
        sbLIZ.append(this.darkValue);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.value);
        parcel.writeString(this.darkValue);
    }

    public ColorEntity(String str, String str2, String str3) {
        this.name = str;
        this.value = str2;
        this.darkValue = str3;
    }
}
