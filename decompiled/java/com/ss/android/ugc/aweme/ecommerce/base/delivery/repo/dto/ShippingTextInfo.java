package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ShippingTextInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.ShippingDialogDto;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShippingTextInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ShippingTextInfo> CREATOR = new Parcelable.Creator<ShippingTextInfo>() { // from class: X.02sI
        @Override // android.os.Parcelable.Creator
        public final ShippingTextInfo createFromParcel(Parcel parcel) {
            ShippingDialogDto shippingDialogDtoCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                shippingDialogDtoCreateFromParcel = null;
            } else {
                shippingDialogDtoCreateFromParcel = ShippingDialogDto.CREATOR.createFromParcel(parcel);
            }
            return new ShippingTextInfo(string, string2, shippingDialogDtoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShippingTextInfo[] newArray(int i) {
            return new ShippingTextInfo[i];
        }
    };

    @C09CT("logistics_panel_shipping_display_text")
    public final String logisticsPanelShippingDisplayText;

    @C09CT("shipping_dialog")
    public final ShippingDialogDto shippingDialogDto;

    @C09CT("shipping_display_text")
    public final String shippingDisplayText;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingTextInfo)) {
            return false;
        }
        ShippingTextInfo shippingTextInfo = (ShippingTextInfo) obj;
        return Intrinsics.LJFF(this.shippingDisplayText, shippingTextInfo.shippingDisplayText) && Intrinsics.LJFF(this.logisticsPanelShippingDisplayText, shippingTextInfo.logisticsPanelShippingDisplayText) && Intrinsics.LJFF(this.shippingDialogDto, shippingTextInfo.shippingDialogDto);
    }

    public final int hashCode() {
        String str = this.shippingDisplayText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.logisticsPanelShippingDisplayText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShippingDialogDto shippingDialogDto = this.shippingDialogDto;
        return iHashCode2 + (shippingDialogDto != null ? shippingDialogDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShippingTextInfo(shippingDisplayText=");
        sbLIZ.append(this.shippingDisplayText);
        sbLIZ.append(", logisticsPanelShippingDisplayText=");
        sbLIZ.append(this.logisticsPanelShippingDisplayText);
        sbLIZ.append(", shippingDialogDto=");
        sbLIZ.append(this.shippingDialogDto);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.shippingDisplayText);
        parcel.writeString(this.logisticsPanelShippingDisplayText);
        ShippingDialogDto shippingDialogDto = this.shippingDialogDto;
        if (shippingDialogDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingDialogDto.writeToParcel(parcel, i);
        }
    }

    public ShippingTextInfo(String str, String str2, ShippingDialogDto shippingDialogDto) {
        this.shippingDisplayText = str;
        this.logisticsPanelShippingDisplayText = str2;
        this.shippingDialogDto = shippingDialogDto;
    }
}
