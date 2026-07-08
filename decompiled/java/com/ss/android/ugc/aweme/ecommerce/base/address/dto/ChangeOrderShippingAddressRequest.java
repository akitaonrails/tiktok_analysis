package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressAssociation;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOrderShippingAddressRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class ChangeOrderShippingAddressRequest implements Parcelable {

    @C09CT("address_association")
    public final AddressAssociation addressAssociation;

    @C09CT("api_version")
    public final Integer apiVersion;

    @C09CT("change_addr_order_id")
    public final String changeAddrOrderId;

    @C09CT("change_addr_order_type")
    public final Integer changeAddrOrderType;

    @C09CT("from_incentive")
    public final Boolean fromIncentive;

    @C09CT("incentive_record_id")
    public final String incentiveRecordId;

    @C09CT("is_from_otp")
    public final Boolean isFromOtp;

    @C09CT("pre_log_id")
    public final String preLogId;

    @C09CT("target_shipping_address")
    public final Address shippingAddress;

    @C09CT("target_address_id")
    public final String targetAddressId;
    public static final Parcelable.Creator<ChangeOrderShippingAddressRequest> CREATOR = new Parcelable.Creator<ChangeOrderShippingAddressRequest>() { // from class: X.03rz
        @Override // android.os.Parcelable.Creator
        public final ChangeOrderShippingAddressRequest createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf;
            Address addressCreateFromParcel;
            AddressAssociation addressAssociationCreateFromParcel;
            Integer numValueOf2;
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z2 = true;
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
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                addressCreateFromParcel = null;
            } else {
                addressCreateFromParcel = Address.CREATOR.createFromParcel(parcel);
            }
            Address address = addressCreateFromParcel;
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                addressAssociationCreateFromParcel = null;
            } else {
                addressAssociationCreateFromParcel = AddressAssociation.CREATOR.createFromParcel(parcel);
            }
            AddressAssociation addressAssociation = addressAssociationCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new ChangeOrderShippingAddressRequest(numValueOf, string, string2, boolValueOf, string3, address, string4, addressAssociation, numValueOf2, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final ChangeOrderShippingAddressRequest[] newArray(int i) {
            return new ChangeOrderShippingAddressRequest[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.changeAddrOrderType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.changeAddrOrderId);
        parcel.writeString(this.targetAddressId);
        Boolean bool = this.fromIncentive;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.incentiveRecordId);
        Address address = this.shippingAddress;
        if (address == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            address.writeToParcel(parcel, i);
        }
        parcel.writeString(this.preLogId);
        AddressAssociation addressAssociation = this.addressAssociation;
        if (addressAssociation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(addressAssociation.associatedAddressId);
        }
        Integer num2 = this.apiVersion;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool2 = this.isFromOtp;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public ChangeOrderShippingAddressRequest(Integer num, String str, String str2, Boolean bool, String str3, Address address, String str4, AddressAssociation addressAssociation, Integer num2, Boolean bool2) {
        this.changeAddrOrderType = num;
        this.changeAddrOrderId = str;
        this.targetAddressId = str2;
        this.fromIncentive = bool;
        this.incentiveRecordId = str3;
        this.shippingAddress = address;
        this.preLogId = str4;
        this.addressAssociation = addressAssociation;
        this.apiVersion = num2;
        this.isFromOtp = bool2;
    }
}
