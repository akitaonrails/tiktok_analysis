package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SwitchRichInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SwitchRichInfo implements Parcelable {

    @C09CT("address_switch_type")
    public Integer addressSwitchType;

    @C09CT("text")
    public ECRichText text;
    public static final Parcelable.Creator<SwitchRichInfo> CREATOR = new Parcelable.Creator<SwitchRichInfo>() { // from class: X.02Zs
        @Override // android.os.Parcelable.Creator
        public final SwitchRichInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(SwitchRichInfo.class.getClassLoader());
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new SwitchRichInfo(eCRichText, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SwitchRichInfo[] newArray(int i) {
            return new SwitchRichInfo[i];
        }
    };
    public static final int $stable = 8;

    public SwitchRichInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitchRichInfo)) {
            return false;
        }
        SwitchRichInfo switchRichInfo = (SwitchRichInfo) obj;
        return Intrinsics.LJFF(this.text, switchRichInfo.text) && Intrinsics.LJFF(this.addressSwitchType, switchRichInfo.addressSwitchType);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.text;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        Integer num = this.addressSwitchType;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SwitchRichInfo(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", addressSwitchType=");
        sbLIZ.append(this.addressSwitchType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeParcelable(this.text, i);
        Integer num = this.addressSwitchType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public SwitchRichInfo(ECRichText eCRichText, Integer num) {
        this.text = eCRichText;
        this.addressSwitchType = num;
    }
}
