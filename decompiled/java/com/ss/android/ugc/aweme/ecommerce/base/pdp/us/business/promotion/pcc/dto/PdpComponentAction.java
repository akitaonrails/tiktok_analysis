package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButtonExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PdpComponentAction implements Parcelable {

    @C09CT("action")
    public final Integer action;

    @C09CT("extra_info")
    public final PopUpButtonExtraInfo extraInfo;

    @C09CT("schema")
    public final String schema;
    public static final Parcelable.Creator<PdpComponentAction> CREATOR = new Parcelable.Creator<PdpComponentAction>() { // from class: X.0mgw
        @Override // android.os.Parcelable.Creator
        public final PdpComponentAction createFromParcel(Parcel parcel) {
            Integer numValueOf;
            PopUpButtonExtraInfo popUpButtonExtraInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                popUpButtonExtraInfoCreateFromParcel = PopUpButtonExtraInfo.CREATOR.createFromParcel(parcel);
            }
            return new PdpComponentAction(numValueOf, string, popUpButtonExtraInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PdpComponentAction[] newArray(int i) {
            return new PdpComponentAction[i];
        }
    };
    public static final int $stable = 8;

    public PdpComponentAction() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpComponentAction)) {
            return false;
        }
        PdpComponentAction pdpComponentAction = (PdpComponentAction) obj;
        return Intrinsics.LJFF(this.action, pdpComponentAction.action) && Intrinsics.LJFF(this.schema, pdpComponentAction.schema) && Intrinsics.LJFF(this.extraInfo, pdpComponentAction.extraInfo);
    }

    public final int hashCode() {
        Integer num = this.action;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.schema;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PopUpButtonExtraInfo popUpButtonExtraInfo = this.extraInfo;
        return iHashCode2 + (popUpButtonExtraInfo != null ? popUpButtonExtraInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpComponentAction(action=");
        sbLIZ.append(this.action);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.extraInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.action;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.schema);
        PopUpButtonExtraInfo popUpButtonExtraInfo = this.extraInfo;
        if (popUpButtonExtraInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            popUpButtonExtraInfo.writeToParcel(parcel, i);
        }
    }

    public PdpComponentAction(Integer num, String str, PopUpButtonExtraInfo popUpButtonExtraInfo) {
        this.action = num;
        this.schema = str;
        this.extraInfo = popUpButtonExtraInfo;
    }
}
