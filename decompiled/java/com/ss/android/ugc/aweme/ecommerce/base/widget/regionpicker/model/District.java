package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C09CT;
import X.C1744360vUg;
import X.C2188811AlT;
import X.InterfaceC20236714Gf;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.AddressBase;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictOptionView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public final class District implements Parcelable {

    @C09CT("address_base")
    public final AddressBase addressBase;

    @C09CT("code")
    public String code;
    public transient InterfaceC20236714Gf<? super Unit> continuation;

    @C09CT("district_key")
    public final String districtKey;

    @C09CT("geoname_id")
    public final String geoNameId;

    @C09CT("has_next")
    public final Boolean hasNextLevel;

    @C09CT("index")
    public String index;

    @C09CT("latitude")
    public final String latitude;

    @C09CT("longitude")
    public final String longitude;
    public transient List<District> multilevelDistricts;

    @C09CT("name")
    public final String name;

    @C09CT("option_view")
    public final DistrictOptionView optionView;

    @C09CT("par_regions")
    public final List<District> parRegions;
    public transient DistrictData response;
    public transient boolean showIndex;
    public static final C1744360vUg Companion = new Object() { // from class: X.0vUg
    };
    public static final Parcelable.Creator<District> CREATOR = new Parcelable.Creator<District>() { // from class: X.03rS
        @Override // android.os.Parcelable.Creator
        public final District createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            AddressBase addressBaseCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z = false;
            DistrictOptionView districtOptionViewCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(District.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                addressBaseCreateFromParcel = null;
            } else {
                addressBaseCreateFromParcel = AddressBase.CREATOR.createFromParcel(parcel);
            }
            AddressBase addressBase = addressBaseCreateFromParcel;
            if (parcel.readInt() != 0) {
                districtOptionViewCreateFromParcel = DistrictOptionView.CREATOR.createFromParcel(parcel);
            }
            return new District(string, string2, string3, string4, string5, arrayList, boolValueOf, string6, string7, addressBase, districtOptionViewCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final District[] newArray(int i) {
            return new District[i];
        }
    };
    public static final int $stable = 8;

    public District() {
        this("", "", null, "", null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.geoNameId);
        parcel.writeString(this.code);
        parcel.writeString(this.index);
        parcel.writeString(this.districtKey);
        List<District> list = this.parRegions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<District> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.hasNextLevel;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.longitude);
        parcel.writeString(this.latitude);
        AddressBase addressBase = this.addressBase;
        if (addressBase == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressBase.writeToParcel(parcel, i);
        }
        DistrictOptionView districtOptionView = this.optionView;
        if (districtOptionView == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            districtOptionView.writeToParcel(parcel, i);
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("District(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", geoNameId=");
        sbLIZ.append(this.geoNameId);
        sbLIZ.append(", index=");
        sbLIZ.append(this.index);
        sbLIZ.append(", showIndex=");
        sbLIZ.append(this.showIndex);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public District(String str, String str2, String str3, String str4, String str5, List<District> list, Boolean bool, String str6, String str7, AddressBase addressBase, DistrictOptionView districtOptionView) {
        this.name = str;
        this.geoNameId = str2;
        this.code = str3;
        this.index = str4;
        this.districtKey = str5;
        this.parRegions = list;
        this.hasNextLevel = bool;
        this.longitude = str6;
        this.latitude = str7;
        this.addressBase = addressBase;
        this.optionView = districtOptionView;
    }
}
