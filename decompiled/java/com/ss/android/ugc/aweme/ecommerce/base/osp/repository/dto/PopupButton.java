package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C662902iJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PopupButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PopupButton implements Parcelable {

    @C09CT("button_style")
    public Integer buttonStyle;

    @C09CT("text")
    public String text;
    public static final C662902iJ Companion = new Object() { // from class: X.02iJ
    };
    public static final Parcelable.Creator<PopupButton> CREATOR = new Parcelable.Creator<PopupButton>() { // from class: X.02iI
        @Override // android.os.Parcelable.Creator
        public final PopupButton createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PopupButton(numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PopupButton[] newArray(int i) {
            return new PopupButton[i];
        }
    };
    public static final int $stable = 8;

    public PopupButton() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupButton)) {
            return false;
        }
        PopupButton popupButton = (PopupButton) obj;
        return Intrinsics.LJFF(this.buttonStyle, popupButton.buttonStyle) && Intrinsics.LJFF(this.text, popupButton.text);
    }

    public final int hashCode() {
        Integer num = this.buttonStyle;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopupButton(buttonStyle=");
        sbLIZ.append(this.buttonStyle);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.buttonStyle;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.text);
    }

    public PopupButton(Integer num, String str) {
        this.buttonStyle = num;
        this.text = str;
    }
}
