package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C702702oj;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddToCartButton implements Parcelable {

    @C09CT("available_count")
    public Integer availableCount;

    @C09CT("button_style")
    public Integer buttonStyle;

    @C09CT("click_hint")
    public String clickHint;

    @C09CT("click_hint_toast_name")
    public String clickHintToastName;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Integer status;
    public static final C702702oj AddToCartButtonStatus = new Object() { // from class: X.02oj
    };
    public static final Parcelable.Creator<AddToCartButton> CREATOR = new Parcelable.Creator<AddToCartButton>() { // from class: X.02oi
        @Override // android.os.Parcelable.Creator
        public final AddToCartButton createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new AddToCartButton(numValueOf, string, string2, numValueOf2, numValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final AddToCartButton[] newArray(int i) {
            return new AddToCartButton[i];
        }
    };
    public static final int $stable = 8;

    public AddToCartButton() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddToCartButton)) {
            return false;
        }
        AddToCartButton addToCartButton = (AddToCartButton) obj;
        return Intrinsics.LJFF(this.status, addToCartButton.status) && Intrinsics.LJFF(this.clickHint, addToCartButton.clickHint) && Intrinsics.LJFF(this.clickHintToastName, addToCartButton.clickHintToastName) && Intrinsics.LJFF(this.availableCount, addToCartButton.availableCount) && Intrinsics.LJFF(this.buttonStyle, addToCartButton.buttonStyle);
    }

    public final int hashCode() {
        Integer num = this.status;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.clickHint;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clickHintToastName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.availableCount;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.buttonStyle;
        return iHashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddToCartButton(status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", clickHint=");
        sbLIZ.append(this.clickHint);
        sbLIZ.append(", clickHintToastName=");
        sbLIZ.append(this.clickHintToastName);
        sbLIZ.append(", availableCount=");
        sbLIZ.append(this.availableCount);
        sbLIZ.append(", buttonStyle=");
        sbLIZ.append(this.buttonStyle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.status;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.clickHint);
        parcel.writeString(this.clickHintToastName);
        Integer num2 = this.availableCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.buttonStyle;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public static AddToCartButton LIZ(AddToCartButton addToCartButton, Integer num) {
        return new AddToCartButton(num, addToCartButton.clickHint, addToCartButton.clickHintToastName, addToCartButton.availableCount, addToCartButton.buttonStyle);
    }

    public AddToCartButton(Integer num, String str, String str2, Integer num2, Integer num3) {
        this.status = num;
        this.clickHint = str;
        this.clickHintToastName = str2;
        this.availableCount = num2;
        this.buttonStyle = num3;
    }
}
