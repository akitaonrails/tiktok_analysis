package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SelectionOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class SelectionOption implements Parcelable {

    @C09CT("refresh_params")
    public final String refreshParams;

    @C09CT("select_sku_quantity")
    public final Integer selectSkuQuantity;

    @C09CT("select_logistic_service_id")
    public final String selectedLogisticServiceId;
    public static final Parcelable.Creator<SelectionOption> CREATOR = new Parcelable.Creator<SelectionOption>() { // from class: X.090e
        @Override // android.os.Parcelable.Creator
        public final SelectionOption createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new SelectionOption(numValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectionOption[] newArray(int i) {
            return new SelectionOption[i];
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
        if (!(obj instanceof SelectionOption)) {
            return false;
        }
        SelectionOption selectionOption = (SelectionOption) obj;
        return Intrinsics.LJFF(this.selectSkuQuantity, selectionOption.selectSkuQuantity) && Intrinsics.LJFF(this.selectedLogisticServiceId, selectionOption.selectedLogisticServiceId) && Intrinsics.LJFF(this.refreshParams, selectionOption.refreshParams);
    }

    public final int hashCode() {
        Integer num = this.selectSkuQuantity;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.selectedLogisticServiceId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.refreshParams;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectionOption(selectSkuQuantity=");
        sbLIZ.append(this.selectSkuQuantity);
        sbLIZ.append(", selectedLogisticServiceId=");
        sbLIZ.append(this.selectedLogisticServiceId);
        sbLIZ.append(", refreshParams=");
        sbLIZ.append(this.refreshParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.selectSkuQuantity;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.selectedLogisticServiceId);
        parcel.writeString(this.refreshParams);
    }

    public SelectionOption(Integer num, String str, String str2) {
        this.selectSkuQuantity = num;
        this.selectedLogisticServiceId = str;
        this.refreshParams = str2;
    }
}
