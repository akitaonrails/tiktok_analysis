package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListClientConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressListClientConfig implements Parcelable {

    @C09CT("enable_delivery_instruction_hint")
    public final String enableDeliveryInstructionHintStr;
    public static final Parcelable.Creator<AddressListClientConfig> CREATOR = new Parcelable.Creator<AddressListClientConfig>() { // from class: X.03sG
        @Override // android.os.Parcelable.Creator
        public final AddressListClientConfig createFromParcel(Parcel parcel) {
            return new AddressListClientConfig(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddressListClientConfig[] newArray(int i) {
            return new AddressListClientConfig[i];
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
        return (obj instanceof AddressListClientConfig) && Intrinsics.LJFF(this.enableDeliveryInstructionHintStr, ((AddressListClientConfig) obj).enableDeliveryInstructionHintStr);
    }

    public final int hashCode() {
        String str = this.enableDeliveryInstructionHintStr;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressListClientConfig(enableDeliveryInstructionHintStr=");
        sbLIZ.append(this.enableDeliveryInstructionHintStr);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enableDeliveryInstructionHintStr);
    }

    public AddressListClientConfig(String str) {
        this.enableDeliveryInstructionHintStr = str;
    }
}
