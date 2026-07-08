package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C677402ke;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.MiniCheckoutPopup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MiniCheckoutPopup implements Parcelable {

    @C09CT("dialog_content")
    public DialogContent dialogContent;

    @C09CT("popup_type")
    public Integer popupType;
    public static final C677402ke Companion = new Object() { // from class: X.02ke
    };
    public static final Parcelable.Creator<MiniCheckoutPopup> CREATOR = new Parcelable.Creator<MiniCheckoutPopup>() { // from class: X.02kZ
        @Override // android.os.Parcelable.Creator
        public final MiniCheckoutPopup createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new MiniCheckoutPopup(numValueOf, (DialogContent) parcel.readParcelable(MiniCheckoutPopup.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MiniCheckoutPopup[] newArray(int i) {
            return new MiniCheckoutPopup[i];
        }
    };
    public static final int $stable = 8;

    public MiniCheckoutPopup() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniCheckoutPopup)) {
            return false;
        }
        MiniCheckoutPopup miniCheckoutPopup = (MiniCheckoutPopup) obj;
        return Intrinsics.LJFF(this.popupType, miniCheckoutPopup.popupType) && Intrinsics.LJFF(this.dialogContent, miniCheckoutPopup.dialogContent);
    }

    public final int hashCode() {
        Integer num = this.popupType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        DialogContent dialogContent = this.dialogContent;
        return iHashCode + (dialogContent != null ? dialogContent.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MiniCheckoutPopup(popupType=");
        sbLIZ.append(this.popupType);
        sbLIZ.append(", dialogContent=");
        sbLIZ.append(this.dialogContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.popupType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeParcelable(this.dialogContent, i);
    }

    public MiniCheckoutPopup(Integer num, DialogContent dialogContent) {
        this.popupType = num;
        this.dialogContent = dialogContent;
    }
}
