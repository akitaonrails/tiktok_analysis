package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C1746140vXY;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.MapLocateData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.TrackParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class MapLocateData implements Parcelable {

    @C09CT("autocomplete_address_id")
    public final String autoCompleteAddressId;

    @C09CT("is_recommend_detail_address")
    public final String isRecommendDetailAddress;

    @C09CT("latitude")
    public final String latitude;

    @C09CT("longitude")
    public final String longitude;

    @C09CT("pin_movable")
    public final String pinMovable;

    @C09CT("session_key")
    public final String sessionKey;

    @C09CT("shipping_address")
    public final Address shippingAddress;

    @C09CT("trackParams")
    public final TrackParams trackParams;
    public static final C1746140vXY Companion = new Object() { // from class: X.0vXY
    };
    public static final Parcelable.Creator<MapLocateData> CREATOR = new Parcelable.Creator<MapLocateData>() { // from class: X.0vXR
        @Override // android.os.Parcelable.Creator
        public final MapLocateData createFromParcel(Parcel parcel) {
            Address addressCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            TrackParams trackParamsCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                addressCreateFromParcel = null;
            } else {
                addressCreateFromParcel = Address.CREATOR.createFromParcel(parcel);
            }
            Address address = addressCreateFromParcel;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                trackParamsCreateFromParcel = TrackParams.CREATOR.createFromParcel(parcel);
            }
            return new MapLocateData(string, string2, address, string3, string4, trackParamsCreateFromParcel, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MapLocateData[] newArray(int i) {
            return new MapLocateData[i];
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
        if (!(obj instanceof MapLocateData)) {
            return false;
        }
        MapLocateData mapLocateData = (MapLocateData) obj;
        return Intrinsics.LJFF(this.longitude, mapLocateData.longitude) && Intrinsics.LJFF(this.latitude, mapLocateData.latitude) && Intrinsics.LJFF(this.shippingAddress, mapLocateData.shippingAddress) && Intrinsics.LJFF(this.autoCompleteAddressId, mapLocateData.autoCompleteAddressId) && Intrinsics.LJFF(this.sessionKey, mapLocateData.sessionKey) && Intrinsics.LJFF(this.trackParams, mapLocateData.trackParams) && Intrinsics.LJFF(this.isRecommendDetailAddress, mapLocateData.isRecommendDetailAddress) && Intrinsics.LJFF(this.pinMovable, mapLocateData.pinMovable);
    }

    public final int hashCode() {
        String str = this.longitude;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.latitude;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Address address = this.shippingAddress;
        int iHashCode3 = (iHashCode2 + (address == null ? 0 : address.hashCode())) * 31;
        String str3 = this.autoCompleteAddressId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sessionKey;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TrackParams trackParams = this.trackParams;
        int iHashCode6 = (iHashCode5 + (trackParams == null ? 0 : trackParams.hashCode())) * 31;
        String str5 = this.isRecommendDetailAddress;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pinMovable;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MapLocateData(longitude=");
        sbLIZ.append(this.longitude);
        sbLIZ.append(", latitude=");
        sbLIZ.append(this.latitude);
        sbLIZ.append(", shippingAddress=");
        sbLIZ.append(this.shippingAddress);
        sbLIZ.append(", autoCompleteAddressId=");
        sbLIZ.append(this.autoCompleteAddressId);
        sbLIZ.append(", sessionKey=");
        sbLIZ.append(this.sessionKey);
        sbLIZ.append(", trackParams=");
        sbLIZ.append(this.trackParams);
        sbLIZ.append(", isRecommendDetailAddress=");
        sbLIZ.append(this.isRecommendDetailAddress);
        sbLIZ.append(", pinMovable=");
        sbLIZ.append(this.pinMovable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.longitude);
        parcel.writeString(this.latitude);
        Address address = this.shippingAddress;
        if (address == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            address.writeToParcel(parcel, i);
        }
        parcel.writeString(this.autoCompleteAddressId);
        parcel.writeString(this.sessionKey);
        TrackParams trackParams = this.trackParams;
        if (trackParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(trackParams.addressResult);
        }
        parcel.writeString(this.isRecommendDetailAddress);
        parcel.writeString(this.pinMovable);
    }

    public MapLocateData(String str, String str2, Address address, String str3, String str4, TrackParams trackParams, String str5, String str6) {
        this.longitude = str;
        this.latitude = str2;
        this.shippingAddress = address;
        this.autoCompleteAddressId = str3;
        this.sessionKey = str4;
        this.trackParams = trackParams;
        this.isRecommendDetailAddress = str5;
        this.pinMovable = str6;
    }
}
