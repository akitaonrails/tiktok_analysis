package com.ss.android.ugc.aweme.ecommerce.base.address.tab;

import X.C09CT;
import X.C2188811AlT;
import X.C969203qc;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.tab.AddressTabEnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressTabEnterParams implements Parcelable {

    @C09CT("address_list_schema")
    public final String addressListSchema;

    @C09CT("source_btm_token")
    public final String btmToken;

    @C09CT("delivery_info")
    public final DeliveryPanelStarter.EnterParam deliveryInfo;

    @C09CT("tab")
    public final Integer tab;
    public static final C969203qc Companion = new Object() { // from class: X.03qc
    };
    public static final Parcelable.Creator<AddressTabEnterParams> CREATOR = new Parcelable.Creator<AddressTabEnterParams>() { // from class: X.03qb
        @Override // android.os.Parcelable.Creator
        public final AddressTabEnterParams createFromParcel(Parcel parcel) {
            DeliveryPanelStarter.EnterParam enterParamCreateFromParcel;
            String string = parcel.readString();
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                enterParamCreateFromParcel = null;
            } else {
                enterParamCreateFromParcel = DeliveryPanelStarter.EnterParam.CREATOR.createFromParcel(parcel);
            }
            DeliveryPanelStarter.EnterParam enterParam = enterParamCreateFromParcel;
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new AddressTabEnterParams(string, enterParam, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddressTabEnterParams[] newArray(int i) {
            return new AddressTabEnterParams[i];
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
        if (!(obj instanceof AddressTabEnterParams)) {
            return false;
        }
        AddressTabEnterParams addressTabEnterParams = (AddressTabEnterParams) obj;
        return Intrinsics.LJFF(this.addressListSchema, addressTabEnterParams.addressListSchema) && Intrinsics.LJFF(this.deliveryInfo, addressTabEnterParams.deliveryInfo) && Intrinsics.LJFF(this.tab, addressTabEnterParams.tab) && Intrinsics.LJFF(this.btmToken, addressTabEnterParams.btmToken);
    }

    public final int hashCode() {
        String str = this.addressListSchema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DeliveryPanelStarter.EnterParam enterParam = this.deliveryInfo;
        int iHashCode2 = (iHashCode + (enterParam == null ? 0 : enterParam.hashCode())) * 31;
        Integer num = this.tab;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.btmToken;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressTabEnterParams(addressListSchema=");
        sbLIZ.append(this.addressListSchema);
        sbLIZ.append(", deliveryInfo=");
        sbLIZ.append(this.deliveryInfo);
        sbLIZ.append(", tab=");
        sbLIZ.append(this.tab);
        sbLIZ.append(", btmToken=");
        sbLIZ.append(this.btmToken);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.addressListSchema);
        DeliveryPanelStarter.EnterParam enterParam = this.deliveryInfo;
        if (enterParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            enterParam.writeToParcel(parcel, i);
        }
        Integer num = this.tab;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.btmToken);
    }

    public AddressTabEnterParams(String str, DeliveryPanelStarter.EnterParam enterParam, Integer num, String str2) {
        this.addressListSchema = str;
        this.deliveryInfo = enterParam;
        this.tab = num;
        this.btmToken = str2;
    }
}
