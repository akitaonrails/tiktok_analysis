package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.AnonymousClass0374;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1164480gPO;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.AddressBase;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Region implements Parcelable, InterfaceC1164480gPO {
    public static final int $stable = 0;

    @C09CT("address_base")
    public AddressBase addressBase;

    @C09CT("code")
    public String code;

    @C09CT("district_key")
    public String districtKey;

    @C09CT("geoname_id")
    public String geoNameId;

    @C09CT("latitude")
    public String latitude;

    @C09CT("longitude")
    public String longitude;

    @C09CT("name")
    public String name;
    public static final AnonymousClass0374 Companion = new Object() { // from class: X.0374
    };
    public static final Parcelable.Creator<Region> CREATOR = new Parcelable.Creator<Region>() { // from class: X.0373
        @Override // android.os.Parcelable.Creator
        public final Region createFromParcel(Parcel parcel) {
            AddressBase addressBaseCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                addressBaseCreateFromParcel = null;
            } else {
                addressBaseCreateFromParcel = AddressBase.CREATOR.createFromParcel(parcel);
            }
            return new Region(string, string2, string3, string4, string5, string6, addressBaseCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Region[] newArray(int i) {
            return new Region[i];
        }
    };

    public Region() {
        this(null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Region)) {
            return false;
        }
        Region region = (Region) obj;
        return Intrinsics.LJFF(this.name, region.name) && Intrinsics.LJFF(this.geoNameId, region.geoNameId) && Intrinsics.LJFF(this.code, region.code) && Intrinsics.LJFF(this.districtKey, region.districtKey) && Intrinsics.LJFF(this.longitude, region.longitude) && Intrinsics.LJFF(this.latitude, region.latitude) && Intrinsics.LJFF(this.addressBase, region.addressBase);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.geoNameId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.code;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.districtKey;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.longitude;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.latitude;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        AddressBase addressBase = this.addressBase;
        return iHashCode6 + (addressBase != null ? addressBase.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Region(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", geoNameId=");
        sbLIZ.append(this.geoNameId);
        sbLIZ.append(", code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", districtKey=");
        sbLIZ.append(this.districtKey);
        sbLIZ.append(", longitude=");
        sbLIZ.append(this.longitude);
        sbLIZ.append(", latitude=");
        sbLIZ.append(this.latitude);
        sbLIZ.append(", addressBase=");
        sbLIZ.append(this.addressBase);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.geoNameId);
        parcel.writeString(this.code);
        parcel.writeString(this.districtKey);
        parcel.writeString(this.longitude);
        parcel.writeString(this.latitude);
        AddressBase addressBase = this.addressBase;
        if (addressBase == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressBase.writeToParcel(parcel, i);
        }
    }

    @Override // X.InterfaceC1164480gPO
    public final String LIZ() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public final String LIZIZ() {
        String str = this.name;
        if (str != null && str.length() != 0) {
            return this.name;
        }
        String str2 = this.code;
        if (str2 != null) {
            return str2.toUpperCase(Locale.ROOT);
        }
        return null;
    }

    public Region(String str, String str2, String str3, String str4, String str5, String str6, AddressBase addressBase) {
        this.name = str;
        this.geoNameId = str2;
        this.code = str3;
        this.districtKey = str4;
        this.longitude = str5;
        this.latitude = str6;
        this.addressBase = addressBase;
    }
}
