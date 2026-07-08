package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButtonExtraInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PopUpButton implements Parcelable {

    @C09CT("action")
    public final Integer action;

    @C09CT("extra_info")
    public final PopUpButtonExtraInfo extraInfo;

    @C09CT("schema")
    public final String schema;

    @C09CT("style")
    public final Integer style;

    @C09CT("text")
    public final String text;
    public static final Parcelable.Creator<PopUpButton> CREATOR = new Parcelable.Creator<PopUpButton>() { // from class: X.0mgv
        @Override // android.os.Parcelable.Creator
        public final PopUpButton createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            PopUpButtonExtraInfo popUpButtonExtraInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                popUpButtonExtraInfoCreateFromParcel = PopUpButtonExtraInfo.CREATOR.createFromParcel(parcel);
            }
            return new PopUpButton(numValueOf, numValueOf2, string, string2, popUpButtonExtraInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PopUpButton[] newArray(int i) {
            return new PopUpButton[i];
        }
    };
    public static final int $stable = 8;

    public PopUpButton() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopUpButton)) {
            return false;
        }
        PopUpButton popUpButton = (PopUpButton) obj;
        return Intrinsics.LJFF(this.style, popUpButton.style) && Intrinsics.LJFF(this.action, popUpButton.action) && Intrinsics.LJFF(this.text, popUpButton.text) && Intrinsics.LJFF(this.schema, popUpButton.schema) && Intrinsics.LJFF(this.extraInfo, popUpButton.extraInfo);
    }

    public final int hashCode() {
        Integer num = this.style;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.action;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.text;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.schema;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PopUpButtonExtraInfo popUpButtonExtraInfo = this.extraInfo;
        return iHashCode4 + (popUpButtonExtraInfo != null ? popUpButtonExtraInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopUpButton(style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.extraInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.style;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.action;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.text);
        parcel.writeString(this.schema);
        PopUpButtonExtraInfo popUpButtonExtraInfo = this.extraInfo;
        if (popUpButtonExtraInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            popUpButtonExtraInfo.writeToParcel(parcel, i);
        }
    }

    public PopUpButton(Integer num, Integer num2, String str, String str2, PopUpButtonExtraInfo popUpButtonExtraInfo) {
        this.style = num;
        this.action = num2;
        this.text = str;
        this.schema = str2;
        this.extraInfo = popUpButtonExtraInfo;
    }
}
