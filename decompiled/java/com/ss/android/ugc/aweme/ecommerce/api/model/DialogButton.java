package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DialogButton implements Parcelable {
    public static final Parcelable.Creator<DialogButton> CREATOR = new Parcelable.Creator<DialogButton>() { // from class: X.02kh
        @Override // android.os.Parcelable.Creator
        public final DialogButton createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            ButtonAction buttonActionCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                buttonActionCreateFromParcel = ButtonAction.CREATOR.createFromParcel(parcel);
            }
            return new DialogButton(string, numValueOf, buttonActionCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DialogButton[] newArray(int i) {
            return new DialogButton[i];
        }
    };

    @C09CT("button_action")
    public ButtonAction buttonAction;

    @C09CT("dialog_button_style")
    public Integer dialogButtonStyle;

    @C09CT("text")
    public String text;

    public DialogButton() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogButton)) {
            return false;
        }
        DialogButton dialogButton = (DialogButton) obj;
        return Intrinsics.LJFF(this.text, dialogButton.text) && Intrinsics.LJFF(this.dialogButtonStyle, dialogButton.dialogButtonStyle) && Intrinsics.LJFF(this.buttonAction, dialogButton.buttonAction);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.dialogButtonStyle;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        ButtonAction buttonAction = this.buttonAction;
        return iHashCode2 + (buttonAction != null ? buttonAction.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DialogButton(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", dialogButtonStyle=");
        sbLIZ.append(this.dialogButtonStyle);
        sbLIZ.append(", buttonAction=");
        sbLIZ.append(this.buttonAction);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        Integer num = this.dialogButtonStyle;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        ButtonAction buttonAction = this.buttonAction;
        if (buttonAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonAction.writeToParcel(parcel, i);
        }
    }

    public DialogButton(String str, Integer num, ButtonAction buttonAction) {
        this.text = str;
        this.dialogButtonStyle = num;
        this.buttonAction = buttonAction;
    }
}
