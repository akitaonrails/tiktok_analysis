package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressCandidateParam;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressSearchParam;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressMapRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ShippingAddressMapRequest implements Parcelable {

    @C09CT("shipping_address")
    public final Address address;

    @C09CT("address_candidate_param")
    public final AddressCandidateParam candidateParam;

    @C09CT("pre_log_id")
    public final String preLogId;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    @C09CT("address_search_param")
    public final AddressSearchParam searchParam;
    public static final Parcelable.Creator<ShippingAddressMapRequest> CREATOR = new Parcelable.Creator<ShippingAddressMapRequest>() { // from class: X.0vVH
        @Override // android.os.Parcelable.Creator
        public final ShippingAddressMapRequest createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Address addressCreateFromParcel;
            AddressCandidateParam addressCandidateParamCreateFromParcel;
            AddressSearchParam addressSearchParamCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                addressCreateFromParcel = null;
            } else {
                addressCreateFromParcel = Address.CREATOR.createFromParcel(parcel);
            }
            Address address = addressCreateFromParcel;
            if (parcel.readInt() == 0) {
                addressCandidateParamCreateFromParcel = null;
            } else {
                addressCandidateParamCreateFromParcel = AddressCandidateParam.CREATOR.createFromParcel(parcel);
            }
            AddressCandidateParam addressCandidateParam = addressCandidateParamCreateFromParcel;
            if (parcel.readInt() != 0) {
                addressSearchParamCreateFromParcel = AddressSearchParam.CREATOR.createFromParcel(parcel);
            }
            return new ShippingAddressMapRequest(numValueOf, address, addressCandidateParam, addressSearchParamCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShippingAddressMapRequest[] newArray(int i) {
            return new ShippingAddressMapRequest[i];
        }
    };
    public static final int $stable = 8;

    public ShippingAddressMapRequest() {
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
        if (!(obj instanceof ShippingAddressMapRequest)) {
            return false;
        }
        ShippingAddressMapRequest shippingAddressMapRequest = (ShippingAddressMapRequest) obj;
        return Intrinsics.LJFF(this.scene, shippingAddressMapRequest.scene) && Intrinsics.LJFF(this.address, shippingAddressMapRequest.address) && Intrinsics.LJFF(this.candidateParam, shippingAddressMapRequest.candidateParam) && Intrinsics.LJFF(this.searchParam, shippingAddressMapRequest.searchParam) && Intrinsics.LJFF(this.preLogId, shippingAddressMapRequest.preLogId);
    }

    public final int hashCode() {
        Integer num = this.scene;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Address address = this.address;
        int iHashCode2 = (iHashCode + (address == null ? 0 : address.hashCode())) * 31;
        AddressCandidateParam addressCandidateParam = this.candidateParam;
        int iHashCode3 = (iHashCode2 + (addressCandidateParam == null ? 0 : addressCandidateParam.hashCode())) * 31;
        AddressSearchParam addressSearchParam = this.searchParam;
        int iHashCode4 = (iHashCode3 + (addressSearchParam == null ? 0 : addressSearchParam.hashCode())) * 31;
        String str = this.preLogId;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShippingAddressMapRequest(scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", address=");
        sbLIZ.append(this.address);
        sbLIZ.append(", candidateParam=");
        sbLIZ.append(this.candidateParam);
        sbLIZ.append(", searchParam=");
        sbLIZ.append(this.searchParam);
        sbLIZ.append(", preLogId=");
        sbLIZ.append(this.preLogId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.scene;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Address address = this.address;
        if (address == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            address.writeToParcel(parcel, i);
        }
        AddressCandidateParam addressCandidateParam = this.candidateParam;
        if (addressCandidateParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressCandidateParam.writeToParcel(parcel, i);
        }
        AddressSearchParam addressSearchParam = this.searchParam;
        if (addressSearchParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(addressSearchParam.searchItemKey);
        }
        parcel.writeString(this.preLogId);
    }

    public ShippingAddressMapRequest(Integer num, Address address, AddressCandidateParam addressCandidateParam, AddressSearchParam addressSearchParam, String str) {
        this.scene = num;
        this.address = address;
        this.candidateParam = addressCandidateParam;
        this.searchParam = addressSearchParam;
        this.preLogId = str;
    }
}
