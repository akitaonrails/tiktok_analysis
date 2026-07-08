package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LockUpBadgeUI;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LockUpBadgeUI implements Parcelable {

    @C09CT("pop_up")
    public final BasicPopUp basicPopup;

    @C09CT("schema")
    public final String schema;

    @C09CT("sheet")
    public final PopUpMessage sheet;

    @C09CT("type")
    public final Integer type;
    public static final Parcelable.Creator<LockUpBadgeUI> CREATOR = new Parcelable.Creator<LockUpBadgeUI>() { // from class: X.02wC
        @Override // android.os.Parcelable.Creator
        public final LockUpBadgeUI createFromParcel(Parcel parcel) {
            Integer numValueOf;
            PopUpMessage popUpMessageCreateFromParcel;
            BasicPopUp basicPopUpCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                popUpMessageCreateFromParcel = null;
            } else {
                popUpMessageCreateFromParcel = PopUpMessage.CREATOR.createFromParcel(parcel);
            }
            PopUpMessage popUpMessage = popUpMessageCreateFromParcel;
            if (parcel.readInt() != 0) {
                basicPopUpCreateFromParcel = BasicPopUp.CREATOR.createFromParcel(parcel);
            }
            return new LockUpBadgeUI(numValueOf, string, popUpMessage, basicPopUpCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LockUpBadgeUI[] newArray(int i) {
            return new LockUpBadgeUI[i];
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
        if (!(obj instanceof LockUpBadgeUI)) {
            return false;
        }
        LockUpBadgeUI lockUpBadgeUI = (LockUpBadgeUI) obj;
        return Intrinsics.LJFF(this.type, lockUpBadgeUI.type) && Intrinsics.LJFF(this.schema, lockUpBadgeUI.schema) && Intrinsics.LJFF(this.sheet, lockUpBadgeUI.sheet) && Intrinsics.LJFF(this.basicPopup, lockUpBadgeUI.basicPopup);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.schema;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PopUpMessage popUpMessage = this.sheet;
        int iHashCode3 = (iHashCode2 + (popUpMessage == null ? 0 : popUpMessage.hashCode())) * 31;
        BasicPopUp basicPopUp = this.basicPopup;
        return iHashCode3 + (basicPopUp != null ? basicPopUp.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LockUpBadgeUI(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", sheet=");
        sbLIZ.append(this.sheet);
        sbLIZ.append(", basicPopup=");
        sbLIZ.append(this.basicPopup);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.schema);
        PopUpMessage popUpMessage = this.sheet;
        if (popUpMessage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            popUpMessage.writeToParcel(parcel, i);
        }
        BasicPopUp basicPopUp = this.basicPopup;
        if (basicPopUp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basicPopUp.writeToParcel(parcel, i);
        }
    }

    public LockUpBadgeUI(Integer num, String str, PopUpMessage popUpMessage, BasicPopUp basicPopUp) {
        this.type = num;
        this.schema = str;
        this.sheet = popUpMessage;
        this.basicPopup = basicPopUp;
    }
}
