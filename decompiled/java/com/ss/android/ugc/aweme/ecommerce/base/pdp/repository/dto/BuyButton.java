package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BuyButton implements Parcelable {

    @C09CT("action_id")
    public String actionId;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("desc")
    public String desc;

    @C09CT("is_hide")
    public Boolean isHide;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Integer status;

    @C09CT("sub_desc")
    public String subDesc;
    public static final Parcelable.Creator<BuyButton> CREATOR = new Parcelable.Creator<BuyButton>() { // from class: X.02oh
        @Override // android.os.Parcelable.Creator
        public final BuyButton createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            Integer numValueOf = null;
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
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new BuyButton(string, boolValueOf, string2, string3, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BuyButton[] newArray(int i) {
            return new BuyButton[i];
        }
    };
    public static final int $stable = 8;

    public BuyButton() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyButton)) {
            return false;
        }
        BuyButton buyButton = (BuyButton) obj;
        return Intrinsics.LJFF(this.desc, buyButton.desc) && Intrinsics.LJFF(this.isHide, buyButton.isHide) && Intrinsics.LJFF(this.subDesc, buyButton.subDesc) && Intrinsics.LJFF(this.daInfo, buyButton.daInfo) && Intrinsics.LJFF(this.status, buyButton.status) && Intrinsics.LJFF(this.actionId, buyButton.actionId);
    }

    public final int hashCode() {
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isHide;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.subDesc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.daInfo;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.status;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.actionId;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BuyButton(desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", isHide=");
        sbLIZ.append(this.isHide);
        sbLIZ.append(", subDesc=");
        sbLIZ.append(this.subDesc);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", actionId=");
        sbLIZ.append(this.actionId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.desc);
        Boolean bool = this.isHide;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.subDesc);
        parcel.writeString(this.daInfo);
        Integer num = this.status;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.actionId);
    }

    public BuyButton(String str, Boolean bool, String str2, String str3, Integer num, String str4) {
        this.desc = str;
        this.isHide = bool;
        this.subDesc = str2;
        this.daInfo = str3;
        this.status = num;
        this.actionId = str4;
    }
}
