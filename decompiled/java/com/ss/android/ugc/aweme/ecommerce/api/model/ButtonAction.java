package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ButtonAction implements Parcelable {
    public static final Parcelable.Creator<ButtonAction> CREATOR = new Parcelable.Creator<ButtonAction>() { // from class: X.02ki
        @Override // android.os.Parcelable.Creator
        public final ButtonAction createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ButtonActionInfo buttonActionInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                buttonActionInfoCreateFromParcel = ButtonActionInfo.CREATOR.createFromParcel(parcel);
            }
            return new ButtonAction(numValueOf, buttonActionInfoCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonAction[] newArray(int i) {
            return new ButtonAction[i];
        }
    };

    @C09CT("button_action_info")
    public ButtonActionInfo buttonActionInfo;

    @C09CT("button_action_type")
    public Integer buttonActionType;

    @C09CT("da_info")
    public String daInfo;

    public ButtonAction() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonAction)) {
            return false;
        }
        ButtonAction buttonAction = (ButtonAction) obj;
        return Intrinsics.LJFF(this.buttonActionType, buttonAction.buttonActionType) && Intrinsics.LJFF(this.buttonActionInfo, buttonAction.buttonActionInfo) && Intrinsics.LJFF(this.daInfo, buttonAction.daInfo);
    }

    public final int hashCode() {
        Integer num = this.buttonActionType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        ButtonActionInfo buttonActionInfo = this.buttonActionInfo;
        int iHashCode2 = (iHashCode + (buttonActionInfo == null ? 0 : buttonActionInfo.hashCode())) * 31;
        String str = this.daInfo;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ButtonAction(buttonActionType=");
        sbLIZ.append(this.buttonActionType);
        sbLIZ.append(", buttonActionInfo=");
        sbLIZ.append(this.buttonActionInfo);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.buttonActionType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        ButtonActionInfo buttonActionInfo = this.buttonActionInfo;
        if (buttonActionInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonActionInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.daInfo);
    }

    public ButtonAction(Integer num, ButtonActionInfo buttonActionInfo, String str) {
        this.buttonActionType = num;
        this.buttonActionInfo = buttonActionInfo;
        this.daInfo = str;
    }
}
